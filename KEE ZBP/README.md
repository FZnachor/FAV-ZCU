# Poznámky k testu

1. **Podle způsobu uzemnění se uvažují různé druhy sítí a jejich označování (IT, TT, TN). Jaký vztah sítě a uzemnění označují písmena na prvním místě kódu a co vyjadřuje druhé písmeno?**
	- **první písmeno** - **vztah sítě** (pracovních vodičů a živých částí) a **uzemnění**
		- **T** - jeden bod sítě (obvykle uzel zdroje) je přímo spojen se zemí
		- **I** - všechny živé části sítě jsou od země buď odděleny nebo je jeden bod sítě spojen se zemí přes velkou impedanci
	- **druhé písmeno** - **vztah neživých částí v rozvodu a uzemnění**
		- **T** - neživé části jsou přímo spojeny se zemí
		- **N** - neživé části jsou přímo spojeny s uzemněným bodem sítě prostřednictvím ochranného vodiče PE

2. **Podle uspořádání nulových a ochranných vodičů se rozlišují tři druhy sítí TN. Jakým způsobem lze charakterizovat síť TN-S a TN-C?**
	- **TN-S**: ochranný a nulový vodič jsou vedeny odděleně
		- v celé síti jsou vedeny ochranný a nulový vodič jako dva samostatné vodiče
		- pro funkci ochranného vodiče PE se využívá nulový vodič sítě N
	- **TN-C**: funkce ochranného a nulového vodiče je sloučena do jednoho vodiče PEN
		- jeden vodič s kombinovanou funkcí, proto se označují TN-C

3. **Jaké jsou přednostní barvy pro izolované vodiče střídavých a stejnosměrných systémů?**
	- **stejnosměrná** soustava (**DC**)
		- kladný vodič - **červená**
		- záporný vodič - **bílá**
		- vodič středního bodu - **světlemodrá**
	- **střídavá** soustava (**AC**)
		- vodič vedení (fáze) 1 - **černá**
		- vodič vedení (fáze) 2 - **hnědá**
		- vodič vedení (fáze) 3 - **šedá**
		- nulový vodič - **světlemodrá**

4. **Jaké jsou tři hlavní kategorie vnějších vlivů a jakým kódem se stupně vnějších vlivů označují?**
	- vnější činitel prostředí - **A**
	- využití - **B**
	- konstrukce budovy - **C**

5. **Jaké jsou meze bezpečných malých napětí s ohledem na členění prostorů a na způsob dotyku částí zařízení (živých částí, krytů)?**

	| prostředí         | při dotyku částí | bezpečné střídavé V (AC) | bezpečné stejnosměrné V (DC) |
	|-----------------------|----------------------|----------------------------|--------------------------------|
	| normální i nebezpečné | živých               | 25                         | 60                             |
	| normální i nebezpečné | neživých             | 50                         | 120                            |
	| zvlášť nebezpečné     | živých               | --                         | --                             |
	| zvlášť nebezpečné     | neživých             | 2                          | 25                             |

6. **Jaké jsou mezní hodnoty proudů z hlediska jejich účinků na lidský organizmus?**
	- **stejnosměrná** soustava (**DC**)
		- mez vnímání od: **2 mA**
		- mez uvolnění od: **25 mA**
		- závažnější negativní účinky od: **120 mA**
	- **střídavá** soustava (**AC**)
		- mez vnímání od: **0.5 mA**
		- mez uvolnění od: **5 mA**
		- závažnější negativní účinky od: **30 mA**

7. **Jak se dá definovat základní pravidlo ochrany před úrazem elektrickým proudem?**
	- nebezpečné **živé části nesmějí být** za normálních podmínek **přístupné** (základní ochrana) a **přístupné vodivé části** (neživé, cizí) **nesmějí být nebezpečné ani za normálních podmínek ani při poruše**

8. **Základní ochrana musí být tvořena pomocí jednoho nebo více prostředků, které za normálních podmínek brání dotyku nebezpečných živých částí. Co lze zařadit mezi prostředky základní ochrany?**
	- **automatické odpojení od zdroje** (zařízení třídy ochrany I)
	- **dvojitá nebo zesílená izolace** (zařízení třídy ochrany II)
	- **malé napětí** (SELV, PELV) (zařízení třídy ochrany III)

9. **Jaké jsou požadavky na základní izolaci živých částí?**
	- **pevný materiál, kapalný materiál nebo plyn** (nejčastěji vzduch + kryt)
	- **koordinace izolace** (odolnost proti vlivům prostředí, jmenovitá napětí, přepětí, povrchové cesty, vzdušné vzdálenosti)
	- **živé části musí být zcela pokryty izolací**, kterou je možno odstranit pouze jejím zničením (barvy, nátěry a emaily se za základní ochranu nepovažují))
	- předepsaný izolační odpor základní izolace je pro el. instalace nn 1 MΩ a pro spotřebiče nn 2 MΩ (odvozeno z podílu nízkého napětí do 1000 V a maximálního unikajícího proudu 0,5 mA)

10. **Jaký stupeň krytí musí splňovat zařízení s živými částmi uvnitř krytů nebo za přepážkami při ochraně kryty nebo přepážkami, vysvětlete stručně význam kódování krytí IP XX (význam a typ používaných číslic a písmen)?**
	- IP (International Protocol)
	- **první číslice**: 0 až 6 – označuje stupeň ochrany před vniknutím cizích těles a před dotykem nebezpečných živých částí
	- **druhá číslice**: 0 až 9 – označuje stupeň ochrany před vniknutím vody
	- **Přídavné písmeno**: A, B, C, D, nepovinné, označuje stupeň ochrany před dotykem nebezpečných živých částí
	- **Doplňkové písmeno**: H, M, S, W, nepovinné, označuje doplňkové vlastnosti krytí

11. **Ochrana při poruše musí být tvořena jedním nebo více prostředky, které na základní ochraně nezávisí ani ji nedoplňují. Jakými prostředky může být tvořena tato ochrana?**
	- **přídavná izolace**
	- **ochranné pospojování**
	- **ochranné stínění**
	- **Automatické odpojení od zdroje**
	- **Jednoduché oddělení (obvodů)**
	- **Nevodivé okolí**
	- Indikace a odpojení ve vysokonapěťových instalacích a sítích

12. **Co musí zajišťovat ochranné opatření, spočívající ve zvýšené ochraně? Uveďte příklad prostředku zvýšené ochrany**
	- Ochranné opatření musí zajišťovat jak ochranu základní, tak ochranu při poruše.
	- **dvojitá nebo zesílená izolace**, ochranné oddělení obvodů, zdroj omezeného proudu, ochranná impedance

13. **Jak je specifikována doplňková ochrana? Je doplňková ochrana proudovým chráničem 30 mA považována za výhradní ochranné opatření?**
	- v určitých prostorách a při působení určitých vnějších vlivů může být určena jako běžná součást použitých ochranných opatření
	- **doplňková ochrana** proudovým chráničem 30mA **není považována** za **výhradní ochranné opatření pouze ji** ve smyslu vyššího zabezpečení **doplňuje**

14. **Z čeho musí sestávat kompletní ochranné opatření, která ochranná opatření jsou všeobecně povolená?**
	- kompletní ochranná opatření musí sestávat **z vhodné kombinace dvou nezávislých ochranných opatření** (základní ochrana a ochrana při poruše)
	- všeobecně povolená:
		- automatické odpojení od zdroje
		- dvojitá nebo zesílená izolace
		- malé napětí (SELV, PELV)

15. **Jaké ochranné opatření je nejčastěji uplatňováno v elektrických instalacích?**
	- **automatické odpojení od zdroje**

16. **Jakým způsobem je zajištěno ochranné opatření automatickým odpojením od zdroje?**
	- **základní ochrana** je zajištěna základní izolací živých částí nebo přepážkami nebo kryty
	- **ochrana při poruše** je zajištěna ochranným pospojováním, ochranným uzemněním a odpojením od zdroje

17. **Co musí být vzájemně spojeno do takzvaného ochranného pospojování při automatickém odpojení od zdroje a k čemu ochranné pospojování slouží?**
	- **spojené musí být**:
		- vstupující **kovové části**, které jsou náchylné přivést nebezpečný rozdíl potenciálů a **které nejsou součástí elektrické instalace** (kovová potrubí zajišťující napájení budovy, např. plynem, vodou, dálkové vytápění, konstrukční cizí vodivé části, přístupná konstrukční výztuž betonu)
	- **ochranné pospojování zajišťuje**:
		- uvedení neživých částí elektrických předmětů a zařízení i cizích vodivých částí na společný potenciál.
		- **odvádění poruchového proudu z místa poruchy ke zdroji** a tím **uzavření smyčky poruchového proudu**, který **způsobí odpojení obvodu nebo jeho části, kde došlo k poruše**

18. **Jaká je maximální doba odpojení pro koncové obvody nepřekračující 32 A v síti TN 3x230/400 V AC?**
	- **0,2 s**

19. **Kdy musí být provedena doplňková ochrana proudovými chrániči 30 mA ve střídavé síti s ochranným opatřením automatickým odpojením od zdroje?**
	- **u zásuvek**, jejichž jmenovitý **proud nepřekračuje 32A**, které jsou **užívány laiky** a jsou určeny pro všeobecné použití.
	- **u mobilních zařízení** určených pro venkovní použití, jejichž **jmenovitý proud nepřesahuje 32 A**
	- **v samostatné domácnosti** u koncových obvodů **napájejících svítidla**

20. **Jakou základní podmínku musí u sítí TN splňovat impedance smyčky poruchového proudu a proč je tato podmínka stanovena?**
	- $Z_{s} * I_{a} \leq U_{0}$
	- $Z_{s}$ - impedance poruchové smyčky (zdroj, vodič vedení až k místu poruchy a ochranný vodič mezi místem poruchy a zdrojem) v ohmech
	- $I_{a}$ - poruchový proud v ampérech vyvolávající automatickou funkci ochranného přístroje (odpojení v požadované době)
	- $U_{0}$ - jmenovité střídavé nebo stejnosměrné napětí vodiče vedení vůči zemi ve voltech
	- je stanovena, aby v případě vzniku poruchy došlo k automatickému odpojení napájení ve stanovené době

21. **Jaké ochranné zařízení nesmí být použito v sítích TN-C při ochranném opatření automatickým odpojením od zdroje?**
	- **proudový chránič**

22. **Co je účelem použití ochrany elektrického zařízení třídy II, nebo s rovnocennou izolací?**
	- v případě porušení základní izolace **zabránit výskytu napětí na přístupných částech elektrického zařízení**

23. **Musí mít obvod napájející jednotlivá zařízení třídy ochrany II ochranný vodič vedený ke každému bodu instalace a každému bodu připojení?**
	- **ano**

24. **Pro jaký účel se užívá označení SELV a PELV, charakterizujte stručně použité prostředky základní ochrany a ochrany při poruše u těchto obvodů?**
	- používá se pro **malá bezpečná napětí**
	- **základní ochrana** je zajištěna **omezením napětí v síti SELV horní mezí** napěťového pásma I, to je 50 V pro střídavé a 120 V pro stejnosměrné napětí
	- **ochrana při poruše** je zajištěna **ochranným oddělením sítě SELV od všech ostatních sítí jiných než SELV a PELV**, **základní izolací mezi sítí SELV a ostatními sítěmi SELV nebo PELV** a **základní izolací mezi sítí SELV a zemí**

25. **Jaká jsou pravidla první pomoci při úrazu elektrickým proudem?**
	- **dbát na svoje vlastní bezpečí**
	- **přeřušit kontakt zraněného s elektrickým vodičem**
	- **pokud zasažený už není pod elektrickým proudem** => **volat záchranku**, ideálně přes aplikaci **Záchranka**
	- **zajistit základní životní funkce**
		- **při selhání** základních životních funkcí => **okamžitě zahájit resuscitaci**
	- **řídit se pokyny od operátorky záchranné služby** do příjezdu záchranné služby