## Množiny

- soubor vzájemně různých prvků (naivní reorie množin)

$A, B, X; a \in A, a \notin A, A \ni a$

Možinové operace
- $A \cup B = \{ u \mid w \in A \vee u \in B \}$
- $A \cap B$
- $A \setminus B$

de Morganovy zákony
- $A \cup (B \cap C) = (A \cup B) \cap (A \cup C)$

Rovnost dvou množin
- $A = B \iff A \leq B \wedge B \leq A$

Kartézský součin množin
- $A \cdot B = \{ (a, b) \mid a \in A \wedge b \in B \}$
- $B \cdot A = \{ (b,a) \mid b \in B \wedge a \in A \}$
- $A_{1}\cdot A_{2}\cdot\dots \cdot A_{n} = \{ (a_{1}, a_{2}, \dots, a_{n}) \mid a_{i} \in A_{i} \, \forall \, i = 1, \dots, n \}$

Základní množiny číselné
- $\mathbb{N}, \mathbb{N}_{0}, \mathbb{Z}, \mathbb{Q}, \mathbb{R}, \mathbb{C}$

## Funkce

$F : \mathbb{R} \to \mathbb{R}$ (reálné funkce reálné proměnné)

$y = e^x$ (exponenciela)
- důležitá funkce v DMA
- def. obor $\mathbb{R}$
- obor hodnot $(0, +\infty)$
- $y' = e^x$
- $\displaystyle e^x = \sum \frac{x^n}{n!}$
- $1 + x \leq e^x$

## Zobrazení

$F : A \to B$
- $\forall \, a \in A \quad \exists \text{ nejvýše 1 } b \in B$

## Relace

Binární relace z množina A do množiny B
- $\rho \leq A \times B$

n-ární relace $A_{1}, \dots, A_{n} \quad \rho \leq A_{1} \times \dots \times A_{n}$

Příklad
- dělitelnost na $\mathbb{N} \dots \varrho$
	- $a, b \in \mathbb{N} \quad a \, \rho \, b \iff a \mid b$
- relace rovnoběžnosti: $R^2$ přímky
	- $p \, \rho \, q \iff p \Vert q$

### Obory
- levý obor relace ... zobecnění definičního oboru
- pravý obor relace ... zobecnění oboru hodnot

Definice
- $\varrho \leq A \times B$
	- levý obor: $L_{\rho} = \{ a \in A \mid \exists \, b \in B : (a, b) \in \rho \}$ nebo $a \, \rho \, b$
	- pravý obor: $R_{\rho} = \{ b \in B \mid \exists \, a \in A : (a, b) \in \rho \}$ nebo $a \, \rho \, b$

Příklad
- $X = \{ 2, 3, 5 \} \quad Y = \{ 1, 4, 7, 10 \}$
- $\rho \leq X \times Y, \quad x \, \rho \, y \iff x \mid y$
- $\rho = \{ (2, 4), (2, 10), (5, 10) \}$
- $L_{\rho} = \{ 2, 5 \}$
- $P_{\rho} = \{ 4, 10 \}$

### Operace s relacemi
- průnik, sjednocení, ...
- $\rho_{1}, \rho_{2} \leq Y \times X \qquad \rho_{1} \leq  \rho_{2} \quad \rho_{1} \text{ implikuje } \rho_{2}$

Př. $X, Y$ množina osob
- $\rho_{1} x \text{ si tyká s } y$ 
- $\rho_{2} x \text{ zná } y$
- $\rho_{1} \leq \rho_{2}$

### Skládání relací (jako skládání funkcí)
- $\rho_{1} \leq X \times Y, \quad \rho_{2} \leq Y \times Z$
- $\rho_{1} \circ \rho_{2} = \{ (x, z) \mid x \in X, z \in Z, \exists \, y \in Y : x \, \rho_{1} \, y \wedge y \, \rho_{2} \, z \}$
- obecně nekomutativní, asociativní

Věta o asociativitě skládání
- $X, Y, Z, W, \quad \rho_{1} \leq X \times Y, \quad \rho_{2} \leq Y \times Z, \quad \rho_{3} \leq Z \times W$, pak platí $\rho_{1} \circ (\rho_{2} \circ \rho_{3}) = (\rho_{1} \circ \rho_{2}) \circ \rho_{3}$

Dk: $x \, [\rho_{1} \circ (\rho_{2} \circ \rho_{3})] \, w$
- $\exists \, y \in Y : x \, \rho_{1} \, y \wedge y \, (\rho_{2} \circ \rho_{3}) \, w$
- $\exists \, z \in Z : x \, \rho_{2} \, z \wedge z \,  \rho_{3} \, w$
- $\implies \exists \, y \in Y \exists z \in Z : x \rho_{1} y \wedge y \rho_{2} z \wedge z \rho_{3} w$
- $\implies x \, [(\rho_{1} \circ \rho_{2}) \circ \rho_{3}] \, w$

### Relace na množině

$\rho \leq X \times X$

Př.
- a) dělitelnost $\mathbb{N}$ - $a \, \rho \, b \iff a \mid b \quad \rho \leq \mathbb{N} \times \mathbb{N}$
	- $a \, \rho \, a \quad a \mid a \quad \forall \, a \in \mathbb{N} : a \mid a$ - reflexivita
	- $a \, \rho \, b \wedge b \, \rho \, a \quad \forall \, a \in \mathbb{N} : a \mid b \wedge b \mid a \implies a = b$ - slabá antisymetrie
	- $a \, \rho \, b \wedge b \, \rho \, c \quad \forall \, a, b, c \in \mathbb{N} : a \mid b \wedge b \mid c \implies a \mid c$ - tranzitivita
- b) inkluze
	- $A \, \rho \, B \iff A \subseteq B$
	- $\forall \, A \in X \quad A \subseteq A$ - reflexivní
	- $\forall \, A, B \in X \quad A \subseteq B \wedge B \subseteq A \implies A = B$ - slabě antisymetrická
	- $\forall \, A, B, C \in X \quad A \subseteq B \wedge B \subseteq C \implies A \subseteq C$ - tranzitivní
- c) $\leq R \quad$
	- $\forall \, a \in \mathbb{R} : a \leq a$ - reflexivní
	- $\forall \, a, b \in \mathbb{R} : a \leq b \wedge b \leq a \implies a = b$ - slabě antisymetrická 
	- $\forall \, a, b, c \in \mathbb{R} : a \leq b \wedge b \leq c \implies a \leq c$ - tranzitivní
	- $< \mathbb{R} \quad \forall \, a, b \in \mathbb{R} : a < b \implies b \cancel{\lt} a$ - silná antisymetrie

Vlastnosti
- $\rho \leq X \times X$
- $\rho$ reflexivní, pokud $\forall \, a \in X : a \, \rho \, a$
- $\rho$ slabě antisymetrická, pokud $\forall \, a, b \in X : a \, \rho \, b \wedge b \, \rho \, a \implies a = b$
- $\rho$ silně antisymetrická, pokud $\forall \, a, b \in X : a \, \rho \, b \wedge b \, \cancel\rho \, a$
- $\rho$ symetrická, pokud $\forall \, a, b \in X : a \, \rho \, b \wedge b \, \rho \, a$
- $\rho$ tranzitivní, pokud $\forall \, a, b, c \in X : a \, \rho \, b \wedge b \, \rho \, c \implies a \, \rho \, c$
- $\rho$ ekvivalentní, pokud $\rho$ je reflexivní, symetrická a tranzitivní
- $\rho$ tolerantní, pokud $\rho$ je reflexivní a symetrická

Třídy ekvivalence
- Př. Matice řádu $n$ ... $A \, \rho \, B \iff hod A = hod B$

### Rozklad množiny

$X, \{ B_{i} \}_{i \in I}$
1) $B_{i} \neq \emptyset \quad \forall \, i \in I$
2) $B_{i} \cap B_{j} = \emptyset \quad \forall \, i \neq j$
3) $\cup_{i\in I} \, B_{i} = X$

mezi ekvivalencí a rozklady existuje vzájemně jednoznačný vztah - bijekce

[?] kolik existuje rozkladů n-prvkové množiny

---

## Rekurentní počítání

- Př. (Fibonacciho čísla) - 1, 1, 2, 3, 5, 8, 13, ...
- Jak zjistit 1000. člen?
	- $F_{n} = F_{n-1} + F_{n-2}, \quad F_{1} = 1, F_{2} = 1$
	- $F_n$ jako funkce n?
	- $F_{n-1} = F_{n-1}$
	- $f_{n} = (F_{n}, F_{n-1})^T, \quad f_{n-1} = (F_{n-1}, F_{n-2})^T$
	- $F_{n} = \begin{bmatrix}1 & 1 \\ 1 & 0\end{bmatrix} f_{n-1} = \begin{bmatrix}1 & 1 \\ 1 & 0\end{bmatrix}^2 f_{n-2} = \begin{bmatrix}1 & 1 \\ 1 & 0\end{bmatrix}^{n-1} f_{1}$
	- $A = \begin{bmatrix}1 & 1 \\ 1 & 0\end{bmatrix}$
	- $f_{n} = A \cdot f_{n-1}$
	- $A = T \cdot J \cdot T^{-1}$
	- $A^n = T \cdot J^n \cdot T^{-1} = T \cdot J^n \cdot T^{-1} \cdot T \cdot J^n \cdot T^{-1} \cdot \dots \cdot T \cdot J^n \cdot T^{-1}$
