# Inerciální a neinerciální soustavy

Jako první je nutné si představit dvě navzájem nezávislé soustavy $S$ a $S'$, ve kterých pozorujeme tentýž hmotný bod $m$.
- osy zůstávají rovnoběžné
- pohybují se vůči sobě

![soustavy](_assets/soustavy.svg)

- z obrázku musí být proto vidět následující vztah pro průvodiče
	- $\vec{r} = \vec{r}' + \vec{R}$
- pokud rovnici zderivujeme podle času, dostaneme podobný vztah pro rychlosti
	- $\frac{d\vec{r}}{dt} = \frac{d\vec{r}'}{dt} + \frac{d\vec{R}}{dt}$
	- $\vec{v} = \vec{v}' + \vec{u}$
		- $\vec{v} = \frac{d\vec{r}}{dt}$ ... **rychlost bodu v $S'$**
		- $\vec{v}' = \frac{d\vec{r}'}{dt}$ ... **rychlost bodu v $S$**
		- $\vec{u} = \frac{d\vec{R}}{dt}$ ... **unášivá rychlost**
	- název unášivá proto, že bod je v $S'$ v klidu, ale oproti $S$ se pohybuje, je tedy unášen rychlostí $S'$
	- pokud tedy ještě zderivujeme vztah pro rychlosti, dostaneme zrychlení
		- $\vec{a_{u}} = \frac{d\vec{u}}{dt}$
		- $\vec{a} = \vec{a}' + \vec{a_{u}}$

### Rovnoměrný přímočarý pohyb

Při tomto pohybu se soustavy **vůči sobě pohybují rovnoměrně**, tedy rychlost mezi nimi (unášivá rychlost) **je konstantní**.
- $\vec{u} = \text{konst.}$

Podle 1. NZ (**zákon setrvačnosti**) platí, že pokud se těleso pohybuje rovnoměrně přímočaře, jeho rychlost je konstantní.
- z toho vyplývá, že platí $\vec{v}' = \vec{v}-\vec{u} = \text{konst.}$
	- protože se rychlost nemění, **unášivé zrychlení** $\vec{a_{u}}$ je nulové
- v druhé soustavě ($S'$) se těleso tedy také pohybuje rovnoměrně přímočaře
- **inerciální soustavy** - platí v nich **zákon setrvačnosti**

Pro převod souřadnic z jedné soustavy do druhé nám zde poslouží tzv. **Galileovy transformace**

- vyjádříme **vektorovou rovnici** z $\vec{r}' = \vec{r} - \vec{R}$
	- $x' = x - R_{x}$
	- $y' = y - R_{y}$
	- $z' = z - R_{z}$
- **konstantní rychlost** jako souřadnice $\vec{u}$
	- $\vec{u} = (u_{x}, u_{y}, u_{z})$
	- vyjádření dráhy: $s = v\cdot t$
- dosadíme za všechna $R_{x,y,z} \implies$ vzniknou **GT**
	- $x' = x - u_{x}\cdot t$
	- $y' = y - u_{y}\cdot t$
	- $z' = z - u_{z}\cdot t$
- $\vec{r}' = \vec{r} - \vec{u}\cdot t$
- $t = t'$

V každé **inerciální soustavě** platí i 2. NZ (**zákon síly**) a pohybové rovnice jsou invariantní vůči **Galileově transformaci**.

### Nerovnoměrně křivočarý pohyb

Unášivá rychlost mezi soustavami je v tomto pohybu proměnlivá a může měnit velikost, orientaci i směr a proto **není konstantní**.
- $\vec{u} \neq \text{konst.}$
- **unášivé zrychlení** $\vec{a_{u}}$ už není nulové, protože se pohybujeme nerovnoměrně $\vec{v}' = \vec{v} - \vec{u} \neq \text{konst.}$
	- proto bude rozdíl ve zrychlení v první a druhé soustavě
	- $\vec{a}' = \vec{a} - \vec{a_{u}}$

Neplatí 1. NZ (**zákon setrvačnosti**), jedná se tedy o **neinerciální soustavu**.

**Pohybová rovnice** podle 2. NZ
- $m\cdot \vec{a}' = m(\vec{a}-\vec{a_{u}}) = m\cdot \vec{a} - m\cdot \vec{a_{u}} = \vec{F} + \vec{F}^* = \vec{F}'$
- není již invariantní
- objevuje se zde **setrvačná síla**
	- nutí těleso setrvávat v původním pohybu
	- $F^* = -m \cdot \vec{a_{u}}$

Zrychlení je možné rozdělit na dvě složky, **normálovou** a **tečnou**:
- $\vec{a_{u}} = \vec{a_{t}} + \vec{a_{n}}$

Vzorec pro celkovou setrvačnou sílu můžeme rozdělit:
- $\vec{F}^* = -m(\vec{a_{t}} + \vec{a_{n}}) = -m\vec{a_{t}} - m\vec{a_{n}} = \vec{F_{n}^*} + \vec{F_{t}^*}$
- dostáváme tak **odstředivou sílu** $\vec{F}^*_{n}$ a **Eulerovu (tečnou) sílu** $\vec{F}^*_{t}$

### Rotační pohyb

Pro vyjádření pohybové rovnice rotačního pohybu musíme kromě skutečné síly $\vec{F}$, která působí v původní inerciální soustavě, také započítat tři další síly.

Při rotaci tělesa se k odstředivé a Eulerově síle přidá třetí tzv. **Coriolisova síla** $\vec{F}^*_{c}$.
- $\vec{F}_{c}^* = - 2m\cdot \vec{\omega} \cdot \vec{v}'$
- objevuje se pouze v případě vlastního pohybu hmotného bodu v neinerciální soustavě takovou rychlostí, která není rovnoběžná s osou rotace

Celková síla při rotaci potom bude
- $\vec{F} + \vec{F}^* + \vec{F}_{t}^* + \vec{F}^*_{n} = \vec{F}'$
