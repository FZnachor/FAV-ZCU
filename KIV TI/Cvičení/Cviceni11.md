**Př. 1**: Vypočítejte nad tělesem $Z_{5}$.

$(2x^4 + 3x^3 + 4) \cdot (3x^3 + 4x^2 + 2x + 1) =$

$$
= (x^7 + 3x^6 + 4x^5 + 2x^4) + (4x^6 + 2x^5 + x^4 + 3x^3) + (2x^3 + x^2 + 3x + 4) = x^7 + 2x^6 + x^5 + 3x^4 + x^2 + 3x + 4
$$

**Př. 2**: Vypočítejte nad tělesem $Z_{5}/x^4-1$.

$(2x^4 + 3x^3 + 4) * (3x^3 + 4x^2 + 2x + 1) =$

Pozn.: výsledkem násobení * je zbytek výsledku součinu po dělení $x^4 - 1$ (resp. $x^4 + 4$, protože -1 je v tomto tělese 4)
- $x^4 = 1$
- $u(x) = 1 + x^2 + x^3$
- $u = [1011]$
	- proto v $u(x)$ není $x$ (druhá pozice)
- $u(x) \cdot x = x + x^3 + x^4$
	- $x^4$ převedeme na 1

$$
= x^3 + 2x^2 + x + 3 + x^2 + 3x + 4 = x^3 + 3x^2 + 4x + 2
$$

**Př. 3**: Vypočítejte v $Z_{2}/x^4-1$

$(x^2 + 1) * (x^2 + x + 1)$

$$
\cancel{x^4} + x^3 + \cancel{x^2 + x^2} + x + \cancel{1} = x^3 + x
$$

**Př. 4**: Binární cyklický kód vznikne ze slova 110110 cyklickými posuvy a součty. Určete všechny značky kódu $K$, generující mnohočlen $g(x)$, kontrolní mnohočlen $h(x)$, generující matici $G$ a kontrolní matici $H$.

značky:
- vždy posunuté o jednu pozici doleva
- $u_{1} = [110110]$
- $u_{2} = [011011]$
- $u_{3} = [101101]$
+ $u_{1} + u_{2} = [101101] = u_{3}$
+ $u_{1} + u_{3} = [011011] = u_{2}$
+ $u_{2} + u_{3} = [110110] = u_{1}$
+ $u_{1} + u_{2} + u_{3} = [000000]$
- 4 unikátní značky

rozměry:
- $k = 2$
- $n = 6$
- stupeň $g(x) = n-k = 4$

generující mnohočlen:
- je nenulový a má nejnižší stupeň ze všech značek
- $g(x) =  1 + x + x^3 + x^4$ ($u_{1}$)
- prvky $g_{0}, g_{1}, g_{2}, g_{4}, g_{5}$

kontrolní mnohočlen:
- $h(x) = x^n - 1 : g(x)$
- $h(x) = (x^6 + 1) : (x^4 + x^3 + x + 1) = x^2 + x + 1$

$(x^6 + 1) : (x^4 + x^3 + x + 1) = x^2 + x + 1$
- $-(x^6 + x^5 + x^3 + x^2)$
	- $x^5 + x^3 + x^2 + 1$
	- $- (x^5 + x^4 + x^2 + x)$
		- $x^4 + x^3 + x + 1$
		- $-(x^4 + x^3 + x + 1)$
			- $\emptyset$

generující matice:
- první řádek je $g(x)$
- další řádky jsou vždy násobené $x$, tedy posunuté o jednu pozici doleva
- nenulový pás z horního levého rohu do dolního pravého

$$
G = \begin{bmatrix}
1 & 1 & 0 & 1 & 1 & 0 \\
0 & 1 & 1 & 0 & 1 & 1
\end{bmatrix}
$$

kontrolní matice:
- první řádek je obráceně, tedy $h_{5}, h_{4}, h_{3}, h_{2}, h_{1}, h_{0}$
- každý další řádek posunutý o jednu pozici doprava
- nenulový pás z horního pravého rohu do dolního levého rohu

$$
H = \begin{bmatrix}
0 & 0 & 0 & 1 & 1 & 1 \\
0 & 0 & 1 & 1 & 1 & 0 \\
0 & 1 & 1 & 1 & 0 & 0 \\
1 & 1 & 1 & 0 & 0 & 0
\end{bmatrix}
$$

**Př. 5**: Vytvořte cyklický kód pro kódování **čtyřprvkových** informační částí. Generující mnohočlen je $g(x) = 1 + x + x^3$. Kódování proveďte jak pomocí generující matice, tak i pomocí generujícího mnohočlenu.

rozměry:
- $k = 4$
- $n - k = 3$
- $\implies n = 7$

generující matice:

$$
G = \begin{bmatrix}
1 & 1 & 0 & 1 & 0 & 0 & 0 \\
0 & 1 & 1 & 0 & 1 & 0 & 0 \\
0 & 0 & 1 & 1 & 0 & 1 & 0 \\
0 & 0 & 0 & 1 & 1 & 0 & 1
\end{bmatrix}
$$

kódování pomocí $G$:
- $u = [1110]^\text{T}\quad (1 + 2 + 4 = 7)$
- označím 1., 2. a 3. řádek (tyto pozice jsou v $u$ nenulové)
	- poté sčítám v $G$ vetikálně do $v$
- $v = [1000110]^\text{T}$
- první, třetí a čtvrtý prvek přenášen čistě (na poziciích 1, 6 a 7)

kódování pomocí $g(x)$:
- $v(x) = u(x) \cdot g(x) = (1 + x + x^2) \cdot (1 + x + x^3)$
- $= (1 + x + x^3) + (x + x^2 + x^4) + (x^2 + x^3 + x^5) = 1 + x^4 + x^5$

| číslo | informační část | kód       |     |
| ----- | --------------- | --------- | --- |
| 0     | `0000`          | `0000000` |     |
| 1     | `1000`          | `1101000` | +   |
| 2     | `0100`          | `0110100` | +   |
| 3     | `1100`          | `1011100` | o   |
| 4     | `0010`          | `0011010` | +   |
| 5     | `1010`          | `1110010` | o   | 
| 6     | `0110`          | `0101110` | o   |
| 7     | `1110`          | `1000110` | +   |
| 8     | `0001`          | `0001101` | +   |
| 9     | `1001`          | `1100101` | o   |
| 10    | `0101`          | `0111001` | o   |
| 11    | `1101`          | `1010001` | +   |
| 12    | `0011`          | `0010111` | o   |
| 13    | `1011`          | `1111111` |     |
| 14    | `0111`          | `0100011` | +   |
| 15    | `1111`          | `1001011` | o   |

Pozn.: Označené kódy jsou posuvy toho prvního označeného.