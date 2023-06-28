### Zadání

**Koule** zadaného poloměru **mírně kývá na závěsu** zadané délky. Spočtěte: **dobu kyvu kyvadla**. Jaké chyby se dopustíme, budeme-li kouli považovat za bodovou hmotnost? (kyv = pohyb ze strany na stranu, kmit = 2 kyvy = pohyb z jedné strany na druhou a zpět)

- $R$ - poloměr koule
- $l$ - délka závěsu
- $T_{k} = \, ?$ (doba kyvu kyvadla)
- chyba pro $R \to 0 = \, ?$
+ netlumené kmity (tření)
+ tíhové pole Země

![](_assets/priklad9.svg)

II. impulzová věta pro rotaci tělesa
- $J \cdot \epsilon = M$
	- $\displaystyle\epsilon = \frac{d\omega}{dt} = \frac{d^2\varphi}{dt^2}$
	- $\displaystyle J = \frac{2}{5}mR^2+m\cdot l^2$ (použití Steinerovy věty)
	- $M = - l \cdot mg\sin(\varphi)$ (moment síly)


### Výpočet

dosadíme do rovnice $\epsilon, J, M$ a upravíme
- $\displaystyle\left(\frac{2}{5}mR^2 + m\cdot l^2\right) \cdot \frac{d^2\varphi}{dt^2} = -l\cdot mg\sin(\varphi)$
- $\displaystyle\left(\frac{2}{5}\cancel{m}R^2 + \cancel{m}\cdot l^2\right) \cdot \frac{d^2\varphi}{dt^2} = -l\cdot \cancel{m}g\sin(\varphi)$
- $\displaystyle\left(\frac{2}{5}R^2 + l^2\right) \cdot \frac{d^2\varphi}{dt^2} + l\cdot g\sin(\varphi) = 0$
- $\displaystyle\frac{d^2\varphi}{dt^2} + \frac{l\cdot g}{\frac{2}{5}R^2 + l^2}\cdot\sin(\varphi) = 0$
	- nahradíme $\frac{l\cdot g}{\frac{2}{5}R^2 + l^2} = \omega^2$ - úhlová rychlost

pro úhly $\varphi < 5^\circ \implies \sin \varphi \sim \varphi$
- $\displaystyle\frac{d^2\varphi}{dt^2} + \omega^2\cdot\varphi = 0$
- lineární harmonický oscilátor

**Doba kyvu kyvadla**
- využijeme vzoreček pro úhlovou rychlost $\omega^2$ uvedený výše
- $\displaystyle T_{k} = \frac{\pi}{\omega}$

$\displaystyle T_{k} = \frac{\pi}{\sqrt{ \frac{l \cdot g}{\frac{2}{5}R^2+l^2} }} = \pi \cdot \frac{\sqrt{ \frac{2}{5} R^2 + l^2 }}{\sqrt{ l \cdot g }} = \pi \cdot \frac{\sqrt{ l \cdot \left[ \frac{2}{5}\left( \frac{R}{l} \right)^2+1 \right] }}{\sqrt{ g }} = \pi \cdot \sqrt{ \frac{l}{g} } \cdot \sqrt{ \frac{2}{5} \left( \frac{R}{l} \right)^2 + 1 }$

### Výsledek

pro $\displaystyle R \to 0 \implies T_{k} = \pi \cdot \sqrt{ \frac{l}{g} }$
- doba kyvu matematického kyvadla

bude-li R 10% délky závěsu $l \implies R = 0.1\cdot l$
- $\displaystyle T_{k} = T^M_{k} \cdot \sqrt{ \frac{2}{5} \left(\frac{0.1 \cdot l}{l}\right)^2 +1 } = T^M_{k \cdot \sqrt{ 1.004 }} = T^M_{k} \cdot 1,002$
- chyba by byla 0.2%
