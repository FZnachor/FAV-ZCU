**Př. 1**: Uvažujme lineární prostor $\mathbb{Z}_{2}^5$ (množina pětic tvořených z 0 a 1). Slova předpokládáme jako $x_{1} x_{2} x_{3} x_{4} x_{5}$.

1) všechna slova splňující podmínku $x_{2} + x_{3} = x_{5}$
	- nulový prvek $00000$ - platí
		- $x_{2} + x_{3} = 0 + 0 = 0 = x_{5}$
	- sčítání - platí
		- $x_{1} x_{2} x_{3} x_{4} x_{5} \quad x_{2} + x_{3} = x_{5}$
		- $y_{1} y_{2} y_{3} y_{4} y_{5} \quad y_{2} + y_{3} = y_{5}$
		- $(x_{1}+y_{1}) (x_{2}+y_{2}) (x_{3}+y_{3}) (x_{4}+y_{4}) (x_{5}+y_{5})$
		- $(x_{2}+y_{2}) + (x_{3}+y_{3}) \,?\, (x_{5}+y_{5})$
		- $L = x_{2}+y_{2}+x_{3}+y_{3} = (x_{2}+y_{2})+(x_{3}+y_{3}) = x_{5}+y_{5}$
2) všechna slova splňující podmínku $x_{2} + x_{3} = 1$
	- nulový prvek $00000$ - neplatí!
	- není lineární kód
3) všechna slova s méně než třemi 1
	- sčítání - neplatí
		 - $11000$
		 - $00110$
		- $11110$ (nepatří)

**Př. 2**: Pro lineární kód 1 určíme dimenzi, bázi, kontrolní rovnici a generující i kódovou matici.

- dimenze = 4
	- $x_{5}$ je zabezpečovací prvek
	- zbytek prvků (4) je informační
- báze
	- kanonická báze
	- poté dopočítám poslední prvek
	- $[10000]^T$
	- $[01001]^T$
	- $[00101]^T$
	- $[00010]^T$
- kontrolní rovnice
	- $x_{2} + x_{3} + x_{5} = 0$
	- přičtu $x_{5}$, protože v tělese $Z_{2}$ je to jako odčítání
- generující matice
	- $G = \begin{bmatrix} 1 & 0 & 0 & 0 & 0 \\ 0 & 1 & 0 & 0 & 1 \\ 0 & 0 & 1 & 0 & 1 \\ 0 & 0 & 0 & 1 & 0 \end{bmatrix}$
- kódová matice
	- pokud $G = [I_{k} | B]$, tak $H = [-B^T | I_{n-k}]$
	- $H = [01101]$

**Př. 3**: Těleso $Z_{5}$.

sčítací tabulka

| +   | 0   | 1   | 2   | 3   | 4   |
| --- | --- | --- | --- | --- | --- |
| 0   | 0   | 1   | 2   | 3   | 4   |
| 1   | 1   | 2   | 3   | 4   | 0   |
| 2   | 2   | 3   | 4   | 0   | 1   |
| 3   | 3   | 4   | 0   | 1   | 2   | 
| 4   | 4   | 0   | 1   | 2   | 3   |

násobící tabulka

| *   | 0   | 1   | 2   | 3   | 4   |
| --- | --- | --- | --- | --- | --- |
| 0   | 0   | 0   | 0   | 0   | 0   |
| 1   | 0   | 1   | 2   | 3   | 4   |
| 2   | 0   | 2   | 4   | 1   | 3   |
| 3   | 0   | 3   | 1   | 4   | 2   |
| 4   | 0   | 4   | 3   | 2   | 1   | 

opačné prvky:
- $-1 = 4$
- $-2 = 3$
- $-3 = 2$
- $-4 = 1$
- $-0 = 0$

převrácené prvky:
- $1^{-1} = 1$
- $2^{-1} = 3$
- $3^{-1} = 2$
- $4^{-1} = 4$

**Př. 4**: Rozhodněte, zda tato matice může být generující maticí lineárního kódu.

$$
A = \begin{bmatrix}
1 & 4 & 1 & 1 & 1 \\
2 & 4 & 0 & 0 & 1 \\
0 & 2 & 1 & 1 & 0
\end{bmatrix} \begin{array}{l}
\\ + \space 3\cdot(1) \\ \\
\end{array} \sim \begin{bmatrix}
1 & 4 & 1 & 1 & 1 \\
0 & 1 & 3 & 3 & 4 \\
0 & 2 & 1 & 1 & 0
\end{bmatrix} \begin{array}{l}
\\ \\ + \space 3\cdot(2)
\end{array} \sim \begin{bmatrix}
1 & 4 & 1 & 1 & 1 \\
0 & 1 & 3 & 3 & 4 \\
0 & 0 & 0 & 0 & 2
\end{bmatrix}
$$

Lineárně nezávislé (pivotové) sloupce: první, druhý a pátý

Kolik bude mít kód značek? $5^3$
- $[000\dots]$
- $[001\dots]$
- $[002\dots]$
- $\vdots$
- $[444\dots]$

Závěr:
- matice bude generovat lineární kód, ale nebude systematický
- pro nalezení systematického kódu je potřeba provést permutaci sloupců
	- $A' = [A_{1}A_{2}A_{5}A_{3}A_{4}]$
	- v této matici provedeme GJEM a dostaneme se k systematickému tvaru generující matice

$$
A' = \begin{bmatrix}
1 & 4 & 1 & 1 & 1 \\
0 & 1 & 4 & 3 & 3 \\
0 & 0 & 2 & 0 & 0
\end{bmatrix} \begin{array}{l}
+ \space (2) \\ + \space 3 \cdot (3) \\ \cdot \space 3
\end{array} \sim \left[\begin{array}{ccc:cc}
1 & 0 & 0 & 4 & 4 \\
0 & 1 & 0 & 3 & 3 \\
0 & 0 & 1 & 0 & 0
\end{array}\right] = G'
$$

$$
H' = \left[\begin{array}{ccc:cc}
1 & 2 & 0 & 1 & 0 \\
1 & 2 & 0 & 0 & 1
\end{array}\right]
$$

**Př. 5**: Těleso $Z_{3}$.

$$
G = \begin{bmatrix}
1 & 1 & 1 & 1 & 1 \\
0 & 1 & 1 & 1 & 1 \\
1 & 1 & 0 & 0 & 0
\end{bmatrix}
$$

Určete kontrolní rovnice a kontrolní matici.

Kontrolní matice
- předpokládáme obecný řádek kontrolní matice $[h_{1} h_{2} h_{3} h_{4} h_{5}]$
1. $h_{1} + h_{2} + h_{3} + h_{4} + h_{5} = 0$
2. $h_{2} + h_{3} + h_{4} + h_{5} = 0$
3. $h_{1} + h_{2} = 0$
- dosadíme řádek do řádku
4. $h_{3} + h_{4} + h_{5} = 0$
- $h_{3} = - h_{4} - h_{5}$
- $h_{3} + 2h_{4} + 2h_{5}$

$$
H = \left[\begin{array}{ccc:cc}
0 & 0 & 1 & 1 & 0 \\
0 & 0 & 2 & 0 & 1
\end{array}\right]
$$

sloupce v matici $H$ jsou $h_{1}, h_{2}, h_{3}, h_{4}, h_{5}$

Kontrolní rovnice
- $2v_{3} + v_{4} = 0$
- $2v_{3} + v_{5} = 0$