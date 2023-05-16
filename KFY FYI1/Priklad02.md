### Zadání

Podél rovnoměrně se otáčející tyče se od jejího upevnění rovnoměrně pohybuje kulička. Určete: **parametrické rovnice dráhy kuličky**, **velikost rychlosti kuličky** a její **celkové**, **tečné** a **normálové zrychlení**.

- $\omega = \text{konst.}$ (rotace tyče)
- $v_{0} = \text{konst.}$ (pohyb kuličky podél tyče)
- parametrická rovnice trajektorie kuličky = ?
- velikost rychlosti kuličky v = ?
- celkové ($a = \ ?$), tečné ($a_{t} = \ ?$) a normálové ($a_{n} = \ ?$) zrychlení

![](_assets/priklad2.svg)

- $\alpha = \omega \cdot t$
- $r = v_{0} \cdot z$
- $r = \sqrt{ v_{x}^2 + v_{y}^2 }$
+ parametrická rovnice trajektorie kuličky
	+ $x = \cos \alpha \cdot r = v_{0}\cdot \cos(\omega t)$
	+ $y = \sin \alpha \cdot r = v_{0}\cdot \sin(\omega t)$
+ umocníme na druhou a sečteme
	+ $x^2 + y^2 = (v_{0}t)^2 \cdot [\cos^2(\omega t) + \sin^2(\omega t)] = (v_{0}t)^2 \cdot 1$
	+ $x^2 + y^2 = (v_{0}t)^2$ ... rovnice rovinné spirály

- $\displaystyle v_{x} = \frac{dx}{dt} = \frac{d}{dt}[v_{0} t \cdot \cos(\omega t)] = v_{0} \cos(\omega t) - v_{0}\omega t \sin(\omega t)$
- $\displaystyle v_{y} = \frac{dy}{dt} = \frac{d}{dt}[v_{0}t \cdot \sin(\omega t)] = v_{0} \sin(\omega t) + v_{0}\omega t \cos(\omega t)$

### Výpočet

$\displaystyle r = \sqrt{ [v_{0} \cos(\omega t) - v_{0}\omega t \sin(\omega t)]^2 + [v_{0} \sin(\omega t) + v_{0}\omega t \cos(\omega t)]^2 } = v_{0} \cdot \sqrt{ 1 + (\omega t)^2 }$
$\displaystyle a_x = \frac{dv_{x}}{dt} = \frac{d}{dt}[v_{0} \cos(\omega t) - v_{0}\omega t \sin(\omega t)] = \dots = -2 \cdot v_{0} \cdot \omega \sin(\omega t) - v_{0} \cdot \omega^2 t \cos(\omega t)$
$\displaystyle a_{y} = \frac{dv_{y}}{dt} = \frac{d}{dt}[v_{0} \sin(\omega t) + v_{0}\omega t \cos(\omega t)] = \dots = 2 \cdot v_{0} \cdot \omega \cos(\omega t) - v_{0} \cdot \omega^2 t \sin(\omega t)$

### Výsledek

$\displaystyle a = \sqrt{ a_{t}^2 + a_{n}^2 } = \sqrt{ 4 v_{0}^2 \cdot \omega^2 + (v_{0} \cdot \omega^2 t)^2 } = v_{0} \cdot \omega \cdot \sqrt{ 4 + (\omega t)^2 }$

$\displaystyle a_{t} = \frac{dv}{dt} = \frac{d}{dt}[ v_{0} \cdot \sqrt{ 1 + (\omega t)^2 } ] = v_{0} \cdot \frac{1}{\cancel{2}}[1 + (\omega t)^2]^\frac{-1}{2} \cdot \cancel{2}(\omega t) \cdot \omega = \frac{v_{0} \cdot \omega^2 \cdot t}{\sqrt{ 1+(\omega t)^2 }}$
$\displaystyle a_{n} = \frac{v^2}{R} \quad$ R neznáme, ale známe $\displaystyle a = \sqrt{ a^2_{t} + a^2_{n} }$

$\displaystyle a_{n} = \sqrt{ a^2 - a^2_{t} } = \sqrt{ v_{0}^2 \cdot \omega^2 \cdot [4 + (\omega t)^2] - \frac{v_{0}^2 \cdot \omega^4 \cdot t^2}{1 + (\omega t)^2} } = \dots = \frac{v_{0} \cdot \omega \cdot [2 + (\omega t)^2]}{\sqrt{ 1 + (\omega t)^2 }}$