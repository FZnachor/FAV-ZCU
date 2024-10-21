# Přehled

## Úvod

| značení    | popis           | význam                       |
| ---------- | --------------- | ---------------------------- |
| $A \cap B$ | průnik jevů     | jev A a zároveň jev B        |
| $A \cup B$ | sjednocení jevů | jev A nebo B (nebo oba jevy) |

Pravděpodobnost
- funkce, která jevům přiřazuje **číslo od 0 do 1** (0-100%)

## Sériově a paralelně řazené prvky

- platí u nezávislých jevů
- **pravděpodobnost poruchy**: $P$
- **spolehlivost**: $R = 1 - P$

Paralelní řazení
- značení $P_{1} \, p \, P_{2} \, p \dots \, p \,  P_{n}$
- $P = p_{1} \cdot p_{2} \cdot \ldots \cdot p_{n}$
- $R = 1 - p_{1} \cdot p_{2} \cdot \ldots \cdot p_{n}$

Sériové řazení
- značení $P_{1} \, s \, P_{2} \, s \, \dots \, s \, P_{n}$
- $P = 1 - (1-p_{1})\cdot(1-p_{2})\cdot\ldots\cdot(1-p_{n})$
- $R = (1-p_{1})\cdot(1-p_{2})\cdot\ldots\cdot(1-p_{n})$

### Podmíněná pravděpodobnost

Pravděpodobnost jevu $A$ za podmínky jevu $B$:

$\displaystyle P(B|A) = \frac{P(A \cap B)}{P(B)}$

Není možné prohodit!
- $P(A|B) \neq P(B|A)$
- ale $P(A|B) \, P(B) = P(B|A) \, P(A)$

## Obecné diskrétní rozdělené

Diskrétní veličina $X$ nabývá hodnot $x_{1}, x_{2}, \dots$

**Střední hodnota**
- $\displaystyle EX = \sum^\infty_{i=1} x_{i} \cdot P(X = x_{i})$

**Rozptyl**
- $\displaystyle\text{var} \, X = \sum^\infty_{i=1} x_{i}^2 \cdot P(X = x_{i}) - (EX)^2$

### Počítání pravděpodobností

$P(X \leq x_{i}) = F(x_{i}) = P(X = x_{1}) + P(X = x_{2}) + \dots + P(X = x_{i})$

$P(X < x_{i}) = F(x_{i}) = P(X = x_{1}) + P(X = x_{2}) + \dots + P(X = x_{i-1})$

Větší než
- $P(X \geq x_{i}) = 1 - P(X < x_{i})$
- $P(X > x_{i}) = 1 - P(X \leq x_{i})$

### Distribuční funkce

$F(x) = P(X \leq x)$
