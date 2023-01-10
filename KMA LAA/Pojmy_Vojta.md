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

###  báze L.V.P., dimenze L.V.P., podprostor
- **báze L.V.P.**
    - množina LN vektorů, které generují daný prostor
- **dimenze L.V.P.**
    - počet prvků báze
    - značí se: $dim(V)$
- **podprostor**
    - máme lineární vektorový prostor $V$ a jeho podprostor $U \subset V$, jestliže
        - 1. pro každé $\vec{u}, \vec{v} \in U$ je $\vec{u} + \vec{v} \in U$
        - 2. pro každé $\vec{u} \in U$ a pro každé $a \in K$ je $a \cdot \vec{u} \in U$
	- vyplývá, že v podprostoru $U$ bude vždy i nulový vektor ($a = 0$)

    - každý podprostor vektorového prostoru je také vektorovým prostorem

### ortogonální doplněk podprostoru
- máme $V\leftarrow$ podprostor Eukleidovského prostoru $W$
- **ortogonální doplněk $V^{\perp}$ podprostoru** $V$ v $U$ je množina všech vektorů z $U$, které jsou kolmé na $V$
- $V^{\perp} = \{ \vec u \in U; \forall \space \vec v \in V; \vec u \perp \vec v \}$
- $dim(V) + dim(V^{\perp}) = dim(W)$

### lineárně závislé prvky, lin. kombinace prvků
- **lineárně závislé prvky**
    - máme L. V. P.: $V$
    - máme prvky $\vec v_1, \vec v_2, ..., \vec v_n \in V$ a koeficienty $\lambda_1, \lambda_2, ..., \lambda_n \in \mathbb{R}$
    - prvky jsou **lineárně závislé** (LZ) pokud LK $\neq 0$: $\lambda_1 * \vec v_1 + \lambda_2 * \vec v_2 + ... + \lambda_n * \vec v_n \neq 0$
- **lineárně nezávislé prvky**
    - máme L. V. P.: $V$ 
    - máme prvky $\vec v_1, \vec v_2, ..., \vec v_n \in V$ a koeficienty $\lambda_1, \lambda_2, ..., \lambda_n \in \mathbb{R}$
    - prvky jsou **lineárně nezávislé** (LN) pokud LK $\neq 0$: $\lambda_1 * \vec v_1 + \lambda_2 * \vec v_2 + ... + \lambda_n * \vec v_n = 0$
- **lineární kombinace prvků**
    - máme L. V. P.: $V$ 
    - máme prvky $\vec v_1, \vec v_2, ..., \vec v_n \in V$ a koeficienty $\lambda_1, \lambda_2, ..., \lambda_n \in \mathbb{R}$
    - **lineární kombinace prvků**: $\lambda_1 * \vec v_1 + \lambda_2 * \vec v_2 + ... + \lambda_n * \vec v_n$

### kvadratická forma, inercie, definitnost kvadratické formy, hlavní minor
- **kvadratická forma**
    - Nechť **A** je reálná symetrická matice řádu n
    - **kvadratická forma** určená maticí **A** je zobrazení $\kappa(\vec{x}) = \vec{x}^{T}A\vec{x}$
- **inercie**
    - Nechť $\kappa(\vec{x}) = \vec{x}^{T}A\vec{x}$ je kvadratická forma, **A** reálná symetrická matice
    - **inercie** je Trojice čísel ($k$, $z$, $d$)
        - $k$ - počet kladných vlastních čísel matice **A**;
        - $z$ - počet záporných vlastních čísel matice **A**;
        - $d$ - počet nulových vlastních čísel matice **A**.
- **definitnost kvadratické formy**
    - vyjadřuje, jakých hodnot nabývá forma pro všechny nenulové vektory
    - pozitivně definitní:  $in(\kappa) = (k, 0, 0)$
    - negativně definitní: $in(\kappa) = (0, z, 0)$
    - pozitivně semidefinitní: $in(\kappa) = (k, 0, d)$
    - negativně semidefinitní: $in(\kappa) = (0, z, d)$
    - indefinitní: $in(\kappa) = (k, z, d)$

- **hlavní minor**
    - Nechť $A = [a_{ij}]$ je reálná symetrická matice řádu $n$ a $A_k$ je její podmatice obsahující prvky $a_{11}, a_{12}, \dots, a_{kk}$. Potom číslo $\det(A_k)$ nazveme **hlavním minorem matice** $A$ **řádu** $k$ a značí se $\Delta _{k}$.

### kořen polynomu, stupeň polynomu
- Nechť $p(x)$ je polynom proměnné $x$
- **kořenem polynomu** $p(x)$: $c \in C$ takové, že $p(c) = 0$
- **stupeň polynomu**: nejvyšší mocnina proměnné x u níž je nenulový koeficient

### diagonální, symetrická, trojúhelníková, . . . matice
- **diagonální matice**
	- čtvercová matice s nenulovými čísly pouze na hlavní diagonále
	- pro $i \neq j : A_{ij} = 0$
	$$diag\{1, -3, 0\} = A = \begin{bmatrix} -1 & 0 & 0 \\ 0 & -3 & 0 \\ 0 & 0 & 0 \end{bmatrix}$$

- **symetrická matice**
    - čtvercová matice, kde se $a_{ij}$ rovná $a_{ji}$
	- $\forall i, j : a_{ij} = a_{ji}$
	$$A_{1} = \begin{bmatrix} 1 & \underline{2} & \underline{1} \\ \underline{2} & 1 & \underline{0} \\ \underline{1} & \underline{0} & 3 \end{bmatrix}$$

- **Antisymetrická matice**
	- čtvercová matice, kde se $a_{ij}$ rovná $-a_{ji}$
	- na hlavní diagonále musí mít nuly, protože $0 = -0$
	- $\forall i, j : a_{ij} = -a_{ji}$
	$$A_{2} = \begin{bmatrix} 0 & \underline{2} & \underline{-1} \\ \underline{-2} & 0 & \underline{3} \\ \underline{1} & \underline{-3} & 0 \end{bmatrix}$$
	- **Poznámka**: V antisymetrické matici jsou všechny prvky $a_{ii} = 0$

- **trojúhelníková matice**
	- Pro **horní trojúhelníkovou** platí pro všechna $i > j$, že $a_{ij} = 0$ 
	- Pro **dolní trojúhelníkovou** platí pro všechna $i < j$, že $a_{ij} = 0$
	$$H = \begin{bmatrix} 1 & 2 & 1 \\ 0 & 3 & 0 \\ 0 & 0 & 4 \end{bmatrix} \quad D = \begin{bmatrix} 1 & 0 & 0 \\ 2 & 2 & 0 \\ 1 & 1 & 0 \end{bmatrix}$$

### Ortogonální průmět a jeho vlastnosti
- Nechť V je euklidovský prostor
- Nechť $U$ je podprostor prostoru $V$
- nechť $v \in V$, $v \notin U$
- **ortogonální průmět** prvku $v$ do podprostoru $U$ je prvek $v_0$ pokud platí:
    - $v_0 \in U$
    - $(v - v_0) \perp U$
- ortogonální průmět $v_0$ tedy realizuje vzdálenost $v$ od $U$ (vzdálenost je zde definována )

### Norma
- máme $L. V. P.: V$
- norma je zobrazení $||x||: V \rightarrow R$
    - 1. $$||x+y|| \leq ||x|| + ||y|| \ \forall {x,y} \in V $$
    - 2. $$ ||\lambda * x|| = ||\lambda|| * ||x|| \ \forall {x} \in V \ \forall \lambda \in \mathbb R$$
    - 3. $||x|| \geq 0 \ \forall x  \in \mathbb R, \ ||x|| = 0 <=> x = 0$