**Př. 1**: Vytvořte systematický cyklický kód s generujícím mnohočlenem $g(x) = 1 + x + x^3$. Vypočtěte všechny značky a vhodně zvolte generující matici.

- $u = [1110]^\text{T}$
- $u(x) = x^3 + x^2 + x$
+ $u(x) \cdot x^{n-k}$
	+ $(x^3 + x^2 + x) \cdot x^3 = x^6 + x^5 + x^4$
+ $u(x)  \cdot x^{n-k} : g(x) = \cancel{q(x)}, z(x)$
	+ $u(x) \cdot x^{n-k} = q(x) \cdot g(x) + z(x)$
	+ $u(x) \cdot x^{n-k} + z(x) = q(x) \cdot g(x)$
- $v(x) = u(x) \cdot x^{n-k} + z(x)$
	- $z(x)$ má stupeň nejvýše $n-k-1$

$(x^6 + x^5 + x^4) : (x^3 + x + 1) = x^3 + x^2$
- $x^2 = z(x)$

$v(x) = u(x) \cdot x^{n-k} + z(x) = x^6 + x^5 + x^4 + x^2$
- $v = [1110100]^\text{T}$

| číslo | informační část | kód       |     |
| ----- | --------------- | --------- | --- |
| 0     | `0000`          | `0000000` |     |
| 1     | `0001`          | `0001011` | +   |
| 2     | `0010`          | `0010110` | +   |
| 3     | `0011`          | `0011101` | o   |
| 4     | `0100`          | `0100111` | o   |
| 5     | `0101`          | `0101100` | +   |
| 6     | `0110`          | `0110001` | +   |
| 7     | `0111`          | `0111010` | o   |
| 8     | `1000`          | `1000101` | +   |
| 9     | `1001`          | `1001110` | o   | 
| 10    | `1010`          | `1010011` | o   |
| 11    | `1011`          | `1011000` | +   |
| 12    | `1100`          | `1100010` | +   |
| 13    | `1101`          | `1101001` | o   |
| 14    | `1110`          | `1110100` | o   |
| 15    | `1111`          | `1111111` |     |

$$
G = \left[\begin{array}{cccc:ccc}
1 & 0 & 0 & 0 & 1 & 0 & 1 \\
0 & 1 & 0 & 0 & 1 & 1 & 1 \\
0 & 0 & 1 & 0 & 1 & 1 & 0 \\
0 & 0 & 0 & 1 & 0 & 1 & 1
\end{array}\right]
$$

$v = G^\text{T} \cdot u = [1110100]^\text{T}$


Blok dat
- `[][][][][][][][a][00000000][00000000]`
	- a = zarovnání na sudou délku
	- zbytek
		- $R_{15}R_{14}\dots R_{0}$
		- tím se nahradí nuly na konci

**Př. 2**:
- $\mathcal{A}_{1} : \neg A \to B$
- $\mathcal{A}_{2} : \neg B \leftrightarrow C$
- $\mathcal{B}: C \to A$
- Logicky vyplývá $\mathcal{B}$?
	- ano, vyplývá

| ABC | $\neg A \to B$ | $\neg B \leftrightarrow C$ | $(1) \wedge (2)$ | $C \to A$ | $(3) \to (4)$ |
| --- | -------------- | -------------------------- | ---------------- | --------- | ------------- |
| 000 | 0              | 0                          | 0                | 1         | 1             |
| 001 | 0              | 1                          | 0                | 0         | 1             |
| 010 | 1              | 1                          | [1]              | [1]       | 1             |
| 011 | 1              | 0                          | 0                | 1         | 1             |
| 100 | 1              | 0                          | 0                | 1         | 1             |
| 101 | 1              | 1                          | [1]              | [1]       | 1             |
| 110 | 1              | 1                          | [1]              | [1]       | 1             |
| 111 | 1              | 0                          | 0                | 1         | 1             | 

- $(\mathcal{A}_{1} \wedge \mathcal{A}_{2} \wedge \dots \wedge A_{n}) \to \mathcal{B}$ je tautologie
- $(\mathcal{A}_{1} \wedge \mathcal{A}_{2} \wedge \dots \wedge A_{n} \wedge \neg\mathcal{B})$ je kontradikce
+ $\mathcal{B}: C \to A$
+ $\neg\mathcal{B}: C \wedge \neg A$

| ABC | $\neg A \to B$ | $\neg B \leftrightarrow C$ | $C$ | $\neg A$ |
| --- | -------------- | -------------------------- | --- | -------- |
| 000 | 0 x            |                            |     |          |
| 001 | 0 x            |                            |     |          |
| 010 | 1              | 1                          | 0 x |          |
| 011 | 1              | 0 x                        |     |          |
| 100 | 1              | 0 x                        |     |          |
| 101 | 1              | 1                          | 1   | 0 x      |
| 110 | 1              | 1                          | 0 x |          |
| 111 | 1              | 0 x                        |     |          |

- $\mathcal{B}$ logicky vyplývá z $\{\mathcal{A}_{1}, \mathcal{A}_{2}\}$

**Př. 3**: Úsudek (ověření korektnosti úsudku)
- Rozhodněte, zda je následující úsudek korektní:
- premisy:
	1. Na zájezd pojede Olda nebo Pavel.
	2. Jestliže pojede Pavel, pojede Simona a nepojede Renata.
	3. Jestliže pojede Tomáš, pojede i Renata.
	4. Jestliže pojede Simona, pojede i Tomáš.
- závěr: Olda pojede na zájezd.

| číslo |                           |                                               |
| ----- | ------------------------- | --------------------------------------------- |
| 1     | $O \vee P$                |                                               |
| 2     | $P \to (S \wedge \neg R)$ | $(\neg P \vee S) \wedge (\neg P \vee \neg R)$ |
| 3     | $T \to R$                 | $(\neg T \vee R)$                             | 
| 4     | $S \to T$                 | $(\neg S \vee T)$                             |

- závěr: $O$

$$
(O \vee P) \wedge (\neg P \vee S) \wedge (\neg P \vee \neg R) \wedge (\neg T \vee R) \wedge (\neg S \vee T) \wedge \neg O
$$
- má být kontradikce
- hledám ohodnocení v němž mají všechny závorky hodnotu 1
	- $O$ musí být 0
	- $P$ musí být 1
	- $S$ musí být 1
	- $R$ musí být 0
	- $T$ musí být 0
	- $S$ musí být 0 (ale už musí být 1) **SPOR!**

Tento úsudek je korektní.
- pokud jsou splněny předpoklady, závěr platí
- pokud ne, může se stát cokoliv

Konjunktivní forma:
+ $(. \vee . \vee .) \wedge (. \vee . \vee .) \wedge \dots \wedge (. \vee . \vee .)$

- $(T \to R)  \leftrightarrow (\neg T \vee R)$
- $P \to (S \wedge \neg R)$
- $\neg P \vee (S \wedge \neg R)$
- $(\neg P \vee S) (\neg P \vee \neg R)$