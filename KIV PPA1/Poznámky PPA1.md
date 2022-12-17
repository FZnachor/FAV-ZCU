# Poznámky PPA1
## Základní matematické funkce a operace s nimi
- Základní matematické funkce
	- Funkce velmi často potřebné při běžných výpočtech
	- Poskytovány třídou ```java.lang.Math``` (tj. třída Math je umístěna v balíku java.lang a není ji tedy třeba importovat)
	- statické metody, musí se tedy **volat s názvem třídy**
		- např. ```Math.jménoMetody();```
	- Většina metod má parametry typu ```double``` a vrací typ ```double```
		- Pro většinu běžných matematických výpočtů se normálně používají reálná čísla
		- Někdy mají i celočíselnou variantu, takže podle toho, zda jsou parametry ```int``` nebo ```double```, vrátí ```int``` nebo ```double```
	- Kromě metod obsahuje konstanty
		- ```Math.PI``` – hodnota π
		- ```Math.E``` – hodnota e
	- příklad metod
		- Absolutní hodnota 
			- ```Math.abs(i);```
		- Větší a menší číslo
			- ```Math.max(i, j);```
			- ```Math.min(d, e);```
		- Zaokrouhlování
			- ```Math.round(e);```

### Generování (pseudo)náhodných čísel v Javě
- Třída ```Math```
	- Obsahuje metodu ```random()```, která vrací reálné náhodné číslo (typu ```double```) z intervalu <0.0; 1.0)
	- Např. ```double nahodne = Math.random();```
- - Třída ```Random```
	- Třída věnovaná náhodným číslům
		- Je umístěná v balíku ```java.util```, před jejím použitím je tedy nutno použít import ```import java.util.Random;```
	- Obsahuje různé metody pro generování náhodných čísel s různými pravděpodobnostními rozděleními
	- Metody třídy ```Random``` nejsou statické, proto se nevolají nad názvem třídy (jako metody třídy ```Math```)
		- Je nutná inicializace podobně jako u třídy ```Scanne```
		- ```Random r = new Random();```
			- Inicializuje třídu ```Random``` pro generování náhodných čísel s výchozí hodnotou získanou ze systémového času
			- Při každém spuštění programu se vygeneruje jiná posloupnost náhodných čísel
		- ```Random r = new Random(výchozíHodnota)```
			- Inicializuje třídu ```Random``` pro generování náhodných čísel se zadanou výchozí hodnotou (celé číslo typu ```long```)
			- Při každém spuštění programu se vygeneruje stejná posloupnost náhodných čísel
			- Je jedno, jakou výchozí hodnotu zadáme (vhodné může být např. ```1```), podstatné je, že je konstantní (při každém spuštění stejná)
		- Metody se potom volají nad proměnnou ```r```
	- Dvě velmi často používané metody
		- ```int nextInt(int max)```
			- Vrací celé číslo z intervalu <0; max – 1>
		- ```double nextDouble()```
			- Vrací reálné číslo z intervalu <0; 1)
			- Funguje stejně jako metoda ```Math.random();```

## Problémy při provádění aritmetických operací
- Při provádění aritmetických operací může nastat několik problémů, se kterými je potřeba počítat

### Výsledky celočíselných aritmetických operací implicitně typu int
- Výsledky celočíselných aritmetických operací (tj. hodnota výrazu) jsou v jazyce Java implicitně typu ```int```
	- Výjimkou je datový typ ```long``` – pokud je alespoň jeden operand typu ```long```, výsledek aritmetické operace je typu ```long```
- Pokud používáme pouze typ ```int```, s problémem se nesetkáme
- Pokud používáme datové typy s menším rozsahem (```byte, short```), je potřeba výslednou hodnotu výrazu před přiřazením přetypovat

### Celočíselné vs. reálné dělení
- V jazyce Java existuje pouze jeden operátor pro dělení – lomítko „/“, který se používá pro celočíselné dělení (tj. dělení se zbytkem) i reálné dělení
	- Typ provedeného dělení záleží na obou operandech
	- Pokud jsou oba operandy celá čísla (např. typu ```int```), výsledek je celé číslo – podíl získaný celočíselným dělením
	- Pokud je alespoň jeden operand nebo oba operandy reálná čísla (např. typu double), výsledek je reálné číslo – podíl získaný reálným dělením (obecně desetinné číslo)

### Přetečení a podtečení
- Přetečení
	- Nastane, pokud do proměnné daného typu uložíme větší hodnotu, než je kapacita daného datového typu
	- Např. do proměnné typu ```byte``` uložíme hodnotu 130 (maximální kladná hodnota uložitelná do ```byte``` je 127
	- To nelze udělat přímo – dojde k chybě při překladu, ale snadno se to stane při ukládání výsledku aritmetické operace nebo při nevhodném přetypování
	- Výsledek přetečení je uložení jiné hodnoty (často s opačným znaménkem, ale není to pravidlo)
	- POZOR! – Přetečení není detekováno jako chyba, program se normálně přeloží a spustí => Zda k přetečení dojde, závisí na hodnotách operandů
- Podtečení
	- Může nastat pouze u reálných čísel (u čísla nebo jeho exponentu)
	- Hodnota, kterou se pokoušíme uložit, je menší než nejmenší zobrazitelná hodnota daným datovým typem (```float``` nebo ```double```)
	- Reálná čísla nemají nekonečnou přesnost, mají omezený počet desetinných míst, pokud uložíme velmi malé nenulové číslo (např. 1E-300), může se stát, že bude uloženo jako 0.0

### Porovnávání reálných čísel
- Reálná čísla nemají nekonečnou přesnost, mají omezený počet desetinných míst – dochází k zaokrouhlování
- Proto není vhodné zjišťování, zda jsou dvě reálná čísla shodná, provádět pomocí relačního operátoru ```„==“```
	- Např. ```d1 == d2```
- Převést na porovnání, zda je absolutní hodnota rozdílu dvou reálných čísel menší než absolutní chyba porovnání (ε – vhodně zvolená malá reálná konstanta)
	- ```Např. Math.abs(d1 - d2) < EPSILON```

## Řídicí struktury
- Řídicí struktury
	- Programové konstrukce, které se skládají z dílčích příkazů
	- Určují způsob provedení těchto příkazů
	- ovlivňují směr provádění programu => bez nich by program běžel postupně od prvního do posledního příkazu
- Tři základní řídící struktury
	- Posloupnost
		- Příkazy jsou v posloupnosti a vždy se provedou v pořadí, v jakém jsou zapsány („řádku po řádce“)
		- Složený příkaz (blok)
			- Několik příkazů uzavřených do složených závorek „{“ a „}“
			- Např. tělo metody ```main()``` (a jakékoliv jiné metody) je blok
			- Často se využívá s větvením a cykly
			- Příkazy v bloku důsledně odsazujeme alespoň dvěma mezerami nebo tabulátorem
			- V Javě téměř ve všech případech využití bloku otevírací závorce „{“předchází předchozí konstrukce (např. hlavička metody, větvení, cyklus) napsaná na STEJNÉ řádce jako tato závorka
		- Větvení
			- V závislosti na splnění podmínky se provede jen určitá část programu
			- Příkaz ```if``` pro jednoduché větvení (neúplný podmíněný příkaz) a příkaz ```if - else``` pro dvojité větvení (úplný podmíněný příkaz)
		- Cyklus
			- V závislosti na splnění podmínky se část programu opakuje
				- Příkaz ```for``` 
					- pro cyklus s předem známými mezemi (s předem známým počtem opakování)
				- Příkaz ```while``` 
					- pro cyklus a předem neznámými mezemi
				- Příkaz ```do - while``` pro cyklus s předem neznámými mezemi

### Větvení
- Základem je příkaz ```if - else```, ostatní příkazy pro větvení urychlují nebo zpřehledňují zápis
	- Bez větvení nelze vytvářet ani jednoduché užitečné programy s výjimkou jednorázových výpočtů

#### Podmíněný příkaz (příkaz if – else)
- V závislosti na splnění podmínky se provede buď jedna, nebo druhá část programu
	- Tyto části se často nazývají „větve“
- Podmínka
	- Logický výraz, jehož výsledkem je (booleovská hodnota) buď ```true``` (podmínka je pravdivá, je splněná) nebo ```false``` (podmínka není pravdivá, není splněná)
	- Uvádí se bezprostředně za klíčové slovo ```if```
	- Je vždy uzavřena do kulatých závorek „(“ a „)“
	- Může obsahovat relační operátory (operátory pro porovnání)
		- ```„<“, „>“, „<=“, „>=“, „!=“, „==“```
	- Může se skládat z více logických výrazů, které jsou spojeny logickými operátory ```„&&“``` („a zároveň“, konjunkce) nebo ```„||“``` („nebo“, disjunkce)
		- Bez ohledu na komplikovanost a délku podmínky, jejím výsledkem je VŽDY hodnota ```true``` nebo ```false```
	- Úplný podmíněný příkaz (```if - else```)
		- Pokud je podmínka splněna (její hodnota je ```true```), provede se první část kódu (uvedená bezprostředně za podmínkou) – „větev ```if```“
		- Pokud podmínka není splněna (její hodnota je false), provede se druhá část kódu – „větev ```else```“
	- Neúplný podmíněný příkaz (```if```)
		- Pokud je podmínka splněna (její hodnota je ```true```), provede se část kódu uvedená bezprostředně za podmínkou
		- Pokud podmínka není splněna (její hodnota je ```false```), neprovede se nic
	- Vnořený příkaz ```if```
		- Příkaz ```if``` může v sobě obsahovat další příkaz ```if```, ten zase další atd.
		- Úroveň zanoření není omezena
	- Příkaz ```else if```
		- Kromě vnořování je možné využít příkaz ```else if```, kdy po klíčovém slově else bezprostředně následuje další příkaz ```if```
		- Běžně se využívá
		- Možnost reagovat na více podmínek
		- Možnost závěrečné ```else``` větve, která se provede, pokud žádná podmínka nebyla splněna
		- Vždy se provede maximálně jedna větev (nebo žádná, pokud chybí závěrečné ```else``` a žádná podmínka není splněná)

#### Přepínač (příkaz switch)
- Umožňuje několikanásobné větvení programu na základě hodnoty jedné proměnné
	- Proměnná může být typ celočíselný datový typ (```int, byte, short, long```) nebo ```char, String``` a výčtový datový typ
- Lze plně nahradit příkazy ```if – else```
	- Není nutné ho používat příliš často, je možné nepoužívat ho vůbec
	- Je ale minimálně dobré vědět, jak funguje, když ho použije někdo jiný
	- Každá větev (začínající klíčovým slovem ```case```) může být ukončena příkazem ```break;```

```java
switch (proměnná) {
case konstanta1:
	příkaz11;
	příkaz12;
	…
	break; 
case konstanta2: 
	příkaz21;
	příkaz22;
	…
	break;
default:
	příkazN1;
	příkazN2;
	… 
	break;
}
```

- Sémantika příkazu ```switch```
	- Nalezne se konstanta odpovídající hodnotě proměnné (nebo vypočtené hodnotě výrazu, pokud je místo proměnné výraz)
	- Provedou se všechny příkazy v této větvi
	- Pokud je větev ukončena příkazem ```break;```, skočí se na konec přepínače, pokračuje se dalším příkazem za přepínačem
		- Pokud větev příkazem ```break;``` ukončena není, pokračuje se s příkazy další větve
		- Zdroj častých chyb vedoucí k neočekávanému chování programu
		- Umožňuje provést stejnou akci pro více hodnot
	- Pokud není nalezena konstanta odpovídající hodnotě proměnné, provedou se příkazy větve ```default```
		- Příkaz ```break;``` za větví ```default``` je zbytečný, protože po dokončení posledního příkazu této větve příkaz ```switch``` končí v každém případě, ale většinou se uvádí
	- POZOR! – Nikdy nekombinujte použití příkazu ```if - else``` a příkazu ```switch```, značně to znepřehledňuje kód

#### Ternární operátor
- Umožňuje přiřazení v závislosti na podmínce
- Syntaxe ```(podmínka) ? výrazTrue : výrazFalse;```
	- Podmínka je libovolný logický výraz s výsledkem ```true``` nebo ```false``` (stejně jako v příkazu if)
	- Výrazy jsou libovolné výrazy, jejichž výsledek je stejného datového typu
	- Pro přehlednost dávat mezery okolo „?“ a „:“
- Sémantika
	- Pokud je podmínka splněná (```true```), vrátí ```výrazTrue```
	- Pokud podmínka není splněná (```false```), vrátí ```výrazFalse```
	- Ternární operátor vždy vrací hodnotu a nelze použít jako příkaz
		- Hodnota musí být přiřazena do proměnné nebo jinak použita, např. může být součástí složitějšího výrazu

## Cykly

- opakování části kódu
- základní pojmy:
	- **řídící proměnná cyklu**
		- Proměnná, na které závisí ukončení cyklu
		- Nejčastěji bývá pouze jedna
	- **podmínka ukončující cyklus**
		- Logický výraz – cyklus končí, pokud je jeho výsledek false
	- **hlavička cyklu**
		- Klíčové slovo určující typ cyklu (for, while nebo do) a výrazy v následujících kulatých závorkách
	- **tělo cyklu**
		- příkazy ve složených závorkách (tj. tvořící blok), které se mají opakovaně provést
		- Přestavuje výkonný kód

### Cyklus s podmínkou na začátku (cyklus while)
- Vhodný v případě, že ukončovací podmínka závisí na nějakém výrazu uvnitř cyklu
	- Není dopředu jasné, kolikrát cyklus proběhne
	- Např. načtení nějakých hodnot až do jejich vyčerpání (např. ze souboru)
- Podmínka, zda má být cyklus proveden se testuje PŘED vykonáním těla cyklu
- syntaxe:
 ```java
 while (výraz) { 
	příkaz1; 
	příkaz2; 
	… 
}
```

### Cyklus s podmínkou na konci (cyklus do – while)
- Velmi podobný cyklu while
	- Používá se ale mnohem méně (v Javě)
- Podmínka, zda má být cyklus ukončen, se testuje **PO** vykonání těla cyklu
	- Tělo cyklu se provede, pak se otestuje podmínka, a pokud je splněna, tělo cyklu se provede znovu
	- Cyklus tedy proběhne minimálně jednou
- syntaxe:
```java
do {
	příkaz1;
	příkaz2;
	… 
} while (výraz);
```

### Cyklus se známým počtem opakování (cyklus for)
- Vhodný v případě, že jsou předem známá omezující kritéria
	- Počáteční a koncová hodnota řídící proměnné a její způsob ovlivnění v každé obrátce cyklu
	- V mnoha případech to znamená, že je známý počet opakování
- Podmínka, zda má být cyklus proveden, se testuje PŘED vykonáním těla cyklu
	- Cyklus tedy nemusí proběhnout ani jednou
- Inicializace je nastavení počáteční hodnoty řídící proměnné cyklu a často i její deklarace, typicky ``` int i = 0 ```
- Ukončovací podmínka je logický výraz, který by měl obsahovat řídící proměnnou, 
   typicky ``` i < hodnota ```
- Změna řídící proměnné je příkaz, který mění hodnotu řídící proměnné, typicky se jedná o inkrementaci ``` (i++) ```, ale může to být i jiný výraz (např. ``` i += 2 ```)
- syntaxe:
```java
for (inicializace; ukončovací podmínka; změna řídící proměnné) { 
	příkaz1; 
	příkaz2; 
	… 
}
```
- Zkrácený zápis pro procházení polí a kolekcí
```java
int[] pole = {6, 7, 8, 9}; //Deklarace pole s inicializaci, bude vysvetleno 
for (int prvek: pole) { 
	System.out.println("Prvek pole: " + prvek); 
}
```
### Příkazy break; a continue;
- Příkazy, které ovlivňují chování cyklu nezávisle na řídící proměnné 
- Mohou být použity u všech tří cyklů 
- Pokud jsou cykly vnořeny do sebe, ovlivňují tyto příkazy cyklus, ve kterém jsou bezprostředně uvedeny
- ``` break ```;
	- Okamžitě ukončí cyklus
	- Používá se pro předčasné ukončení cyklu (např. při výskytu chyby) či pro řádné ukončení nekonečného cyklu
- ``` continue ```; 
	- Skočí na konec těla cyklu, čímž si vynutí další obrátku (iteraci) cyklu 
	- Cyklus neskončí
	- Používá se méně než break;

## Metody
- Naprostá většina programů je netriviální a rozsáhlá 
- Často potřebujeme jeden výpočet provést vícekrát
	- Pokud všechen výkonný kód napíšeme jen do metody ```main```(), budou se části kódu opakovat
- Potřeba dekompozice
	- Rozdělení problému na menší podproblémy
	- Tyto podproblémy lze rozdělit ještě na menší podproblémy
	- Tak postupujeme dále, až dostaneme elementární podproblémy, které jsou snadno řešitelné => postupujeme hierarchicky odshora dolů
	- Snadno řešitelné elementární podproblémy mohou být reprezentovány metodami
- Použití metod
	- Program se snáze navrhuje
		- Je rozdělen na elementární části reprezentované metodami
		- Je možné vytvářet program po krocích
	- Zdrojový kód je přehlednější
		- V daném místě se lze soustředit jen na jednu konkrétní část algoritmu

### Popis metod a terminologie
- metody jsou úseky kódu (podprogramy), které provádějí nějaký výpočet
	- Metody by neměly být příliš dlouhé (cca na jednu obrazovku) a měly by dělat jednu jasně definovatelnou činnost popsanou jejich názvem
- Je třeba rozlišovat deklaraci/definici metody a volání/použití metody

### Deklarace metody
- Deklarace metody znamená, že vytvoříme (napíšeme) metodu
	- včetně jejího názvu a výkonného kódu
	- POZOR! – Tento kód se však provede až při volání metody
- Každá metoda se skládá z hlavičky a těla
- Hlavička metody
	- Obsahuje „popis vlastností“ metody včetně jejího jména
	- ``` právo static návratováHodnota název(parametry) ```
		- Např. ``` public static double naDruhou(double x) ```
	- ```public ``` je přístupové právo
	- ```static ``` značí, že se jedná o statickou metody třídy
		- Existují i metody bez ```static```, tzv. metody instance, kterých je ve skutečnosti většina
	- Název metody začíná malým počátečním písmenem, každé další slovo víceslovného názvu začíná velkým písmenem 
		- Podobně jako u názvu proměnných
	- U dokumentačního komentáře metody se uvádí alespoň jedna řádka popisující účel metody, případné parametry metody a návratová hodnota jsou popsány na dalších řádkách
	- např.:
	```java
	/** 
		* Ukazka deklarace metod - vypocet vzdalenosti dvou bodu v rovine 
		* @author Tomas Potuzak 
		* @version 1.0 (2018-08-13) 
	*/
	```
- Tělo metody
	- Obsahuje výkonné příkazy uzavřené do složených závorek
	- V Javě se otevírací závorka píše na řádku hlavičky metody
- Metoda je jednoznačně určena třídou, ve které je deklarována, svým názvem, počtem, typem a pořadím svých parametrů a návratovou hodnotou
	- Přesto se ve vysvětlujícím textu (nikoliv ve zdrojovém kódu) běžně používá pouze název metody se závorkami (např. ``` naDruhou ```()), pokud nehrozí záměna za jinou metodu
- Každá metoda musí být deklarována přímo uvnitř třídy
	- Není možné deklarovat metodu mimo třídu
	- Není možné deklarovat metodu uvnitř jiné metody
	- Metody se typicky deklarují po deklaraci proměnných (např. deklarace ```Scanner```u) kvůli přehlednosti
		- Mohou být ale deklarovány kdekoliv uvnitř třídy
	- Pořadí deklarace metod **je** (v Javě) **irelevantní**, každá metoda je platná (je viditelná) v celé třídě => metoda může být deklarována až za místem, kde již byla volána

### Volání (použití) metody
- Volání metody znamená, že se provede kód umístěný v těle metody na místě programu, kde metodu voláme (použijeme)
	- Pokud chceme metodu použít (tj. chceme, aby provedla svou činnost (výpočet) na určitém místě), použijeme její jméno a do závorek napíšeme hodnoty skutečných parametrů, které nahradí formální parametry v hlavičce metody
	- Pokud použijeme metodu ve stejné třídě, jako ve které je deklarována (tj. voláme ji z jiné metody téže třídy), voláme ji pouze jejím jménem a hodnotami parametrů
		- ``` metoda(parametry); ```
	- Pokud použijeme metodu vně třídy, ve které je deklarována, musíme před název metody přidat název třídy, ve které je deklarována (tečková notace)
		- ``` Třída.metoda(parametry); ```
		- Toto platí pouze pro metody označené klíčovým slovem ```static```

### Lokální proměnné
- Jsou definovány **UVNITŘ** metod

#### Viditelnost lokálních proměnných
- Jsou viditelné (tj. mohu je používat pro čtení a zápis) **pouze uvnitř metody**
	- Jsou viditelné od místa (řádky), kde byly deklarovány
	- Jsou viditelné do konce bloku, ve kterém byly deklarovány
		- Rozdíl oproti proměnným definovaným UVNITŘ třídy, ale VNĚ metod (proměnné třídy), které jsou viditelné v rámci třídy i před místem deklarace (podobně jako metody)
		- Pokud jsou deklarovány přímo v těle metody (tj. ne uvnitř vnořeného bloku), jejich viditelnost končí s tělem metody
		- Pokud jsou definovány uvnitř vnořeného bloku (např. v příkazu if nebo v cyklu), jejich platnost končí koncem bloku
- Zastíní proměnnou třídy (a instance) pokud se jmenuje stejně
	- Je možné deklarovat lokální proměnnou, která se jmenuje stejně jako proměnná třídy
	- Společný název (identifikátor) pak odkazuje na **LOKÁLNÍ** proměnnou, ne na proměnnou třídy
	- Potenciální zdroj problémů => je potřeba dát pozor, o jakou proměnnou se jedná (lokální/třídy/instance)
		- IDE nástroje většinou druh proměnné odlišují barvou či řezem písma pro větší přehlednost
- Lokální proměnné ve vnořených blocích
	- Všechny lokální proměnné deklarované před vnořeným blokem jsou platné (viditelné) i v tomto bloku => nelze definovat novou lokální proměnnou se stejným názvem

#### Inicializace lokálních proměnných
- Lokální proměnné nejsou implicitně inicializovány na ```0, 0.0, false``` nebo ```null``` 
	- Na rozdíl od proměnných třídy (a proměnných instance)
	- Je vhodné je inicializovat ručně (explicitně) 
	- Např. ``` int i = 0; ```

### Návratová hodnota metody a příkaz return
- Existují **dva typy metod**: 
	- Metody **s návratovou hodnotnou** (**funkce**)
	- Metody **bez návratové hodnoty** (**procedury**)

#### Metody s návratovou hodnotou (funkce)
- Metoda může vracet návratovou hodnotu, která může být libovolného typu (základní datový typ, třída, pole, ...)
	- Pokud metoda vrací návratovou hodnotu, jedná se o funkci
- Typ je specifikován těsně před názvem metody
- Pro určení návratové hodnoty uvnitř těla metody se používá příkaz (klíčové slovo) ```return```, za který se uvede výraz s odpovídajícím typem výsledné hodnoty
- ```return výraz;```
	- Výraz může být libovolně komplikovaný nebo se může jednat o samotnou proměnnou (nebo výjimečně i pojmenovanou/nepojmenovanou konstantu)
- Volání metody s návratovou hodnotou
	- Výsledkem volání metody je její návratová hodnota, ale může mít i další efekty
		- Např. může ovlivnit hodnoty proměnných třídy (nebo mnohem častěji proměnných instance)
	- Pokud je primárním výsledkem volání metody (funkce) její návratová hodnota, je většinou volána jako součást výrazu
	- Pokud primárním výsledkem volání metody (funkce) je jiná činnost, kterou provádí, a návratová hodnota je (někdy) vedlejší, lze jí volat jako příkaz (tj. ne jako součást výrazu)
		- Vrácená hodnota se zahodí (nikam se nepřiřadí a nepoužije se)

#### Metody bez návratové hodnoty (procedura)
- Metoda nevrací žádnou návratovou hodnotu, pouze provede nějakou činnost => pak se jedná o proceduru
- Při deklaraci metody se místo návratového typu uvede klíčové slovo void
	- Např. ```public void vypisNahodnaCisla()```
- Volání metody bez návratové hodnoty
	- Metoda se volá pouze jako příkaz, nemůže být součástí výrazu jako metoda s návratovou hodnotou

#### Použití příkazu return
- Příkaz return okamžitě ukončí metodu, bez ohledu na to, kde se v metodě nachází 
- Příkazů return může být v jedné metodě více (např. v každé větvi příkazu ```if```)
	- Pokud metoda vrací návratovou hodnotu (jedná se o funkci), nesmí existovat větev, ve které by příkaz return nebyl (došlo by k chybě překladu)
- Za ním už se nesmí nacházet žádný příkaz, protože se nikdy nemůže provést (dojde k chybě překladu)
	- Např. pokud je použit v příkazu ```switch```, nemůžou být jednotlivé větve ukončeny příkazem ```break;```, protože tento příkaz je nedosažitelný
- Příkaz ```return``` se může použít k předčasnému ukončení metody (např. proto, že parametr nemá platnou hodnotu)
- Příkaz return se může použít i k předčasnému ukončení metody bez návratové hodnoty (procedury) 
	- Pak se použije samotný ```return;```

### Parametry metody
- Metoda může mít „neomezené“ množství parametrů
	- Prakticky jich bývá pouze několik (žádný až cca 3 až 5)
		- Více parametrů typicky svědčí o špatné dekompozici problému
	- Parametry jsou popsány v závorce za názvem metody stejně jako deklarace proměnné typem a názvem
		- Parametry mohou být libovolného typu
		- Pokud má metoda více parametrů, jsou odděleny čárkou
		- U každé proměnné musí být explicitně uveden datový typ, i když je více parametrů stejného datového typu za sebou
		- Např. ```double static secti(double a, double b)```

#### Formální a skutečné parametry metody
- Parametry definované v hlavičce metody (při deklaraci metody) se nazývají **formální parametry**
- Při volání metody jsou v závorce uvedeny **skutečné parametry metody**
	- Musejí odpovídat počtem a datovým typem (ve správném pořadí)
	- Může se jednat o proměnné, pojmenované/nepojmenované konstanty a výrazy (datový typ výsledku výrazu musí odpovídat datovému typu formálního parametru)
- Ve formálních parametrech (proměnných) jsou do metody předány hodnoty skutečných parametrů metody
	- Tyto hodnoty typicky ovlivňují chování metody
	- Formální parametry mají v těle metody všechny vlastnosti lokálních proměnných, typicky se ale jejich hodnoty jen čtou
		- Je možné do nich přiřadit hodnotu, tím se ale ztratí hodnota předaná do metody => do formálních parametrů nové hodnoty v těle metody nepřiřazovat

#### Mechanizmus předání parametrů do metody
- Parametry jsou předávány vždy **hodnotou**
	- Platí pro základní datové typy i reference
- Hodnoty skutečných parametrů jsou překopírovány a vloženy do odpovídajících formálních parametrů, přes které jsou hodnoty dostupné v těle metody
- Změnit hodnotu formálních parametrů v těle metody je možné, ale změna se nijak neprojeví vně metody
	- Kromě toho se přepíše hodnota předaná do metody

### Předávání řízení při volání metod
- Pokud je program rozdělen na metody, neběží lineárně od první řádky po poslední 
- Při každém volání metody se „skočí“ na začátek těla metody a začne se provádět její kód
	- Tzv. „předávání řízení“
- Při dosažení konce těla metody se skočí zpátky na místo, odkud byla metoda volána, a pokračuje se dalším příkazem
- Volání metody jako parametru jiné metody
	- Pokud metoda vrací návratovou hodnotu a tato hodnota je použita jako parametr volání další metody, je možné si ji uložit do pomocné proměnné a tu pak použít jako parametr další metody
		- Tento zápis je přehlednější
	- Je však také možné volat metodu přímo ve volání další metody
		- Tento zápis je úspornější, ale méně přehledný 
		- Oba zápisy se běžně používají

### Přetěžování metod (overloading)
- V jedné třídě může být deklarováno více metod se stejným jménem
- Metody se pak nazývají přetížené (overloaded)

#### Důvody k přetěžování metod
- Přetížené metody obvykle dělají podobnou činnost, ale mírně se liší
- Protože je možné metody přetížit, není nutné vymýšlet podobné názvy podobných metod, můžeme rovnou použít stejný název
- Dělají stejnou činnost pro různý datový typ
	- Např. metoda ```Math.abs()``` je přetížena 4x pro typ 
	   ```int, long, float a double```
- Dělají stejnou činnost, ale s upřesněním
	- Typicky přibudou další parametry

#### Požadavky na přetížené metody
- Přetížené metody MUSÍ mít různé hlavičky
	- Musí se lišit počtem a/nebo typem a/nebo pořadím typů parametrů
	- Nestačí, aby se lišily jen návratovou hodnotou
	- Nestačí, aby se lišily jen názvem formálních parametrů
		- Názvy formálních parametrů nejsou podstatné – používají se v těle metody, ale při jejím volání je důležitý pouze jejich typ
	- Při volání překladač vybere podle skutečných parametrů metodu, která přesně odpovídá počtem, typem a pořadím parametrů

## Konstanty a magická čísla
- Doposud jsme běžně používaly číselné nebo znakové (textové) konstanty přímo ve zdrojovém kódu
	- Tzv. literály
	- Ve většině případů se taková použití označují jako „magická čísla“ a jsou nevhodná

### Magická čísla
- Magická se nezývají proto, že není jasné, odkud se vzaly
	- „Najednou je v programu číslo 2.58. Proč?“
	- Nemusí se jednat o čísla, může se jednat i o znakové a textové, případně jiné nepojmenované konstanty
- Velmi znesnadňují úpravu kódu
	- I u relativně jednoduchých programů
	- Pokud budu program chtít upravit, budu muset magické číslo přepsat na víceromístech

### Pojmenované konstanty místo magických čísel
- Snahou by mělo být důsledně se zbavit magických čísel pomocí pojmenovaných (též symbolických) konstant
- Konstanty mohou být lokální (deklarované uvnitř metody), ale naprostá většina je deklarována jako konstanta třídy (tj. uvnitř třídy, ale mimo metody)
	- Konstanta je odlišena od proměnné klíčovým slovem ```final```
	- **Názvy konstant** jsou psány **velkými písmeny**, **oddělovač** slov ve víceslovných názvech je **podtržítko**

### Povolené nepojmenované konstanty
- Stejně jako u každého pravidla i u magických čísel existují výjimky, v tomto případě číselné
- Je odůvodnitelné použít malá celá čísla (např. -1, 0, 1, 2), pokud však nemají speciální význam
	- Např. test sudosti/lichosti čísel
		- ```if (cislo % 2 == 0)```