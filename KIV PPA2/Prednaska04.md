# Řazení

Nalezení pořadí (indexů) pro množinu prvků podle nějakého uspořádání. (neplést s tříděním)
- jeden z nejčastějších výpočetních úkonů
- součást mnoha složitějších algoritmů
- až 30 % častu běžného počítače
- rychlost algoritmů se dá dobře popsat pomocí jejich výpočetní složitosti

**Dělení**
- **vnitřní**: jen paměťová místa, kde jsou uložená data a konstantní počet dodatečných
- **vnější**: používá $\Omega(n)$ dodatečných paměťových míst
+ **přímé**: přesouvá (řadí) samotná data (jednoduché datové typy)
+ **nepřímé**: přesouvá jen zástupce dat (složitější datové typy)
- **nestabilní**: v případě rovnosti mohou pořadí stejných prvků změnit
- **stabilní**: v případě rovnosti zachovává původní pořadí prvků
	- u stabilního řazení můžeme řadit vícekrát a předchozí pořadí bude zachováno
+ **porovnávací**: většina algoritmů, porovnává vždy dvojici prvků
+ **jiné**: jen speciální případy, např. počítací řazení

**Počítací řazení**
- omezený počet klíčů
- pouze pro přímé řazení
- používá se k určení, **kolikrát** se vyskytuje každý klíč

## Uspořádání

- relace $\leq$ na množině všech možných prvků
- vlastnosti:
	- **tranzitivní**: když A $\leq$ B a $B \leq C$, pak $A \leq C$
	- **antisymetrická**: $A \leq B$ a $B \leq A$ jedině, když $A = B$
	- **trichotomická**: buď $A \leq B$, nebo $B \leq A$

### Uspořádání v Javě

- reprezentováno implementací rozhraní **Comparable**
	- A je v relaci s B právě když A.compareTo(B) $\leq 0$
	- implementace **compareTo** musí také splňovat vlastnosti uspořádání

## Druhy řazení

**Insert sort** (řazení vkládáním)
- uvažuje vždy jeden prvek
- postupně ho posouvá na správné místo v již seřazené části posloupnosti
- složitost:
	- záleží na charakteru dat
	- v nejhorším případě $\Omega(n^2)$
	- v průměrném případě také $\Omega(n^2)$
		- náročné jsou prvky vzdálené od správné pozice
	- pokud žádný prvek od své správné pozice není dále než k, kde k nezávisí na n, je složitost $\mathcal{O}(n)$

**Shell sort** (Shellovo řazení)
- data budou zpracovávání v několika průchodech
- v počátečních průchodech kontrolovány a přesouvány prvky vzdálené o krok $h > 1$
- délka kroku $h$ se bude postupně snižovat
- v posledním průchodu $h = 1$ a proces je stejný jako u insert sortu, nicméně většina prvků se bude posouvat jen o malou vzdálenost
- složitost:
	- dosud se ji nepodařilo přesně zjistit, dle experimentů $\mathcal{O}(n^{1.25})$
	- není známa ani optimální posloupnost kroků
- nestabilní

**QuickSort** (řazení dělením)
- rozdělí problém na menší podproblémy a ty dále dělí stejným způsobem
- končí, když je podproblém trviální
- přirozeně vede na rekurzivní zápis
- postup:
	- vybere se pivot (např. poslední prvek) a přesune se do proměnné
	- pole se prochází zleva a při nalezení něčeho většího než je pivot se prvek přesune na volné místo (tedy to místo posledního prvku)
	- poté se začne procházet zprava a postup se opakuje, dokud se indexy zleva i zprava nerovnají
- vlastnosti:
	- není potřeba vyměňovat prvky (je to drahá operace)
	- využijeme skutečné parametry left a right jako proměnné
- problém: nevhodný pivot
	- ideálním pivotem je medián
- složitost:
	- nejhorší případ: $\Omega(n^2)$
		- seřazená posloupnost
	- nejlepší případ: $\mathcal{O}(n)$
		- medián vybrán jako první pivot
	- očekávaný případ: $\approx 2n \in \mathcal{O}(n)$
	- průměrný případ: $\mathcal{O}(n \log(n))$

**QuickSelect**
- podobný řazení dělením
- najde prvek v k-tém pořadí velikosti (ten který by po seřazení byl na k-tém indexu)
- postup:
	- vybere se pivot
	- interval se rozdělí podle pivotu stejně jako při řazení
	- vybere se podinterval, ve kterém leží cílový index
- efektivní pro hledání mediánu či kvantilů

**Mergesort** (řazení slučováním)
- myšlenka: sloučení dvou posloupností je možné v lineárním čase
- vnější řazení (bude potřeba paměť navíc)
- postup:
	- procházíme obě posloupnosti současně (držíme aktuální index pro obě)
	- do výsledné posloupnosti zapíšeme menší ze dvou aktuálních prvků
	- v příslušné posloupnosti se posuneme na další prvek
- efentivní implementace:
	- pracuje s úseky původního pole a eliminuje testování konce polí A a B
	- alokuje se dočasné pole
	- v poli se vytvoří tzv. bitonická posloupnost
		- prvky A v původním pořadí, prvky v B v obráceném pořadí
	- z pomocného pole se prvky sloučí do původního pole
- složitost:
	- $\mathcal{O}(n \log(n))$ ve všech případech
- paměťová složitost:
	- $\Omega(n)$ nutná pro uložení bitonické posloupnosti
- ve většině implementací stabilní
- snadný přepis na nerekurzivní verzi

### Porovnání složitosti algoritmů

| algoritmus | nejhorší            | očekávaná           | paměťová    |
| ---------- | ------------------- | ------------------- | ----------- |
| BubbleSort | $\Theta(n^2)$       | $\Theta(n^2)$       | $\Theta(1)$ |
| InsertSort | $\Theta(n^2)$       | $\Theta(n^2)$       | $\Theta(1)$ |
| ShellSort  | $\Theta(n^{3/2})$   | $\Theta(n^{1.25})$? | $\Theta(1)$ |
| QuickSort  | $\Theta(n^2)$       | $\Theta(n \log(n))$ | $\Theta(1)$ |
| MergeSort  | $\Theta(n \log(n))$ | $\Theta(n \log(n))$ | $\Theta(n)$ |