# Pojmy z LAA
### inverzní matice, regulární a singulární matice
- **inverzní matice**
    - X je inverzní k A, jestliže platí $A * X = X * A = I$

- **regulární matice**
    - **čtvercová** matice
    | vlastnost                                 | výraz                     |
    | ----------------------------------------- | ------------------------- |
    | její **hodnost** se rovná jejímu **řádu** | $hod(A) = n$              |
    | má **nenulový determinant**               | $\det{A} \neq 0$          |
    | **existuje** k ní **inverzní matice**     | $\text{existuje } A^{-1}$ |
    - Každou **regulární matici** lze řádkovými elementárními úpravami převést **na jednotkovou matici**.

- **singulární matice**
    | vlastnost                                  | výraz                       |
    | ------------------------------------------ | --------------------------- |
    | její **hodnost** je **menší než její řád** | $hod(A) < n$                |
    | má **nulový determinant**                  | $\det{A} = 0$               |
    | **neexistuje** k ní **inverzní matice**    | $\text{neexistuje } A^{-1}$ |

### lineární, identické zobrazení, jádro, obraz, matice lineárního zobrazení
- zobrazení (funkce) => množiny M do množiny N je předpis, kdy každému prvku z M je přiřazen právě jeden prvek z N
- **lineární zobrazení** (homomorfizmus)
    - máme ***L. V. P.***: $U, V$
    - Zobrazení $\mathbb{L} : U \rightarrow V$ je **lineární zobrazení** pokud $\forall x, y \in U$ a $\forall c \in \mathbb{R}$ platí:
        - 1. $\mathbb{L}(x+y) = \mathbb{L}(x) + \mathbb{L}(y)$
        - 2. $\mathbb{L}(c*x) = c * \mathbb{L}(x)$

- **identické zobrazení**
    - zobrazení $\mathbb{F}$ pro které platí $\mathbb{F}(x) = (x)$

- **jádro**
    - Máme ***L. V. P.***: $U, V$ a ***linerní zobrazení*** $\mathbb{L} : U \rightarrow V$
    - **jádro lineárního zobrazení** $\mathbb{L}$ je množina všech prvků $x \in U$ takových, že $\mathbb{L}(x) = 0_v$:
        - Ker($\mathbb{L}) = \left \{  x \in U; \mathbb{L}(x) = 0_v\right \}$

- **obraz**
    - Máme ***L. V. P.***: $U, V$ a ***linerní zobrazení*** $\mathbb{L} : U \rightarrow V$
    - **obraz lineárního zobrazení** $\mathbb{L}$ je množina všech prvků $y \in V$ takových, že $\exists \space x \in U$ tak, že $\mathbb{L}(x) = y$:
        - $Im \space \mathbb{L} = \{y \in V; \space \exists x \in U, \space \mathbb{L}(x) = y \}$

- **matice lineárního zobrazení**
    - Máme ***L. V. P.***: $U, V$ a ***linerní zobrazení*** $\mathbb{L} : U \rightarrow V$
    - **matice lineárního zobrazení** je matice M pro kterou platí: $\widehat{\mathbb{L}(u)} = M * \vec u$
    - M = [$\widehat{\mathbb{L}(u_1)}  \space\space \widehat{\mathbb{L}(u_2)} \space\space ... \space\space \widehat{\mathbb{L}(u_n)}$]