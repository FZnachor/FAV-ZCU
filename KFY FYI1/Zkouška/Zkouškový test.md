### Popište a vysvětlete inerciální a neinerciální souřadné soustavy
- základní vztahy pro průvodiče, rychlosti a zrychlení (obrázek)
- platnost 1. a 2. Newtonova zákona v těchto soustavách
- co jsou to Galileovy transformace a za jakých podmínek platí
- kdy působí setrvačné síly (tři druhy těchto sil) a kam směřují (obrázek)

#### Základní vztahy pro průvodiče, rychlosti a zrychlení (obrázek)

**Inerciální soustavy** (inercie = setrvačnost)
- vztažná soustava, která se **pohybuje rovnoměrně přímočaře** nebo je v klidu
	- **rovnoměrně** - rychlost se v čase nemění
	- **přímočaře** - směr se v čase nemění
- Newtononovy zákony platí bez jakýchkoliv úprav

**Neinerciální soustavy**
- vztažná soustava, která se pohybuje **zrychleně** (např. zrychleně rovnoměrně, po kruhové dráze, ...)
- kromě skutečných sil brány v úvahu také zdánlivé (inertní) síly
	- **Eulerova (setrvačná) síla** $\vec{F}^*_{t}$, **odstředivá síla** $\vec{F}^*_{n}$, **Coriolisova síla** $\vec{F}^*_{C}$
- pro použití Newtonových zákonů je potřeba přidávat tyto zdánlivé síly

Máme dvě vzájemně nezávislé soustavy $S$ a $S'$, ve kterých pozorujeme stejný hmotný bod $m$
- osy zůstávají rovnoběžné a pohybují se vůči sobě (**posuvný pohyb nebo-li translace**)

Průvodiče jsou vektory polohy $r, r'$ závisící na čase $t$
- vedou od počátku souřadnicového systému k poloze tělesa $m$
- pokud se těleso pohybuje v dané soustavě, průvodič se v čase mění a jeho změna určuje rychlost tělesa v dané soustavě

![](_assets/soustavy.svg)

Z obrázku je zřejmý **vztah pro průvodiče**
- $\displaystyle\vec{r} = \vec{r}' + \vec{R}$

Derivace podle času - **vztah pro rychlost**
- $\displaystyle\frac{d\vec{r}}{dt} = \frac{d\vec{r}'}{dt} + \frac{d\vec{R}}{dt}$
	- můžeme upravit, rychlost je vyjádřena jako $v = \frac{dr}{dt}$
- $\vec{v} = \vec{v}' + \vec{u}$
	- $\vec{v}$ je rychlost bodu v soustavě $S$
	- $\vec{v}'$ je rychlost stejného bodu v soustavě $S'$
	- $\vec{u}$ je **unášivá rychlost**, tedy rychlost, s jakou se soustava $S'$ pohybuje vzhledem k soustavě $S$ (hmotný bod je soustavou unášen)

Derivace vzorce rychlosti podle času - **vztah pro zrychlení**
- $\displaystyle\frac{d\vec{v}}{dt} = \frac{d\vec{v}'}{dt} + \frac{d\vec{u}}{dt}$
	- můžeme upravit, zrychlení je časovou derivací rychlosti
- $\vec{a} = \vec{a}' + \vec{a}_{u}$
	- $\vec{a}$ je zrychlení bodu v soustavě $S$
	- $\vec{a}'$ je zrychlení stejného bodu v soustavě $S'$
	- $\vec{a}_{u}$ je **unášivé zrychlení** soustavy $S'$ vůči soustavě $S$

#### Platnost 1. a 2. Newtonova zákona v těchto soustavách

První Newtonův zákon (zákon setrvačnosti)
- Těleso setrvává v klidu nebo v rovnoměrném přímočarém pohybu, pokud na něj nepůsobí žádná výsledná síla (součet všech sil).

Druhý Newtonův zákon (zákon síly)
- Zrychlení tělesa je přímo úměrné výsledné síle působící na těleso a nepřímo úměrné jeho hmotnosti. Tento vztah je vyjádřen rovnicí $\vec{F} = m\vec{a}$.
	- hmotnost je míra setrvačnosti, brání v pohybu

**Rovnoměrný přímočarý pohyb** soustavy $S'$ vůči soustavě $S$
- **unášivá rychlost** mezi soustavami je konstantní
	- $\vec{u} = \text{konst.}$
- v soustavě $S$ platí pro těleso **zákon setrvačnosti** (1. NZ)
	- těleso se bez působení sil pohybuje v soustavě $S$ rovnoměrným přímočarým pohybem nebo je v klidu
	- rychlost v soustavě $S$ je tedy konstantní včetně nuly
		- $\vec{v} = \text{konst.}$
	- z výše uvedených vztahů plyne, že rychlost v soustavě $S'$ bude také konstantní
		- $\vec{v}' = \vec{v} - \vec{u} = \text{konst.}$
	- **zákon setrvačnosti platí v obou soustavách**, nazývají se tedy inerciální (setrvačné)
	- v těchto soustavách platí **Galileovy transformace**
- platnost 2. NZ v soustavě $S'$
	- předpokládejme, že pro hmotný bod v soustavě $S$ neplatí 1. NZ, ale působením těles se začal pohybovat podle zákona síly: $\vec{F} = m\vec{a}$
	- při konstantní **unášivé rychlosti** $\vec{u}$ soustavy $S'$ je její **unášivé zrychlení nulové**
		- $\displaystyle\vec{a}_{u} = \frac{d\vec{u}}{dt} = \frac{d}{dt}(\text{konst}) = 0$
	- ze vztahů plyne rovnost zrychlení $\vec{a}' = \vec{a} - \vec{a}_{u} = \vec{a}$
	- pohybová rovnice v $S'$ má tedy tvar
		- $m\cdot \vec{a}' = m\cdot(\vec{a}-\vec{a}_{u}) = m\cdot \vec{a} = \vec{F} = \vec{F}'$
	- v obou soustavách jsou tedy **stejná zrychlení** i **stejné síly**
		- pohybová rovnice tedy platí v nezměněném tvaru v každé inerciální soustavě
		- pohybové rovnice jsou invariantní (nezměněné) vůči Galileově transformaci

**Nerovnoměrný křivočarý (posuvný) pohyb** soustavy $S'$ vůči soustavě $S$
- pohyb musí být stále translací (osy se tedy neotáčí)
- **unášivá rychlost** je nyní obecně proměnnou veličinou
	- rychlost může měnit velikost, směr i orientaci
	- $\vec{u} \neq \text{konst.}$
	- **unášivé zrychlení** je tedy nenulové
		- $\displaystyle\vec{a}_{u} = \frac{d\vec{u}}{dt} \neq 0$
- platnost 1. NZ v soustavě $S'$
	- v případě konstantní rychlosti tělesa v soustavě $S$ nebude v $S'$ rychlost konstantní
		- $\vec{v}' = \vec{v} - \vec{u} \neq \text{konst.}$
	- kvůli tomu v soustavě $S'$ **neplatí zákon setrvačnosti** a jedná se tak o **neinerciální soustavu**
- platnost 2. NZ v soustavě $S'$
	- jelikož je unášivé zrychlení nenulové, tak je zrychlení bodu v soustavě $S'$ odlišné od zrychlení stejného bodu v soustavě $S$
		- $\vec{a}' = \vec{a} - \vec{a}_{u} \neq \vec{a}$
	- pohybová rovnice v $S'$ má poté tvar
		- $m\cdot \vec{a}' = m\cdot(\vec{a} - \vec{a}_{u}) = m\cdot \vec{a}-m\cdot \vec{a}_{u} = \vec{F} + \vec{F}^* = \vec{F}'$
		- v obou soustavách jsou nyní **jiná zrychlení** i **jiné síly**
	- pohybová rovnice **není invariantní**
		- změnila svůj tvar a kromě původní působící síly se zde objevuje **nová setrvačná síla** $\vec{F}^*$ závisející na unášivém zrychlení soustavy

#### Co jsou to Galileovy transformace a za jakých podmínek platí

Jedná se o transformační vztahy pro převod souřadnic mezi dvěma inerciálními soustavami
- $\vec{r} = \vec{r}' + \vec{R} \implies \vec{r}' = \vec{r} - \vec{R}$ - budeme počítat souřadnice ve druhé soustavě
- tento vztah je možné rozložit na tři rovnice
	- $x' = x - R_{x}$
	- $y' = y - R_{y}$
	- $z' = z - R_{z}$
- použitím rovnice $s = v\cdot t$ rozložíme $R_{i}$ na $u_{i}\cdot t$, čímž získáme **Galileovy transformace**
	- $x' = x - u_{x}\cdot t$
	- $y' = y - u_{y}\cdot t$
	- $z' = z - u_{z}\cdot t$
	- $t = t'$ (souřadnice počítáme ve stejném čase)
- pokud vyjádříme $x, y, z$ místo $x', y', z'$, tak získáme **inverzní Galileovy transformace**
	- $x = x' + u_{x}\cdot t$
	- $y = y' + u_{y}\cdot t$
	- $z = z' + u_{z}\cdot t$
	- $t = t'$

Podmínky
- soustavy $S$ a $S'$ se vůči sobě pohybují **posuvným pohybem** (translací)
	- osy soustav musí zachovávat svůj směr
- obě dvě soustavy musí být **inerciální**
- **v nulovém čase** $t = 0$ **obě soustavy splývají** - jejich počátky jsou na stejném místě, tedy $O' = O$

#### Kdy působí setrvačné síly a kam směřují (obrázek)

**Nerovnoměrný křivočarý (posuvný) pohyb** soustavy $S'$ vůči soustavě $S$
- **setrvačná síla** (v neinerciální soustavě)
	- $\vec{F}^* = -m\cdot \vec{a}_{u}$
- rozložení setrvačné síly na složky
	- $\vec{a}_{u} = \vec{a}_{n} + \vec{a}_{t}$
	- $\vec{F}^* = -m(\vec{a}_{n} + \vec{a}_{t}) = -m\vec{a}_{n} -m\vec{a}_{t} = \vec{F}^*_{n} + \vec{F}^*_{t}$
	- **odstředivá síla**
		- $\displaystyle\vec{F}^*_{n} = -m\vec{a}_{n} = -m\cdot \frac{u^2}{R}\cdot \vec{n} = -m\cdot \vec{\omega}\times \vec{\omega}\times \vec{r}$
		- má opačný směr oproti dostředivé síle
	- **Eulerova (setrvačná) síla**
		- $\displaystyle\vec{F}^*_{t} = -m\vec{a}_{t} = -m\cdot \frac{du}{dt}\cdot \vec{t} = -m\cdot \vec{\epsilon} \times \vec{r}$
		- má opačný směr oproti tečné síle

![](_assets/sily-soustav.svg)

**Rotační pohyb** soustavy $S'$ vůči soustavě $S$
- předpoklady
	- inerciální soustava $S$ je v klidu
	- neinerciální soustava $S'$ se otáčí úhlovou rychlostí $\omega$ kolem **společných os** $z = z'$
	- počátky obou soustav splývají - $O = O'$
- sledujeme jediný hmotný bod $m$ v soustavách $S$ i $S'$
	- počátky obou soustav splývají, vektory jsou tedy totožné - $\vec{r} = \vec{r}'$
	- souřadnice tohoto jediného vektoru jsou v obou soustavách různé
- hmotný bod je se soustavou $S'$ pevně spojený
	- je vůči ní v klidu a je touto soustavou unášen
	- jeho unášivá rychlost rovna obvodové rychlosti kruhového pohybu
		- $\vec{u} = \vec{\omega}\times \vec{r}$
- bod se může v $S'$ pohybovat i samostatně
	- navíc s rychlostí $\vec{v}'$
	- skládání rychlostí v soustavě $S$ - $\vec{v} = \vec{v}' + \vec{\omega}\times \vec{r}$
- **obecný vztah mezi derivacemi libovolného vektoru**
	- vektor $\vec{A}$ ve dvou vztažných soustavách
	- v inerciální soustavě $S$ a neinerciální soustavě $S'$ rotující úhlovou rychlostí $\vec{\omega}$
	- $\displaystyle\frac{d\vec{A}}{dt} = \frac{d'\vec{A}}{dt} + \vec{\omega}\times \vec{A}$
- vztah výše lze využít pro výpočet zrychlení hmotného bodu v neinerciální soustavě
	- $\displaystyle\frac{d\vec{v}'}{dt} = \frac{d'\vec{v}'}{dt} + \vec{\omega}\times \vec{v}'$
	- $\displaystyle\vec{a}' = \frac{d'\vec{v}'}{dt} = \frac{d\vec{v}'}{dt} - \vec{\omega}\times \vec{v}'$
	- $\displaystyle\vec{a}' = \frac{d}{dt}(\vec{v} - \vec{\omega}\times \vec{r}) - \vec{\omega}\times \vec{v}'$
	- $\displaystyle\vec{a}' = \vec{a} - \vec{\epsilon}\times \vec{r} - \vec{\omega}\times \vec{v} - \vec{\omega}\times \vec{v}'$
	- $m\cdot\vec{a}' = m\cdot\vec{a} - m\cdot\vec{\epsilon}\times \vec{r} - m\cdot \vec{\omega}\times(\vec{\omega}\times \vec{r}) - 2\cdot m\cdot \vec{\omega}\times \vec{v}'$
	- $m\cdot \vec{a} = \vec{F} + \vec{F}^*_{1} + \vec{F}^*_{2} + \vec{F}^*_{3} = \vec{F}'$
- kromě skutečné síly $\vec{F}$ je potřeba započítat tři další
	- $\vec{F}^*_{1} = \vec{F}^*_{t} = -m\cdot \vec{\epsilon}\times \vec{r}$ - **Eulerova (setrvačná) síla**
	- $\vec{F}^*_{2} = \vec{F}^*_{n} = -m\cdot \vec{\omega}\times(\vec{\omega}\times \vec{r})$ - **odstředivá síla**
	- $\vec{F}^*_{3} = \vec{F}^*_{C} = -2m\cdot \vec{\omega}\times \vec{v}'$ - **Coriolisova síla**
		- objevuje se pouze, pokud se hmotný bod pohybuje rychlostí, která není rovnoběžná s osou rotace - tedy $z = z'$


### Definujte a vysvětlete základní energetické veličiny hmotného bodu v gravitačním poli
- **práce síly pole** a **vnější síly** - jak se na nich projeví **konzervativnost gravitačního pole**
- **potenciální energie**, **kinetická energie** a **celková mechanická energie**
- zákon zachování mechanické energie

#### Práce síly pole a vnější síly, konzervativnost gravitačního pole

Práce síly pole
- práce vykonaná gravitační silou při přesunu hmotného bodu
- závisí pouze na počáteční a konečné poloze
+ existuje **centrální těleso** (CT) o hmotnosti $M$
+ ve vzdálenosti $\vec{r}$ od **CT** se nachází těleso o hmotnosti $m$
+ poté centrální těleso působí na druhé těleso silou $\vec{F}$
	+ $\displaystyle\vec{F} = -\kappa \cdot \frac{Mm}{r^2} \cdot \vec{r_{0}}$
	+ $\kappa$ je gravitační konstanta
	+ $\vec{r}_{0} = \frac{\vec{r}}{r}$ je jednotkový vektor určující směr síly působící na těleso $m$
+ pozorované těleso hmotnosti $m$ je v gravitačním poli **CT**

Práce vnější síly
- práce vykonaná jinou silou než gravitační, která působí na hmotný bod $m$

**Konzervativnost gravitačního pole**
- práce vykonaná v tomto poli při přesunu hmotného bodu je závislá pouze na **počáteční a konečné poloze**, nikoliv na dráze
- znamená, že pole nezpůsobuje ztrátu ani zisk celkové mechanické energie systému

#### Potenciální a kinetická energie, celková mechanická energie

**Potenciální energie**
- práce, kterou těleso vykoná při pohybu z místa $\vec{r}$ do výchozího místa $\vec{r_{1}}$
- nezáleží na dráze
- $\displaystyle W_{p}(\vec{r}, \vec{r_{1}}) = -\kappa \frac{Mm}{\vec{r}} + \kappa \frac{Mm}{\vec{r_{1}}}$

**Kinetická energie**
- zabýváme se změnou pohybové síly tělesa
- závisí pouze na velikosti rychlosti tělesa
- $W_{k}(v) = \frac{1}{2}mv^2$

**Celková mechanická energie**
- součet potenciální a kinetické energie
- v libovolném místě **konzervativního silového pole** stále stejnou hodnotu
- **zákon o zachování mechanické energie**
	- $W = W_{p} + W_{k} = \text{konst.}$
	- tento součet nám říká o **zachování mechanické energie**
	- jediným jeho předpokladem je **konzervativnost silového pole**
		- konzervativní silové pole nezpůsobuje ztrátu ani zisk celkové mechanické energie systému

### Popište a vysvětlete tlumený harmonický oscilátor
- výchozí podmínky, všechny působící síly
- sestavení pohybové rovnice - její řešení pro různé velikosti tlumení (včetně grafů)
- jaká je perioda, amplituda a energie oscilátoru u kmitavého řešení
- co je to útlum a kvalita oscilátoru
- stav velmi malého tlumení

#### Výchozí podmínky, všechny působící síly

Tlumený harmonický oscilátor je systém, který vykazuje oscilace (kmitání) kolem rovnovážné polohy, přičemž tyto oscilace postupně ztrácejí energii v důsledku **odporových sil** (tlumení).

Tlumící (odporová) síla působící na pružinu
- $\displaystyle\vec{F}_{t} = -B\cdot \vec{v} = -B\cdot \frac{d\vec{r}}{dt}$
	- $B$ - koeficient tlumení
	- $\vec{r}$ - průvodič (poloha)

Síla pružiny
- $F = -k\cdot y$
	- $k$ - tuhost pružiny
	- $y$ - výchylka od rovnovážné polohy

Úpravy vzorce
- $\displaystyle m\cdot a = -k\cdot y - B\cdot \frac{dy}{dt}$
	- $F = m\cdot a$ - podle 2. NZ
- síla je rovna síle pružiny a přidané tlumící síle
	- v jednorozměrném případě vznikne rovnice níže
	- $\displaystyle m\cdot \frac{d^2y}{dt^2} = -k\cdot y - B\cdot \frac{dy}{dt}$
- tento vzorec upravíme
	- $\displaystyle\frac{d^2y}{dt^2} + \frac{B}{m} \cdot \frac{dy}{dt} + \frac{k}{m} \cdot y = 0$
	- $\displaystyle\ddot{y} + \frac{B}{m} \cdot \dot{y} + \frac{k}{m} \cdot y = 0$

#### Sestavení pohybové rovnice a její řešení (vč. grafů)

Vlastní úhlová frekvence
- $\displaystyle\frac{k}{m} = \omega^2$
- vlastní, jelikož platí pro netlumenou soustavu

Konstanta útlumu
- $\displaystyle\frac{B}{m} = 2b$
- $b$ vyjadřuje intenzitu účinku brzdících sil

**Pohybová rovnice**
- dosadíme předchozí vztahy
- $\ddot{y} + 2b\dot{y} + \omega^2y = 0$

Řešení
- dosadíme partikulární integrál do rovnice výše
	- $\alpha^2 + 2b\alpha + \omega^2 = 0$
- je to kvadratická rovnice, můžeme tedy napsat její řešení
	- $\alpha_{1,2} = -b \pm \sqrt{ b^2 - \omega^2 }$
- existují tak dvě partikulární řešení a obecné řešení bude mít tvar:
	- $y = C_{1}\cdot e^{\alpha_{1}t} + C_{2}\cdot e^{\alpha_{2}t}$
	- o konkrétním tvaru rozhodne velikost konstant $b$ a $\omega$

#### Perioda, amplituda a energie oscilátoru u kmit. řešení

Úhlová frekvence tlumených kmitů
- $\omega_{1} = \sqrt{ \omega^2 - b^2 }$

Perioda tlumených kmitů
- $\displaystyle T = \frac{2\pi}{\omega_{1}}$

Amplituda tlumených kmitů
- $A_{1} = A \cdot e^{-bt}$
	- $A$ - původní amplituda
	- amplituda s časem klesá

Energie tlumeného oscilátoru
- $\displaystyle W = \frac{1}{2}m\omega^2_{1}A^2\cdot e^{-2bt}$

#### Útlum a kvalita oscilátoru

Útlum
- poměr dvou po sobě jdoucích maximálních výchylek na jednu stranu
	- v časech $t$ a $t + T_{1}$ (plus doba kmitu)
- $\displaystyle\lambda = \frac{y(t)}{y(t+T_{1})} = e^{bT_{1}}$

Kvalita oscilátoru
- $2\pi$ násobek podílu **střední hodnoty celkové energie** oscilátoru v jedné periodě a **ztráty této energie** během jedné periody kmitů
- $\displaystyle Q = 2\pi\cdot \frac{W_{\text{stř.}}}{W_{1}}$

#### Stav velmi malého tlumení

- využívá se v elektronice
- konstanta tlumení je daleko menší než vlastní frekvence oscilátoru
- $b \ll \omega$

Kvalita oscilátoru (při velmi malém tlumení)
- v tomto případě se amplituda i energie zmenší **jen nepatrně**
	- střední hodnota energie je přibližně rovna okamžité energii
		- $W_{\text{stř.}} \approx W$
	- frekvence kmitů je přibližně rovna vlastní frekvenci oscilátoru
		- $\omega_{1} = \sqrt{ \omega^2-b^2 } \approx \omega$
- $\displaystyle Q = \frac{\omega}{2b}$

### Popište a vysvětlete nucený harmonický oscilátor
- výchozí podmínky, všechny působící síly
- pohybová rovnice, obecné a ustálené řešení
- velikost amplitudy – její průběh (do grafu)
- kdy nastane jev amplitudové rezonance - jeho popis, speciálně pro velmi malé tlumení

#### Výchozí podmínky, všechny působící síly

Jelikož by kmity přirozeně ustaly, budeme je v tomto případě udržovat působením vnější síly.

Tlumící (odporová) síla působící na pružinu
- $\displaystyle\vec{F}_{t} = -B\cdot \vec{v} = -B\cdot \frac{d\vec{r}}{dt}$
	- $B$ - koeficient tlumení
	- $\vec{r}$ - průvodič (poloha)

Síla pružiny
- $F = -k\cdot y$
	- $k$ - tuhost pružiny
	- $y$ - výchylka od rovnovážné polohy

**Harmonická budící síla**
- $F_{b} = F_{0} \cdot \sin \Omega t$
	- $\Omega$ - úhlová frekvence
	- $F_{0}$ - amplituda budící síly - nejvyšší hodnota $F_{b}$
- nejjednodušší budící síla se sinusovým průběhem

Úpravy vzorce
- postupujeme jako u tlumených kmitů, ale přidáme navíc budící sílu
- $\displaystyle m\cdot \frac{d^2y}{dt^2} = -k\cdot y - B\cdot \frac{dy}{dt} + F_{0}\cdot \sin \Omega t$
- $\displaystyle\ddot{y} + \frac{B}{m} \cdot \dot{y} + \frac{k}{m} \cdot y = \frac{F_{0}}{m}\cdot \sin \Omega t$

#### Pohybová rovnice, obecné a ustálené řešení

Vlastní úhlová frekvence
- $\displaystyle\frac{k}{m} = \omega^2$

Konstanta útlumu
- $\displaystyle\frac{B}{m} = 2b$

**Pohybová rovnice nucených kmitů**
- $\displaystyle\ddot{y} + 2b\dot{y} + \omega^2y = \frac{F_{0}}{m}\cdot \sin \Omega t$

Partikulární řešení
- uvažujeme jen malé tlumení
- $y = A\cdot\sin(\Omega t + \Phi_{0})$
	- $\Phi_{0}$ - počáteční fáze kmitání, $t = 0$

**Obecné řešení nucených kmitů**
- $y = C\cdot e^{-bt} \cdot \sin(\omega_{1}t + \varphi_{0}) + A\cdot \sin(\Omega t + \Phi_{0})$
- dvě části jsou důsledkem dvou vlivů na pohyb hm. bodu
	1. spolupůsobení třecí a pružné síly (tlumené kmity)
	2. harmonický kmitavý pohyb stejné frekvence, způsoben budící silou

**Ustálené řešení nucených kmitů**
- je určeno pouze partikulárním řešením
- $y = A\cdot\sin(\Omega t + \Phi_{0})$
- první člen obecného řešení prakticky vymizí (přestane kmitat)

#### Velikost amplitudy, její průběh

Vztah pro amplitudu nucených kmitů
- $\displaystyle A = \frac{F_{0}}{m}\cdot\frac{1}{\sqrt{ (\omega^2 - \Omega^2)^2 + 4b^2\Omega^2 }}$

Fázový posun
- $\displaystyle\tan\Phi_{0} = -\frac{2b\Omega}{\omega^2-\Omega^2}$

![](_assets/tlumeni.svg)

#### Amplitudová rezonance, velmi malé tlumení

- dochází k ní, když se frekvence vnější síly $\Omega$ blíží přirozené frekvenci oscilátoru $\omega$
- v takovém případě je amplituda maximální

Rezonance
- bez tlumení - $A$ teoreticky roste do nekonečna
- s tlumením - $A$ dosáhne konečné hodnoty i při rezonanci, protože tlumení omezuje růst amplitudy

Velmi malé tlumení
- amplituda rezonančních kmitů je výrazně vyšší, jelikož je tlumena jen málo

### Popište skládání dvou rovinných vln stejné frekvence postupujících stejným směrem
- sestavte výchozí rovnice pro obě vlny (od dvou koherentních zdrojů na ose x) (obrázek)
- převeďte na komplexní tvary - a sečtěte na výslednou vlnu
- podmínky extrémních stavů
- aplikace

#### Výchozí rovnice pro obě vlny, obrázek

- podle **principu superpozice** můžeme libovolné pohyby (nebo vlny) **skládat nezávisle na sobě** (jelikož jsou zcela nezávislé)
- každý z vícero pohybů můžeme analyzovat **samostatně**
	- výsledky poté v **libovolném pořadí složíme** (sečteme)

Úhlová rychlost
- $\displaystyle\omega = \frac{2\pi}{T} = 2\pi f$
- $\omega_{1} = \omega_{2} = \omega$
- máme stejnou frekvenci, tedy i stejnou úhlovou rychlost a periodu

Výchozí rovnice
- $y_{1} = A_{1}\cdot \sin(\omega t+\varphi_{1})$
- $y_{2} = A_{2}\cdot \sin(\omega t+\varphi_{2})$

Výsledný pohyb
- $y = y_{1}+y_{2}$
- $y = A_{1}\cdot\sin(\omega t+\varphi_{1}) + A_{2}\cdot \sin(\omega t+\varphi_{2})$
- součtem dvou sinusoid **stejné frekvence** je opět sinusoida nezměněné frekvence
- změnila se pouze **amplituda** a **fázová konstanta** $\varphi$ (v případě fázového posunu)

![](_assets/vlny.svg)
- černá vlna je součtem modrých vln

#### Převeďte na komplexní tvary, výsledná vlna

Použití komplexních funkcí
- $\displaystyle \hat{u}_{1} = A_{1}\cdot e^{i\cdot(\omega t+\varphi_{1})} = A_{1}\cdot e^{i\cdot \varphi_{1}} \cdot e^{i\cdot \omega\cdot t} = \hat{A}_{1}\cdot e^{i\cdot\omega\cdot t}$
- $\displaystyle \hat{u}_{2} = A_{2}\cdot e^{i\cdot(\omega t+\varphi_{2})} = A_{2}\cdot e^{i\cdot \varphi_{2}} \cdot e^{i\cdot \omega\cdot t} = \hat{A}_{2}\cdot e^{i\cdot\omega\cdot t}$
- komplexní tvar **výsledných kmitů**
	- $\hat{u} = \hat{u}_{1} + \hat{u}_{2} = \hat{A}_{1}\cdot e^{i\cdot \omega\cdot t} + \hat{A}_{2}\cdot e^{i\cdot \omega\cdot t} = (\hat{A}_{1} + \hat{A}_{2}) \cdot e^{i\cdot \omega\cdot t}$
	- stejná frekvence umožňuje vytknutí exponenciely
- standardní tvar komplexního zápisu kmitů
	- $\hat{u} = (\hat{A}_{1} + \hat{A}_{2}) \cdot e^{i\cdot \omega\cdot t} = \hat{A} \cdot e^{i\cdot \omega\cdot t} = A\cdot e^{i\cdot \varphi} \cdot e^{i\cdot \omega\cdot t}$
	- důkaz, že výsledné kmity jsou opět harmonické se stejnou frekvencí jako původní
- výsledná komplexní amplituda
	- je součtem obou počátečních komplexních amplitud
	- $\hat{A} = \hat{A}_{1} + \hat{A}_{2}$
	- $A\cdot e^{i\cdot \varphi} = A_{1}\cdot e^{i\cdot \varphi_{1}} + A_{2}\cdot e^{i\cdot \varphi_{2}}$

#### Podmínky extrémních stavů

Podmínky extrémních stavů určují, jaké musí mít vlny počáteční fáze $\varphi_{1}, \varphi_{2}$, abychom dosáhli maximální/minimální amplitudy, kterou je možné z těchto vln složit.

Podmínka maxima
- oba počáteční vektory musí být souhlasně rovnoběžné - $\varphi_{1} = \varphi_{2}$
- $\varphi_{2} - \varphi_{1} = 0 \pm n\cdot 2\pi, \quad n = 0,1,2,3,\dots$
	- vlny mají stejný fázový rozdíl, proto $0$
	- mohou se lišit o celou periodu, proto $n\cdot2\pi$
- fázový rozdíl kmitů je roven sudému násobku $\pi$
- kmity jsou ve fázi

Podmínka minima
- oba počáteční vektory musí být nesouhlasně rovnoběžné - $\varphi_{2} - \varphi_{1} = \pm\pi$
- $\varphi_{2} - \varphi_{1} = \pi \pm n\cdot 2\pi, \quad n = 0,1,2,3,\dots$
	- vlny jsou vůči sobě posunuty o $\pi$
	- mohou se opět lišit o celou periodu
- $\varphi_{2} - \varphi_{1} = \pm(2n+1)\pi$
- fázový rozdíl kmitů je roven lichému násobku $\pi$
- kmity jsou v protifázi

#### Aplikace

- mechanické konstrukce (namáhání materiálu)
- elektrické obvody (zesílení/zeslabení výsledného signálu)
- interferenční a difrakční přístroje

### Definujte a vysvětlete fotometrické veličiny
- **světelný tok** (jak se liší od zářivého toku)
- **svítivost a jas** - přesné definice a vysvětlení (také použítých veličin) (obrázky)
- co to je **izotropní bodový zdroj** a **homogenní izotropní plošný zdroj**

#### Světelný tok (jak se liší od zářivého)

- fotometrická veličina, která měří **energii elektromagnetického záření** v oblasti **viditelného světla**
	- **zářivý tok** (radiometrická veličina) měří **veškerou energii** elektromagnetického záření (tedy nejen viditelnou část)
- jde o efektivní část zářivé energie (té, která vyvolává zrakový vjem), prošlá či dopadlá za jednotku času na plochu $S$ ve stanoveném směru
- jednotkou je **1 lumen** (lm)
- $\displaystyle\phi = \frac{dW}{dt}[\text{lm}]$

#### Svítivost a jas - definice a vysvětlení

**Svítivost**
- fotometrická veličina analogická **zářivosti** (radiometrická veličina)
- udává **intenzitu světelného toku** vysílaného **bodovým zdrojem** v určitém směru, tedy do malého prostorového úhlu $d\Omega$
- definována jako podíl **světelného toku** vysílaného bodovým zdrojem a malého prostorového úhlu $d\Omega$
- jednotkou je **1 kandela** (cd)
- $\displaystyle I = \frac{d\phi}{d\Omega} \, [cd]$

![](_assets/svitivost.svg)

**Jas** (měrná svítivost)
- fotometrická veličina analogická **záři**
- definován jako podíl
	- **svítivosti** elementární části povrchu $S$ plošného zdroje ve **zvoleném směru** stanoveným úhlem $\alpha$ od kolmice plochy
	- **její zdánlivé velikosti** v tomto směru (jejího průmětu do roviny kolmé k tomuto směru)
- měří, jak "jasný" se zdroj jeví z určitého úhlu
- jednotkou je **1 nit** (nt)
- $\displaystyle L = \frac{dI}{dS\cdot \cos \alpha} \, [nt]$

![](_assets/jas.svg)

#### Izotropní bodový zdroj a homogenní izotropní plošný zdroj

**Izotropní bodový zdroj**
- zdroj elektromagnetického záření, **jehož rozměny jsou natolik malé**, že je možno **je zanedbat** a považovat tento zdroj za bodový
	- např. oproti vzdálenosti $r$ od místa pozorování, např. od plochy $S$
- **izotropní** - má konstantní zářivost ve všech směrech vyzařování

**Homogenní izotropní plošný zdroj**
- zdroj elektromagnetického záření, který má danou plochu $S$
- **izotropní** - má konstantní zářivost ve všech směrech vyzařování
- **homogenní** - ve všech místech svítí zdroj stejně

### Dodatková otázka: Těžiště
- základní vlastnosti **těžiště** soustavy hmotných bodů (tělesa), odvoďte vztah pro jeho polohu
- proč říkáme, že těžiště je rovnovážný bod tělesa?
- jak je těžiště užitečné pro popis pohybu celého tělesa?

#### Základní vlastnosti těžiště, vztah pro jeho polohu

Máme soustavu hmotných bodů, které chceme **vyjádřit jako jeden**, kterému se přiřadí **celková rychlost** i **působiště výsledné síly**.
- nazveme jej hmotným středem soustavy

**Hmotnost těžiště**
- součet hmotností všech hmotných bodů
- $m_{0} = m = m_{1} + m_{2} + \dots + m_{N} = \sum^N_{k=1} m_{k}$

**Poloha (průvodič) těžiště** $\vec{r}_{0}$

**Rychlost těžiště**
- $\displaystyle\vec{v}_{0} = \frac{d\vec{r}_{0}}{dt}$ (derivace průvodiče)

**Hybnost těžiště**
- $\displaystyle p_{0} = m\cdot \vec{v}_{0} = m\frac{d\vec{r}_{0}}{dt}$
- hybnost těžiště $\vec{p}_{0}$ musí být rovna celkové hybnosti soustavy $\vec{P}$
	- $\vec{p}_{0} = \vec{P}$

**Vzorec pro polohu těžiště**
- dosadíme do vzorce $\vec{p}_{0} = \vec{P}$
- $\displaystyle m\frac{d\vec{r}_{0}}{dt} = \sum^N_{k=1} m_{k} \frac{d\vec{r}_{k}}{dt}$
- $\displaystyle\frac{d}{dt}m\vec{r}_{0} = \frac{d}{dt} \sum^N_{k=1} m_{k}\vec{r}_{k}$
- $\displaystyle m\vec{r}_{0} = \sum^N_{k=1} m_{k}\vec{r}_{k} + \text{konst}$
- z rovnosti derivací plyne rovnost funkcí - až na libovolnou konstantu
	- pro zjištění polohy těžiště se používá **nulová konstanta**
- $\displaystyle\vec{r}_{0} = \frac{1}{m}\sum^N_{k=1}m_{k}\vec{r}_{k}$

#### Proč říkáme, že těžiště je rovnovážný bod tělesa?

Pokud těleso podepřeme (nebo zavěsíme) v těžišti, součet všech vnějších sil bude nulový a těleso bude v klidu - proto se jedná o rovnovážný stav.

- podepřením (nebo zavěšením) tělesa v těžišti zajistíme, že **součet všech vnějších sil je nulový** - pak soustava hmotných bodů musí zůstat v klidu

#### Jak je těžiště užitečné pro popis pohybu celého tělesa?

Za pomoci těžiště jsme schopni nahradit soustavu hmotných bodů za jeden hmotný bod.
