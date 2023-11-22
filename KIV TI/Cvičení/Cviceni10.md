**Př. 1**: $\mathbb{Z}_{5}$

$$
A = \begin{bmatrix}
1 & 4 & 1 & 1 & 1 \\
2 & 4 & 0 & 0 & 1 \\
0 & 2 & 1 & 1 & 1
\end{bmatrix}
\begin{matrix}
\cdot \space 2 \\
\cdot \space 1 \\
\cdot \space 4
\end{matrix}
$$

$$
u = \begin{bmatrix}
2 & 1 & 4
\end{bmatrix}^\text{T}
$$


Získání vektoru $v$:
- násobíme matici $A$ vektorem $u$
	- $v = G^\text{T} \cdot u$
	- vynásobíme řádky a sečteme sloupce

$$
\begin{bmatrix}
2 & 3 & 2 & 2 & 2 \\
2 & 4 & 0 & 0 & 1 \\
0 & 3 & 4 & 4 & 4
\end{bmatrix}
$$
$$
\begin{bmatrix}
4 & 0 & 1 & 1 & 2
\end{bmatrix}^\text{T}
$$

Kontrolní matice:

$$
H_{A} = \begin{bmatrix}
1 & 2 & 0 & 1 & 0 \\
1 & 2 & 1 & 0 & 0
\end{bmatrix}
$$

$$
H_{A} \cdot v = \begin{bmatrix}
0 & 0
\end{bmatrix}^\text{T}
$$

Chybový vektor:

$$
e = \begin{bmatrix}
0 & 2 & 0 & 0 & 0
\end{bmatrix}
$$

$$
w = v + e = \begin{bmatrix}
4 & 2 & 1 & 1 & 2
\end{bmatrix}^\text{T}
$$

Syndrom:
$$
s = H \cdot w = \begin{bmatrix}
4 & 4
\end{bmatrix}^\text{T}
$$

**Př. 2**: Navrhněte binární lineární kód, který umožní zakódovat šestiprvkové informační části tak, aby bylo možné **současně** opravovat jednoduché a detekovat dvojité chyby.

Pozn.: Musíme vyjít od toho, jakou musí mít kód minimální Hammingovskou vzdálenost $d_{0}$. Potom si uvědomíme, jestli existují nějaké standardní kódy, které to splňují. Pokud neexistují, tak použijeme opakovací kód.

Požadavky:
- jednoduchá chyba - opravit
- dvojitá chyba - detekovat

Použitelné kódy:
- $d_{0} = 1 \dots$ _nedává smysl_
- $d_{0} = 2 \dots$ parita
- $d_{0} = 3 \dots$ Hammingův kód (i zkrácený)
- $d_{0} = 4 \dots$ rozšířený Hammingův kód (i zkrácený)
- $d_{0} \geq 5 \dots$ opakovací kód

$$
e_{i} = \begin{bmatrix}
0 & \dots & 0 & 1 & 0 & \dots & 0
\end{bmatrix}^\text{T}
$$

$$
s = H \cdot w = H \cdot (v + e_{i}) = H \cdot v + H \cdot e_{i} = H \cdot e_{i} = H_{0,i}
$$

$$
H = \left[\begin{array}{c:c}
-B^\text{T} & I_{n-k}
\end{array}\right]
$$
- v matici $H$ jsou sloupce s více než jednou jedničkou

$$
G = \left[\begin{array}{c:c}
I_{k} & B
\end{array}\right]
$$
- v $B$ alespoň dvě jedničky

Opravování jednonásobných chyb:
- $k = 6$ (počet informačních prvků)
- počet syndromů $2^r \geq 1 + k+r$
	- 1 syndrom pro bezchybný přenos
	- $k+r$ syndromů pro každý prvek
	- $r = n-k$

Hledání $r$:
- $2^r \geq 1 + 6 + r$
- $2^r \geq r + 7$
- $r = 4$

$$
G = \left[\begin{array}{cccccc:cccc|c}
1 & 0 & 0 & 0 & 0 & 0 & 0 & 0 & 1 & 1 & 1 \\
0 & 1 & 0 & 0 & 0 & 0 & 0 & 1 & 0 & 1 & 1 \\
0 & 0 & 1 & 0 & 0 & 0 & 0 & 1 & 1 & 0 & 1 \\
0 & 0 & 0 & 1 & 0 & 0 & 0 & 1 & 1 & 1 & 0 \\
0 & 0 & 0 & 0 & 1 & 0 & 1 & 0 & 0 & 1 & 1 \\
0 & 0 & 0 & 0 & 0 & 1 & 1 & 0 & 1 & 0 & 1
\end{array}\right] \quad \begin{matrix}
3 \\
5 \\
6 \\
7 \\
9 \\
10
\end{matrix}
$$

Pozn.: Při vyplňování druhé části matice začínáme číslem 3 a nesmíme přidávat mocniny 2. Přidáme poslední sloupec, který je paritní, díky němuž můžeme detekovat dvojnásobné chyby.

Vytvoříme **kontrolní matici**:

$$
H_{R} = \left[\begin{array}{cccccc:ccccc}
0 & 0 & 0 & 0 & 1 & 1 & 1 & 0 & 0 & 0 & 0 \\
0 & 1 & 1 & 1 & 0 & 0 & 0 & 1 & 0 & 0 & 0 \\
1 & 0 & 1 & 1 & 0 & 1 & 0 & 0 & 1 & 0 & 0 \\
1 & 1 & 0 & 1 & 1 & 0 & 0 & 0 & 0 & 1 & 0 \\
1 & 1 & 1 & 0 & 1 & 1 & 0 & 0 & 0 & 0 & 1
\end{array}\right]
$$

$$
H = \left[\begin{array}{cccccc:cccc:c}
0 & 0 & 0 & 0 & 1 & 1 & 1 & 0 & 0 & 0 & 0 \\
0 & 1 & 1 & 1 & 0 & 0 & 0 & 1 & 0 & 0 & 0 \\
1 & 0 & 1 & 1 & 0 & 1 & 0 & 0 & 1 & 0 & 0 \\
1 & 1 & 0 & 1 & 1 & 0 & 0 & 0 & 0 & 1 & 0 \\
1 & 1 & 1 & 1 & 1 & 1 & 1 & 1 & 1 & 1 & 1
\end{array}\right]
$$

Přidáváme poslední řádek jedniček a poslední sloupec nul.

**Zakódování dat**:
- $u = \begin{bmatrix} 1 & 1 & 0 & 0 & 0 \end{bmatrix}^\text{T}$
- $v = \left[\begin{array}{cccccc:ccccc} 1 & 1 & 0 & 0 & 0 & 0 & 0 & 1 & 1 & 0 & 0 \end{array}\right]^\text{T}$
- pro zjištění druhé části $v$ sečteme první dva řádky matice $G_{R}$

**Jednoduchá chyba**:
- $e = \left[\begin{array}{ccccc:cccc} 0 & 0 & 0 & 0 & 0 & 1 & 0 & 0 & 0 & 0 \end{array}\right]^\text{T}$
- $w = \left[\begin{array}{ccccc:cccc} 1 & 1 & 0 & 0 & 0 & 1 & 1 & 1 & 0 & 0 \end{array}\right]^\text{T}$
- $s = H_{R} \cdot w$

Pozn.: Při výpočtu sčítáme hodnoty ve sloupcích určených vektorem $w$ po jednotlivých řádcích, výsledkem je syndrom $s$.

$$
s = \begin{bmatrix}
1 & 0 & 0 & 0 & 0
\end{bmatrix}^\text{T}
$$

Pozn. 2: V případě jednoduché chyby je syndrom roven řádku kontrolné matice.

**Dvojitá chyba**:
- $e' = \left[\begin{array}{ccccc:cccc} 0 & 0 & 0 & 0 & 1 & 1 & 0 & 0 & 0 & 0 \end{array}\right]^\text{T}$
- $w' = \left[\begin{array}{ccccc:cccc} 1 & 1 & 0 & 0 & 1 & 1 & 1 & 1 & 0 & 0 \end{array}\right]^\text{T}$

$$
s' = \begin{bmatrix}
0 & 0 & 1 & 0 & 1
\end{bmatrix}^\text{T}
$$

Pozn.: Tento řádek v kontrolní matici nenajdeme.

**Př. 3**: Sdělovací kanál přenáší 120 binárních znaků za sekundu. Zdroj generuje 100 binárních znaků za vteřinu. Navrhněte lineární binární kód, který umožní opravovat jednoduché chyby.

Řešení: Hammingův kód vyhovující podmínce $2^r = k + r + 1$.

H. kód (7, 4) - 4 informační
- $100$ znaků/s $\implies 25$ znaků/s $\implies 25 \cdot 7$ znaků/s $= 175$ znaků/s
- kanál tento přenos nezvládne

| r   | k   | n   | $2^r$ | k/n                |
| --- | --- | --- | ----- | ------------------ |
| 3   | 4   | 7   | 8     | 0.57               |
| 4   | 11  | 15  | 16    | 0.73               |
| 5   | 26  | 31  | 32    | 0.838 $\geq 0.833$ | 

Redundance $\rho = 1-\frac{k}{n}$
- $\frac{k}{n}$ - informační poměr

Potřebujeme informační poměr lepší než $\frac{k}{n} \geq \frac{100}{120} = 0.833$.

Počet informačních znaků vygenerovaných za jednotku času ... $k = 100$
Počet znaků po zakódování ... $n = 120$

**Př. 4**: Navrhněte lineární kód, který umožní kódovat tříprvkové informační části tak, aby bylo možné **současně** opravovat dvojité a detekovat čtyřnásobné chyby.

Řešení: opakovací kód s počtem opakování 7

$$
G = \left[\begin{array}{ccc:c}
1 & 0 & 0 & 111111 &  &  \\
0 & 1 & 0 &  & 111111 &  \\
0 & 0 & 1 &  &  & 111111 
\end{array}\right]
$$

šířka: 21, výška: 3