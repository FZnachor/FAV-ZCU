Struktura B. algeber
- $X = \{a, ,b, c\}, (2^x, \leq)$
- každá podmnožina X reprezentuje char. vektory

Věta (Sperner)
- $\displaystyle width(2^x) = {|x| \choose \lfloor\frac{|x|}{2}\rfloor}$
- Pascalův tojúhelník

Direktní součin B. algebry
- $B_{1} = (B_{1}, \leq_{1}), B_{2} = (B_{2}, \leq_{2})$
- direktní součin B. algeber $B_{1} \times B_{2}$ se rovná algebra
	- $B = B_{1} \times B_{2} = (B_{1} \times b_{2}, \leq)$
	- $(a_{1}, a_{2}) \leq (b_{1}, b_{2}) \iff a_{1} \leq_{1} b_{1} \wedge a_{2} \leq_{2} b_{2}$
- Př.: $B_{1} \quad B_{2}$
	- $B_{1} = \{0_{1}, 1_{1}\} \quad B_{2} = \{0_{2}, 1_{2}\}$
	- $B_{1} \times B_{2} = \{(0_{1}, 0_{2}), (0_{1}, 1_{2}), (1_{1}, 0_{2}), (1_{1}, 1_{2})\}$
- Důsl.: Každá B. algebra B je izomorfní $B_{2}^n$, kde n = # atomů B
	- $B_{2}^2 = B_{2} \times B_{2}, B_{2}^3 = B_{2} \times B_{2} \times B_{2}$
	- $B_{2}^4$ - hyperkrychle (4-rozměrná)

Booleovské funkce
- $f: B_{2}^n \to B_{2}^m \quad$ omezíme se na $m = 1$
- speciální případ je výroková logika
- binární logické spojky, pravdivostní tabulka

| $p$ | $q$ | $p \wedge q$ | $p \vee q$ | $p \implies q$ | $p \iff q$ | $p + q$ |
| --- | --- | ------------ | ---------- | -------------- | ---------- | ------- |
| 0   | 0   | 0            | 0          | 1              | 1          | 0       |
| 0   | 1   | 0            | 1          | 1              | 0          | 1       |
| 1   | 0   | 0            | 1          | 0              | 0          | 1       |
| 1   | 1   | 1            | 1          | 1              | 1          | 0       |

- kolik existuje B. fcí n proměnných?
	- $x_{1}, x_{2} \dots x_{n} \qquad f(x_{1}, \dots, x_{n})$
	- \# vstupů je $2^n$ ... $2^{2^n}$
	- jaká je struktura B. fcí?
	- množina všech B. fcí n proměnných ... Fn
	- na Fn lze zavést uspořádání
		- $F, g \in Fn$, definujeme $f \leq g \iff \forall \, x \in B_{2}^n \quad f(x) \leq g(x)$
		- porovnání v $B_{2}$
		- pokud $f \leq g$, pak řekneme, že f implikuje g
- Př.:
	- $f \leq g$
	- $f \Vert h$ jsou neporonatelné

| x   | y   | f(x, y) | g(x, y) | h(x, y) |
| --- | --- | ------- | ------- | ------- |
| 0   | 0   | 1       | 1       | 0       |
| 0   | 1   | 0       | 1       | 1       |
| 1   | 0   | 0       | 0       | 0       |
| 1   | 1   | 1       | 1       | 0       |


- Množina Fn tvoří B. algebru
	- $(f \wedge g)(x) = f(x) \wedge g(x)$
	- $(f \vee g)(x) = f(x) \vee g(x)$
	- $\overline f(x) = \overline{f(x)}$

Booleovy polynomy
- $\wedge, \vee, \overline{}$
- Def.: B. polynom v proměnných $x_{1}, \dots, x_{n}$
	1. $0, 1, x_{1}, \dots, x_{n}$ tvoří B. polynom
	2. jsou-li p, q B. polynomy, pak
		- $p \wedge q, p \vee q, \overline p$
		- jsou B. p.
- B. p. v proměnných $x_{1}, \dots, x_{n}$ se rozumí každý výraz vytvořený konečným počtem aplikací těchto pravidel
- Př.: $x_{1}, x_{2}, x_{3} : x_{1} \quad \overline{x_{3}} \wedge x_{1}$
	- $x_{2} \vee x_{3}$
- Def.: literál proměnné $x_{i}$ je B. p. rovný $x_{i}$ nebo $\overline{x_{i}}$
	- **součinová (průseková) klauzule** v proměnných $x_{1}, \dots, x_{n} \qquad \overline{x_{1}} \wedge x_{2} \wedge x_{7}$
		- součin (průsek) některých literálů proměnných $x_{1}, \dots, x_{n}$
	- **součtová (spojová) klauzule**
		- součet (spojení) $\qquad x_{1} \vee \overline{x_{3}} \vee x_{5}$
	- **úplná součinová klauzule** součinová klauzule obsahující literály všech proměnných
		- $\overline{x_{1}} \wedge x_{2} \wedge x_{3}$
		- $x_{1} \wedge x_{2} \wedge \overline{x_{3}}$
	- **úplná součtová klauzule** součtová klauzule obsahující literály všech proměnných
		- $x_{1} \vee \overline{x_{2}} \vee x_{3}$
	- $\wedge \to \cdot \qquad \overline{x_{1}} \wedge x_{2} \wedge x_{7} = \overline{x_{1}} x_{2} x_{3}$
	- $\wedge \to + \qquad x_{1} \wedge \overline{x_{3}} \wedge x_{5} = x_{1} + \overline{x_{3}} + x_{5}$
	- **součtová (disjunktivní) forma**
		- pokud B. f. vyjádřená jako součet součinových klauzulí
	- **úplná součtová (disjunktivní) forma**
		- součet nějakých úplných součtových klauzulí
	- **součinová (konjuktivní) forma**
		- pokud B. f. vyjádřená jako součin součtových klauzulí
	- **úplná součinová (konjuktivní) forma**
		- součet nějakých úplných součinových klauzulí
- Př.: $f(x_{1}, x_{2}, x_{3})$
	- $x_{1} \cdot x_{2} + x_{3} \quad$ součtová (disj.) forma
	- $x_{1} \cdot \overline{x_{2}} \cdot x_{3} + \overline{x_{1}} \cdot x_{2} \cdot \overline{x_{3}} \quad$ úplná součtová (disj.) forma
	- $(\overline{x_{1}} + x_{2}) \cdot x_{3} \quad$ součinová (konj.) forma
	- $(\overline{x_{1}} + \overline{x_{2}} + \overline{x_{3}}) \cdot (x_{1} + \overline{x_{2}} + x_{3}) \quad$ úplná součinová (konj.) forma

Věta: Každá B. fce se dá vyjádřit pomocí B. polynomu
- Každá nekonstantní B. fce se dá vyjádřit pomocí ÚDNF nebo ÚKNF.
- Př.:
	- ÚDNF: $\quad f(x, y, z) = \overline x y \overline z + \overline x y z + x y \overline z$
	- ÚKNF:  $\quad f(x, y, z) = (x+y+z)(x+y+\overline z)(\overline x+y+z)(\overline x+y+\overline z)(\overline x+\overline y+\overline z)$

| x   | y   | z   | f(x, y, z) | ÚKD                                     | ÚDK                                       |
| --- | --- | --- | ---------- | --------------------------------------- | ----------------------------------------- |
| 0   | 0   | 0   | 0          |                                         | $x + y + z$                               |
| 0   | 0   | 1   | 0          |                                         | $x + y + \overline z$                     |
| 0   | 1   | 0   | 1          | $\overline x \cdot y \cdot \overline z$ |                                           |
| 0   | 1   | 1   | 1          | $\overline x \cdot y \cdot z$           |                                           |
| 1   | 0   | 0   | 0          |                                         | $\overline x + y + z$                     |
| 1   | 0   | 1   | 0          |                                         | $\overline x + y + \overline z$           |
| 1   | 1   | 0   | 1          | $x \cdot y \cdot \overline z$           |                                           |
| 1   | 1   | 1   | 0          |                                         | $\overline x + \overline y + \overline z$ |

Minimalizace B. fcí
- minimální disjunktivní forma
- součet co nejmenšího počtu součinů

Quineho-McCluskeyho metoda
- Př.: 
	- ÚDNF: $\quad \overline x \overline y \overline z + \overline x \overline y z + x \overline y \overline z + x \overline y z + x y \overline z$
		- první dvojice: $\quad \overline x \overline y (\overline z + z) = \overline x \overline y$
		- druhá dvojice: $\quad (\overline x + x) \overline y \overline z = \overline y \overline z$

| x   | y   | z   | f(x, y, z) |
| --- | --- | --- | ---------- |
| 0   | 0   | 0   | 1          |
| 0   | 0   | 1   | 1          |
| 0   | 1   | 0   | 0          |
| 0   | 1   | 1   | 0          |
| 1   | 0   | 0   | 1          |
| 1   | 0   | 1   | 1          |
| 1   | 1   | 0   | 1          |
| 1   | 1   | 1   | 0          |

- $f(x, y, z) = x \overline z + \overline y$
- ? vynechání některých součinů tak, že výsledek je stále roven funkci f
- f, p součin literálů je implikantem fce f, pokud $p \leq f$
- implikant je prostý, pokud součin vzniklý odstraněním libovolného literálu z p přestane být implikantem f