- neporovnatelné prvky a, b ... $a \Vert b$
	- neplatí $a\leq b \vee b\leq a$
- úplné (lineární) uspořádání ... každé dva prvky jsou porovnatelné
	- $(\mathbb{R}, \leq)$
- $(X, \leq)$ poset, $C \subseteq X$ je řetězec (řetízek), pokud platí, že každé 2 různé prvky $x, y \in C$ jsou porovnatelné
	- $A \subseteq X$ je antiřetězec (antiřetízek) : každé 2 různé prvky jsou neporovatelné
- $(X, \leq)$ poset, řekneme, že $(Y \leq_{y})$ je podposet $(X, \leq)$
	- $Y \subseteq X, \quad \leq_{y} \, = \, \leq \cap \space (Y \times Y)$

Lineární rozšíření posetu

Věta: $(X, \leq)$ konečný poset, d á se vždy lineárně rozšířit
- i nekonečný, je ale potřeba axiom výběru

Výška posetu $P = (X, \leq)$ ... height(P)
- největší h takové, že v něm existuje řetězec velikosti h

Šířka posetu $P = (X, \leq)$ ... width(P)
- největší w takové, že v P existuje antiřetězec velikosti w

Věta (Dilworth) ... $P = (X, \leq)$ poset, width(P) = w
- pak existuje rozklad množiny X na podmnožiny $C_{1}, \dots, C_{w}$
- "Céčka" vzájemně disjunktní tak, že $C_i$ je řetězec
- navíc neexistuje rozklad na méně řetězců

Věta (duální Dilworthova věta)
- $P = (X, \leq)$ poset, h = height(P), pak existuje rozklad $X = A_{1} \cup \dots \cup A_{h}$ tak, že $A_i$ json antiřetězce
- navíc neexistuje rozklad na méně než h antiřetězců

Př.: Hasseův diagram $(\mathbb{N}, I)$

Př.: uspořádání množin inkluzí X
- $(2^x, \leq)$
- $A \cap B \quad$ největší množina na množině všech společných podmnožin A a B
- $A \cup B \quad$ nejmenší společná nadmnožina

Def.:
- poset $(X, \leq)$
	- $a, b \in X \quad c \in X$ t. ž. $c \leq a \wedge c \leq b \quad$ dolní závora
	- $a, b \in X \quad d \in X$ t. ž. $d \leq a \wedge d \leq b \quad$ horní závora
- $\sup(a,b)$ nejmenší horní závora
- $\inf(a,b)$ největší dolní závora

Definice svazu: $P = (X, \leq)$ poset, řekněme, že P je svaz, pokud
- $\forall \, x, y \in X \quad \exists \, \inf(x,y) \wedge \exists \, \sup(x, y)$

Př.: svazy a nesvazy

dvojí pohled na svazy
- $(X, \leq)$ poset $\to \wedge, \vee \quad a \leq b \iff a \wedge b = a \iff a \vee b = b$
- $(X, \wedge, \vee)$

Def.: $(X, \wedge_{x}, \vee_{x})$ svaz, $(Y, \wedge_{y}, \vee_{y})$ je podsvazem $(X, \wedge_{x}, \vee_{x})$ když platí $: Y \leq X$
- $\forall a, b \in Y : a \wedge_{y} b = a \wedge_{x} b$
- $\forall a, b \in Y : a \vee_{y} b = a \vee_{x} b$

Tvrzení: $(X, \wedge, \vee)$ svaz
- $\forall \, x, y, z \in X$
1) $x \vee x = x \quad$ idempotentnost $\quad x \wedge x = x$
2) $x \vee y = y \vee x \quad$ komutativita $\quad x \wedge x = y \wedge x$
3) $(x \vee y) \vee z = x \vee (y \vee x) \quad$ asociativita $\quad (x \wedge y) \wedge z = x \wedge (y \wedge x)$
4) $x \vee (y \wedge x) = x \quad$ absorbce $\quad x \wedge (y \vee x) = x$

Princip duality
- pokud v libovolném **pravdivém** tvrzení o svazech platném pro **všechny** svazy nahradíme
	- $\wedge \to \vee$
	- $\vee \to \wedge$
	- $\leq \, \to \, \geq$
- získáme opět **pravdivé** tvrzení
- pro množiny
	- $A \cup (B \cap C) = (A \cup B) \cap (A \cup C)$
	- $A \cap (B \cup C) = (A \cap B) \cup (A \cap C)$
	- distributivita pro $\cup, \cap$

Distributivní svaz $(X, \wedge, \vee)$
- $\forall \, a, b, c \in X : a \wedge (b \vee c) = (a \wedge b) \vee (a \wedge c)$

Tvrzení: v distrib. svazu platí i
- $\forall \, a, b, c \in X : a \vee (b \wedge c) = (a \vee b) \wedge (a \vee c)$
- neplyne z principu duality

Věta (Birkhoff) X svaz
- $(X, \wedge, \vee)$ je distributivní $\iff$ $(X, \wedge, \vee)$ neobsahuje jako podsvaz $M_{5}, N_{5}$
	- ty nejsou distributivní
	- $a \wedge (v \vee c) = a \wedge 1 = a \quad \neq \quad (a \wedge b) \vee (a \wedge c) = 0 \vee 0 = 0$
	- $a \vee (v \wedge c) = a \quad \neq \quad (a \vee b) \wedge (a \vee c) = 0$

Tvrzení: v konečném svazu $\exists$ nejmenší a největší prvek
- Dk.: $X = \{ x_{1}, \dots, x_{n} \}$
	- $x_{1} \vee \dots \vee x_{n} \geq x_{i} \, \forall \, i = 1, \dots, n \quad$ největší prvek
	- $x_{1} \wedge \dots \wedge x_{n} \leq x_{i} \, \forall \, i = 1, \dots, n \quad$ nejmenší prvek
- označení:
	- 0 - nejmenší prvek
	- 1 - největší prvek

Komplement prvku: $(X, \wedge, \vee)$ konečný, 1 nejv. prvek, 0 nejm. prvek
- $a \in X \quad$ komplement $\overline a \in X$
	- $a \wedge \overline a = 0$
	- $a \vee \overline a = 1$
- svaz takový, že $\forall a \in X \quad \exists$ komplementární svaz

Booleova algebra
- distributivní a komplementární svaz s 0, 1