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

### lineární, identické zobrazení, jádro, obraz, matice lineárního zobrazení a přechodu
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

- **matice přechodu**
    - Máme ***L. V. P.***: $U, V$ a ***linerní zobrazení*** $\mathbb{L} : U \rightarrow V$
    - **matice přechodu $T$** je matice pro kterou platí: $T* \vec x_c = \widehat {I * \vec x_d}$
    - matice přechodu $T$ od báze $D$ k bázi $C$

### determinant matice, hodnost matice, algebraický doplněk matice
- **determinant**
    - **Determinantem** čtvercové matice $A = [a_{ij}]$ řádu $n$ nazveme číslo
    - $$\det(A) = \sum_{\pi}^{} zn(\pi)a_{1\pi(1)}a_{2\pi(2)}\dots a_{n\pi(n)}$$
    - kde sčítáme přes všechny permutace na množině $\{1, 2, \dots, n\}$.
    - součet všech permutací vzniklých z diagonálního řádku matice, kde sudá permutace je s kladným znaménkém a lichá se záporným
    - v součinu prvků v definici determinantu je z každého řádku a z každého sloupce vybrán právě jeden prvek

- **hodnost matice**
    - počet nenulových řádků / sloupců matice
    - **dimenze lineárního obalu souboru řádků / sloupců matice**
    - Je to číslo, které představuje maximální počet lineárně nezávislých řádků / sloupců matice.

- **algebraický doplněk matice**
    - Subdeterminant (minor) vzniklý z matice vynecháním $i$-tého řádku a $j$-tého sloupce.
    - $(-1)^{i+j} * \det A[\cancel{i/j}]$

### polynom proměnné x
- polynom je funkce ve tvaru součtu násobků mocninných funkcí
- $$\displaystyle p(x) = \sum^n_{i=0} a_{i}x^i \ \ \forall x \in C, a_{n} \neq 0$$

- $$p(x) = a_nx^n + a_{n-1}x^{n-1} + . . . + a_{1}x + a_0 \ \ \ \forall x \in C, a_{n} \neq 0$$

### vlastní číslo, vektor, spektrum matice
- **vlastní číslo matice**
    - máme čtvercovou matici - $A$, vlastní vektor matice $A$ - $\vec{u}$, vlastní číslo matice $A$ - $\lambda$
    - pro vlastní číslo musí platit: $A * \vec u = λ * \vec u$

- **spektrum matice**
    - Nechť A je čtvercová matice
    - soubor všech vlastních čísel matice A
    - značí se $Sp(A)$
    	- např.: $Sp(A) = \{3^2; -1\}$

- **vlastní vektor matice**
    - Nechť A je čtvercová matice
    - **nenulový** vektor $\vec u$ je vlastním vektorem matice $A$ příslušnému vlastnímu číslu $\lambda$, jestliže $A * \vec u = λ * \vec u$