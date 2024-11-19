# Nelineární rovnice

Předpokládáme, že
1. reálná funkce $f$ je spojitá pro $x \in \langle a, b\rangle$,
2. $f(a) \cdot f(b) < 0$.

Potom existuje aspoň jedno řešení $x$ rovnice $f(x) = 0$ na $\langle a,b\rangle$.

## Metoda půlení intervalu

Máme interval $\langle a,b\rangle$, který budeme půlit. Vypočítáme funkční hodnotu $f(s_{i})$ v polovině intervalu.

Pokud má funkční hodnota $f(s_{i})$ **stejné znaménko** jako funkční hodnota $f(a)$, změníme $a = s_{i}$, v opačném případě $b = s_{i}$.

- zastavovací podmínka - velikost intervalu
- výsledek je $x = \frac{a+b}{2}$
- vždy konverguje, ale velmi pomalu

## Metoda prosté iterace

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

## Newtonova metoda

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
