# Tabulka

- vztah mezi množinou klíčů a množinou hodnot (jako například slovník)
- asociativní abstraktní datová struktura

### Klíč

- diskrétní datový typ:
	- `int`
	- `String`
	- ne `double`!
- nejdůležitější vlastnost - možnost zjistit, zda jsou si dvě hodnoty rovny
- při vhodné implementaci vyhodnocení rovnosti může být klíčem i složitější struktura (např. množina čísel $\{0, 1, 2\}$ je shodná s $\{2, 0, 1\}$, může být tedy klíčem)

### Hodnota

- libovolný datový typ nebo reference na instanci

### Vlastnosti

- není určeno pořadí prvků
- některým klíčům nemusí být přiřazena žádná hodnota

### Operace

- přidání přiřazení (klíč + hodnota)
- získání hodnoty pro daný klíč
- zjištění existence hodnoty přiřazené danému klíči
- zrušení přířazení (odebrání klíče)
- získání všech klíčů s přiřazenou hodnotou

Ideálně by měly mít všechny (kromě všech klíčů) složitost $\Theta(1)$

### Implementace tabulky

**Tabulka s přímým adresováním**
- pole, kde index je klíč
- problém:
	- často neznáme rozsah možnách klíčů
	- počet přípustných klíčů může být velmi velký nebo nekonečný
	- neřeší složitější klíče
- výhoda: splňuje $\Theta(1)$

**Reprezentace absence prvku**
- pomocí obalovací třídy (např. `Element`)
- ta obsahuje `value` s daty
- odlišíme tak neexistující klíč od `null`, `-1`, ...

**Rozptylová tabulka** (hash table)
- hashovací funkce
	- vstup: *klíč*, výstup: *index v poli*
	- vlastnosti:
		- hodnota 0 až délka pole -1
		- pro různé hodnoty různé klíče
			- nelze vždy, počet klíčů může být větší než délka pole
		- pro stejný klíč vrátí stejný index

**Kolize**
- vložíme hodnotu s klíčem $k_1$, uloží se na index $H(k_1)$
- vložíme další hodnotu s takovým klíčem $k_2$, že $H(k_1) = H(k_2)$
- pozice v poli už je obsazena
- nedá se jim dost dobře bránit, musí se řešit
	- do pole uložíme spojové struktury
	- každý záznam v poli obsahuje hodnotu i klíč
	- záznam bude obsahovat `next`, kam se dá případný další klíč s hodnotou

![](implementace-tabulky.png)

### Implementace operací

- přidání prvku
	- vložíme jej na začátek spojové struktury (nemusíme jí celou procházet)
- získání prvku
	- procházíme `while` cyklem
	- porovnáváme klíče - jeho instance musí být schopna rozhodnout o své významové shodnosti (`.equals()`)

### Výpočetní složitost

- přidání prvku: $\Theta(1)$
- vybrání a odebrání prvku závisí na délce spojové struktury
	- přidáno bylo $n$ prvků
	- používá se pole o délce $m$
	- složitost tedy je $\Theta(n/m) = \Theta(n)$
	- **řešení**:
		- omezit poměr $n/m$ (např. $n/m < 10$)
		- po překročení limitu se data přesunou do větší struktury
		- průměrná složitost je poté $\Theta(1)$

**Rozložení klíčů**
- známe-li rozložení klíčů, je potřeba mu přizpůsobit hashovací funkci
- pokud ne, funkce by měla záviset na všech částech klíče
	- ne jen na prvním písmenu, poslední číslici, ...

### Implementace v Javě

- třída `HashMap<K, V>`
- typové parametry `<K>` (klíč) a `<V>` (hodnota)

**Metody**
- `void put(K key, V value)`
- `V get(K key)`
- `boolean containsKey(K key)`
- v průměrném případě $\mathcal O(1)$

**Rozptylová funkce**
- používá se `public int hashCode() {...}` na datovém typu
- výsledek může být libovolné číslo (java se postará o namapování na indexy pole)

**Rovnost klíčů**
- používá se `boolean equals(Object o) {...}`

Při implementaci `equals` a `hashCode` musíme dbát na jejich konzistenci!
- když `a.equals(b) == true`, pak `a.hashCode() == b.hashCode()`
	- naopak to neplatí
- `a.equals(a)` musí vracet `true`
- když `a.equals(b) == true`, potom musí `b.equals(a) == true`

**Třída `HashSet<T>`**
- má pouze klíče - hodí se k efektivnímu nalezení duplicit