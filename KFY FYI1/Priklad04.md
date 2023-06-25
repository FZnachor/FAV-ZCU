### Zadání

Na základě obecného vzorce pro potenciální energii $W_{pot}(r) = -\kappa\frac{mM}{r} +\kappa\frac{mM}{r_{1}}$, najděte vztah pro **potenciální energii hmotného bodu** v malé výšce **h** nad zemským povrchem.

- $m$ - hmotnost přenášeného tělesa
- $r$ - koncová poloha
- $r_{1}$ - výchozí poloha
- $\kappa$ - gravitační konstanta
- $M$ - hmotnost Země (tělesa v jehož gravitačním poli se nacházíme)

![](_assets/priklad4.svg)

- $h$ - malá výška nad povrchem Země
- $R_{z}$ - poloměr Země
- $W_{pot}(h) = \, ?$

### Výpočet

$\displaystyle W_{pot}(h) = -\kappa \cdot \frac{m \cdot M_{z}}{R_{z} + h} + \kappa \cdot \frac{m \cdot M_{z}}{R_{z}} = \kappa \cdot m \cdot M_{z} \cdot \left[ \frac{1}{R_{z}} - \frac{1}{R_{z}+h} \right] =$

$\displaystyle= \kappa \cdot m \cdot M_{z} \cdot \left[ \frac{\cancel{R_{z}}+h-\cancel{R_{z}}}{R_{z}(R_{z}+h)} \right] = \kappa \cdot m \cdot M_{z} \cdot \frac{h}{R_{z}^2\left( 1+\frac{h}{R_{z}} \right)} =$

$\displaystyle = m \cdot \left( \kappa \cdot \frac{M_{z}}{R^2_{z}} \right) \cdot h = m \cdot g \cdot h$

Pouze blízko povrchu Země
- $h \ll R_{z} \implies \text{zanedbáme}$
- $\displaystyle\kappa \cdot \frac{M_{z}}{R_{z}^2} \sim g$

### Výsledek

$W_{pot}(h) \simeq m \cdot g \cdot h$