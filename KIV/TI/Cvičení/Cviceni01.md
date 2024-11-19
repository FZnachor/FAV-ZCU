## Rozklad množiny

Rozklad množin je množina podmnožin, které jsou
- neprázdné,
- vzájemně disjunktní,
- sjednocením je celá množina.

## Kartézský součin

- značí se $A \times B$
- $\{ (a, b) \mid a \in A \wedge b \in B \}$

Vlastnosti
- není komutativní ($A \times B \neq B \times A$)
- je asociativní
	- $A = \{ 1, 2 \}, B = \{ a, b \}, C = \{ 3, 4 \}$
	- $(A \times B) \times C = \{ ((1, a), 3), ((1, a), 4), \dots, ((2, b), 4) \}$
	- $A \times (B \times C) = \{ (1, (a, 3)), (1, (a, 4)), \dots, (2, (b, 4)) \}$
	- pro nás není podstatná struktura
		- $A \times B \times C = \{(1, a, 3), (1, a, 4), (2, b, 4)\}$

## Binární relace

Binární relace je libovolnou podmnožinou Kartézského součinu.

Inverzní relace
- $b \, R^{-1}\, a \iff a \, R \, b$

Složená relace (kompozice)
- $\alpha \subseteq A \times B$
- $\beta \subseteq B \times C$
- $\gamma = \alpha \circ \beta \subseteq A \times C$

## Příklad

- $A = \{ 1, 2, 3 \}$
- $B = \{ 2, -3 \}$
- $C = \{ a, b, c \}$

+ $R \subseteq A \times B = \{ (1, 2), (1, -3), (2, 2), (2, -3) \}$
+ $S \subseteq B \times C = \{ (2, a), (-3, c) \}$

- $R \circ S = \{ (1, a), (2, a), (1, c), (2, c) \}$

## Relace na množině

$R \subseteq A \times A$
- množina $A = \{ 1, 2, 3 \}$
- relace $R = \{ (1, 1), (1, 2), (1, 3), (2, 2), (2, 3), (3, 3) \}$

## Funkce

$F: A \to B \quad f \subseteq A \times B$
- $\forall \, a \in A : \exists! \, b \in B : a \, f \, b$

Je inverzní relace k funkci také funkcí?
- pouze v případě, že je funkce injektní