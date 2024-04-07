### Zadání

Balistické kyvadlo je tvořeno **truhlíkem s pískem zavěšeným na dlouhých drátech**. Vstřelíme-li do truhlíku projektil, kyvadlo se vychýlí, a **na základě této výchylky určete rychlost střely**.

- $M$ - hmotnost bal. kyvadla
- $l$ - délka závěsu
- $m$ - hmotnost střely
- $v_{0} = \, ?$

![](_assets/priklad8.svg)

předpoklady
- tíhové pole Země
- střela v truhlíku uvázne

zákon zachování mechanické energie
- $W_{kin} + W_{pot} = \text{konst.}$

zákon zachování hybnosti
- $\vec p = \text{konst.}$ (hybnost)
- v tomto případě
	- $\vec{p}_\text{střela} = \vec{p}_\text{střela + kyvadlo}$
	- $m \cdot v_{0} = (m+M) \cdot v_{1}$
	- hybnost před srážkou `=` hybnost po srážce

z obrázku platí
- $(l-h)^2 + d^2 = l^2$
- $\cancel{l^2} - 2lh + h^2 + d^2 = \cancel{l^2}$
- $2lh = h^2 + d^2$
- $\displaystyle \frac{2lh}{d^2} = \frac{h^2}{d^2} + 1$
- pro velká l platí, že
	- $h \ll d \implies \text{zanedbáme} \, \frac{h^2}{d^2}$
- $\displaystyle h = \frac{d^2}{2l}$

### Výpočet

vyjádříme $v_{1}$ ze zákona zachování mechanické energie
- $\displaystyle \frac{1}{2}\cancel{(m+M)} \cdot v_{1}^2 = \cancel{(m+M)} \cdot g \cdot h$
- $\displaystyle \frac{1}{2} \cdot v_{1}^2 = g \cdot h$
- $v_{1}^2 = 2gh$
- $v_{1} = \sqrt{ 2gh }$

využijeme vzorečku ze zákona o zachování hybnosti
- $m \cdot v_{0} = (m+M) \cdot v_{1}$
- $v_{0} = \frac{m+M}{m} \cdot v_{1}$

### Výsledek

rychlost střely podle svislé výchylky $h$ 
- dosazení do vzorce pro $v_{0}$ podle zákona o zachování hybnosti
- $\displaystyle v_{0} = \frac{m+M}{m} \cdot \sqrt{ 2gh }$

rychlost střely podle vodorovné výchylky $d$
- pro zjištění $h$ dosadíme vzorec pro jeho výpočet z $d$
- $\displaystyle v_{0} = \frac{m+M}{m} \cdot \sqrt{ \cancel{2} \cdot g \cdot \frac{d^2}{\cancel{2}l} } = \frac{m+M}{m} \cdot \sqrt{ \frac{g}{l} } \cdot d$