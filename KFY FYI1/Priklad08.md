### Zadání

Balistické kyvadlo je tvořeno **truhlíkem s pískem zavěšeným na dlouhých drátech**. Vstřelíme-li do truhlíku projektil, kyvadlo se vychýlí, a **na základě této výchylky určete rychlost střely**.

- $M$ - hmotnost bal. kyvadla
- $l$ - délka závěsu
- $m$ - hmotnost střely
- $v_{0} = \, ?$

![](_assets/priklad8.svg)

- předpoklady:
	- tíhové pole Země
	- střela v truhlíku uvázne
- zákon zachování mechanické energie
	- $W_{kin} + W_{pot} = \text{konst.}$
- zákon zachování hybnosti
	- $\vec p = \text{konst.}$
- z obrázku platí
	- $(l-h)^2 + d^2 = l^2$
	- $\cancel{l^2} - 2lh + h^2 + d^2 = \cancel{l^2}$
	- $2lh = h^2 + d^2$
	- $\displaystyle \frac{2lh}{d^2} = \frac{h^2}{d^2} + 1$
	- pro velká h:
		- $h \ll d \implies \text{zanedbáme} \, \frac{h^2}{d^2}$
	- $h  = \frac{d^2}{2l}$

### Výpočet

$\displaystyle \frac{1}{2}\cancel{(m+M)} \cdot W^2 + 0 = 0 + \cancel{(m+M)} \cdot g \cdot h$

$m \cdot v_{0} = (m+M) \cdot W$

$v_{0} = \frac{m+M}{m} \cdot W$

- $W^2 = 2gh$
- $W = \sqrt{ 2gh }$
- $\displaystyle v_{0} = \frac{m+M}{m} \cdot \sqrt{ 2gh }$ ... pro svislou výchylku h

### Výsledek

dosadíme h
- $\displaystyle v_{0} = \frac{m+M}{m} \cdot \sqrt{ \cancel{2} \cdot g \cdot \frac{d^2}{\cancel{2}l} } = \frac{m+M}{m} \cdot \sqrt{ \frac{g}{l} } \cdot d$
- pro vodorovnou výchylku d