**Př. 1**: Vytvořte gramatiku, která bude nad abecedou $\{0, 1\}$ generovat řetězec obsahující lichý počet 0 a sudý počet 1.
- $\{0, 1\} \quad w \dots \text{lichý počet } 0 \text{, sudý počet } 1$
- 4 stavy

**Př. 2**:
- $S \to abA \mid bS \mid aa \mid A$
- $A \to abA$
- $B \to aS \mid baA \mid a$

a) Najděte $G'$ typu G3R takovou, že $L(G') = L(G)$.
+ $S \to bS | aS_{1} | aS_{2} \mid aS | bB_{1} | aB_{2} \mid aA_{1}$
+ $A \to aA_{1} \mid aS | bB_{1} | aB_{2}$
+ $B \to aS | bB_{1} | aB_{2}$
- $S_{1} \to bA$
- $B_{1} \to aA$
- $A_{1} \to bA$
- $S_{2} \to aS_{3}$
- $S_{3} \to e$
- $B_{2} \to e$

b) Vytvořte tabulku popisující nedeterministický konečný automat A takový, že platí $L(A) = L(G') = L(G)$.

|                    | a                                   | b              |
| ------------------ | ----------------------------------- | -------------- |
| $\to S$            | $\{S, S_{1}, S_{2}, A_{1}, B_{2}\}$ | $\{S, B_{1}\}$ |
| $S_{1}$            | -                                   | $\{A\}$        |
| $S_{2}$            | $\{S_{3}\}$                         | -              |
| $\leftarrow S_{3}$ | -                                   | -              |
| $A$                | $\{S, A_{1}, B_{2}\}$               | $\{B_{1}\}$    |
| $A_{1}$            | -                                   | $\{A\}$        |
| $B$                | $\{S, B_{2}\}$                      | $\{B_{1}\}$    |
| $B_{1}$            | $\{A\}$                             | -              |
| $\leftarrow B_{2}$ | -                                   | -              |

c) Vytvořte tabulku popisující deterministický konečný automat A' takový, že platí $L(A') = L(G') = L(G)$.

|                                                          | a                                              | b                     |
| -------------------------------------------------------- | ---------------------------------------------- | --------------------- |
| $\to S$ (0)                                              | $\{S, S_{1}, S_{2}, A_{1}, B_{2}\}$ (1)        | $\{S, B_{1}\}$ (2)    |
| $\leftarrow \{S, S_{1}, S_{2}, A_{1}, B_{2}\}$ (1)       | $\{S, S_{1}, S_{2}, S_{3}, A_{1}, B_{2}\}$ (3) | $\{S, A, B_{1}\}$ (4) |
| $\{S, B_{1}\}$ (2)                                       | $\{S, S_{1}, S_{2}, A, A_{1}, B_{2}\}$ (5)     | $\{S, B_{1}\}$ (2)    |
| $\leftarrow\{S, S_{1}, S_{2}, S_{3}, A_{1}, B_{2}\}$ (3) | $\{S, S_{1}, S_{2}, S_{3}, A_{1}, B_{2}\}$ (3) | $\{S, A, B_{1}\}$ (4) |
| $\{S, A, B_{1}\}$ (4)                                    | $\{S, S_{1}, S_{2}, A, A_{1}, B_{2}\}$ (5)     | $\{S, B_{1}\}$ (2)    |
| $\leftarrow\{S, S_{1}, S_{2}, A, A_{1}, B_{2}\}$ (5)     | $\{S, S_{1}, S_{2}, S_{3}, A_{1}, B_{2}\}$ (3) | $\{S, A, B_{1}\}$ (4) |

**Př. 3**: Sestrojte NKA $A$, kde platí $L(A) = L(G_{1})^R \cup L(G_{2})$.
- $G_{1}$
	- $S \to aS | bbA$
	- $A \to aaA | B$
	- $B \to bbB | e$
- $G_{2}$
	- $S \to Aba | Ab | B$
	- $A \to Aaa | B$
	- $B \to Bbb | e$
- G3L -> reverze -> G3P -> NKA -> reverze -> NKA

Plán
1) $A_{1} \qquad L(A_{1}) = L(G_{1})$
2) $A_{1}^R \qquad L(A_{1}^R) = L(A_{1})^R = L(G_{1})^R$
3) $G_{2}^R \qquad L(G_{2}^R) = L(G_{2})^R$
4) $A_{2}^R \qquad L(A_{2}^R) = L(G_{2}^R) = L(G_{2})^R$
5) $A_{2} \qquad A_{2} = (A_{2}^R)^R \quad L(A_{2}) = \dots = L(G_{2})$
6) $A \qquad L(A) = L(A_{1}^R) \cup L(A_{2}) = L(G_{1})^R \cup L(G_{2})$

$G_{2}^R$
- $S \to abA | bA | B$
- $A \to aaA | B$
- $B \to bbB | e$