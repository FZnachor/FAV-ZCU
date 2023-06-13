### Zadání

**Koule** zadaného poloměru **mírně kývá na závěsu** zadané délky. Spočtěte: **dobu kyvu kyvadla**. Jaké chyby se dopustíme, budeme-li kouli považovat za bodovou hmotnost? (kyv = pohyb ze strany na stranu, kmit = 2 kyvy = pohyb z jedné strany na druhou a zpět)

- $R$ - poloměr koule
- $l$ - délka závěsu
- $T_{kyvadla} = \, ?$
- chyba pro $R \to 0 = \, ?$
- netlumené kmity (tření)
- tíhové pole Země

![](_assets/priklad9.svg)

- 2. impulzová věta (pohybová rovnice pro rotaci tuhého tělesa)
	- $J \cdot \vec \epsilon = -\vec M$
		- $\vec M = \vec I \cdot \vec G$
		- $M = \vert \vec M \vert = \vert \vec I \vert \cdot \vert \vec G \vert \cdot \sin \varphi = l \cdot m \cdot g \cdot \sin \varphi$
	- $J$ - moment setrvačnosti
	- $\displaystyle \vec \epsilon = \frac{d\vec w}{dt} = \frac{d^2\vec\varphi}{dt^2}$
- Steinerova věta
	- $\displaystyle J \cdot \frac{d^2 \varphi}{dt^2} = -M$
	- $J = J_{0} + m \cdot l^2 = \frac{2}{5} m R^2 + m \cdot l^2$
		- $J_{0} = \frac{2}{5}m\cdot R$ (moment setrvačnosti koule - symetrická osa)

### Výpočet

$\displaystyle \left( \frac{2}{5} m R^2 + m \cdot l^2 \right) \cdot \frac{d^2\varphi}{dt^2} = -l\cdot m\cdot \sin \varphi$

$\displaystyle \left( \frac{2}{5} m R^2 + m \cdot l^2 \right) \cdot \frac{d^2\varphi}{dt^2} + l \cdot m \cdot g \cdot \sin \varphi = 0$

$\displaystyle \left( \frac{2}{5} m R^2 \cdot l^2 \right) \cdot \frac{d^2\varphi}{dt^2} + l \cdot g \cdot \sin \varphi = 0$

$\displaystyle\frac{d^2\varphi}{dt^2} + \frac{l \cdot g}{\frac{2}{5}R^2 + l ^2} \cdot \sin \varphi = 0$

$\displaystyle\frac{d^2\varphi}{dt^2} + \frac{l \cdot g}{\frac{2}{5}R^2 + l ^2} \cdot \sin \varphi = 0$
- pro $\varphi < 5^\circ \implies \sin \varphi \simeq \varphi$ 

$\displaystyle\frac{d^2\varphi}{dt^2} + \frac{l \cdot g}{\frac{2}{5}R^2 + l ^2} \cdot \varphi = 0$
- $\displaystyle \frac{l \cdot g}{\frac{2}{5}R^2 + l ^2} = \omega^2$ - úhlová rychlost

$\displaystyle\frac{d^2\varphi}{dt^2} + \omega^2 \cdot \varphi = 0$
- lineární harmonický oscilátor
- ... víme, že $\displaystyle\omega = \frac{2\pi}{T}$, kde $T$ je perioda (doba kmitu)
- $\displaystyle T_{kyv} = \frac{\pi}{\omega}$

$\displaystyle T_{kyv} = \frac{\pi}{\sqrt{ \frac{l \cdot g}{\frac{2}{5}R^2+l^2} }} = \pi \cdot \frac{\sqrt{ l \cdot \left[ \frac{2}{5}\left( \frac{R}{l} \right)^2+1 \right] }}{l \cdot g} = \pi \cdot \sqrt{ \frac{l}{g} } \cdot \sqrt{ \frac{2}{5} \left( \frac{R}{l}^2 + 1 \right) }$

### Výsledek

pro $\displaystyle R \to 0 \implies T_{kyv} = \pi \cdot \sqrt{ \frac{l}{g} }$
- doba kyvu matematického kyvadla

bude-li R 10% délky závěsu l ($R = 0.1 \cdot l$)
- $\displaystyle T_{kyv} = T^M_{kyv} \cdot \sqrt{ \frac{2}{5} \left(\frac{0.1 \cdot l}{l}\right)^2 +1 } = T^M_{kyv \cdot \sqrt{ 1.004 }} = T^M_{kyv} \cdot 1,002$
- chyba by byla 0.2%