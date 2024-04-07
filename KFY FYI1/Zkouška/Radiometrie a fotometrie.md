# Radiometrie a fotometrie

Vyzařování, přenos a účinky energie elektromagnetické záření všech vlnových délek zkoumá **radiometrie** a elektromagnetické záření v optické oblasti studuje **fotometrie**.

### Radiometrické veličiny

**Zářivý tok**
- celková energie záření, která prošla za čas $t$ plochou $S$
- vhodný ke studiu vyzařování energie ze zdroje i k popisu dopadu energie na hmotné objekty
- $\phi_{e} = \frac{dW_{e}}{dt}$

### Fotometrické veličiny

Hodnotí pouze část energie elektromagnetického záření, kterou vidíme.

**Citlivost oka**
- poměr světelného a zářivého toku
- $K = \frac{\phi}{\phi_{e}}$

**Světelný tok**
- fotometrická veličina, která zhodnotí **energii** elektromagnetického **záření v oblasti viditelného světla**
- jde o efektivní část zářivé energie, která **vyvolává zrakový vjem**, prošlá za jednotku času plochou $S$ ve stanoveném směru
- $\phi = \frac{dW}{dt}[\text{lm}]$ (lumen)

**Svítivost**
- fotometrická veličina analogická **zářivosti**, která udává **intenzitu světelného toku** vysílaného **bodovým zdrojem** v daném směru (prostorovém úhlu)
- $I = \frac{d\phi}{d\Omega} [\text{cd}]$ (kandela)
	- $d\Omega$ ... **prostorový úhel** v daném směru
	- $d\phi$ ... vyzařující **světelný tok**

![svítivost](_assets/svitivost.svg)

**Jas**
- fotometrická veličina analogická **záři**
- je definována jako podíl **svítivosti elementární části povrchu plošného zdroje** ve **zvoleném směru** a **její zdánlivé velikosti** v tomto směru
- jas je svítivost daného místa povrchu plošného zdroje o jednotkové zdánlivé ploše v tomto směru
- $L = \frac{dI}{dS \cdot \cos \alpha} [nt]$ (nit)

**Intenzita osvětlení**
- fotometrická veličina analogická intenzitě ozáření
- definována jako **světelný tok** dopadající na jednotku plochy
- $E = \frac{d\phi}{dS}$

### Zdroje

**Homogenní zdroj**
- povrch plošného zdroje **svítí ve všech místech stejně** a tak můžeme ve vztahu pro jas vypustit diferenciály
- $L = \frac{I}{S \cdot \cos \alpha}$

**Izotropní zdroj**
- jas plošného zdroje je **ve všech směrech konstantní** (stejný jako v kolmém) a **ve všech místech svítí stejně** (homogenní zdroj)
- **Lambertův zákon**
	- říká, že svítivost **izotropního rovinného plošného zdroje** v každém místě klesá s kosinem úhlu odklonu od kolmice k ploše - **kosinový zářič**
