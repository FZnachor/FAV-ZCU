# Vypočítatelnost, složitost problémů

**Motivace**
- spousta algoritmů řazení
- různé složitosti
- stále stejný problém
- existuje pro daný problém lepší (rychlejší) algoritmus?

**Problém**
- množina vstupů A a množina výstupů B
- $A \times B$ - kartézský součin
	- pro danou dvojici $(a, b), a \in A, b \in B$ říká, zda pro vstup a je b řešením problému
	- podmnožina $X = \{ (\{1\}, 1), (\{1,2\}, 1), (\{2,3\}, 2), \dots \}$
- hledáme takové $b \in B$ pro dané $a \in A$, že $(a, b) \in X$
- problém řeší algoritmus
	- a je vstup
	- b je výstup
	- algoritmus musí vrátit nic, pokud pro $a \in A$ neexistuje žádné $b \in B$ tak, že $(a, b) \in X$
- rozhodovací problém
	- určuje, zda existuje řešení hlavního problému
	- máme druhou množinu $X'$, která označuje, jestli existuje $(a, b) \in X$, například $X' = \{((10, 15), \text{true}), ((7, 3), \text{false})\}$
	- určitě není složitější než hlavní problém

**Existuje pro každý problém algoritmus?**
- Záleží na programovacím jazyce?
	- každý algoritmus může být vykonán tzv. Turingový strojem
	- pokud v nějakém jazyce jde implementovat Turinguův stroj, pak lze popsat libovolný algoritmus

**Problém zastavení** (halting problem)
- $A:$ všechny možné programy v Javě včetně hodnot parametrů
- $B: \{\text{true}, \text{false}\}$
- $X:$ skončí program po konečném počtu kroků?
- problém je algoritmicky nerozhodnutelný

**Algoritmická neřešitelnost**
- pro řešení některých problémů prokazatelně neexistuje žádný algoritmus
- než začneme problém řešit, zamysleme se, zda je vůbec řešitelný
- má smysl hledat efektivnější algoritmus?

**Stromová reprezentace**
- list
	- permutace vstupů
	- všechny permutace musí být možné
	- počet permutací: $n!$
- výška stromu
	- maximální počet provedených operací
+ nejlepší možný strom
	- nutný počet listů: $n!$
	- největší možný počet listů: $2^h$ (úplný strom)
	+ $n! = 2^h$
	+ $\log_{2}(n!) = h$
	+ platí $\log_{2}(n!) \in \Omega(n \log(n))$ (Stirlingova aproximace)
		+ tedy $h \in \Omega(n \log(n))$
		+ nemůže tedy existovat lepší řadící algoritmus než se složitostí $\Omega(n \log(n))$

**Třída problémů P**
- pro řešení problému v této třídě existuje (polynomiální) algoritmus se složitostí $\mathcal{O}(n^k)$

**Třída problémů NP**
- pro řešení problému v této třídě existuje nedeterministický algoritmus s polynomiální složitostí $\mathcal{O}(n^k)$
- "řeší" rozhodovací úlohy
- binární výstup, ale jiná interpretace
	- `true`: ano, řešení obecné úlohy existuje 
	- `false`: nevíme
- nedeterministický skok
	- provede náhodné volby a ověří, jestli je to správně
- pokud je řešením pro vstup $a \in A$
	- `true`, pak musí existovat posloupnost náhodných voleb (tzv. certifikát) taková, která povede na odpověď `true`
	- `false`, pak nesmí existovat posloupnost náhodných voleb taková, která povede na odpověď `true`

**Polynomiální převoditelnost**
- problém $X_{1}$ je polynomiálně převoditelný na $X_{2}$, když $X_{1}(a) = X_{2}(f(a))$
	- funkce $f()$ musí být vyhodnotitelná v polynomiálním čase
+ vstup pro problém $X_{1}$ je možné funkcí $f()$ převést na vstup pro problém $X_{2}$
+ problém $X_{1}$ je možné vyřešit algoritmem řešícím $X_{2}$
+ je-li $X_{2}$ polynomiální, pak je i $X_{1}$ polynomiální
+ z hlediska polynomiality není $X_{1}$ složitější než $X_{2}$

**Cookova-Levinova věta**
- každá NP úloha je polynomiálně převoditelná na problém splnitelnosti logické formule
- důkaz (náznak)
	- algoritmus ověřující řešení obecné úlohy lze popsat Turingovým strojem
	- Turingův stroj lze popsat logickou formulí
	- splnitelnost formule implikuje existenci řešení obecné úlohy
- důsledky
	- pokud by existoval polynomiální algoritmus na SAT (satisfyability), pak by existoval polynomiální algoritmus na všechny NP problémy
	- NP je velmi široká třída problémů a nezdá se pravděpodobné, že by pro všechny existoval polynomiální algoritmus
	- není to ale nemožné

**NP-úplné problémy** (NP-Complete, NPC)
- množina problémů, na které lze převést všechny NP problémy
- SAT je NPC (krátká formulace Cookovy-Levinovy věty)
- dı́ky tomu lze NP-úplnost dokázat snadněji
	- stačı́ ukázat, že SAT je převoditelná na daný NP problém X
	- tranzitivitou převoditelnosti je dokázáno, že všechny NP jsou převoditelné na X

**NP-těžké problémy** (NP-Hard)
- problémy které jsou přinejmenšı́m tak těžké jako NP-úplné
- obecné problémy odpovı́dajı́cı́ NP-úplným rozhodovacı́m úlohám
- tzn. v polynomiálnı́m čase ověřı́me řešenı́, které ale musı́me uhodnout
- v praxi častějšı́ než NP-úplné
- stejné praktické důsledky jako NP-úplnost