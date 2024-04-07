### Zadání

**Homogenní válec** o poloměru **R** a hmotnosti **m** se beze smyku valí po **nakloněné rovině** ve směru spádnice. Délka nakloněné roviny je **s**, úhel jejího sklonu je **α**. V nejvyšším bodě byl válec v klidu a pohybuje se jen vlivem vlastní tíhy. Vypočítejte, jakou **rychlost** bude mít těžiště válce **při opuštění nakloněné roviny**.

- $R$ - poloměr válce
- $m$ - hmotnost válce
- $s$ - délka nakloněné roviny (NR)
- $\alpha$ - úhel sklonu NR
- $v = \, ?$ - rychlost válce

![](_assets/priklad7.svg)

tíhové pole $\to$ konzervativní $\implies$ zákon zachování mechanické energie
- $W_{kin} + W_{pot} = \text{konst.}$
- musí tedy platit $W_{kin1}+W_{pot1} = W_{kin2}+W_{pot2}$
	- v místech 1 (nahoře) a 2 (dole)

výška
+ $h = \sin \alpha \cdot s$ (viz. obrázek)

pro valení válce bez prokluzu platí
- $v \cdot T = 2\pi R$
	- $T$ - perioda jednoho otočení
	- upravíme na tvar níže
+ $\displaystyle \frac{v}{R} = \frac{2\pi}{T} = \omega$ (úhlová rychlost)
- $J = \frac{1}{2} m R^2$

### Výpočet

upravíme vzorec
- $\emptyset + m \cdot g \cdot h = \left( \frac{1}{2}m \cdot v^2 \right) + \left( \frac{1}{2}J \cdot \omega^2 \right) + \emptyset$
- $m \cdot g \cdot h = \frac{1}{2}mv^2 + \frac{1}{2}J\omega^2$
	- dosadíme za $J, \omega$

upravujeme a poté vyjádříme $v^2$
- $m \cdot g \cdot h = \frac{1}{2}mv^2 + \frac{1}{2}\left( \frac{1}{2}m \cdot R^2 \right)\cdot\left( \frac{v}{R} \right)^2$
- $\cancel{m} \cdot g \cdot h = \frac{1}{2}\cancel{m}v^2 + \frac{1}{4}\cancel{m \cdot R^2} \cdot \frac{v^2}{\cancel{R^2}}$
+ $g \cdot h = \frac{3}{4}v^2 \implies v^2 = \frac{4}{3}gh$

### Výsledek

$v^2 = \frac{4}{3}gh = \frac{4}{3} g \cdot s \cdot \sin \alpha$

$v = \sqrt{ \frac{4}{3} \cdot g \cdot s \cdot \sin \alpha }$