### Zadání

Index lomu jádra optického vlákna z křemenného skla je $n_{1} = 1.415$, index lomu pláště je o 1% nižší, tj. $n_{2} = 1.401$. Určete numerickou aperturu NA vlákna a mezní úhel dopadu ze vzduchu $\alpha_{m}$.

- $n_{1} = 1.415$
- $n_{2} = 1.401$
- $NA = \, ?$
- $\alpha_{m} = \, ?$

![](_assets/priklad12.svg)

- $n_{v} \sim 1$

pro optické rozhraní 1 platí
- $\displaystyle \frac{\sin \alpha_{m}}{\sin \beta} = \frac{n_{1}}{n_{v}} = n_{1} \implies \sin \alpha_{m} = n_{1} \cdot \sin \beta$

pro optické rozhraní 2 platí
- $\displaystyle \frac{\sin \gamma}{\sin \delta} = \frac{n_{2}}{n_{1}}$
+ pro správnou funkci optického vlákna je potřeba úplný (totální) odraz na optickém rozhraní 2
	+ $\displaystyle \delta = \frac{\pi}{2} : \frac{\sin \gamma}{\sin \frac{\pi}{2}} = \frac{n_{2}}{n_{1}} \implies \sin \gamma = \frac{n_{2}}{n_{1}}$

### Výpočet

vztah mezi úhly $\gamma$ a $\beta$ - viz. pravoúhlý trojúhelník
- $\beta = \frac{\pi}{2} - \gamma \implies \sin \beta = \sin \left(\frac{\pi}{2} - \gamma\right) = \cos \gamma$

určení numerické apertury
- $\sin \alpha_{m} = n_{1} \cdot \sin \beta = n_{1} \cdot \cos \gamma =$
- $= n_{1} \cdot \sqrt{ 1 - \sin^2 \gamma } = n_{1} \cdot \sqrt{ 1 - \left(\frac{n_{2}}{n_{1}}\right)^2 } = \sqrt{ n_{1}^2 - \cancel{n_{1}^2} \cdot \frac{n_{2}^2}{\cancel{ n_{1}^2}} } =$
- $= \sqrt{ n_{1}^2 - n_{2}^2 } = \text{NA}$

$\sin \alpha_{m} = NA \implies \alpha_{m} = \arcsin(\text{NA})$

### Výsledek

dosadíme
- $\alpha_{m} = \arcsin(\sqrt{ 1.415^2 - 1.401^2 }) = 11.452459^\circ$