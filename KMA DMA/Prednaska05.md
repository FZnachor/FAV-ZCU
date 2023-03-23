Booleova algebra
- distributivní a komplementární svaz
- má 0 (nejmenší prvek) a 1 (největší prvek)
- ? struktura konečných B. algeber
	- atom B. algebry $B = (X, \wedge, \vee, \overline{}, 0, 1)$
		- prvek $a \in X$ se nazývá atom B. algebry B, pokud
		- $\forall \, x \in X: x \wedge a = 0$ nebo $x \wedge a = a$
	- Pozorování: X konečné : atom je takový prvek, jehož bezprostřední předchůdce je 0
		- jinak řečeno: výška atomu je 2
	- Tvrzení: $B = (X, \wedge, \vee, \overline{}, 0, 1)$ je konečná B. algebra, $x \in X$, $x \neq 0$, pak
		- $x = a_{1} \vee a_{2} \vee \dots \vee a_{k}$
		- $a_{i}$ jsou atomy B. algebry t. ž. $a_{i} \leq x$
		- a zároveň v $\{ a_{1}, \dots, a_{k} \}$ jsou obsaženy všechny atomy $\leq x$
	- Dk.: $a_{i}, i = 1, \dots, k$ atomy $\leq x$ nechť $\exists$ atom a $a \leq x$, který ve spojení chybí $a = a \wedge x = a \wedge (a_{1} \vee a_{2} \vee \dots \vee a_{k}) = (a \wedge a_{1}) \vee (a \wedge a_{2}) \vee \dots \vee (a \wedge a_{k})$
		- $a_{i} \vee a_{2} \vee \dots \vee a_{k} \leq x$
		- pokud $a \wedge a_{1} = 0 = a \wedge a_{2} = \dots = a \wedge a_{k}$, pak $a = 0$
			- $\implies \exists \, i : a \wedge a_{i} \neq 0$
			- $a \wedge a_{1} = a = a_{1}$ spor

Věta (Minsky)
- $P = (X, P), height(P) = h$
	- pak $\exists$ rozklad $X = A_{1} \cup \dots \cup A_{h}$, kde $A_{i}$ je antiřetězec
	- $i = 1, \dots, h$
	- navíc: neexistuje rozklad na méně než h antiřetězců
- Dk.:
	- $x \in X$, výška prvku x: $height(x)$ = největší t t. ž. existuje řetězec $x_{1} < \dots < x_{t-1} < x_{t} = x$
	- $A_{i} = \{ x \in X \mid height(x) = i \}$, jsou to antiřetězce: $x, y \in A_{i}$ 
		- $x_{1} < \dots < x_{i} = x < y = x_{i+1} \implies$ výška y alespoň $i+1$
			- spor s $y \in A_{i}$
		- sporem nechť $x \neq y$, předpokládám $x < y$
	- lépe to nejde:
	- $height(P) = h \implies \exists$ řetězec na h prvkách
		- $C = \{ x_{1}, \dots, x_{h} \}$
	- nechť $\exists$ rozklad na méně než h antiřetězců
		- $t < h$
	- Dirichletův přihrádkový princim h prvků do $t < h$ přihrádek

Tvrzení
- v lib. distributivním s vazu $(X, \leq)$ platí duální distributivní zákon
	- $x \vee (y \wedge z) = (x \vee y) \wedge (x \vee z) \quad \forall \, x, y, z \in X$
	- původní d. z. $a \wedge (b \vee c) = (a \wedge b) \vee (a \wedge c) \quad \forall \, a, b, c \in Y, (Y, \leq)$ svaz
- Dk.:
	- předpokládejme že platí
		- $a \wedge (b \vee c) = (a \wedge c) \vee (a \wedge c)$
		- $a = x \vee y, b = x, c = z$
		- $(x \vee y) \wedge (x \vee z) = ((x \vee y) \wedge x) \vee ((x \vee y) \wedge z)$
		- $= [(x \wedge x) \vee (x \wedge y)] \vee [(x \wedge z) \vee (y \wedge z)]$
		- $= [x \vee (x \wedge y)] \vee [(x \wedge z) \vee (y \wedge z)]$
		- $= x \vee (x \wedge z) \vee (y \wedge z)$
		- $= x \vee (y \wedge z)$

Motivace komplement
- doplněk množin
- $A^{\subset} = X \setminus A$
- $A \cap A^{\subset} = \emptyset$
- $A \cup A^{\subset} = X$
- $\overline a = b, c$
- $a \wedge c = 0$
- $a \vee c = 1$

Věta
- je-li svaz distributivní komplementní, pak každý prvek má právě 1 komplement
- Důsledek: distrib. svaz, pak každý prvek má nejvýše 1 komplement
- Dk.: b, předp. že existují alespoň 2 komplementy pro b
	- $b_{1}, b_{2} \quad \overline b_{1} = b, \overline b_{2} = b, b_{1} \neq b_{2}$
	- $b_{1} \wedge b = 0, b_{2} \wedge b = 0$
	- $b_{1} \vee b = 1, b_{2} \vee b = 1$
	- $b_{1} = b_{1} \wedge 1 = b_{1} \wedge (b_{2} \vee b) = (b_{1} \wedge b_{2}) \vee (b_{1} \wedge b) = b_{1} \wedge b_{2}$
	- $b_{2} = b_{2} \wedge 1 = \dots = b_{2} \wedge b_{1}$
	- $\implies b_{2} = b_{1}$

Věta (De Morganova)
- Boolova algebra $B = (B, \wedge, \vee)$ - distributivní komplementární svaz s 0, 1
	- $\forall x, y \in B : \overline{x \vee y} = \overline x \wedge \overline y$
		- $\overline{x \wedge y} = \overline x \vee \overline y$
- Dk.:
	- $(x \vee y) \wedge (\overline x \wedge \overline y) = (x \wedge \overline x \wedge \overline y) \vee (y \wedge \overline x \wedge \overline y) = 0 \vee 0 = 0$
	- $(x \vee y) \vee (\overline x \wedge \overline y) = (x \vee \overline x \vee \overline y) \wedge (y \vee \overline x \vee \overline y) = 1 \wedge 1 = 1$

Věta (Booleovský kalkulus)
- $B = (X, \wedge, \vee, \overline{}) \quad x, y, z \in X$ platí
	1) $x \vee x = x \quad$ idempotentnost
	2) $x \vee y = y \vee x \quad$ komutativita
	3) $(x \vee y) \vee z = x \vee (y \vee z) \quad$ asociativita
	4) $x \vee (x \wedge y) = x \quad$ absorbce
	- D) $\quad x \wedge (y \vee z) = (x \wedge y) \vee (x \wedge z) \quad$ distributivita
	- N1) 0, 1 neutrální prvky
		1) $x \vee 0 = x \qquad x \wedge 1 = x$
		2) $x \vee 1 = 1 \qquad x \wedge 0 = 0$
	- K1) $\quad \overline 0 = 1 \qquad \overline 1 = 0$
	- K2) $\quad x \vee \overline x = 1 \qquad x \wedge \overline x = 0$
	- K3) $\quad \overline{\overline x} = x \quad$ involuformost
	- K4) $\quad \overline{x \vee y} = \overline x \wedge \overline y \qquad \overline{x \wedge y} = \overline x \vee \overline y$

Stoneova věta
- Př. dělitelé čísla 30, uspořádání dělitelnosti
	- $X = \{ 1, 2, 3, 5, 6, 10, 15, 30 \}$ - B. algebra
- Př. $A = \{ a, b, c \}$M.2 and 2.5" Drive
	- $(2^A, \leq)$ - B. algebra
- izomorfizmus dvou B. algeber
	- $B = (X, \wedge, \vee, \overline{}, 0_{B}, 1_{B}), C = (Y, n, u, ', 0_{C}, 1_{C})$ je zobrazení $F : X \to Y$, které je
		1) bijekce
		2) F zachovává všechny operace
			- $F(x \wedge y) = F(x) \, n \, F(y)$
			- $F(x \vee y) = F(x) \, u \, F(y)$
			- $F(\overline x) = F(x)'$
			- $F(0_{B}) = 0_{C}, F(1_{B}) = 1_{C}$

Věta (Stone)
- každá konečná Booleova algebra je izomorfní
- Booleově algebře $(2^X, \leq)$ pro nějakou množinu X
- $X = At(B) \quad$ X je množina atomů B
- Dk.:
	- zobrazení $\Theta, b \in B$
	- $\Theta(b) = \{ x \mid x \leq b, x \text{ atom } B \}$
	- $b = 0 \quad \Theta(0) = \emptyset$
	- $\Theta$ je
		- bijekce
			- prosté (injektivní)
			- na (surjektivní)
		- zachování operace
	- $\Theta$ injektivní $b_{1} \neq b_{2} \implies \Theta(b_{1}) \neq \Theta(b_{2})$
		- $b_{1} \neq b_{2} \implies b_{1} \not\leq b_{2} \text{ nebo } b_{2} \not\leq b_{1}$
		- nechť $b_{1} \not\leq b_{2} : b_{1} \wedge b_{2} \neq b_{1}, b_{1} = b_{1} \wedge 1 = b_{1} \wedge (b_{2} \vee \overline b_{2})$
		- $= (b_{1} \wedge b_{2}) \vee (b_{1} \wedge \overline b_{2}) \implies b_{1} \wedge \overline b_{2} \neq 0$
		- $\implies \exists \text{ atom } a \in B : a \leq b_{1}, a \not\leq b_{2}$
		- $\implies a \in \Theta(b_{1}) \wedge a \not\in \Theta(b_{2})$
	- $\Theta$ surjektivní
		- plyne z věty o jednoznačnosti vyjádření prvku b pomocí suprema mn. atomů
		- $\implies \Theta$ je bijekce (vzájemně jednoznačné zobrazení)
		- $\Theta$ zachovává 0, 1 $b(0) = \emptyset, b(1) = X$
		- $\Theta$ zachovává komplement
		- $\Theta$ zachovává operace $\wedge, \vee$
			- chci $\Theta(b_{1} \wedge b_{2}) = \Theta(b_{1}) \cap \Theta(b_{2})$ (1)
				- $\Theta(b_{1} \vee b_{2}) = \Theta(b_{1}) \cup \Theta(b_{2})$ (2)
			1. atom $x \leq b_{1} \wedge b_{2} \implies x \leq b_{1} \wedge x \leq b_{2}$
				- $\implies x \in \Theta(b_{1}), x \in \Theta(b_{2})$
				- $\implies x \in \Theta(b_{1}) \cap \Theta(b_{2})$
				- $x \in \Theta(b_{1}) \wedge \Theta(b_{2}) \implies x \in \Theta(b_{1}) \wedge x \in \Theta(b_{2})$
					- $\implies x \leq b_{1} \wedge x \leq b_{2} \implies x \leq b_{1} \wedge b_{2} \implies x \in \Theta(b_{1} \wedge b_{2})$
			2. $\subseteq \quad x \in \Theta(b_{1} \vee b_{2}) \implies x \leq b_{1} \vee b_{2} \implies x = x \wedge (b_{1} \vee b_{2})$
				- $= (x \wedge b_{1}) \vee (x \wedge b_{2}) \implies x \wedge b_{1} \neq 0 \text{ nebo } x \wedge b_{2} \neq 0$
				- pokud $x \wedge b_{1} = 0 = x \wedge b_{2}$
					- $\implies x \leq b_{2} \text{ nebo } x \leq b_{2} \implies x \in \Theta(b_{1}) \text{ nebo } x \in \Theta(b_{2})$
					- $\implies x \in \Theta(b_{1}) \cup \Theta(b_{2})$
			- $\supseteq \quad x \in \Theta(b_{1}) \cup \Theta(b_{2}) \implies x \leq b_{1} \vee x \leq b_{2} \implies x \leq b_{1} \vee b_{2}$
				- $\implies x \in \Theta(b_{1} \vee b_{2})$
			- Důsl.: Každá konečná B. algebra má  $2^n$ prvků, kde $n = \#$ atomů.
				- $\implies$ # atomů = $\log_{2}|B|$
					- $B = (B, \leq)$
			- Důsl.: Každé dvě B. algebry se stejným počtem prvků jsou izomorfní
