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

$\displaystyle W_{pot}(h) = -\kappa \cdot \frac{m \cdot M}{R_{z} + h} + \kappa \cdot \frac{m \cdot M}{R_{z}} = \kappa \cdot m \cdot M_{z} \cdot \left[ \frac{1}{R_{z}} - \frac{1}{R_{z}+h} \right] = \dots = m \cdot \left( \kappa \cdot \frac{M_{z}}{R_{z}} \right) \cdot h = m \cdot g \cdot h \cdot \frac{1}{1+\frac{h}{R_{z}}}$
- $h \ll R_{z} \implies \text{zanedbáme}$
- pouze blízko povrchu Země

### Výsledek

$W_{pot}(h) \simeq m \cdot g \cdot h$