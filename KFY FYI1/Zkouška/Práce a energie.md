# Práce a energie

### Mechanická práce

Na SŠ se práce definuje jako síla $F$ působící po dráze $s$ pod úhlem $\alpha$.
- $A = F \cdot s \cdot \sin \alpha$

![práce](_assets/prace.svg)

Pokud je dráha vektorem, potom je výsledná mechanická práce skalárním součinem dvou vektorů:
- $A = \vec{F} \cdot \vec{s}$
- platí pokud působíme konstantní silou

Práce běžně **neprobíhá na přímé dráze** a působící **síla není konstantní** a proto musíme **dráhy rozdělit** na přímé úseky a **sečíst mechanickou práci** na těchto částech.

- uděláme nekonečný součet nekonečně malých členů práce
- získáme křivkový **určitý integrál** přes celou dráhu
	- $A = \int_{s} \vec{F}\, d\vec{s} = \int_{s} \vec{F} \, d\vec{r}$

### Práce síly pole a vnější síly

- **centrální těleso** (CT) o hmotnosti $M$
- ve vzdálenosti $\vec{r}$ od **CT** těleso o hmotnosti $m$
+ poté centrální těleso působí na druhé těleso silou $\vec{F} = -\kappa \cdot \frac{Mm}{r^2} \cdot \vec{r_{0}}$
	+ $\kappa$ je gravitační konstanta
+ pozorované těleso hmotnosti $m$ je v gravitačním poli **CT**

**Intenzita gravitačního pole**
- rovna síle působící na těleso jednotkové hmotnosti (vydělené hmotností)
- $\vec{K} = \frac{\vec{F}}{m} = -\kappa \frac{M}{r^2} \vec{r_{0}}$

Pokud bychom tedy chtěli přemístit těleso o hmotnosti $m$ v tomto gravitačním poli, museli bychom vnějšími silami překonat sílu tohoto gravitačního pole.

- vykonaná práce by poté byla rovna $A' = \int_{\vec{r_{1}}}^{\vec{r_{2}}} F \, d\vec{r} = -A$
- působíme stejně velkou silou jako g. pole, ale opačným směrem
- vykonaná práce nezávisí na dráze, ale na počátečním a koncovém bodě dráhy ($\vec{r_{1}}$ a $\vec{r_{2}}$)

Pokud bychom tělesu v bodě $r_{2}$ umožnili pohyb zpět do výchozího bodu $r_{1}$, tak gravitační pole vykoná stejnou sílu, jakou bylo potřeba vykonat pro původní přemístění.

- **konzervativní gravitační pole** - g. pole s touto vlastností (zakonzervování vykonané práce)

### Potenciální energie

Jedná se o práci, kterou těleso vykoná při pohybu z místa $\vec{r}$ do výchozího místa $\vec{r_{1}}$.
- nezáleží na dráze
- $W_{p}(\vec{r}, \vec{r_{1}}) = -\kappa \frac{Mm}{\vec{r}} + \kappa \frac{Mm}{\vec{r_{1}}}$
- $\vec{r}$ a $\vec{r_{1}}$ představují vzdálenost od středu gravitačního pole

**Gravitační potenciální energie** je tedy definována jako práce, kterou vykoná gravitační pole při pohybu z místa $\vec{r}$ do výchozího místa $\vec{r_{1}}$.

### Kinetická energie

U kinetické energie se zabýváme změnou pohybové síly tělesa.
- závisí pouze na pohybovém stavu (rychlosti) tělesa v počátečním a koncovém bodě
- $W_{k}(v) = \frac{1}{2}mv^2$

### Celková mechanická energie

Součet potenciální a kinetické energie má v jakémkoliv místě **konzervativního silového pole** stále stejnou hodnotu.
+ $W = W_{p} + W_{k} = \text{konst.}$
	+ tento součet se nazývá **celková mechanická energie** a říká ním o jejím **zachování**
+ zákon o zachování energie
	- jediným jeho předpokladem je **konzervativnost silového pole***
