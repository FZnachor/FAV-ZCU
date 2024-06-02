### Popište a vysvětlete **inerciální a neinerciální** souřadné soustavy
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
	- **setrvačná síla, Coriolisova síla, centrifugální (odstředivá) síla**
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
- $\displaystyle\frac{d\vec{r}}{dt} = \frac{d\vec{r}'}{dt} + \frac{d\vec{R}}{t}$
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
- unášivá rychlost mezi soustavami je konstantní
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
		- pohybové rovnice jsou invariantní vůči Galileově transformaci

**Nerovnoměrný křivočarý (posuvný) pohyb** soustavy $S'$ vůči soustavě $S$
- pohyb musí být stále translací (osy se tedy neotáčí)
- **unášivá rychlost** je nyní obecně proměnnou veličinou
	- může měnit velikost, směr i orientaci
	- $\vec{u} \neq \text{konst.}$
- při křivočarém pohybu soustavy $S'$ je její **unášivé zrychlení nenulové**
	- rychlost se tedy v průběhu mění
	- $\vec{a}_{u} = \frac{d\vec{u}}{dt} \neq 0$
- v případě konstantní rychlosti tělesa v soustavě $S$ nebude v $S'$ rychlost konstantní
	- $\vec{v}' = \vec{v} - \vec{u} \neq \text{konst.}$
	- kvůli tomu v soustavě $S'$ **neplatí zákon setrvačnosti** a jedná se tak o **neinerciální soustavu**
- jelikož je unášivé zrychlení nenulové, tak je zrychlení bodu v soustavě $S'$ odlišné od zrychlení stejného bodu v soustavě $S$
	- $\vec{a}' = \vec{a} - \vec{a}_{u}$
- pohybová rovnice v $S'$ má poté tvar
	- $m\cdot \vec{a}' = m\cdot(\vec{a} - \vec{a}_{u}) = m\cdot \vec{a}-m\cdot \vec{a}_{u} = \vec{F} + \vec{F}^* = \vec{F}'$
	- v obou soustavách jsou nyní **jiná zrychlení** i **jiné síly**
	- pohybová rovnice **není invariantní**
		- změnila svůj tvar a kromě původní působící síly se zde objevuje **nová setrvačná síla** závisející na unášivém zrychlení soustavy

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
- **v nulovém čase** ($t = 0$) **obě soustavy splývají** (jejich počátky jsou na stejném místě, tedy $O' = O$)

#### Kdy působí setrvačné síly a kam směřují (obrázek)

**Nerovnoměrný křivočarý (posuvný) pohyb** soustavy $S'$ vůči soustavě $S$
- **setrvačná síla** (v neinerciální soustavě)
	- $\vec{F}^* = -m\cdot \vec{a}_{u}$
- rozložení setrvačné síly na složky
	- $\vec{a}_{u} = \vec{a}_{n} + \vec{a}_{t}$
	- $\vec{F}_{n}^* = -m(\vec{a}_{n} + \vec{a}_{t}) = -m\vec{a}_{n} -m\vec{a}_{t} = \vec{F}^*_{n} + \vec{F}^*_{t}$
	- **odstředivá síla**
		- $\displaystyle\vec{F}^*_{n} = -m\vec{a}_{n} = -m\cdot \frac{u^2}{R}\cdot \vec{n} = -m\cdot \vec{\omega}\times \vec{\omega}\times \vec{r}$
		- má opačný směr oproti dostředivé síle
	- **Eulerova (setrvačná) síla**
		- $\displaystyle\vec{F}^*_{t} = -m\vec{a}_{t} = -m\cdot \frac{du}{dt}\cdot \vec{t} = -m\cdot \vec{\epsilon} \times \vec{r}$
		- má opačný směr oproti tečné síle

**Rotační pohyb** soustavy $S'$ vůči soustavě $S$
- předpoklady
	- inerciální soustava $S$ je v klidu
	- neinerciální soustava $S'$ se otáčí úhlovou rychlostí $\omega$ kolem **společných os** $z = z'$
	- počátky obou soustav splývají ($O = O'$)
- sledujeme jediný hmotný bod $m$ v soustavách $S$ i $S'$
	- počátky obou soustav splývají, vektory jsou tedy totožné ($\vec{r} = \vec{r}'$)
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
		- objevuje se pouze, pokud se hmotný bod pohybuje rychlostí, která není rovnoběžná s osou rotace (tedy $z = z'$)

### Popište a vysvětlete **tlumený** harmonický oscilátor
- výchozí podmínky - všechny působící síly
- sestavení pohybové rovnice - její řešení pro různé velikosti tlumení (včetně grafů)
- jaká je perioda, amplituda a energie oscilátoru u kmitavého řešení
- co je to útlum a kvalita oscilátoru
- stav velmi malého tlumení

### Popište skládání dvou **rovinných vln stejné** frekvence postupujících **stejným** směrem
- sestavte výchozí rovnice pro obě vlny (od dvou koherentních zdrojů na ose x) (obrázek)
- převeďte na komplexní tvary - a sečtěte na výslednou vlnu
- podmínky extrémních stavů
- aplikace

### Definujte a vysvětlete **fotometrické veličiny**
- **světelný tok** (jak se liší od zářivého toku)
- **svítivost a jas** - přesné definice a vysvětlení (také použítých veličin) (obrázky)
- co to je **izotropní bodový zdroj** a **homogenní izotropní plošný zdroj**

#### Světelný tok (jak se liší od zářivého)

- fotometrická veličina, která měří **energii elektromagnetického záření** v oblasti **viditelného světla**
	- **zářivý tok** (radiometrická veličina) měří **veškerou energii** elektromagnetického záření (tedy nejen viditelnou část)
- jde o efektivní část zářivé energie (té, která vyvolává zrakový vjem), prošlá za jednotku času plochou $S$ ve stanoveném směru (nebo dopadlá na plochu $S$)
- jednotkou je **1 lumen** (lm)
- $\phi = \frac{dW}{dt}[\text{lm}]$

#### Svítivost a jas - definice a vysvětlení

**Svítivost**
- fotometrická veličina analogická **zářivosti** (radiometrická veličina)
- udává **intenzitu světelného toku** vysílaného **bodovým zdrojem** v určitém směru (do malého prostorového úhlu $d\Omega$)
- definována jako podíl **světelného toku** vysílaného bodovým zdrojem a malého prostorového úhlu $d\Omega$
- jednotkou je **1 kandela** (cd)
- $\displaystyle I = \frac{d\phi}{d\Omega} \, [cd]$

![](_assets/svitivost.svg)

**Jas** (měrná svítivost)
- fotometrická veličina analogická **záři**
- definován jako podíl
	- **svítivosti** elementární části povrchu $S$ plošného zdroje ve **zvoleném směru** (stanoveném úhlem $\alpha$ od kolmice plochy)
	- **její zdánlivé velikosti** v tomto směru (jejího průmětu do roviny kolmé k tomuto směru)
- měří, jak "jasný" se zdroj jeví z určitého úhlu
- jednotkou je **1 nit** (nt)
- $\displaystyle L = \frac{dI}{dS\cdot \cos \alpha} \, [nt]$

![](_assets/jas.svg)

#### Izotropní bodový zdroj a homogenní izotropní plošný zdroj

**Izotropní bodový zdroj**
- zdroj elektromagnetického záření, **jehož rozměny jsou natolik malé**, že je možno **je zanedbat** a považovat tento zdroj za bodový
	- např. oproti vzdálenosti $r$ od místa pozorování (od plochy $S$)
- **izotropní** - má konstantní zářivost ve všech směrech vyzařování

**Homogenní izotropní plošný zdroj**
- zdroj elektromagnetického záření, který má danou plochu $S$
- **izotropní** - má konstantní zářivost ve všech směrech vyzařování
- **homogenní** - ve všech místech svítí zdroj stejně

### Dodatková otázka:
- Uveďte základní vlastnosti **těžiště** soustavy hmotných bodů (tělesa) a odvoďte vztah pro jeho polohu.
- Proč říkáme, že těžiště je rovnovážný bod tělesa?
- Jak je těžiště užitečné pro popis pohybu celého tělesa?
