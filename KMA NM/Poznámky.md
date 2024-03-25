## Nelineární rovnice

Předpokládáme, že
1. reálná funkce $f$ je spojitá pro $x \in \langle a, b\rangle$,
2. $f(a) \cdot f(b) < 0$.

Potom existuje aspoň jedno řešení $x$ rovnice $f(x) = 0$ na $\langle a,b\rangle$.

### Metoda půlení intervalu

Máme interval $\langle a,b\rangle$, který budeme půlit. Vypočítáme funkční hodnotu $f(s_{i})$ v polovině intervalu.

Pokud má funkční hodnota $f(s_{i})$ **stejné znaménko** jako funkční hodnota $f(a)$, změníme $a = s_{i}$, v opačném případě $b = s_{i}$.

- zastavovací podmínka - velikost intervalu
- výsledek je $x = \frac{a+b}{2}$
- vždy konverguje, ale velmi pomalu

### Metoda prosté iterace

Postup
1. z rovnice vyjádříme některé $x$
	- $x^5 - x = \ln(x+4)$ do formátu $x_{k+1} = \sqrt[5]{ \ln(x_{k}+4) + x_{k} }$
2. určíme/dostaneme zadaný $\epsilon$ a $x_{0}$
	- $\epsilon = 0.01$
	- $x_{0} = 1$
3. dosazujeme hodnoty do rovnice, dokud nenastane zastavující podmínka
	- $\vert x_{k} - x_{k-1} \vert < \epsilon$

| $k$ | $x_k$       | $\vert x_{k} - x_{k-1}\vert$ |
| --- | ----------- | ---------------------------- |
| 0   | 1           | -                            |
| 1   | 1,211460877 | 0,211460877                  |
| 2   | 1,234081012 | 0,022620135                  |
| 3   | 1,236396294 | 0,002315282                  |

Postačující podmínky konvergence. Funkce $\varphi$ na intervalu $I = \langle a,b\rangle$ je spojitá a platí:
- $\forall x \in I : \varphi(x) \in I$ (funkce $\varphi$ zobrazuje $I$ do sebe)
- $\exists q \in \langle 0, 1) : \vert \varphi(x) - \varphi(y)\vert \leq q\vert x-y\vert \quad \forall x, y \in I$ (funkce $\varphi$ je kontrakce)

### Newtonova metoda

- $x_{0} = 1.236396294$
	- z metody prosté iterace nebo zadáno
- $f(x) = x^5 - x - \ln(x+4)$
	- vše převedeme na jednu stranu rovnice
- $f'(x) = 5x^4 - 1 - \frac{1}{x+4}$
	- derivací funkce $f(x) = x^5 - x - \ln(x+4)$

Hodnotu poté $x_{0}$ zpřesňujeme vzorcem $x_{k+1} = x_{k} - \frac{f(x_{k})}{f'(x_{k})}$
- zastavovací podmínka $\vert x_{k+1} − x_k\vert < \epsilon$ nebo $\vert f(x_k)\vert < \delta$

**Geometrický význam**
- také metoda tečen nebo metoda linearizace
- tvoříme tečny funkce v bodech $x_{k}$
- hodnota $x_{k+1}$ je průsečíkem tečny s osou $x$

Modifikovaná Newtonova metoda
- pokud se derivace moc nemění, můžeme místo $f'(x_{k})$ využívat $f'(x_{0})$
- tečnou je pouze první přímka, ty následující jsou na ni kolmé

Metoda sečen
- je i pro nediferencovatelné funkce
- $f'(x_{k})$ nahradíme za $\frac{f(x_{k}) - f(x_{k-1})}{x_{k}-x_{k-1}}$
- potřebujeme znát dvě počáteční hodnoty
- další iterace $x_{k+1}$ je průsečíkem sečny s osou $x$

## Soustava lineárních rovnic

### Jacobiova metoda

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

### Gauss-Seidelova metoda

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

### Metoda SOR

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
