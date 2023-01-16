# Pojmy z LAA

**Zobrazení** - Předpis $f : X \to Y$, kdy prvkům z X přiřazujeme prvky z Y (např. reálná funkce).

**Komplexní čísla** - Číslo $z = a+bi$, kde $a, b \in \mathbb{R};$ a $\text{Re}(z) = a, \text{Im}(z) = b;$ hodnota $i = \sqrt{-1}$.

### Polynomy

**Polynom** - Polynomem proměnné $x$ je předpis (funkce) $p(x) = a_{n}x^n + \dots + a_{1}x + a_{0}$.
- $p(x) = \sum_{i=0}^{n} a_{i}x^i \quad \forall x \in \mathbb{C}, a_{n} \neq 0$

**Koeficienty polynomu $p(x)$** - Hodnoty $a_{i}$ v předpisu polynomu.

**Stupeň polynomu $p(x)$** - Největší $k$, pro něž je $a_{k}$ nenulové, značíme $\text{st}(p(x))$.

**Nulový polynom** - Polynom $p(x)$, který má všechny koeficienty nulové, poté platí $\text{st}(p(x)) = -\infty$.

**Kořen polynomu** - Číslo $c \in \mathbb C$, pro které platí $p(c) = 0$.

### Matice

**Matice typu $m/n$** - Soubor (tabulka) $m \times n$ prvků (čísel) $a_{ij}$ zapsaných do $m$ řádků a $n$ sloupců, obvykle $a_{ij} \in \mathbb C$.

Správně bychom měli definovat: Matice **A** typu $m/n$ je zobrazení $\{1, 2, \dots, m\} \times \{1, 2, \dots, n\} \to \mathbb C$ (nebo speciálně $\mathbb R$).

Názvosloví:
- $(i, j)$ - pozice v matici
- $a_{ij}$ - prvek na pozici $(i, j)$
- $i$ - řádkový index
- $j$ - sloupcový index
- $a_{kk}$ - diagonální prvek matice
- $m/n$ - typ matice: $m$ řádků, $n$ sloupců

Tvary
- **Čtvercová matice** - matice typu $m/n$, kde $m=n$
- **Obdélníková matice** - matice typu $m/n$, kde $m \neq n$
- **$m$-složkový sloupcový vektor** - matice typu $m/1$
- **$n$-složkový řádkový vektor** - matice typu $1/n$

**Nulová matice** - Matice typu $m/n$, jestliže $a_{ij} = 0$ pro každé $i, j$, značíme ji 0.

**Diagonální matice** - Čtvercová matice, pro kterou platí $a_{ij} = 0$ jestliže $i \neq j$, zapisujeme $A = \text{diag}(a_{11}, a_{22}, a_{nn})$.

**Jednotková matice** - Diagonální matice, pro kterou platí $a_{ii} = 1$, značí se $I$.

**Symetrická matice** - Čtvercová matice, pro kterou platí $a_{ij} = a_{ji}$.

**Antisymetrická matice** - Čtvercová matice, pro kterou platí $a_{ij} = -a_{ji}$ (a $a_{ii} = 0$).

**Horní trojúhelníková matice** - Matice, pro kterou platí $a_{ij} = 0$ pro všechna $i > j$.

**Dolní trojúhelníková matice** - Matice, pro kterou platí $a_{ij} = 0$ pro všechna $i < j$.

**Rovnost** - Matice **A** a **B** jsou si rovny, jestliže jsou stejného typu a platí $a_{ij} = b_{ij}$ pro všechna $i, j$, píšeme **A** = **B**.

**Sčítání matic** - Sčítáme matice stejného typu po prvcích ($c_{ij} = a_{ij} + b_{ij}$), zapisujeme $C = A + B$.
- $A+B = B+A$
- $A+(B+C) = (A+B)+C$
- $A+0 = 0+A = A$
- $(A+B)^T = A^T + B^T$

**Násobení matice konstantou** - Zapisujeme $C = k \cdot A$, kde $k \in \mathbb{C}$. Každý prvek vynásobíme číslem $k$.
- $0 \cdot A = 0$
- $k(A+B) = kA + kB$
- $(k_{1}+k_{2})A = k_{1}A + k_{2}B$
- $(k_{1}k_{2})A = k_{1}(k_{2}A)$
- $1A = A$
- $-1A = -A$
- $(kA)^T = kA^T$

**Násobení dvou matic** - Zapisujeme jako $C = A \cdot B$, kde A je typu m/**n** a B je typu **n**/p. Platí, že $c_{ij} = a_{i1}b_{1j} + a_{i2}b_{2j} + \dots + a_{in}b_{nj}$. Násobení dvou matic není komutativní.
- $A(BC) = (AB)C$
- $(A+B)C = AC + BC$
- $A(B+C) = AB + AC$
- $(AB)^T = B^TA^T$
- $k(AB) = (kA)B = A(kB)$

**Opačná matice** - Matice $[-a_{ij}]$ k matici **A**, značíme -**A**.

**Transponovaná matice** - Matice $[a_{ji}]$ typu $n/m$ k matici $A = [a_{ij}]$ typu $m/n$.

**Mocniny matice** - Nultá mocina $A^0 = I$, $k$-tá mocnina $A^k = A \cdot A \cdot \dots \cdot A$.

**Inverzní matice** - Matice $A^{-1}$ je inverzní matice ke čtvercové matici A, pro kterou platí, že $A \cdot A^{-1} = A^{-1} \cdot A = I$.

**Rozšířená matice soustavy** -  Matice $A^R = [A | \vec b]$, kde matice $A$ obsahuje vektory neznámých a $\vec{b}$ je vektor pravých stran.

**Pivot v řádku $i$** - První nenulový prvek v tomto řádku (bráno zleva).

**Matice ve stupňovitém tvaru** - Matice **A**, kde pro každý řádek platí:
1. Je-li v $i$-tém řádku pivot na pozici $j$, ve všech dalších řádcích je na pozici $j' > j$.
2. Je-li řádek nulový, každý další je také nulový.

### Lineární vektorové prostory

**Lineární vektorový prostor nad tělesem $\mathbb T$** - Neprázdná množina $\mathcal{V}$, kde pro každé $\vec x, \vec y, \vec z \in \mathcal{V}$ a pro každé $k, l \in \mathbb T$
- $\exists!\space \vec u \in \mathcal{V}$ tak, že $\vec u = \vec x + \vec y$,
- $\exists!\space \vec u \in \mathcal{V}$ tak, že $\vec u = k \vec x$,
- $(\vec x + \vec y) + \vec z = \vec x + (\vec y + \vec z)$,
- existuje prvek $\vec o \in \mathcal{V}$ takový, že $\vec x + \vec o = \vec o + \vec x = \vec x$,
- $(k+l)\vec x = k\vec x + l\vec x$,
- $(kl)\vec x = k(l\vec x)$,
- $1\vec x = \vec x$,
- $k(\vec x + \vec y) = k\vec x + k\vec y$.

**Lineární kombinace** - Prvek $\lambda_{1} \vec v_{1} + \lambda_{2} \vec v_{2} + \dots + \lambda_{k} \vec v_{k}$, kde $\vec v_{i}$ jsou prvky LVP $\mathcal{V}$ a $\lambda_{i}$ jsou koeficienty.

**Lineární (ne)závislost** - Prvky $\vec v_{i}$ nazveme **LN** pouze tehdy, pokud $\lambda_{1} \vec v_{1} + \lambda_{2} \vec v_{2} + \dots + \lambda_{k} \vec v_{k} = \vec o$ jedině když $\lambda_{i} = 0$, v opačném případě se prvky nazývají **LZ**.

**Podprostor** - Nechť $\mathcal{V}$ je LVP a $\mathcal{V}' \subset \mathcal{V}$. Prostor $\mathcal{V}'$ je podprostorem LVP $\mathcal{V}$, jestliže
1. pro každé $\vec x_{1}, \vec x_{2} \in \mathcal{V}'$ je $\vec x_{1} + \vec x_{2} \in \mathcal{V}'$,
2. pro každé $\vec x \in \mathcal{V}'$ a pro každé $\lambda \in \mathbb R$ je $\lambda\vec x \in \mathcal{V}'$.

**Lineární obal množiny** - Nechť $M = \{ \vec v_{1}, \vec v_{2}, \dots, \vec v_{k} \} \subseteq \mathcal{V}$. Množinu $\langle M \rangle$ všech lineárních kombinací prvků $\vec v_{i}$ nazveme lineárním obalem množiny $M$.

**Generující množina LVP** - Množina $M$, která generuje LVP $\mathcal{V}$, jestliže $\langle M \rangle = \mathcal{V}$.

**Konečně generovaný prostor** - Prostor, ve kterém existuje konečná množina generující $\mathcal{V}$.

**Báze prostoru $\mathcal{V}$** - Lineárně nezávislá množina, která generuje prostor $\mathcal{V}$.

**Dimenze $\mathcal{V}$** - Počet prvků báze LVP $\mathcal{V}$, značí se $\dim(\mathcal{V})$.

**Souřadnice prvku** - Nechť $\mathcal{V}$ je nenulový konečně generovaný LVP, $\vec v \in \mathcal{V}$ a nechť $B = \{\vec b_{1}, \vec b_{2}, \dots, \vec b_{k}\}$ je jeho uspořádaná báze. Jednoznačně určené koeficienty $c_{1}, c_{2}, \dots, c_{n} \in \mathbb{R}$ lineární kombinace $\vec{v} = c_{1}\vec{b_{1}}, c_{2}\vec{b_{2}}, \dots, c_{n}\vec{b_{n}}$ se nazývají souřadnice prvku $\vec v$ v bázi $B$, značí se $\widehat{\vec v_{B}} = [c_{1}, c_{2}, \dots, c_{n}]^T$.

### Determinant matice

**Permutace** - Vzájemně jednoznačné zobrazení konečné množiny na sebe.

**Transpozice** - Permutace $\pi$, pro kterou existují $i, j$ takové, že $\pi(i) = j, \pi(j) = i$ a $\pi(k) = k$ pro všechna $k \neq i, j$.

**Znaménko permutace $\pi$** - Číslo 1, je-li permutace sudá a -1, je-li permutace lichá (skládá se ze sudého/lichého počtu transpozice).

**Determinant** - Determinantem čtvercové matice $A = [a_{ij}]$ řádu $n$ nazveme číslo $\displaystyle\det A = \sum_{\pi} zn(\pi) a_{1\pi(1)} a_{2\pi(2)} \dots a_{n\pi(n)}$, kde sčítáme přes všechny permutace na množině $\{ 1, 2, \dots, n \}$.

**Algebraický doplněk prvku $a_{ij}$** - Číslo $A_{ij} = (-1)^{i+j} \det A[\cancel{i/j}]$, kde matice A je čtvercová.

### Hodnost matice

**Řádkový (sloupcový) prostor** - Nechť A je typu $m/n$. Lineární obal všech řádkových (sloupcových) vektorů (řádků/sloupců) matice A nazveme **řádkovým (sloupcovým) prostorem** matice A.

**Řádková (sloupcová) hodnost matice** - Dimenze řádkového (sloupcového) prostoru matice A nazveme řádkovou (sloupcovou) hodností matice A, značíme $\text{hod}^r(A)$, resp. $\text{hod}^s(A)$.

**Hodnost matice** - Hodností matice A nazveme $\text{hod}^r(A)$

**Minor řádu $m$** - Determinant libovolné čtvercové podmatice řádu $m$.

**Regulární (singulární) matice** - Čtvercovou matici A řádu $n$ nazveme regulární, je-li $\text{hod}(A) = n$, jinak ji nazveme singulární (tj. $\text{hod}(A) < n$).

**Adjungovaná matice k matici A** - Matice poskládaná transponovaně z algebraických doplňků, značí se $A^A$.

### Lineární zobrazení

Nechť $\mathcal{U}, \mathcal{V}$ jsou LVP a $\mathbb L : \mathcal{U} \to \mathcal{V}$ lineární zobrazení.

**Lineární zobrazení (homomorfizmus)** - Zobrazení $\mathbb L : \mathcal{U} \to \mathcal{V}$ kde $\mathcal{U}, \mathcal{V}$ jsou LVP, jestliže pro každé $\vec x, \vec y \in \mathcal{U}$ a pro každé $c \in \mathbb R$ platí:
1. $\mathbb{L}(\vec x + \vec y) = \mathbb{L}(\vec x) + \mathbb{L}(\vec y)$
2. $\mathbb{L}(c \cdot \vec x) = c \cdot \mathbb{L}(\vec x)$

**Identické zobrazení** - Zobrazení $\mathbb F$ definované vztahem $\mathbb F(x) = (x)$.

**Jádro lineárního zobrazení** - Množina všech prvků $\vec x \in \mathcal{U}$ takových, že $\mathbb L(\vec x) = \vec o_{v}$. Značíme ji $\text{Ker}(\mathbb L) = \{ \vec x \in \mathcal{U}; \mathbb L(\vec x) = \vec o_{v} \}$.

**Obraz lineárního zobrazení** - Množina všech prvků $\vec y \in \mathcal{V}$ takových, že existuje $\vec x \in \mathcal{U}$ tak, že $\mathbb L(\vec x) = \vec y$. Značí se $\text{Im}(\mathbb L) = \{ \vec y \in \mathcal{V}; \exists \vec x \in \mathcal{U}, \mathbb L(\vec x) = \vec y \}$.

**Izomorfní zobrazení** - Lineární zobrazení $\mathbb L$, jestliže je prosté a zároveň na.

**Izomorfní prostory** - Prostory $\mathcal{U}, \mathcal{V}$, pokud existuje izomorfní zobrazení z $\mathcal{U}$ do $\mathcal{V}$.

**Matice lineárního zobrazení** - Nechť $\mathcal{U}, \mathcal{V}$ jsou LVP a $\mathbb{L} : \mathcal{U} \to \mathcal{V}$ lineární zobrazení. **Matice lineárního zobrazení** je matice M pro kterou platí: $\widehat{\mathbb{L}(\vec{u})} = M \cdot \vec u$.
- $M = \begin{bmatrix}\widehat{\mathbb{L}(\vec{u}_1)} & \widehat{\mathbb{L}(\vec{u}_2)} & \dots & \widehat{\mathbb{L}(\vec{u}_n)}\end{bmatrix}$

**Matice přechodu** - Nechť $\mathcal{U}, \mathcal{V}$ jsou LVP a $\mathbb{L} : \mathcal{U} \to \mathcal{V}$ lineární zobrazení. Matice přechodu $T$ od báze $D$ k bázi $C$ je matice, pro kterou platí: $T \cdot \vec{x}_{c} = \widehat{I \cdot \vec{x}_{d}}$.

### Soustavy lineárních rovnic

**Řešení soustavy rovnic** - Každý vektor $\overline {\vec x} \in \mathbb R^n$, pro nějž platí $A\overline {\vec x} = \vec b$.

**Ekvivalentní soustavy** - Dvě soustavy, které mají stejnou množinu řešení.

**(Ne)homogenní soustava** - Soustava rovnic se nazývá **homogenní**, jestliže $\vec b = \vec o$. V opačném případě se nazývá **nehomogenní**.

### Vlastní čísla a vlastní vektory

**Vlastní číslo matice A** - Nechť A je čtvercová matice řádu $n$. Číslo $\lambda \in \mathbb C$ nazveme vlastním číslem matice A, jestliže existuje nenulový vektor $\vec u \in \mathbb R^n$ takový, že $\lambda \vec u = A\vec u$.

**Vlastní vektor** - Vektor $\vec u$ příslušející vlastnímu číslu $\lambda$, pro který platí $\lambda \vec u = A\vec u$.

**Charakteristický polynom** - Polynom $\det(A-\lambda I)$ se nazývá charakteristický polynom matice A, která je čtvercová.

**Charakteristická rovnice** - Rovnice $\det(A - \lambda I) = 0$, kde se charakteristický polynom rovná nule.

**Spektrum matice** - Soubor všech vlastních čísel matice A, značíme ho $\text{Sp}(A)$.
- $\text{Sp}(A) = \{ 3^2; -1 \}$

**Podobnost matice** - Matice A a B jsou čtvercové, matice A je podobná matici B, jestliže existuje regulární matice T taková, že $A = T^{-1}BT$. Značíme $A \approx B$.

**Lineární operátor** - Lineární zobrazení $\mathbb L : \mathcal{U} \to \mathcal{U}$.

**Řetězec zobecněných vlastních vektorů** - Uspořádaná $k$-tice vektorů $\vec u_{i}$ je řetězcem zobecněných vlastních vektorů, kde A je čtvercová matice a $\lambda$ je vlastní číslo matice A, jestliže
- $(A-\lambda I)\vec u_{1} = \vec o, \vec u_{1} \neq \vec o$,
- $(A-\lambda I)\vec u_{2} = \vec u_{1}$,
- $\dots$
- $(A-\lambda I)\vec u_{k} = \vec u_{k-1}$,

a $k$ je nejmenší číslo, pro něž je $(A-\lambda I)^k = \vec O$.

**Zobecněný vlastní vektor** - Vektor $\vec u_{1}$ je vlastní vektor příslušející vlastnímu číslu $\lambda$. Pro každé $j = 1,2,\dots,k$ se nazývá $j$-tý zobecněný vlastní vektor příslušející vlastnímu číslu $\lambda$.

### Prostory se skalárním součinem

**Skalární součin** - Zobrazení $(\vec x, \vec y) : \mathcal{U} \times \mathcal{U} \to \mathbb{R}$ splňující vlastnosti
1. $(\vec x, \vec x) \geq 0$ pro každé $\vec x \in \mathcal{U}; (\vec x,\vec x) = 0$, právě když $\vec x = \vec o$,
2. $(\vec x, \vec y) = (\vec x, \vec y) \space \forall\vec x, \vec y \in \mathcal{U}$,
3. $(k\vec x, \vec y) = k(\vec x, \vec y) \space \forall\vec x, \vec y \in \mathcal{U}, \forall k \in \mathbb{R}$,
4. $(\vec x + \vec y, \vec z) = (\vec x, \vec z) + (\vec y, \vec z) \space \forall\vec x, \vec y, \vec z \in \mathcal{U}$,

kde $\mathcal{U}$ je LVP nad $\mathbb{R}$.

**Eukleidovský prostor** - LVP se skalárním součinem.

**Norma** - Zobrazení $\Vert \text.\Vert : \mathcal{U} \to \mathbb{R}$ v lineárním vektorovém prostoru $\mathcal{U}$, které má vlastnosti
1. $\Vert \vec{x} \Vert \geq 0 \, \forall \vec{x} \in U;\space \Vert \vec{x} \Vert = 0$ právě když $\vec{x} = \vec{o}$,
2. $\Vert k\vec{x} \Vert = \vert k \vert \cdot \Vert \vec{x} \Vert \ \forall\vec{x} \in U$ a $\forall k \in \mathbb{R}$,
3. $\Vert \vec{x} + \vec{y} \Vert \leq \Vert \vec{x} \Vert + \Vert \vec{y} \Vert \ \forall \vec{x}, \vec{y} \in \mathbb{R}$.

**Ortogonální prvky** - Dva prvky $\vec x, \vec y$ Eukleidovského prostoru, jestliže $(\vec x, \vec y) = 0$. Píšeme $\vec x \perp \vec y$. Množiny $X, Y \subset \mathcal{U}$ jsou ortogonální, jestliže $\vec x \perp \vec y$ pro každé $\vec x \in X, \vec y \in Y$.

**Ortogonální průmět** - Nechť $\mathcal{V}$ je Eukleidovský prostor, $\mathcal{U}$ podprostor $\mathcal{V}$ a $\vec{v} \in \mathcal{V}, \vec{v} \notin \mathcal{U}$. **Ortogonální průmět** prvku $\vec{v}$ do podprostoru $\mathcal{U}$ je prvek $\vec{v}_{0}$, pokud platí:
- $\vec{v}_{0} \in \mathcal{U}$,
- $(\vec{v}-\vec{v}_{0}) \perp \mathcal{U}$.

**Ortogonální báze** - Báze Eukleidovského prostoru, jejíž každé dva prvky jsou ortogonální.

Unitární prostor ??

**Ortogonální doplňek** - Ortogonální doplněk $\mathcal{V}^{\perp}$ podprostoru $\mathcal{V}$ v $\mathcal{U}$ je množina všech vektorů z $\mathcal{U}$, které jsou kolmé na $\mathcal{V}$, tedy na každý prvek $\mathcal{V}$, kde $\mathcal{V}$ je podprostor Eukleidovského prostoru $\mathcal{U}$. Píšeme $V^{\perp} = \{\vec{u} \in \mathcal{U}; \vec{u} \perp \vec{v}; \forall \vec{v} \in V\}$.

**Ortonormální báze** - Ortogonální báze $B = \{ \vec b_{1}, \vec b_{2}, \dots, \vec b_{k} \}$, kde $(\vec b_{i}, b_{i}) = 1$ pro každé $i = 1, 2, \dots, k$.

### Kvadratické formy

**Kvadratická forma** - Zobrazení $\kappa(\vec x) = \vec x^T A \vec x$, kde A je reálná symetrická matice.

**Inercie kvadratické formy** - Označme $k$ počet kladných vlastních čísel matice A, $z$ počet záporných a $d$ počet vlstních čísel matice A rovných nule, inercií kvadratické formy označíme trojici čísel $(k, z, d)$ a značíme $in(\kappa) = (k, z, d)$, kde $\kappa(\vec x) = \vec x^TA\vec x$ je kvadratická forma a A je reálná symetrická matice.

**Definitnost kvadratické formy** - Řekněme, že kvadratická forma $\kappa(\vec x)$ na $\mathbb{R}^5$ je

| typ                                     | jestliže                               |
| --------------------------------------- | -------------------------------------- |
| **pozitivně definitní**                 | $in(\kappa) = (k, 0, 0)$               |
| **negativně definitní**                 | $in(\kappa) = (0, z, 0)$               |
| **pozitivně semidefinitní**             | $in(\kappa) = (k, 0, d), d > 0$        |
| **negativně semidefinitní**             | $in(\kappa) = (0, z, d), d > 0$        |
| **indefinitní**                         | $in(\kappa) = (k, z, d), k > 0, z > 0$ |
| **pozitivně i negativně semidefinitní** | $in(\kappa) = (0, 0, d)$                                       |

**Hlavní minor matice A řádu $k$** - Číslo $\det(A_{k})$, kde $A = [a_{ij}]$ je symetrická matice řádu $n$ a $A_{k}$ je její podmatice obsahující prvky $a_{11}, a_{22}, \dots, a_{kk}$. Značí se $\Delta_{k}$.
