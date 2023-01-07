**Zobrazení** - Předpis $f : X \to Y$, kdy prvkům z X přiřazujeme prvky z Y (např. reálná funkce).

**Komplexní čísla** - Číslo $z = a+bi$, kde $a, b \in \mathbb{R};$ a $\text{Re}(z) = a, \text{Im}(z) = b;$ hodnota $i = \sqrt{-1}$.

### Polynomy

**Polynom** - Polynomem proměnné $x$ je předpis (funkce) $p(x) = a_{n}x^n + \dots + a_{1}x + a_{0}$.

**Koeficienty polynomu $p(x)$** - Hodnoty $a_{i}$ v předpisu polynomu.

**Stupeň polynomu $p(x)$** - Největší $k$, pro něž je $a_{k}$ nenulové, značíme $\text{st}(p(x))$.

**Nulový polynom** - Polynom $p(x)$, který má všechny koeficient nulové, poté platí $\text{st}(p(x)) = -\infty$.

Operace s polynomy ??

**Kořen polynomu** - Číslo $c \in \mathbb C$, pro které platí $p(c) = 0$.

Speciální typy polynomů ??

### Matice

**Matice typu $m/n$** - Soubor (tabulka) $m \times n$ prvků (čísel) $a_{ij}$ zapsanných do $m$ řádků a $n$ sloupců, obvykle $a_{ij} \in \mathbb C$.

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

**Nulová matice** - Matice typu $m/n$, jestliže $a_{ij} = 0$, značíme ji 0.

**Diagonální matice** - Čtvercová matice, pro kterou platí $a_{ij} = 0$ jestliže $i \neq j$, zapisujeme $A = \text{diag}(a_{11}, a_{22}, a_{nn})$.

**Jednotková matice** - Diagonální matice, pro kterou platí $a_{ii} = 1$, značí se $I$.

**Symetrická matice** - Čtvercová matice, pro kterou platí $a_{ij} = a_{ji}$.

**Antisymetrická matice** - Čtvercová matice, pro kterou platí $a_{ij} = -a_{ji}$ (a $a_{ii} = 0$).

**Horní trojúhelníková matice** - Matice, pro kterou platí $a_{ij} = 0$ pro všechna $i > j$.

**Dolní trojúhelníková matice** - Matice, pro kterou platí $a_{ij} = 0$ pro všechna $i < j$.

**Rovnost** - Matice **A** a **B** jsou si rovny, jestliže jsou stejného typu a platí $a_{ij} = b_{ij}$ pro všechna $i, j$, píšeme **A** = **B**.

**Opačná matice** - Matice $[-a_{ij}]$ k matici **A**, značíme -**A**.

**Transponovaná matice** - Matice $[a_{ji}]$ typu $n/m$ k matici $A = [a_{ij}]$ typu $m/n$.

**Mocniny matice** - Nultá mocina $A^0 = I$, $k$-tá mocnina $A^k = A \cdot A \cdot \dots \cdot A$.

**Inverzní matice** - Matice $A^{-1}$ je inverzní matice ke čtvercové matici A, pro kterou platí, že $A \cdot A^{-1} = A^{-1} \cdot A = I$.

**Rozšířená matice soustavy** -  Matice $A^R = [A | b]$, kde matice $A$ obsahuje vektory neznámých a $b$ je vektor pravých stran.

**Pivot v řádku $i$** - První nenulový prvek v tomto řádku (bráno zleva).

**Matice ve stupňovitém tvaru** - Matice A, kde pro každý řádek platí: Je-li v $i$-tém řádku pivod na pozici $j$, ve všech dalších řádcích je na pozici $j' > j$ a je-li řádek nulový, každý další je také nulový.

### Lineární vektorové prostory

**Lineární vektorový prostor nad tělesem $\mathbb T$** - Neprázdná množina $\mathcal{V}$, kde pro každé $\vec x, \vec y, \vec z \in \mathcal{V}$ a pro každé $k, l \in \mathbb T$
- existuje právě jeden prvek $\vec u \in \mathcal{V}$ tak, že $\vec u = \vec x + \vec y$,
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

**Konečně generovaný prostor** - Prostor, ve kterém existuje konežná množina generující $\mathcal{V}$.

**Báze prostoru $\mathcal{V}$** - Lineárně nezávislá množina, která generuje $\mathcal{V}$.

**Dimenze $\mathcal{V}$** - Počet prvků báze LVP $\mathcal{V}$, značí se $\dim(\mathcal{V})$.

**Souřadnice prvku** - Nechť $\mathcal{V}$ je nenulový konečně generovaný LVP, $\vec v \in \mathcal{V}$ a nechť $B = {\vec b_{1}, \vec b_{2}, \dots, \vec b_{k}}$ je jeho uspořádaná báze. Jednoznačně určené koeficienty $c_{1}, c_{2}, \dots, c_{n} \in \mathbb{R}$ LK $v = c_{1}\vec{b_{1}}, c_{2}\vec{b_{2}}, \dots, c_{n}\vec{b_{n}}$ prvku $\vec v$ bází $B$, značí se $\widehat{\vec v_{B}} = [c_{1}, c_{2}, \dots, c_{n}]^T$.

