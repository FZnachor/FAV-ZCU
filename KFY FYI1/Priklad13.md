### Zadání

Světlo o vlnové délce **550 nm** dopadá kolmo na optickou mřížku s **500 vrypy/mm**.
- a) Určete mřížkovou konstantu d mřížky
- b) Určete úhel, o který se odchyluje maximum druhého řádu od směru kolmého k rovině mřížky
- c) Určete maximální pozorovatelný řád maxima $n_{\text{max}}$, který můžete pozorovat pro zadanou vlnovou délku
- d) Je-li mřížka osvětlena polychromatickým zářením, určete největší možnou vlnovou délku $\lambda_{3}$, která může být pozorována ve spektru 3. řádu

+ $\lambda = 550 \, \text{nm}$
+ 500 vrypů/mm
- $d = \, ?$
- $\alpha_{2} = \, ?$
- $n_{\text{max}} = \, ?$
- $\lambda_{3}^\text{max} = \, ?$

![](_assets/priklad13.svg)

z přednášky: tzv. podmínka pro max. interferenci na mřížce
- $d \cdot \sin \alpha = n \cdot \lambda$
	- $d$ - mřížková konstanta
	- $\alpha$ - úhel maxima
	- $n$ - řád maxima ($0, \pm 1, \pm 2, \dots$)
	- $\lambda$ - vlnová délka

### Výpočet

**a) stanovení mřížkové konstanty d**
- $\displaystyle d = \frac{1}{\text{počet vrypů/1m}} = \frac{1}{500 \cdot 10^3} [\text{m}] = 2 \cdot 10^{-6} \, \text{m} = 2 \, \micro\text{m}$

**b) úhel maxima 2. řádu**
- $\alpha_{2}$, tedy $n = 2$
- $\displaystyle d \cdot \sin \alpha_{2} = 2 \cdot \lambda \implies \sin \alpha_{2} = \frac{2 \cdot \lambda}{d} \implies \alpha_{2} = \arcsin\frac{2 \cdot \lambda}{d}$
- dosadíme: $\displaystyle \alpha_{2} = \arcsin \frac{2 \cdot 550 \cdot 10^{-9}}{2 \cdot 10^{-6}} = 33.3670^\circ$

**c) maximální řád maxima $n_{max}$**
 - $\displaystyle d \cdot \sin \alpha = n \cdot \lambda \implies n = \frac{d}{\lambda} \cdot \sin \alpha \dots n^\text{max} = \frac{d}{\lambda}$
	- $\sin \alpha = 1 \qquad \left( a = \frac{\pi}{2} \right)$
- dosadíme: $\displaystyle n_\text{max} = \frac{2 \cdot 10^{-6}}{550 \cdot 10^{-9}} = 3.6363$
	- tedy $n_\text{max} = 3$ (celé číslo zaokrouhlené dolů)

**d) největší pozorovatelná vlnová délka ve spektru 3. řádu**
- $\displaystyle d \cdot \sin \alpha = n \cdot \lambda \implies \lambda = \frac{d}{n} \cdot \sin \alpha \dots \lambda_{3}^\text{max} = \frac{d}{3}$
	- $\sin \alpha = 1 \qquad \left( a = \frac{\pi}{2} \right)$
- dosadíme: $\displaystyle\lambda_{3}^\text{max} = \frac{2 \cdot 10^{-6}}{3} \, [\text{m}] = 6.666 \cdot 10^{-7} \, \text{m} = 667 \, \text{nm}$