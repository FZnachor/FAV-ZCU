# Soustava lineárních rovnic

Metody řešení nelineárních rovnic
- startovací (vždy konvergují)
- zpřesňující
- speciální (např. pro polynomy)

Startovací metody
- metoda půlení intervalu (bisekce)
- metoda prosté iterace

Zpřesňující metody
- Newtonova metoda
- Mullerova metoda

GEM
- provést pivotizaci - do první řádek prohodíme s řádkem s nejvyšším číslem v prvním sloupci
- sloupce raději neprohazovat

LU rozklad
- první sloupec L je stejný
- první řádek U je stejný


## Jacobiova metoda

$$
A = \begin{bmatrix}
3 & 1 & 0 \\
1 & 4 & 0 \\
0 & 1 & 5
\end{bmatrix} \qquad b = \begin{bmatrix}
1 \\
2 \\
3
\end{bmatrix} \qquad x_{0} = \begin{bmatrix}
0 \\
0 \\
0
\end{bmatrix}
$$

1. kontrola diagonální dominance
	- $\vert 3\vert > \vert 1\vert + \vert 0\vert$
	- $\vert 4\vert > \vert 1\vert + \vert 0\vert$
	- $\vert 5\vert > \vert 0\vert + \vert 1\vert$
2. sestavení rovnic a vyjádření $x, y, z$
	- $3x + y = 1$
		- $\to x = \frac{1}{3}(1 - y)$
	- $x + 4y = 2$
		- $\to y = \frac{1}{4}(2 - x)$
	- $y + 5z = 3$
		- $\to z = \frac{1}{5}(3 - y)$

| k   | 0.  | 1.            | 2.            | 3.            | 4.            |
| --- | --- | ------------- | ------------- | ------------- | ------------- |
| x   | $0$ | $0.333333333$ | $0.166666667$ | $0.194444444$ | $0.180555556$ |
| y   | $0$ | $0.5$         | $0.416666667$ | $0.458333333$ | $0.451388889$ |
| z   | $0$ | $0.6$         | $0.5$         | $0.516666667$ | $0.508333333$ |

## Gauss-Seidelova metoda

Stejná, jako Jacobiova metoda, ale rovnou používáme s vypočítanými hodnotami.
- provedeme výpočet pro $x = \dots$, takže už ve výpočtu $y$ použijeme nové $x$

Sestavení rovnice
- $x^{(k+1)} = \frac{1}{3}(1 - y^{(k)})$
- $y^{(k+1)} = \frac{1}{4}(2 - x^{(k+1)})$
- $z^{(k+1)} = \frac{1}{5}(3 - y^{(k+1)})$

| k   | 0.  | 1.            | 2.            | 3.            |
| --- | --- | ------------- | ------------- | ------------- |
| x   | $0$ | $0.333333333$ | $0.194444444$ | $0.18287037$  |
| y   | $0$ | $0.416666667$ | $0.451388889$ | $0.454282407$ |
| z   | $0$ | $0.516666667$ | $0.509722222$ | $0.509143519$ |

## Metoda SOR

Tato metoda vychází z GS metody, akorát navíc přidává relaxační koeficient $\omega \in (0,2)$.
- $\omega = 1$ - jedná se o GS metodu
- $\omega \in (0,1)$ - jedná se o metodu SUR
- $\omega \in (1,2)$ - jedná se o metodu SOR

Postup
1. kontrola diagonální dominance
2. sestavení rovnic GS metody
3. přidání relaxačního koeficientu
	- $x^{(k+1)} = \omega \cdot [\frac{1}{3}(1 - y^{(k)})] + (1 - \omega)x^{(k)}$
	- $y^{(k+1)} = \omega \cdot [\frac{1}{4}(2 - x^{(k+1)})] + (1 - \omega)y^{(k)}$
	- $z^{(k+1)} = \omega \cdot [\frac{1}{5}(3 - y^{(k+1)})] + (1 - \omega)z^{(k)}$

Zvolíme $\omega = 1.05, \epsilon = 0.01$.

| k   | 0.  | 1.           | 2.            |
| --- | --- | ------------ | ------------- |
| x   | $0$ | $0.35$       | $0.18090625$  |
| y   | $0$ | $0.433125$   | $0.455855859$ |
| z   | $0$ | $0.53904375$ | $0.507318082$ |
