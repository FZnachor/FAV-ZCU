$\sum = \{ a,b \}$

$L_{1} = \{ w \mid w \text{ obsahuje lichý počet } a \text{ a sudý počet } b \}$
- 4 stavy
	- sasb - vstupní
	- salb
	- lasb - koncový
	- lalb

$L_{2} = \{ w \mid w \text{ obsahuje lichý počet } a \text{ a 0 nepovažujeme za sudé číslo} \}$
- 3 stavy
	- 0 - vstupní
	- l
	- s - koncový

$L_{3} = \{ w \mid w \text{ obsahuje právě dva znaky } a \}$
- 4 stavy
	- 0 - vstupní
	- 1
	- 2 - koncový
	- \>2 - absorbční stav (zamítací), nedá se z něj dostat

$L_{4} = \{ w \mid w \text{ obsahuje alespoň 2 znaky } a \}$
- 3 stavy
	- 0 - vstupní
	- 1 
	- \>=2 - koncový a absorbční

$L_{5} = \{ w \mid w \text{ začíná podřetězcem } bba- \}$
- 5 stavů
	- e - vstupní
	- b
	- bb
	- bba - koncový akceptující absorbční
	- špatný - zamítací absorbční

$L_{6} = \{ w \mid w \text{ obsahuje méně než 2 znaky } a \}$
- opak $L_{4}$, stačí prohodit koncové stavy
- 4 stavy
	- 0 - koncový
	- 1 - koncový
	- \>=2
- $L = \left( Q, \sum, \delta, q_{0}, F\right)$
- $\overline L = \left( Q, \sum, \delta, q_{0}, \overline F\right)$

$L_{7} = \{ w \mid w \text{ obsahuje podřetězec } -bbab- \}$
- 5 stavů
	- e
	- b
	- bb
	- bba
	- bbab

$L_{8} = \{ w \mid w \text{ obsahuje podřetězec } -abba- \}$

$L_{9} = \{ w \mid w \text{ končí na } -abba \}$

$L_{10} = \{ w \mid w \text{ současně splňuje} \}$
- nezačíná bba-
- obsahuje -babb-
- nekončí -aa

$L_{11} = \{ w \mid w \text{ současně splňuje } \}$
- obsahuje -aaba-
- neobsahuje -bba-
- **Kartézský součin automatu**
	- u zkoušky jsou na tom stavěny příklady!