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

## Třídy a instance (objekty)
- Objektové programování
	- Program je dekomponován na objekty (abstrakce objektů z reálného světa), které udržují data a metody, které s daty pracují, pohromadě

### Třída, instance, reference
- Strukturovaný datový typ
- Na rozdíl od základních datových typů, které obsahují pouze jednu hodnotu a nejde je dále členit, třída může obsahovat data ve formě proměnných (atributů) obecně různého typu
- Kromě dat obsahuje metody, které obecně provádějí operace nad těmito daty
- Třída je šablonou pro tvorbu instancí (objektů)
- Název třídy začíná velkým počátečním písmenem, každé další slovo víceslovného názvu začíná velkým písmenem
- U dokumentačního komentáře třídy se uvádí alespoň jedna řádka popisující účel třídy, dále autor třídy a případně verze (s datem poslední úpravy)

### Instance (objekt)
- Je vytvořena podle konkrétní třídy a nese v sobě konkrétní hodnoty atributů (proměnných)
- Od jedné třídy může být vytvořeno více instancí, přičemž každá může mít (a typicky má) jinak nastavené atributy
- Aby bylo možné s atributy a metodami definovanými ve třídě pracovat, je NUTNÉ vytvořit její instanci (neplatí při použití klíčového slova ```static```)
	- Tím se vytvoří místo v paměti pro tuto instanci, do kterého se mimo jiné uloží hodnoty jednotlivých atributů
	- Rozdíl oproti základním datovým typům, kdy se místo v paměti vytvořilo v okamžiku deklarace proměnné (tj. v okamžiku provedení řádky ```int i;``` se vytvořilo místo v paměti o velikosti 4 byty pro uložení celého čísla) 
- Reference
	- Abychom mohli pracovat s instancí a jejími atributy a metodami, potřebujeme na ní referenci
	- Reference (referenční proměnná) ukazuje na místo v paměti, kde je uložena konkrétní instance

#### Deklarace referenční proměnné a vytvoření instance
- Referenční proměnná se deklaruje stejně jako proměnná základního datového typu, tj. názevTypu názevProměnné;
	- ```názevTypu``` je název třídy,
	- ```názevProměnné``` je název referenční proměnné 
- Pouhou deklarací referenční proměnné ale instance třídy nevznikne 
	- Po deklaraci (bez inicializace) je referenční proměnná „prázdná“ – není vytvořeno místo v paměti pro instanci a sama referenční proměnná tedy na nic neukazuje
		- POZOR! – Pokud se jedná o lokální proměnnou (tj., proměnnou deklarovanou uvnitř metody), je vhodné inicializovat referenční proměnnou hodnotou null
			- Hodnota ```null``` (klíčové slovo) explicitně říká, že reference neodkazuje (zatím) na žádnou instanci
			- Pokud tuto inicializaci neprovedete, hodnota lokální referenční proměnné není definována a při pokusu o její čtení dojde k chybě (už při překladu programu)
- Vytvoření instance
	- Instance se vytvoří pomocí operátoru new (klíčové slovo) a přiřadí se do připravené referenční proměnné 
	- ```referenčníProměnná = new Třída();```
		- Referenční proměnná musí být stejného typu jako vytvářená instance (tj. ```Třída```)
			- Nebo typu předka třídy nebo rozhraní implementovaného třídou (viz předměty KIV/PPA2 a KIV/OOP)

#### Přístup k atributům a metodám instance
- K jednotlivým atributům (proměnným) a metodám instance přistupujeme přes referenční proměnnou, která na instanci ukazuje
- Používá se tečková notace
	- ```referenčníProměnná.proměnnáInstance```
		- Do proměnných (pokud jsou viditelné) lze zapisovat hodnoty a lze je i číst
	- ```referenčníProměnná.metodaInstance()```
		- Metody lze volat (pokud jsou viditelné)

#### Práce s referenčními proměnnými a instancemi
- Do referenčních proměnných lze přiřazovat nové instance i jiné referenční proměnné
- Na jednu instanci může ukazovat více referenčních proměnných
- Pokud už nějakou instanci nebudeme používat, můžeme do referenční proměnné explicitně přiřadit hodnotu ```null```
	- Např. ```pocatek = null;```
	- Tím ztratíme referenci na instanci a Garbage Collector ji časem smaže a uvolní tím paměť, kterou instance zabírá
	- V Javě neexistuje příkaz pro explicitní smazání instance (a tím pádem „ruční“ uvolnění paměti)
	- POZOR! – Pokud má referenční proměnná hodnotu ```null``` (tj. neukazuje na žádnou instanci) nelze přes tuto proměnnou přistupovat k atributům a metodám instance (protože tam žádná instance není)
		- Pokus o přístup vede k chybě ```NullPointerException``` za běhu programu (nikoliv při překladu)
			- Pokud se může stát (v závislosti na předchozím kódu), že referenční proměnná může být ```null```, nebo může ukazovat na instanci, je vhodné před přístupem k proměnným a metodám instance otestovat, zda je referenční proměnná různá od ```null``` – např. ```if (pocatek != null)```

### Atributy (proměnné) instance
- Protože třídy jsou abstrakce objektů z reálného světa, atributy typicky odpovídají vlastnostem těchto objektů 
	- Jako atributy jsou reprezentovány pouze ty vlastnosti, které jsou důležité z hlediska výpočtu (funkce programu)
	- Každá instance může mít (a typicky má) v atributech uloženy jiné hodnoty
- Atributy (proměnné) instance jsou deklarované uvnitř třídy ale MIMO metody
	- V deklaraci NEMAJÍ uvedeno klíčové slovo ```static```
	- Naprostá většina proměnných v dosavadních programech byla definována uvnitř metod (hlavně ```main()```) a jednalo se tedy o lokální proměnné
	- Pokud byly dosud proměnné deklarované vně metod, jednalo se o statické proměnné třídy (s klíčovým slovem ```static``` – např. používané deklarace ```Scanner```u pro čtení z klávesnice)
	- Dokumentační komentáře jsou typicky jednořádkové a stručně popisují účel proměnné 
	- Atributy se typicky deklarují na začátku třídy (před všemi metodami)
		- Kvůli přehlednosti
		- Atribut má viditelnost (je použitelný) přes celou třídu (i před místem deklarace), podobně jako metody 
	- Atributy (proměnné) instance mohou být libovolného datového typu (primitivní datový typ, třídy nebo pole) - Není žádné omezení
	- Implicitní inicializace atributů (proměnných) instance 
		- U lokálních proměnných (deklarovaných uvnitř metod) bylo doporučeno provést inicializaci hned při deklaraci (např. ```int i = 0;```), aby se nestalo, že se pokusíme číst z proměnné její hodnotu, která ale nebyla nastavená
		- U atributů (proměnných) instance to není nutné, protože jsou automaticky (implicitně) inicializovány na ```0, 0.0, false``` nebo ```null```, v závislosti na datovém typu
			- Doplnit explicitní inicializaci je možné, ale není to nutné ani vhodné

#### Konstanty instance
- Ve třídě je možné definovat i konstanty instance
	- Stejně jako pro lokální konstanty a statické konstanty třídy je nutné přidat klíčové slovo ```final```
	- ```final datovýTyp JMÉNO_KONSTANTY = hodnota; ```
		- V deklaraci chybí klíčové slovo ```static```
	- Např. ```final int MAXIMALNI_SIRKA = 1280;```
	- Hodnota konstanty instance nemusí být, stejně jako lokální konstanty, nastavena při deklaraci, ale může být **nastavena později** – u **konstanty instance** to však lze provést **pouze v konstruktoru**
		- Vždy však lze **hodnota konstanty nastavit pouze jednou**
	- Mnohem častěji se využívají statické konstanty třídy

### Metody instance
- Metody instance představují **operace nad atributy instance**
- Platí pro ně téměř stejná pravidla, jako pro statické metody třídy

#### Deklarace metody instance
- Deklarace se liší od dosud probraných statických metod třídy pouze chybějícím klíčovým slovem ```static``` v hlavičce metody
	- ```přístupovéPrávo návratováHodnota název(parametry)```
	- Např. ```public double urciVzdalenost(Bod2D b)```

#### Volání metod instance
- Pokud voláme metodu instance ve stejné třídě, v jaké je deklarována (tj. voláme ji z jiné metody téže třídy), voláme ji pouze jejím jménem a hodnotami parametrů
	- ``metoda(parametry)``
	- Stejné jako u statických metod třídy
	- Např. ```int mocnina = naDruhou(x);```
- Pokud použijeme metodu vně třídy, ve které je deklarována, musíme před název metody přidat název referenční proměnné ukazující na instanci, nad níž chceme metodu zavolat
	- ```referenčníProměnná.metoda(parametry);```
	- Na rozdíl od statické metody třídy, kdy se používá název třídy

### Metody a atributy instance a třídy
- Z předchozích kapitol vyplývá, že existují dva druhy metod a dva druhy atributů
	- Metody a atributy (proměnné) instance
	- (Statické) metody a atributy (proměnné) třídy

#### Porovnání vlastností metod a atributů instance a třídy
- Metody a atributy (proměnné) **instance** (bez ```static```)
	- Každá instance má vlastní hodnoty atributů (proměnných) 
	- K proměnným instance se přistupuje přes konkrétní referenční proměnnou ukazující na konkrétní instanci 
	- Metody instance se vně své třídy (kde jsou deklarovány) volají nad konkrétní referenční proměnnou ukazující na konkrétní instanci
	- Metody instance mohou uvnitř své třídy volat jiné metody instance i metody třídy a přistupovat k proměnným instance i třídy
	- Při správném objektovém návrhu je to naprostá většina atributů a metod
- Metody a atributy (proměnné) **třídy** (se ```static```)
	- Každá proměnná třídy má jen jedno paměťové místo a může tak mít jen jednu hodnotu, bez ohledu na to, kolik instancí třídy existuje
	- Paměťové místo pro proměnnou třídy existuje, i když žádná instance ještě neexistuje
	- K proměnným třídy se vně jejich třídy přistupuje přes název třídy
	- Metody třídy se vně své třídy volají nad názvem třídy
	- Metody třídy mohou uvnitř své třídy volat pouze metody třídy a přistupovat pouze k proměnným třídy (metody a proměnné instance deklarované v téže třídě, tj. bez ```static```, jsou pro ně nepřístupné)
	- Při správném objektovém návrhu jich není mnoho
		- Výjimkou jsou konstanty třídy, které jsou podstatně častější než konstanty instance

#### Použití metod a atributů (proměnných) instance
- Atributy instance obsahují data konkrétní instance třídy
- Metody instance provádějí operace nad těmito konkrétními daty 
	- Díky tomu, že metody instance mají přístup k atributům instance přímo, tato data se nemusí předávat (a nepředávají) jako parametry metod
	- Metody instance jsou poměrně často bez parametrů, protože většinou pracují s proměnnými instance, ke kterým mají přímý přístup (aniž by musely být předávány jako parametry metody)
	- Pokud v programu od třídy vytvářím instanci či instance, většina atributů a metod bude instance, nikoliv třídy
		- Výjimku tvoří konstanty instance, které se v programech používají minimálně

#### Použití metod a proměnných třídy
- Použití konstant třídy
	- Konstanty v dané třídě jsou ve většině případů stejné pro všechny instance => **není vhodné používat konstanty instance**
	- **Konstanta třídy** zabírá **pouze jedno paměťové místo** (na rozdíl od konstanty instance, kde je zabráno tolik paměťových míst, kolik je instancí)
	- Pro získání hodnoty konstanty třídy se nevytváří instance, přistupuje se k ní přes název třídy (např. ```Math.PI```)
		- Uvnitř třídy není název třídy nutný
		- Konstanty mají obvykle přístupové právo ```public```
		- Konstantě třídy lze přiřadit hodnota pouze přímo v deklaraci, není možné ji inicializovat později
		- Použití statické konstanty třídy je vidět např. na Obr. 13.2

- Použití proměnných třídy
	- Málo časté
	- Hodí se, pokud potřebujeme, aby byla proměnná jen jedna pro všechny instance
	- Např. doporučené použití třídy ```Scanner``` pro čtení ze standardního vstupu 
		- ```public static Scanner sc;```
		- Aby ```Scanner``` fungoval správně na standardní vstup, je potřeba mít jen jeden v celém programu. Tento požadavek splňuje právě statická proměnná ```sc```, přes kterou pak lze provádět čtení kdekoliv v programu
			- Do proměnné ```sc``` se přiřadí instance hned na začátku metody ```main()``` a tato instance se pak používá pro veškeré čtení

- Použití metod třídy
	- Vstupní bod programu – metoda ```main()``` – je metoda třídy (statická)
	- To vychází z toho, že na začátku programu není k dispozici instance žádné třídy, a tedy nemůže být spuštěná metoda instance
	- Pokud potřebuji pomocnou metodu, kterou volám v metodě ```main()```, musí to být rovněž metoda třídy (statická)
		- Zde stojí za zvážení, jestli není lepší v metodě ```main()``` vytvořit instanci a nad ní pak volat libovolné metody instance

	- Metody, u kterých se nevyplatí vytvářet instanci
		- Je mnoho metod, které realizují nějaký výpočet, ke kterému nepotřebují instanční proměnné ani jiné vlastnosti instance (např. matematické výpočty – metody třídy ```Math```)
		- U takových metod je vhodné, aby byly metody třídy (statické), protože se nemusí vytvářet instance a volají se přímo nad názvem třídy
		- Více takových metod může být deklarováno v tzv. utility třídě
			- Volání je pak možné z jakékoliv metody (třídy či instance)

#### Mechanizmus předání referenčních parametrů metod
- Metody instance i statické metody třídy mají stejný mechanizmus předávání hodnot parametrů metod
	- Hodnoty parametrů se předávají hodnotou
	- Platí jak pro parametry primitivních datových typů, tak i referencí (typu třídy, ukazujících na instance)
		- Stejný mechanizmus má ale různé důsledky
		- Pro primitivní datové typy se změna hodnoty formálního parametru uvnitř metody neprojeví vně metody (protože hodnota parametru je pouze kopií)
		- Obsah referenční proměnné je však pouze odkaz ukazující na instanci (na rozdíl od proměnné primitivního datového typu, která obsahuje hodnotu přímo, např. celé číslo)
		- Pokud překopírujeme odkaz, bude pořád ukazovat na stejnou instanci => změny provedené v této instanci SE PROJEVÍ i vně metody

### Konstruktor
- Při vytváření instance třídy operátorem ```new``` je vhodné nastavit počáteční hodnoty atributů této instance (objektu) – pro to slouží tzv. konstruktor
- Konstruktor
	- Speciální metoda (instance) pro inicializaci objektu
	- Musí se jmenovat stejně jako třída (včetně velikosti písmen)
	- Nemá žádnou návratovou hodnotu (ani ```void```)
		- Podle toho se pozná od ostatních metod (a podle názvu jako třída
	- Při vytváření instance za ```new``` ve skutečnosti voláme konstruktor
		- Protože se jmenuje stejně jako třída, vypadá to, že uvádíme třídu
	- Konstruktor může být bez parametru, nebo může mít „libovolné“ množství a typ parametrů (jako běžná metoda)
	- Konstruktor nemusí být ve třídě explicitně uveden, ale pokud je, typicky obsahuje inicializaci atributů instance
		- Často s předáním hodnot atributů pomocí formálních parametrů konstruktoru
		- Inicializace atributů nemusí být jen hodnotami formálních parametrů, mohou se např. pouze připravovat složitější datové struktury pro další výpočty
		- Konstruktor může být (a často bývá) přetížen
			- Umožňuje různou inicializaci atributů instance

#### Proměnná ```this```
- V konstruktoru (ale i setrech a dalších metodách) se typicky využívá speciální referenční proměnná ```this```
- Referenční proměnná ```this```
	- Je dostupná v každé instanci a ukazuje na „tuto“ instanci (tj. na sebe sama)
	- Všechny metody instance volané uvnitř své třídy (tj. z jiných metod instance, bez uvedení referenční proměnné, nad kterou jsou volány) jsou implicitně volány nad proměnnou ```this```, to samé platí pro atributy instance
		- Díky tomu je možné používat metody a atributy instance uvnitř jejich třídy bez uvedení instance (implicitně se použije ```this```)
	- Explicitní použití ```this``` umožňuje přístup k atributům instance, pokud jsou zastíněny lokální proměnnou nebo parametrem metody/konstruktoru se stejným názvem
		- Parametry konstruktoru sloužící pro předání počátečních hodnot atributů instance se typicky jmenují stejně 
			- Díky ```this``` není nutné vymýšlet jiné názvy formálních parametrů metod/konstruktorů
		- Explicitní uvedení ```this``` je možné u metod a atributů instance vždy (i když nedochází k zastínění), ale není to nutné ani příliš vhodné
- přetížení konstruktoru
	- Při přetěžování konstruktoru je možné volat jiný konstruktor téže třídy
		- Volání jiného konstruktoru musí být první příkaz v konstruktoru
		- Volá se pomocí ```this(parametry);```, nikoliv jménem konstruktoru
		- Není třeba opakovat kód konstruktoru => používá se běžně

#### Implicitní konstruktor
- Pokud ve třídě není žádný konstruktor uveden volá se při vytváření nové instance implicitní konstruktor bez parametrů
	- Tento konstruktor bez parametrů zajistí vytvoření instance v paměti
		- Atributy instance jsou implicitně inicializovány na ``0, 0.0, false`` nebo ```null``` podle datového typu
	- POZOR! – Pokud do třídy přidáme libovolný explicitní konstruktor, implicitní konstruktor nebude vytvořen!
		- Pokud potřebujeme i konstruktor bez parametrů jako doplněk k dalším konstruktorům, musíme ho rovněž explicitně napsat
		- Pak je možné použít konstruktor bez parametrů (ale nejedná se o implicitní konstruktor, protože je ve třídě přímo napsaný)

### Zapouzdření a přístupová práva
- Atributy mohou být přístupné z vnějšku třídy
	- Tento postup není vhodný, protože umožňuje změnu atributů bez jakékoliv kontroly, což umožňuje mj. zadat neplatné hodnoty
- **Zapouzdření** (encapsulation)
	- Atributy objektu jsou **skryté před vnějšími vlivy** pomocí **přístupových práv**
- Pokud je potřeba změnit nastavení atributů, provádí se to prostřednictvím metod, které mohou obsahovat kontroly – tzv. ```setry```
	- Tyto metody by měly existovat pouze pro atributy, u kterých chceme jejich změnu z vnějšku třídy umožnit
- Pokud je potřeba získat hodnoty atributů, jsou zpřístupněny metodami nazvanými ```getry```
	- Tyto metody by měly existovat pouze pro atributy, jejichž hodnota má být přístupná z vnějšku třídy
- I metody mohou mít nastavená přístupová práva tak, aby je nebylo možné volat z vnějšku třídy
	- Typicky pomocné metody

#### Přístupová práva
- Přístupová práva určují, odkud lze k dané metodě nebo atributu přistoupit
- Klíčová slova určující přístupová práva se píší na začátek deklarace
	- U atributů před datový typ
		- Např. ```private int pocetClenu;```
	- U metod před návratovou hodnotu nebo ```void```
		- Např. ```public int naDruhou(int x)```
- Přístupová práva (od nejméně po nejvíce restriktivní)
	- ```public```
		- Metoda/atribut je přístupný odkudkoliv (ze stejné třídy, z jiné třídy stejného balíku, z jiné třídy jiného balíku)
		- Typicky se používá pro metody
	- ```protected```
		- Metoda/atribut je přístupný ze stejné třídy, z jiné třídy stejného balíku a z potomka třídy (viz předmět KIV/OOP)
	- Neuvedeno (přístupové právo není explicitně uvedeno)
		- Metoda/atribut je přístupný ze stejné třídy a z jiné třídy stejného balíku
	- ```private```
		- Metoda/atribut je přístupný pouze ze stejné třídy
		- Typicky se používá pro atributy
- Přístupová práva u třídy (a také rozhraní – viz předměty KIV/OOP a KIV/PPA2)
	- ```public```
		- Třída musí být v souboru odpovídající názvu třídy
	- Neuvedeno
		- Třída může být v jiném souboru, který neodpovídá názvu třídy
		- Více tříd pak může být v jednom souboru, ale maximálně jedna může být ```public``` (a její název pak odpovídá názvu souboru)
		- Pak ale není viditelná z jiného balíku => nepoužívat
	- Jiná přístupová práva pro třídy možná nejsou

#### Getry a setry
- Metody pro přístup k atributům
	- Getry začínají slovem ```get``` (anglicky „získat“), v případě atributu typu boolean slovem ```is``` (anglicky „je“)
	- Setry začínají slovem ```set``` (anglicky „nastavit“)
	- Slova ```get``` a ```set``` se používají, i když píšeme zdrojový kód česky
	- Je to konvence pojmenování, která se dodržuje
	- Jinak jsou to běžné metody
- Getry
	- Hlavička přesně daná pro daný atribut
	- ```public datovýTypAtributu getAtribut()```
	- ```public boolean isAtribut()```
	- Např. ```public int getX()```
	- Např. ```public boolean isPrazdny()```
	- Vrací hodnotu atributu, typicky obsahují jedinou řádku s příkazem ```return```
- Setry
	- Hlavička přesně daná pro daný atribut
	- ```public void setAtribut(datovýTypAtributu atribut)```
	- Např. ```public void setX(int x)```
	- Nastaví hodnotu atributu
	- Obsahuje přiřazení hodnoty do atributu předané přes formální parametr setru
		- Typicky se používá referenční proměnná ```this``` jako v konstruktoru
	- Typicky by měl obsahovat **kontrolu**, **zda je hodnota formálního parametru platná** (přípustná)
		- POZOR! – Nastavit hodnotu pouze, pokud je platná, a jinak neudělat nic není nejšťastnější řešení – **reálně se řeší pomocí výjimek**
		- Pokud tuto **kontrolu neobsahuje**, pak se vlastně o **zapouzdření nejedná**, protože si můžeme z vnějšku třídy dělat s atributem, co chceme (byť prostřednictvím getru a setru)
		- Pokud tuto kontrolu dělá, **měl by být setr použit i v konstruktoru** místo přímého přiřazení
			- Přiřazení je bez kontroly, což umožňuje zadat neplatnou hodnotu přes formální parametry konstruktoru
- Běžné metody instance (ne getry a setry) mohou měnit více atributů najednou, čímž vyjádří jednu změnu stavu instance
	- Pokud jsou na sobě atributy závislé a neměly by se měnit každý zvlášť, pak by pro ně neměly existovat setry a místo toho by měla existovat metoda měnící konzistentně všechny závislé atributy najednou

### Textová reprezentace objektu
- Objekty (instance), mohou být velmi komplikované (obsahovat mnoho různých atributů), často je ale **potřeba získat textovou reprezentaci** objektu (ve formě řetězce – ```String```)
	- **Pro výpis objektu** do příkazové řádky – velmi často během ladění programu 
	- **Pro zobrazení objektu** např. v seznamu v grafickém uživatelském prostředí (GUI)
	- Jsou i další použití
	- Vypisování hodnot jednotlivých atributů ručně je zdlouhavé, pokud je atributů více, a kód pro výpis je navíc v jiné třídě => využívá se metoda ```toString()```

#### Metoda toString()
- Metoda vracející textovou reprezentaci objektu (instance)
- Hlavička metody ```public String toString()```
- Tato metoda je implicitně v každé instanci (je zděděna od třídy ```Object``` – viz předmět KIV/OOP)
- Vrací řetězec popisující danou instanci
	- Metoda pouze VRACÍ řetězec, sama ho NEVYPISUJE
Tato metoda se volá, pokud chceme objekt (instanci) vypsat pomocí metody ```System.out.println()```
- **Implicitní implementace**
	- Vrací řetězec obsahující název třídy, zavináč a číslo určující konkrétní instanci 
		- Např. ```Bod2D3@15db9742```
	- Neobsahuje informace o stavu třídy (např. hodnoty atributů)
- **Vlastní implementace**
	- Implicitní metodu lze překrýt **vlastní implementací**
		- Stačí ve třídě vytvořit **metodu se stejnou hlavičkou**
		 - Před metodu je vhodné napsat ```@Override``` indikující, že **metoda je překryta** (overridden) 
			- Není to nutné, ale např. Eclipse tuto entitu doplní automaticky, pokud necháme metodu ```toString()``` vygenerovat
			- Bližší informace viz předmět KIV/OOP
		- Metoda musí vracet řetězec, ale ten může obsahovat cokoliv
			- Typicky obsahuje hodnoty atributů (při ladění programu), ale záleží na tom, na co chceme textovou reprezentaci třídy použít
		- Příklad typické metody ```toString()```

### Porovnání objektů
- Objekty (instance) obecně nejsou uspořádané jako základní datové typy, operátory ```„>“, „>=“, „<“, „<=“``` tedy nelze použít
- Lze však použít porovnání na rovnost (operátor ```„==“```) a také různost (operátor ```„!=“```)
	- POZOR! – Má jiný než očekávaný význam
	- Výsledkem porovnání je **true**, **pokud se jedná o stejnou instanci** (tj. porovnávané referenční proměnné odkazují na stejnou instanci). **Pokud se nejedná o stejnou instanci**, je výsledkem porovnání **false**
	- I když mají **dvě instance stejné třídy stejné hodnoty** všech atributů, výsledek je **false**
	- Často je ale potřeba zjistit, zda jsou objekty shodné podle hodnot atributů (některých nebo všech)
	- Lze dělat ručně porovnáváním jednotlivých atributů, ale pro více atributů zdlouhavé a kód pro porovnání je v jiné třídě => využívá se metoda ```equals()```

#### Metoda equals()
- Metoda slouží **k porovnání objektu** (instance) **s objektem stejné třídy**
- Hlavička metody ```public boolean equals(Object o)```
- Tato metoda je implicitně v každé instanci (je zděděna od třídy ```Object``` – viz předmět KIV/OOP) 
	- Stejně jako metoda ```toString()```
- Metoda vrací ```true```, pokud jsou instance shodné a ```false```, pokud jsou instance rozdílné 
	- **Co je shodné a rozdílné, určuje kód metody**
	- Typicky **se porovnávají hodnoty atributů**
- **Implicitní implementace**
	- Chová se stejně jako operátor „```==```“
	- Vrací **true** pouze v případě, že je **stejná instance**
- **Explicitní implementace**
	- Implicitní metodu lze překrýt **vlastní implementací**
		- Stačí ve třídě vytvořit metodu se stejnou hlavičkou
		- Před metodu je vhodné napsat ```@Override``` indikující, že metoda je překryta (overridden) 
	- Existují doporučení, jak má kód metody ```equals()``` vypadat (viz předmět KIV/OOP)
	- Porovnávaná instance je v parametru, který je typu (třídy) ```Object```
	- Aby bylo možné číst atributy porovnávané instance, je potřeba proměnnou explicitně přetypovat na typ třídy naší instance
		- Přetypování se zapisuje stejně jako u základních datových typů (název třídy v kulaté závorce)
			- Při pokusu o přetypování na nesprávný typ dojde k chybě za běhu programu
		- Pak je možné porovnávat jednotlivé atributy
	- Příklad implementace metody ```equals()```

### Výčtový typ
- Výčtový typ v Javě je sofistikovanější řešení pojmenovaných konstant

#### Základní použití výčtového typu
- Základní použití výčtového typu se hodí v případě, kdy
	- Máme více konstant, které spolu souvisí
	- Jejich hodnota je irelevantní
- Deklarace výčtového typu
	- Deklaruje se podobně jako třída, místo klíčového slova ```class``` se použije klíčové slovo ```enum```
	- Pravidla pojmenování jsou stejná jako pro třídu – počáteční písmeno velké, počáteční písmena všech dalších slov víceslovného názvu velká
	- Pokud je označen přístupovým právem ```public```, musí být v samostatném souboru, jehož název odpovídá názvu výčtového typu
	- Na začátku obsahuje konstanty, což jsou jednotlivé hodnoty výčtového typu
		- Pravidla pojmenování stejná jako pro konstanty – všechna písmena velká, oddělovač slov ve víceslovném názvu je podtržítko
		- Konstanty jsou odděleny čárkami
- Použití výčtového typu
	- Výčtový typ můžeme využít pro deklarování libovolné proměnné (lokální, instance, třídy), jako návratovou hodnotu metody, atd. – stejně jako jakýkoliv jiný datový typ (základní, třída, pole)
		- Do proměnné výčtového typu lze přiřadit pouze jednu z konstant definovaných v deklaraci výčtového typu nebo hodnotu ```null```
		- Při použití konstanty je třeba použít název výčtového typu
			- ```VýčtovýTyp.KONSTANTA```
			- Podobně jako u konstant třídy
		- Hodnoty výčtového typu lze porovnávat operátorem „```==```“ s očekávaným výsledkem (na rozdíl od instancí třídy)
		- Hodnoty výčtového typu lze přímo vypsat
			- Vypíše se přímo název konkrétní konstanty

#### Pokročilé použití výčtového typu
- Výčtový typ má větší možnosti než bylo popsáno
	- Může obsahovat proměnné a metody, které se pak vážou k jednotlivým hodnotám výčtového typu
		- Např. u typu ```HodnotaKaret``` by bylo možné u každé hodnoty uvést bodovou hodnotu karet
		- Podrobnosti viz předmět KIV/OOP

## Uspořádání paměti
- **Paměť je** při vykonávání programu **rozdělena na zásobník a haldu**
	- Obě části jsou fyzicky **ve stejné paměti (RAM)**, jen **na jiném místě**

### Zásobník a halda
- **Při vykonávání programu se používají obě části**, některé věci jsou uloženy v zásobníku, jiné na haldě
- **POZOR**!
	- **Neplést s datovými strukturami zásobník a halda** (viz předmět KIV/PPA2), jde o něco zcela jiného
	- Bohužel v češtině i angličtině je pro obojí stejný název
	- Část paměti halda není ani podobná datové struktuře halda
	- Část paměti zásobník je principiálně podobný datové struktuře zásobník

#### Zásobník (stack)
- Slouží pro ukládání volání jednotlivých metod
	- Při volání metody se vytvoří nový zásobníkový rámec (stack frame), ve kterém se alokuje (tj. vytvoří) místo pro
		- Pomocné hodnoty, které Java používá pro řízení běhu programu
		- Formální parametry
		- Všechny lokální proměnné
			- Proměnné základních datových typů jsou zde uloženy přímo
			- Lokální referenční proměnné jsou zde uloženy přímo, ale objekty (instance), na které ukazují, jsou uloženy na haldě
	- Při dokončení metody se zásobníkový rámec uvolní
- Je podstatně menší než halda (řádově 1 MB)
	- Může se stát, že dojde volné místo na zásobníku
		- Typicky při vnořeném volání příliš mnoha metod (typicky při použití rekurze – viz předmět KIV/PPA2)
		- Program se ukončí a objeví se chyba přetečení zásobníku (```stack overflow```)

#### Halda (heap)
- Slouží **pro ukládání objektů (instancí) a polí**
	- Při volání konstruktoru se alokuje místo na haldě potřebné pro uložení objektu, mj. jeho proměnných instance
	- Paměť uvolní automaticky garbage collector, když na instanci neukazuje žádná referenční proměnná (ani ze zásobníku, ani z instančních referenčních proměnných uložených v instancích na haldě)
		- Paměť nelze uvolnit ručně, ale lze JVM požádat, aby zvýšil úsilí automatického uvolňování paměti na haldě voláním metody ```System.gc();```
			- Po dokončení metody JVM udělal vše pro uvolnění paměti odstraněním instancí, na něž již neukazují referenční proměnné
- Je **podstatně větší než zásobník** (většina dostupné paměti – řádově GB)
	- Přesto se může stát, že dojde volné místo na haldě
		- Typicky při vytváření příliš mnoha a/nebo příliš velkých objektů (nebo polí)
		- Program se ukončí a objeví se chyba nedostatku paměti (```out of memory```)
			- Při postupném zaplňování paměti se před chybou program typicky zpomalí, což je důsledek zvýšené snahy garbage collectoru o uvolnění paměti
- Oblast metod (method area)
	- Část haldy, ve které jsou uloženy přeložené výkonné kódy metod (třídy i instance) a také proměnné třídy

## Pole
- **Strukturovaný datový typ pro uložení více prvků stejného typu**
- Pro uložení více hodnot stejného typu se hodí pole

### Základní práce s (jednorozměrným) polem
- Pole
	- Strukturovaný datový typ
	- Skládá se z **pevně daného počtu prvků**
	- **Je homogenní** – všechny prvky v něm uložené jsou stejného typu
	- **Počet prvků se stanoví při inicializaci** (vytvoření) pole a pak již **nelze změnit**
	- **Počet prvků je délka pole**, která je v **poli kromě prvků rovněž uložená**
- Indexy
	- Jednotlivé prvky pole jsou **přístupné pomocí indexů**
	- V Javě má index vždy hodnoty 0 až délka pole - 1

#### Deklarace a vytvoření pole
- Pole je podobné třídám a objektům
	- V podstatě se jedná o speciální třídu a při inicializaci pole vytváříme její „instanci“ uloženou na haldě
- Je potřeba deklarovat referenční proměnou a vytvořit novou „instanci pole“ operátorem ```new```
	- Stejně jako u objektů je možné udělat obojí najednou, nebo nejprve deklarovat referenční proměnou a později vytvořit nové pole
	- ```datovýTyp[] proměnná = new datovýTyp[početPrvků];```
	- Při vytváření nového pole se udává počet prvků (v hranatých závorkách „[“ a „]“), které bude pole obsahovat
	- Typ prvků pole může být libovolný
		- Libovolný základní datový typ
		- Libovolná třída
- Protože proměnná typu pole je referenční, může být ```null```
	- Pokud se jedná o lokální proměnnou a nevytváříme pole hned při deklaraci jeho referenční proměnné, je rozumné inicializovat referenční proměnnou na ```null```
	- Pokud se jedná o proměnnou instance nebo třídy, je inicializována na ```null``` implicitně
- Při vytvoření pole jsou jeho jednotlivé prvky implicitně inicializovány na ```0, 0.0, false``` nebo ```null``` podle datového typu pole
	- I v případě, že referenční proměnná ukazující na pole je lokální
- Vytvoření pole výčtem hodnot
	- Pole je kromě operátoru ```new``` možné vytvořit i výčtem jeho hodnot uvedeným ve složených závorkách ```„{“``` a ```„}“```
	- Např. ```int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13};```
	- Pole má stejné vlastnosti jako pole vytvořené operátorem ```new``` – délku pole určí překladač podle počtu prvků
	- Často používáno jako vzorová data pro usnadnění ladění, nebo uložení pole konstantních hodnot
	- POZOR! – Takto definované pole nemá konstantní prvky, **jeho prvky lze libovolně měnit**, např. ```fibonacci[3] = -6;```
	- POZOR!
		- Samotným výčtem hodnot lze pole vytvořit POUZE PŘI DEKLARACI
		- Pokud chceme přiřadit do existující referenční proměnné nové pole výčtem hodnot, musí samotnému výčtu předcházet vytvoření pole operátorem ```new``` bez udání počtu prvků
		- proměnná = ```new datovýTyp[] {hodn1, hodn2, …};```
		- Např. ```fibonacci = new int[] {1, 1, 2, 3};```
- Konstantní pole
	- Použití klíčového slova ```final``` nezajistí, aby prvky pole po prvním přiřazení nešly změnit
	- ```final``` pouze zajistí konstantnost referenční proměnné – nelze do ní již přiřadit jinou hodnotu (tj. jiné pole)
		- Prvky pole, na které ukazuje ```final``` referenční proměnná lze ale měnit bez problémů
		- To samé platí pro referenční proměnné a instance tříd – hodnoty atributů (proměnných) instance lze měnit, i když je referenční proměnná ukazující na instanci označena jako ```final```

#### Přístup k prvkům pole a jeho délka
- K jednotlivým prvkům pole se přistupuje pomocí indexu
	- Index se zapisuje za referenční proměnou do hranatých závorek
	- ```proměnná[index]```
- Prvek pole se chová stejně jako proměnná odpovídajícího datového typu
	- Lze do něj zapisovat hodnotu
	- Lze z něj číst hodnotu
	- Např. ```teploty[0] = 17.5;```
	- Např. ```double teplota = teploty[0];```
- Délka pole
	- Každé pole má v sobě informaci o délce uloženou v proměnné ```length```
		- Volá se přes tečkovou notaci stejně jako proměnná instance nad referenční proměnnou pole 
		- Např. ```int pocetTeplot = teploty.length;```
	- První prvek pole má index 0
		- ```Např. double prvniTeplota = teploty[0];```
	- Poslední prvek pole má index ```pole.length – 1```
		- Např. ```double posledniTeplota = teploty[teploty.length - 1];```
	- Index mimo rozsah pole
		- POZOR! – Při pokusu o přístup k prvkům se záporným indexem nebo indexem větším nebo rovným délce pole, dojde k chybě za běhu programu (nikoliv při překladu) – je vyhozena výjimka ```ArrayIndexOutOfBoundsException```
- Použití pole jako parametr metody 
	- Pole může být použito jako parametr metody (stejně jako primitivní datový
typ nebo třída)
	- POZOR! – Stejně jako u tříd a instancí platí, že změny provedené v hodnotách pole předaného do metody jako parametr se projeví vně metody

#### Výpis celého pole, inicializace stejnou hodnotou
- Pro práci s poli existuje utility třída ```java.util.Arrays```
	- Obsahuje statické metody (podobně jako třída ```Math```) pro práci s poli
- Výpis celého pole
	- Metoda ```Arrays.toString()```
		- Převede celé pole na řetězec, který lze následně vypsat např. metodou ```System.out.println();```
		- POZOR!
			- Sama metoda řetězec pouze vrací, nevypisuje ho
			- Podobně jako metoda instance toString() u objektů 
	- Pokud necháme vypsat pole metodou ```System.out.println()``` přímo (bez metody ```Arrays.toString()```), vypíše se pouze identifikace „instance pole“
		- Podobně jako implicitní implementace metody instance ```toString()``` u objektů
		- Např. volání ```System.out.println(vektor1);``` vypíše např. [D@1b6d3586 (čísla za „@“ se budou při různých spuštěních lišit) 
- Inicializace prvků pole stejnou hodnotou 
	- Prvky pole jsou při vytvoření implicitně inicializovány na ```0, 0.0, false``` nebo ```null``` podle datového typu pole
	- Pokud je potřeba inicializovat pole jinou hodnotou (stejnou pro všechny prvky), je možné využít metodu ```Arrays.fill(pole, hodnota);```
		- Např. ```Arrays.fill(ciselnaRada, 1);``` naplní všechny prvky pole ```ciselnaRada``` hodnotou ```1```
			- Metoda je překrytá pro pole všech základních datových typů a pole typu ```Object```
	- Existuje i varianta s určením počátečního a koncového indexu vyplnění pole ```Arrays.fill(pole, indexOd, indexDo, hodnota);```
	Např. ```Arrays.fill(ciselnaRada, 0, 2, 10);``` naplní první dva prvky (**počáteční index je včetně**, **koncový není včetně**) pole ```ciselnaRada``` hodnotou ```10```

#### Použití zápisu ```for - each```
- Pokud nepotřebujeme pracovat s indexem pole a stačí nám postupný přístup ke všem jednotlivým prvkům, je možné použít zkrácený zápis cyklu ```for``` (známý též jako ```for - each```)
	- ```for (datovýTyp prvek: pole)```
	- Cyklus zaručí, že se dostane na všechny prvky – projde se celé pole od začátku do konce
	- V každé obrátce cyklu je v proměnné prvek následující prvek pole
	- Běžně se používá pro pole (a kolekce – viz předmět KIV/PPA2) objektů 

#### Pole jako tabulka, přepočet indexů
- Tabulka
	- Datová struktura obsahující dvojice klíč a hodnota
	- Pro daný klíč můžeme získat hodnotu
	- Viz předměty KIV/PPA2 a KIV/PT
- Pole se dá použít jako jednoduchá tabulka
	- Index může sloužit jako klíč
	- Hodnota prvku pole jako hodnota
	- Indexy pole začínají vždy od 0 – pokud je potřeba jiný začátek klíčů, je potřeba přepočet

#### Reprezentace množiny polem
- Množina
	- Soubor prvků (např. čísel) chápaných jako celek
	- Každý prvek může být obsažen v množině maximálně jednou
- Pro reprezentaci množiny lze využít pole typu ```boolean[]```
	- Indexy odpovídají prvkům množiny
	- Hodnoty prvků pole udávají, zda prvek je přítomný v množině (```true```) nebo není (```false```)

### Pole objektů
- Prvkem pole můžou být kromě základních datových typů i instance
	- Použití se nijak neliší, jen je potřeba nezapomenout vytvořit instance jednotlivých prvků, což se u základních datových typů nedělá

#### Deklarace pole objektů a jeho inicializace
- Deklarace a vytvoření pole se neliší od polí základních datových typů
	- Je potřeba deklarovat referenční proměnnou a vytvořit novou „instanci pole“ operátorem ```new```
	- ```Třída[] proměnná = new Třída[početPrvků];```
	- Např. ```Vysledek[] vysledky = new Vysledek[POCET];```
	- Opět je možné nejprve deklarovat referenční proměnnou a později vytvořit nové pole
	- Jednotlivé prvky referenční proměnné na instance třídy odpovídající typu pole
		- Po vytvoření pole jsou všechny implicitně inicializovány na hodnotu ```null```
		- POZOR! – V tomto okamžiku (po vytvoření pole) tedy jednotlivé instance prvků neexistují – dosud nebyly vytvořeny operátorem ```new```
- Vytvoření instancí prvků pole
	- Instanci každého prvku je potřeba vytvořit zvlášť, typicky v cyklu ```for```

#### Přístup k prvkům pole a k proměnným a metodám instance prvků
- Přístup k prvkům pole je stejný jako u polí základních datových typů pomocí indexu v hranatých závorkách „[“ a „]“ 
- Jednotlivé prvky jsou referenční proměnné ukazující na jednotlivé instance
	- Přístup k atributům a metodám instance je přes tečkovou notaci použitou nad prvkem pole

### Vícerozměrná pole
- Pole může mít více rozměrů
	- Často se využívají dvourozměrná (např. pro uložení matic), ale mohou být i tří a vícerozměrná
	- Pole s více než třemi rozměry většinou nemají reálné opodstatnění
	- Pro určení požadovaného prvku pole je potřeba více indexů
		- Počet odpovídá počtu rozměrů pole
- Vícerozměrné pole jako **pole polí**
	- Dvourozměrné pole v Javě je ve skutečnosti jednorozměrné pole referenčních proměnných, kde každá ukazuje na jednorozměrná pole (tj. „řádku“)
		- Díky tomu má každé jednorozměrné pole svou délku, kterou je možné zjistit, a dvourozměrné pole ji má též
		- Z dvourozměrného pole tak lze zjistit jeho počet řádek i sloupců
		- Každé jednorozměrné pole může mít jinou délku
	- Trojrozměrné pole v Javě je pak jednorozměrné pole referenčních proměnných, kde každá ukazuje na dvourozměrné pole, atd.

#### Deklarace a vytvoření vícerozměrného pole
- Deklarace referenční proměnné pro vícerozměrné pole je podobná jako pro jednorozměrné
	- Pouze obsahuje více prázdných párů hranatých závorek „[]“ – jeden pár pro každý rozměr pole
	- ```datovýTyp[][]…[] proměnná;```
	Např. ```double[][] prvkyMatice;```
- Vytvoření všech rozměrů najednou
	- Nejběžnější použití vícerozměrných polí
	- Počty prvků ve všech rozměrech pole udány najednou
		- V případě dvourozměrného pole má každý řádek stejnou šířku
		- Tzv. pravoúhlé pole – pole tvoří pravoúhlý obrazec – obdélník, kvádr, teserakt, atd.
	- ```proměnná = new datovýTyp[počet1][počet2]…[početN];```
	- Např. ```prvkyMatice = new double[vyska][sirka];```
- Vytvoření rozměrů postupně
	- Počty prvků v jednotlivých rozměrech udány postupně
	- Nejprve vytvoříme „vnější“ pole a pak do jeho jednotlivých prvků přiřadíme nové „instance“ „vnitřních“ polí
		- V případě dvourozměrného pole může mít každý řádek různou délku
		- Pole je „zubaté“ 
	- ```proměnná = new datovýTyp[počet1][]…[];```
	- POZOR!
		- Musí se vždy začínat rozměrem nejvíc vně (tj. první závorky zleva)
		- Nelze ```proměnná = new datovýTyp[][počet2]…[];```
- Vytvoření pole výčtem hodnot
	- I vícerozměrné pole je možné vytvořit výčtem hodnot
		- Pole může být pravoúhlé i „zubaté“
	- Platí stejná pravidla, jako při vytváření jednorozměrného pole
		- Použití samotného výčtu je možné pouze při deklaraci, při pozdějším vytvoření pole je nutné použít i operátor ```new```

#### Přístup k prvkům pole
- Pro přístup k jednotlivým prvkům vícerozměrného pole se používá více indexů
	- Počet indexů odpovídá počtu rozměrů pole
- Použití méně indexů než je rozměrů pole
	- Při použití méně indexů se nedostaneme k prvku pole, ale k poli s menším rozměrem
	- Např. pokud máme dvourozměrné pole a použijeme pouze jeden index, dostaneme se k jednorozměrnému („vnitřnímu“) poli, tj. k „řádce“ pole
	- V okamžiku, kdy se dostaneme na „vnitřní“ pole, můžeme zjistit jeho délku
		- To se velmi často využívá
		- Funguje dobře při procházení vícerozměrného pole, i pokud je pole „zubaté“
- Příklady přístupu k prvkům pole a k „vnitřním“ polím kvůli jejich délce je na
	- Deklarace a vytvoření pole ```jednotkovaMatice```
- Kompletní příklad na použití dvojrozměrných polí k násobení matic (v kombinaci s objekty)
	- Použitá třída ```Matice```

### Pole v paměti
- Pole je ve skutečnosti instance speciální třídy a je celé uloženo na haldě (heap)
	- Jak to vypadá v paměti při práci s poli, je demonstrováno na příkladu s polem primitivního datového typu a na příkladu s polem objektů
- **Pole nulové délky**
	- Pole může mít délku 0 prvků
	- Pak nemá žádný prvek, do kterého by šla zapsat hodnota, ale může být použitelná informace o nulové délce
- Rozdíl oproti referenční proměnné pole rovné ```null```
	- **Referenční proměnná pole rovná null** neukazuje na žádné pole (**žádné pole není na haldě**)
	- Pole nulové délky na haldě existuje a ukazuje na něj referenční proměnná, neobsahuje ale žádný prvek

#### Pole primitivních datových typů v paměti
- Pole primitivních datových typů ve své „instanci“ **přímo obsahuje hodnoty jednotlivých prvků**

## Ověřování správnosti programu, ladění
- Při vytváření programů je do zdrojového kódu (neúmyslně) zaneseno mnoho různých chyb od překlepů přes neošetření hraničních případů až po logické chyby v celkovém chování programu
- Část chyb odhalí překladač (a upozorní nás na ně IDE nástroj) – chyby při překladu
- Část chyb překladač neodhalí a program jde přeložit
	- POZOR!
		- Pokud jde program přeložit, neznamená to, že funguje správně!
		- Program může (někdy nebo vždy) dávat nesprávné výsledky
		- Může docházet k chybám za běhu programu
- Chyby, které překladač neodhalí (chyby za běhu programu), je třeba najít a opravit opakovaným opravováním, překládáním a spouštěním programu s využitím vhodných vstupních dat
	- Tato činnost se nazývá ladění (častěji debugging)
- Lze provádět ručně nebo s využitím specializovaného nástroje zvaného debugger – součást téměř všech IDE nástrojů
	- Často se používá kombinace obou přístupů
- Vyšší fází ladění je testování
	- Zjišťuje se, zda program pracuje správně pro všechny typy vstupů, zda reaguje správně na neplatné vstupy apod.
	- Podrobně viz předmět KIV/OKS

### Odhalení chyb při psaní zdrojového kódu a při překladu
- Překladač ```javac``` umí odhalit především syntaktické chyby
	- Často způsobené překlepy v názvech proměnných, metod, zapomenutím na import třídy, zapomenutím deklarace proměnné, atd.
	- Všechny nalezené chyby jsou vypsány při překladu
- Překlad v příkazové řádce
	- Pokud překládáme program ručně v příkazové řádce příkazem javac, objevíme chyby až po spuštění překladu
	- Protože překlad netrvá dlouho (pro malé programy), je možné provádět ho během vývoje opakovaně, např. při každém inkrementálním přidání funkcionality
		- Nalezené chyby lze průběžně odstraňovat
		- Odstranění chyby se ověří opakovaným překladem 
	- Je možné i napsat celý program a poté odstranit chyby najednou
		- Odstranění chyb se opět ověří opakovaným překladem
	- POZOR!
		- Při opakovaném překladu se počty chyb mohou snižovat i zvyšovat
		- Překladač se snaží při překladu najít co možná nejvíce chyb  tj. neskončí při první nalezené chybě, ale pokud to jde, pokračuje dále
		- Některé chyby jsou však z pohledu překladače natolik zásadní (ač z pohledu člověka vypadají banálně – např. zapomenutý středník „;“ nebo složená závorka „}“), že mu znemožní kontrolu velké části kódu
		- Po opravení takové chyby může překladač tuto přeskočenou část zkontrolovat a tím odhalit další, dosud neodhalené chyby  počet chyb může po odstranění chyby vzrůst

#### Čtení a porozumění výstupu překladače
- Výstup překladače (tj. výpis chyb při překladu) se zobrazí po skončení překladu v příkazové řádce nebo v konzoli IDE nástroje
- Výstup nemusí být stejný v IDE a v příkazové řádce

### Ladění (debugging)
- Pokud se **program podaří přeložit**, ještě to **neznamená, že funguje správně**
	- Většinou správně nefunguje, i když jde přeložit
- Chyby v chování programu neodhalí překladač, musí je najít sám programátor
- Chybné chování programu se typicky projevuje:
	- Program je předčasně ukončen s chybovým hlášením (vždy nebo někdy)
		- Je třeba rozumět chybovému hlášení
	- Program zdánlivě funguje, ale dává pro některé či všechny vstupy zcela špatné nebo částečně špatné výsledky
	- Ladění je možno provádět ručně tzv. metodou ladících výpisů a/nebo s využitím specializovaného ladícího nástroje (debuggeru)
	- POZOR!
		- Program se nedá považovat za odladěný po vyzkoušení jednoho či několika málo vstupů
		- Je potřeba zkoušet více různých vstupních hodnot, netypické hodnoty apod.
		- Je potřeba zkoušet i neplatné hodnoty, na něž by měl program adekvátně reagovat
			- To však zatím není probráno

#### Chybové hlášení za běhu programu
- Pokud dojde za běhu programu k chybě (přesněji k vyhození výjimky) a tato chyba není v programu ošetřena, program je předčasně ukončen a do konzole (či příkazové řádky) se vypíše chybové hlášení
- Chybové hlášení
	- Vypíše, o jakou chybu (výjimku) se jedná (její název a někdy i popis)
	- Vypíše tzv. stack trace (výpis zásobníku)
		- Zjednodušený obsah zásobníku (stack) programu v okamžiku, kdy k chybě došlo
		- Obsahuje volání metod – je jasné, v jaké metodě přesně došlo k chybě (první uvedená metoda) a ze které metody byla tato metoda volána (další uvedená metoda)
		- Následují další metody, které byly hierarchicky volány až k metodě ```main()```
		- V jednoduchých programech je většinou zobrazeno i číslo řádky, na které k chybě došlo
	- Hlášení o chybách za běhu programu typicky vypadají stejně v příkazové řádce i v konzoli IDE nástroje

#### Metoda ladících výpisů
- Metoda ladících výpisů se používá, **pokud nemáme k dispozici debugger**, nebo ho z nějakého důvodu nechceme použít
- Na vhodná místa programu vložíme volání metody System.out.println()
	- Můžeme vypisovat hodnoty důležitých proměnných
	- Můžeme pomocí výpisu unikátních značek (tj. textů) určit, kde se program
- přesně nachází (podle toho, co a v jakém pořadí program vypíše)

#### Použití debuggeru v Eclipse
- Debugger umožňuje dělat automaticky to, co musíme ručn pomocí kontrolních výpisů a umožňuje mnohem více
	- Sledování hodnot vybraných proměnných a výrazů
	- Krokování programu řádku po řádce
	- Nastavení breakpointů – bodů, ve kterých se program zastaví a umožní od něj krokování 
- Spuštění debuggeru v Eclipse
	- Vytvoření breakpointu
		- Pro zapnutí debuggeru je potřeba nastavit breakpoint, tedy bod, od kterého bude program krokován
		- Breakpoint se na určitou řádku nastaví dvojklikem vlevo od požadované řádky
		- Alternativou je kliknout pravým tlačítkem na stejné místo => vybrat Toogle breakpoint
		- Přítomnost breakpointu na řádce je indikována symbolem
		- Stejným způsobem lze breakpoint odstranit
	- Spuštění debuggeru
		- Mít aktivní třídu s breakpointem
		- Debug as… => Java Application
		- Pokud si Eclipse není jistý, který program chcete debuggovat, dá vám na výběr
		- Pokud není zvolen žádný breakpoint, program proběhne jako při normálním spuštění
	- Po spuštění debuggeru program běží normálně, dokud nedosáhne breakpointu
		- Potom se objeví dotaz, zda chceme spustit debug perspektivu, která přepne rozložení oken Eclipse 
- Popis debug perspektivy v Eclipse
	- Okno zásobníku
		- Ukazuje, v jaké části programu se právě nacházíme
		- Jde o zobrazení části paměti zásobník obsahující rámce pro jednotlivé volání metod
		- Toto okno příliš nevyužíváme
	- Okno editoru
		- Okno se zdrojovým kódem
		- V debug perspektivě se zpravidla nepoužívá pro úpravu kódu
		- Zelený pruh určuje řádku, na které se program právě nachází při jeho krokování
		- Jsou vidět nastavené breakpointy
		- Nejdůležitější okno debuggeru
	- Okno se strukturou programu (outline)
		- Zobrazuje strukturu programu (jednotlivé třídy a metody)
		- Toto okno příliš nevyužíváme
	- Okno konzole
		- Okno, do kterého se vypisuje výstup programu
		- Uživatel zde rovněž zadává vstup programu, pokud je třeba
	- Okno sledování proměnných
		- Zde můžeme sledovat všechny proměnné a jejich aktuální hodnoty během krokování programu
		- Druhé nejdůležitější okno debuggeru
		- V záložce Breakpoints je seznam všech nastavených breakpointů
- Ovládání debuggeru
	- V okamžiku, kdy se program zastaví na breakpointu, lze pokračovat v jeho krokování různými způsoby
		- Step Into - též klávesa [F5]
			- Provede jeden krok programu
			- Pokud je tímto krokem volání metody, skočí do této metody
		- Step Over – též klávesa [F6]
			- Provede jeden krok programu
			- Pokud je tímto krokem volání metody, provede ji celou jako jeden krok (tj. do metody neskočí) 
		- Step Return – též klávesa [F7]
			- Provede všechny zbývající příkazy v metodě, vyskočí z ní a zastaví se na dalším řádku volající metody
		- Resume – též klávesa [F8]
			- Provede všechny příkazy od aktuální pozice až k dalšímu breakpointu (nebo do ukončení programu) normálně (tj. bez krokování)
		- Terminate – též [Ctrl]+[F2]
			- Ukončí provádění programu
	- Nastavení filtrů krokování (step filters)
		- Umožní omezit, do kterých metod je možné při krokování skočit
			- Např. nechceme, abychom se při krokování dostali do knihovních tříd a metod Java Core API
		- Zapnutí filtrů krokování (Use Step Filters – též [Ctrl]+[F5])
			- Pokud je tlačítko zapnuté, filtry jsou použity a do vybraných balíků nevstoupí ani možnost Step Into
		- Sledování hodnot proměnných (okno sledování proměnných)
			- Záložka Variables
			- Automaticky zobrazuje platné lokální proměnné a jejich hodnoty
			- Pro zobrazení statických proměnných a konstant je nutné je zaškrtnout
				- => Java => Show Constants a Show Static Variables
		- Zobrazení aktuální hodnoty proměnné
			- Stačí kurzorem myši najet v okně editoru na proměnnou, která nás zajímá 
- Díky debuggeru přesně vidíme, co se v programu děje, jaké jsou hodnoty proměnných
	- Podstatně komfortnější, než kontrolní výpisy
	- Lze vyzkoušet na odhalení chyb v programu pro výpočet faktoriálu

## Řetězce a práce s nimi
- Třída ```String```
	- Jedna z nejpoužívanějších tříd z Java Core API
	- Řetězcové konstanty (literály – texty uzavřené do uvozovek, např. "Ahoj") používáme od začátku předmětu KIV/PPA1

### Specifické vlastnosti třídy String
- ```String``` je třída, jednotlivé řetězce (tj. texty) jsou její instance uložené na haldě (na heapu)
- Z praktických důvodů má však některé vlastnosti, které u jiných tříd nejsou

#### Vytvoření řetězce bez operátoru new
- Jak bylo vidět ve všech příkladech, které dosud vypisovaly text, instance třídy ```String``` může vzniknout i bez operátoru ```new```
	- Vznikne zápisem literálu (nepojmenované konstanty)
		- Např. ```String pozdrav = "Ahoj!";```
		- Např. ```System.out.println("Nazdar!");```
	- Tento postup jsme používali dosud (aniž jsme věděli o tom, že vznikají instance třídy ```String```)
	- Tento postup se používá běžně
- Je možné i přímo vytvořit novou instanci třídy String operátorem ```new```
	- Třída ```String``` obsahuje několik konstruktorů umožňující vytvořit řetězec z pole znaků, pole bytů, atd.
	- Je možné i vytvořit nový řetězec z jiného řetězce
		- Např. ```String pozdrav = new String("Ahoj!");```
		- Tento zápis NEPOUŽÍVAT
		- Protože samotný zápis literálu "```Ahoj```" způsobí vytvoření nové instance třídy ```String```, volání new ```String()``` zbytečně vytvoří další instanci

#### Konstantnost řetězce
- Řetězce v Javě (tj. instance třídy ```String```) jsou konstantní, neměnné (immutable)
	- Nelze do nich přidávat text, mazat, nebo měnit jednotlivé znaky
	- Veškeré metody zdánlivě upravující řetězec ve skutečnosti vytvoří novou instanci třídy ```String``` a text v původní instanci zůstane nedotčen
- Existují třídy pro práci s měnitelným řetězcem
	- Třída StringBuilder
	- Třída StringBuffer
	- Přesto si ve většině případů vystačíme s třídou ```String```
		- To, že při změně obsahu řetězce dojde k vytvoření nové instance a původní zůstane nezměněná, nám nevadí (v podstatě si toho nevšimneme)

#### Spojení řetězců pomocí operátoru „+“ (zřetězení)
- Od začátku jsme běžně používali
	- Především v metodě ```System.out.println()```
- Operátor „+“ spojí dva řetězce (operandy) a vytvoří novou instanci obsahující texty obou řetězců (operandů)
- Operátor „+“ také umožňuje připojit k řetězci libovolný datový typ
	- Hodnota daného typu se převede na řetězec
	- Alespoň jeden operand musí být řetězec, pokud ne, má operátor „+“ význam sčítání
		- Pro přehlednost je lepší začínat řetězcem, pokud nechceme začínat uvozujícím textem, lze použít prázdný řetězec
	- Časté je použití přímo v metodě ```System.out.println()```

### Práce s řetězci
- Metody pro práci s řetězci jsou převážně **metody instance třídy String**
- Proto se volají nad referenční proměnnou ukazující na instanci řetězce
	- ```referenčníProměnná.názevMetody(parametry);```
	- Např. ```pozdrav.charAt(0);```
	- Stejné jako u jiných objektů
- Protože instance řetězce vznikne pouhým zapsáním literálu, lze nad ním rovnou volat metody bez nutnosti použití referenční proměnné
	- Např. ```"Ahoj".charAt(0); //Funkcni ale nepouzivat```
	- NEPOUŽÍVAT!

#### Práce s jednotlivými znaky a délka řetězce
- Řetězec si lze představit jako speciální konstantní pole znaků
	- Ale jedná se o instanci třídy, nelze s ní pracovat jako s polem – tj. přistupovat k jednotlivým znakům pomocí hranatých závorek „[“ a „]“
	- Pole znaků (tj. ```char[]```) je uvnitř řetězce skutečně obsaženo
- Pro následující příklady předpokládejte deklaraci
	- ```String pozdrav = "Nazdar";```
- Délka řetězce
	- Metoda ```length()```
		- POZOR! – Je to metoda, nikoliv proměnná, jako u polí (tj. musí se uvést závorky)
		- Vrací počet znaků řetězce (včetně bílých znaků)
	- ```int delka = pozdrav.length(); //delka bude 6```
- Znak na zadané pozici
	- Metoda ```charAt(indexZnaku)```
	- Znaky mají index podobně jako prvky pole číslované od 0 do délka řetězce - 1
	- ```char znak = pozdrav.charAt(0); //znak bude 'N'```
- Index prvního výskytu znaku/podřetězce
	- Metoda ```indexOf(znak/podřetězec)```
	- Vrátí index prvního výskytu znaku (podřetězce) v řetězci, nebo -1, pokud znak (podřetězec) není nalezen
	- ```int index1 = pozdrav.indexOf('a'); //index1 bude 1```
	- ```int index2 = pozdrav.indexOf("zd"); //index2 bude 2```
	- ```int index3 = pozdrav.indexOf("j"); //index3 bude -1```
- Index posledního výskytu znaku/podřetězce
	- Metoda ```lastIndexOf```(```znak/podřetězec```)
	- Vrátí index posledního výskytu znaku (podřetězce) v řetězci, nebo -1, pokud znak (podřetězec) není nalezen
	- ``int li1 = pozdrav.lastIndexOf('a'); //li1 bude 4``
	- ```int li2 = pozdrav.lastIndexOf("Na "); //li2 bude 0 ```
- Náhrada všech výskytů znaku v řetězci
	- Metoda ```replace(puvodníZnak, novýZnak)```
	- ```String s2 = pozdrav.replace('a', 'e'); //"Nezder"```

#### Porovnání řetězců
- Řetězce jsou instance třídy ```String```
- Porovnání pomocí operátoru „```==```“, pouze zjistí, zda se jedná o stejné instance **nepoužívat**
- **Porovnání podle obsahů** (důsledně včetně velikosti písmen) – **shodné/rozdílné**
	- Metoda ```equals```(```jinýŘetězec```)
	- Výsledek ```true``` (řetězce jsou shodné) nebo ```false``` (řetězce jsou rozdílné)
- Porovnání podle obsahů **bez ohledu na velikost písmen** – **shodné/rozdílné**
	- Metoda ```equalsIgnoreCase```(```jinýŘetězec```)
	- Výsledek ```true``` (řetězce jsou shodné bez ohledu na velikost písmen) nebo ```false``` (řetězce jsou rozdílné bez ohledu na velikost písmen) 
- Porovnání podle obsahů (**důsledně včetně velikosti písmen**) – **větší/menší/stejný**
	- Metoda ```compareTo```(```jinýŘetězec```)
	- Výsledek 0 (řetězce jsou shodné), nebo záporné číslo (první řetězec je „menší“ než druhý – tj. je blíže začátku abecedy), nebo kladné číslo (první řetězec je „větší“ než druhý – tj. je dále od začátku abecedy)
	- Výsledek 0 (řetězce jsou shodné), nebo záporné číslo (první řetězec je „menší“ než druhý – tj. je blíže začátku abecedy), nebo kladné číslo (první řetězec je „větší“ než druhý – tj. je blíže konci abecedy)
- POZOR! – Návratové hodnoty metod ```compareTo…()```
	- Vrácené záporné a kladné číslo (když řetězce nejsou shodné) nemusí být (a není) jen -1 nebo 1
	- Návratovou hodnotu metody je třeba porovnávat pomocí operátorů „>“ a „<“, nikoliv porovnáním operátorem „==“ s -1 či 1 
- **Test začátku a konce řetězce**
	- Výsledek ```true```, pokud řetězec začíná/končí zadaným podřetězcem, jinak vrací ```false```
	- Metoda ```startsWith(prefix)```
	- Metoda ```endsWith(postFix)```
	- Metoda ```startsWithIgnoreCase(prefix)```
	- Metoda ```endsWithIgnoreCase(postFix)```

#### Získání podřetězce z řetězce
- Stále předpokládáme deklaraci ```String pozdrav = "Nazdar";```
- Získání podřetězce od zadaného indexu (**včetně**) do konce
	- Metoda ```substring(indexOd)```
	- ```String p1 = pozdrav.substring(2); //p1 bude "zdar"```
- Získání podřetězce od zadaného indexu (**včetně**) do zadaného indexu (**vyjma**)
	- Metoda ```substring(indexOd, indexDo)```
	- ```String p2 = pozdrav.substring(0, 2); //p2 bude "Na"```
- Odstranění bílých znaků ze začátku a konce řetězce
	- Metoda ```trim()```
	- Uvažujme deklaraci ```String bz = "\r\n \tahoj \t\n\r";```
	- ```String oriznuty = bz.trim(); //oriznuty bude "ahoj"```

### Konverze řetězce na jiné datové typy a obráceně
- Relativně časté operace
	- **Převod řetězce na číselný datový typ**
		- Typicky při vstupu (když nepoužíváme Scanner, nebo je vstup komplikovanější, nebo v GUI)
		- Číselný datový typ je potřeba, abychom mohli provádět aritmetické operace
		- ```Např. "1" + "2" je řetězec "12", ale 1 + 2 je 3```
	- **Převod čísla na řetězec**
		- Implicitně se provádí při každém výstupu
		- Explicitně, když chceme využít operace nad řetězci např. pro čísla (např. zjištění počtu znaků (tj. číslic), zřetězení s řetězcem)
	- **Převod instance (objektu) na řetězec**
		- Pokud chceme instanci vypsat

#### Konverze řetězce na jiné datové typy
- Pro základní datové typy se používá metoda ```Typ.parseTyp(řetězec)``` z příslušné obalovací třídy základního datového typu 
	- Jedná se o metody třídy, volá se s názvem třídy, není potřeba vytvářet instanci
		- Např. ```int i = Integer.parseInt("42");```
		- Např. ```long l = Long.parseLong("2444111333");```
		- Např. ```double d = Double.parseDouble("5.972E24");```
		- Např. ```boolean b = Boolean.parseBoolean("false");```
	- Pro objekty
		- Není žádný standardní a obecný postup pro převod řetězce na instanci jiné třídy 

#### Konverze jiných datových typů na řetězec
- Běžně se využívá schopnost operátoru zřetězení „+“ převádět jiné datové typy (základní datové typy a instance tříd) na řetězec
	- Pro základní datové typy funguje přímočaře
	- Pro objekty také – objekt se převede na řetězec implicitním voláním metody ```toString()```
		- Pokud je metoda ```toString()``` překryta, funguje dobře
- Pro pole je potřeba použít metodu třídy ```Arrays.toString(pole)```
	- Pokud se použije pouze operátor „+“, použije se implicitní textová reprezentace pole (např. ```[I@15db9742```)
- Pro základní datové typy existuje další možnost – metoda ```Typ.toString (hodnota)``` z příslušné obalovací třídy základního datového typu
	- Např. ```String s = Integer.toString(42); //s bude "42"```
- Pro základní datové typy a pro instance tříd existuje další možnost – metoda třídy ```valueOf(hodnota)``` třídy ```String```
	- Metoda je překrytá pro všechny základní datové typy a objekty
	- Např. ```String s = String.valueOf(42) //s bude "42"```

### Rozdělení řetězce na podřetězce
- Často je potřeba **rozdělit řetězec na několik podřetězců** podle oddělovače (mezer, bílých znaků, čárek, teček, pomlček či jiné interpunkce či jiného znaku)
	- Metoda instance ```split(regulárníVýraz)``` ve třídě ```String```
	- Metoda má jako parametr regulární výraz
		- Regulární výraz
			- Řetězec popisující celou množinu řetězců => mnohé znaky tak mají speciální význam 
		- Parametrem tedy není jen znak, podle kterého se má řetězec rozdělit 
		- Některé znaky (např. mezera) nemají speciální význam a lze je tak použít bez problémů (tj. ```split(" ")```)
		- Některé znaky mají speciální význam a je třeba použít tzv. „escape“ sekvenci
			- Zpětné lomítko „\“ před znak, který chceme použít => zruší se tím speciální význam znaku
			- Protože však zpětné lomítko má speciální význam i v řetězcových a znakových literálech (umožňuje napsat speciální znaky, např. konec řádky „\n“), je třeba napsat zpětná lomítka
	- Metoda vrací pole řetězců, délka pole záleží na počtu podřetězců dvě „\\“

### Proměnný řetězec
- V některých případech (ač jich není mnoho) opravdu potřebujeme, aby se při každé změně textu řetězce nevytvářela nová instance => je potřeba měnitelný (mutable) řetězec
	- Pokud provádíme v řetězci mnoho změn a použili bychom třídu ```String```, **vytvářelo by se mnoho instancí** – pro každou změnu se vytvoří nová, což zbytečně zabírá paměť a zpomaluje program (vytvoření instance nějakou dobu trvá)
	- Pokud by šel **řetězec měnit**, vystačíme si s jednou instancí

#### Třída StringBuilder
- **Proměnný/měnitelný řetězec** (sekvence znaků)
- Vytvoření instance třídy ```StringBuilder```
	- Lze zadat řetězec, nebo kapacitu 
		- Kapacita se udává kvůli efektivitě – pokud je dostatečná, nemusí se během práce s řetězcem (při jeho prodloužení) kapacita navyšovat
		- Je však možné do instance třídy ```StringBuilder``` vložit/přidat řetězec nebo jiný datový typ (viz níže) a překročit aktuální kapacitu kapacita se automaticky navýší
	- Např. ```StringBuilder sb1 = new StringBuilder("Ahoj");```
	- Např. ```StringBuilder sb2 = new StringBuilder(100);```
- Práce se znaky
	- Zjištění konkrétního znaku
		- Metoda ```charAt(index)```
		- Vrátí znak na zadaném indexu
		- Např. ```int i = sb1.charAt(3); //'o'```
	- Nastavení konkrétného znaku
		- Metoda ```setCharAt(index, znak)```
		- Nastaví znak na zadaném indexu na zadaný znak
		- Např. ```sb1.setCharAt(0, 'E'); //"Ehoj"```
- Délka řetězce
	- Zjištění délky uloženého řetězce
		- Metoda ```getLength()```
		- Vrátí délku řetězce
		- Např. ```int d1 = sb1.getLength(); //4```
		- Např. ```int d2 = sb2.getLength(); //0```
- Nastavení délky řetězce
	- Metoda ```setLength(délka)```
	- Nastaví délku řetězce
	- Pokud se řetězec prodlužuje, přidané znaky budou mít hodnotu 0
	- Pokud se řetězec zkracuje, znaky nad zadanou délku se oříznou
	- Např. ```sb2.setLength(10); //10 znaků hodnoty 0```
	- Např. ```sb2.setLength(0); //Prazdny retezec```
- Převrácení řetězce 
	- Metoda ```reverse()```
	- Převrátí pořadí znaků
	- Např. ```sb1.reverse(); //"johE"```
- Přidání/vložení libovolného datového typu
	- Přidání libovolného datového typu
		- Metoda ```append(hodnota)```
		- Metoda překryta pro všechny základní datové typy, ```Object```, ```String``` a ```StringBuilder```
		- Např. ```sb2.append(true); //"true"```
		- Např. ```sb1.append(sb2); //"johEtrue"```
	- Vložení libovolného datového typu
		- Metoda ```insert(index, hodnota)```
		- Metoda překryta pro všechny základní datové typy, ```Object``` a ```String```
		- Znaky na pozici ```index``` a dále se odsunou o počet vložených znaků
		- Např. ```sb1.insert(3, 42); //"joh42Etrue"```
	- Smazání podřetězce či znaku
		- Smazání podřetězce
			- Metoda ```delete(začátek, konec);```
			- Smaže podřetězec začínající na pozici začátek a končící před pozicí ```konec```
			- Např. ```sb1.delete(2, 5); //"joEtrue"```
		- Smazání znaku
			- Metoda ```deleteCharAt(index)```
			- Smaže znak na zadaném indexu
			- Např. ```sb1.deleteCharAt(2); //"jotrue"```

#### Třída StringBuffer
- Proměnný/měnitelný řetězec (sekvence znaků), která má téměř stejné metody a téměř stejné použití jako třída ```StringBuilder```
	- Starší a pomalejší
	- Vhodný, pokud má s proměnným řetězcem pracovat více vláken (viz předmět KIV/PGS)

### Třída Character
- Obalovací třída pro základní datový typ ```char```
- Obsahuje mnoho konstant důležitých pro práci s různými speciálními znaky (např. z jiných abeced než latinky)
- Obsahuje mj. metody pro určení typu znaku

#### Určení typu znaku
- Metody pro určení typu znaku třídy ```Character```
	- Jedná se o metody třídy, volají se nad názvem třídy, vrací ```true```, pokud znak je daného typu (podle názvu metody), jinak vrací ```false```
	- Metody pracují správně i pro speciální znaky (které např. nejsou z latinky)
	- Metoda ```isDigit(znak)```
		- Zjistí, jestli je zadaný znak číslice
		- Např. ```Character.isDigit('3'); //true```
		- Např. ```Characet.isDigit('A'); //false```
	- Metoda ```isLetter(znak)```
		- Zjistí, jestli je zadaný znak písmeno
		- Např. ```Character.isLetter('3'); //false```
		- Např. ```Character.isLetter('A'); //true```
	- Metoda ```isLetterOrDigit(znak)```
		- Zjistí, jestli je zadaný znak písmeno nebo číslice
		- Např. ```Character.isLetterOrDigit('3'); //true```
		- Např. ```Character.isLetterOrDigit('A'); //true```
	- Metoda ```isWhitespace(znak)```
		- Zjistí, jestli je zadaný znak bílý znak
		- POZOR! – druhé „```s```“ v názvu metody je také malé
		- Např. ```Character.isWhitespace(' '); //true```
		- Např. ```Character.isWhitespace('\n'); //true```
	- Metoda ```isLowerCase(znak)```
		- Zjistí, jestli je zadaný znak malé písmeno
		- Např. ```Character.isLowerCase('a'); //true```
		- Např. ```Character.isLowerCase('A'); //false```
		- Např. ```Character.isLowerCase('3'); //false```
	- Metoda ```isUpperCase(znak)```
		- Zjistí, jestli je zadaný znak velké písmeno
		- Např. ```Character.isUpperCase('a'); //false```
		- Např. ```Character.isUpperCase('A'); //true```
		- Např. ```Character.isUpperCase('3'); //false```

## Práce s parametry příkazové řádky (programu)
- Mnoho programů je možné spustit s **jedním či více parametry příkazové řádky** (též **parametry programu**)
	- Např. většina programů pro práci s různými soubory (obrázky, videa, textové soubory) umožňuje zadat jako parametr soubor, který mají po spuštění otevřít

### Zadání parametrů příkazové řádky
- Parametry se zadávají při spuštění programu **za příkaz, který program spouští**
	- Parametrů může být více
	- Jednotlivé parametry jsou odděleny mezerou
	- ```java balík.Třída parametr1 parametr2 …```
		- Např. ```java VypisParametruProgramu -v 128```
- Parametry s mezerou či mezerami
	- Pokud je parametrem řetězec, který obsahuje jednu nebo více mezer, je nutné parametr uzavřít do uvozovek (jinak by byl chápán jako více parametrů)
	-	 Např. ```java VypisParametruProgramu 128 "Program Files"```

### Předání parametrů příkazové řádky do programu
- S parametry zadanými při spuštění programu lze jednoduše pracovat
- Protože metoda ```main()``` je vstupní bod programu, jsou parametry příkazové řádky předány jako skutečný parametr této metody
	- Jsou dostupné ve formálním parametru ```args```
	- Jedná se o pole řetězců
		- Řetězce mohou obsahovat libovolné znaky (tedy čísla, písmena, interpunkci, bílé znaky)
		- Jednotlivé parametry (řetězce) jsou v jednotlivých buňkách pole
		- Délka pole odpovídá počtu parametrů
		- Pokud je program spuštěn bez parametrů (tj. všechny dosud předvedené programy), je ```args``` pole délky 0 (nikoliv ```null```)

### Zpracování parametrů příkazové řádky
- Parametry mohou mít libovolný význam, typicky se jedná o název souboru, přepínače či jiné (např. číselné) hodnoty
- Parametry jsou však vždy předány jako řetězce
	- Pokud se jedná o čísla (sloužící k nějakému výpočtu), je potřeba převod z řetězce na číslo

## Postup při návrhu algoritmu (od problému k programu)
- Pokud máme problém, který chceme vyřešit pomocí počítačového programu, je potřeba nejprve promyslet různé aspekty vytvářeného programu
	- Jaký je algoritmus či algoritmy programu
	- Jakým způsobem lze algoritmus realizovat a dekomponovat na menší části
	- Jaké jsou potřebné datové struktury
	- Jaký bude vstup a výstup programu (co má program načítat a co vypisovat)
	- Jak bude program komunikovat s uživatelem (typ uživatelského rozhraní)

### Obecný postup
- Zde je popsáno několik obecných rad, jak při vytváření (rozsáhlejšího) programu postupovat
	- Nejedná se o žádnou konkrétní metodiku
	- Nejedná se o dogma, které by muselo být dodržováno striktně 

#### Promyšlení jednotlivých aspektů
- Je potřeba rozmyslet všechny zmíněné aspekty o Většina z nich spolu úzce souvisí => změna rozhodnutí v jedné oblasti pravděpodobně ovlivní další oblasti
	- Dělat si poznámky, schémata
		- Zvláště u složitějších problémů se snadno zapomíná na již vymyšlené věci, proto je potřeba si myšlenky zaznamenávat

#### Postup programování
- S programováním by se mělo začít, až když je rozmyšlená a navržená struktura aplikace 
	- Tj. na jaké třídy bude aplikace členěna a do jakých balíku budou tyto třídy umístěny
- Co naprogramovat nejdříve
	- Je možno více postupů
	- Častý je postup shora dolů 
		- Vytvoří se kostry jednotlivých (téměř všech) tříd i s hlavičkami metod
		- Do těchto koster se následně postupně doplní funkcionalita (těla metod)
		- Pokud budeme mít nejprve hotovou kostru většiny tříd metod (s prázdnými těly), hodí se to při následném psaní těl metod
			- Těla metod mimo jiné obsahují volání jiných metod naší aplikace => pokud tyto metody existují (byť s prázdnými těly), IDE nástroj může při psaní pomoci s doplňováním jejich volání
- Průběžná kontrola funkcionality
	- IDE nástroj nás upozorní na překlepy a jiné syntaktické chyby  je možné vytvořit program, který půjde hned napoprvé přeložit (tj. bez chyb při překladu)
	- Program však s vysokou pravděpodobností obsahuje chyby v chování programu, na které nás IDE nástroj neupozorní  je potřeba ladění
	- Řádné ladění je možné až po dokončení aplikace
	- Ladění částí kódu (např. jednotlivých výpočtů) je však možné už v průběhu může to usnadnit ladění v závěrečné fázi, protože části kódu byly už alespoň částečně prověřeny

#### Úpravy algoritmů a refaktoring
- Pro začátečníky ale i pro zkušené programátory není snadné zohlednit při návrhu programu všechny aspekty
- Často se na něco zapomene
- Náprava opomenutí může být drobná, ale také rozsáhlá
- Je poměrně běžné, že se v již hotovém kódu dělají úpravy
	- Za účelem doplnění či změny funkcionality
		- Typicky proto, že se na něco zapomnělo, nebo se objevil nový požadavek
		- Např. změna algoritmů, změna formátu vstupů a výstupů
	- Za účelem vylepšení zdrojového kódu (bez změny funkcionality)
		- Tzv. refaktoring
		- Např. změna struktury aplikace (rozdělení funkcionality do více tříd ametod), přejmenování a přesunutí tříd, rozdělení aplikace do více balíků apod.
		- IDE nástroje často poskytují nástroje pro jeho usnadnění
			- Např. přejmenování a přesunutí třídy
- Ve skutečnosti se málokdy stane, že původní návrh, jak by měl program vypadat, se naprogramuje 1:1 a nedojde k žádným změnám

#### Ladění a testování
- Po dokončení programu je potřeba provést jeho ladění
	- Program obsahuje chyby za běhu programu, které je potřeba odstranit
	- Důležité je zkoušet program spouštět s různými typy vstupů (včetně neplatných vstupů) a ověřovat, zda dává správné výstupy
	- V případě nalezení problému (program padá a/nebo dává nesprávné výsledky), je vhodné použít debugger (případně kontrolní výpisy) pro zjištění, co se v programu děje a pro nalezení a odstranění chyb

#### Odevzdání programu
- Po dokončení testování je třeba vytvořit formu programu, která je vhodná pro odevzdání či distribuci
	- Typicky spustitelný soubor JAR
	- Tato forma by rovněž měla být řádně otestována

## Řazení
- Velmi častá operace v mnoha různorodých algoritmech
- Slouží především pro usnadnění následného vyhledávání
	- Používá se nejen v programování, ale i v běžném životě (často se setkáváme s abecedním pořadím, např. slova v rejstříku knihy, které usnadní nalezení požadovaného výrazu)

### Základní pojmy
- Pro řazení se v angličtině používá slovo „sort“
	- Toto slovo má však dva odlišné významy
		- Řazení – činnost, kdy přeskupíme prvky posloupnosti (nejčastěji uložené v poli) tak, aby mezi sousedními prvky platily vztahy „předchůdce-následník“ či „menší-větší“ 
			- Např. seřadíme pole čísel podle velikosti od nejmenšího čísla k největšímu nebo seřadíme studenty podle příjmení od A do Z
			- V předmětu KIV/PPA1 a navazujících předmětech budeme důsledně používat slovo „řazení“
		- Třídění – činnost, kdy prvky z určité skupiny (množiny) rozdělujeme do podskupin podle nějaké společné vlastnosti
			- Např. roztřídíme celá čísla na sudá a lichá V českém překladu se občas slovo **„třídění“ používá ve významu řazení => NEPOUŽÍVAT**!
- Klíč
	- Řadit je možné prvky primitivních datových typů nebo instance
	- Pokud řadíme instance, které mají obecně více atributů, pak typicky řadíme podle jednoho nebo několika z nich
	- Atribut, podle kterého řadíme, se nazývá klíč
- Protože se řazení používá velmi často, existuje množství rozmanitých algoritmů, které se navzájem liší některými svými vlastnostmi, zejména svou rychlostí a složitostí implementace

#### Vlastnosti algoritmů řazení
- Směr řazení
	- Řazení vzestupně
		- Předchozí prvek je menší nebo roven následujícímu prvku
			- Např. 1, 2, 3, 3, 3, 4, 6, 9, 9
		- Častější směr řazení 
	- Řazení sestupně
		- Předchozí prvek je větší nebo roven následujícímu prvku
			- Např. 9, 9, 6, 4, 3, 3, 3, 2, 1 
	- Pokud nebude explicitně uvedeno jinak, budeme ve zbylém textu uvažovat řazení vzestupně
- Umístění řazených prvků
	- **vnitřní řazení**
		- **Všechny prvky**, které chceme seřadit, **jsou uloženy v jeden okamžik v operační paměti**
		- Ve zbylém textu budeme **uvažovat pouze vnitřní řazení**
			- Paměti je „dost“ – lze bez problémů řadit desítky milionů prvků
	- **Vnější řazení**
		- Řazených prvků je **extrémní množství** a **všechny najednou se do operační paměti nevejdou**
		- Prvky jsou uloženy v jednom či více souborech nebo v databázi na vnější paměti (např. na pevném disku)
		- **V jeden okamžik je v operační paměti pouze část prvků**
- Stabilita
	- Stabilní řazení
		- **Řazení je stabilní**, **pokud relativní pořadí prvků se stejnou hodnotou klíče zůstává v seřazeném poli** (posloupnosti) **stejné jako v původním poli** (posloupnosti)
			- Např. pokud budu **řadit pole osob s atributy jméno a příjmení podle příjmení**, pořadí osob se stejným příjmením zůstane zachované
				- Neseřazené osoby: Jana Volná, Tomáš Marný, Petr Dobrý, Martin Marný, Lenka Malá, Jitka Volná
				- Seřazené osoby: Petr Dobrý, Lenka Malá, Tomáš Marný, Martin Marný, Jana Volná, Jitka Volná
	- Nestabilní řazení
		- Řazení je nestabilní, pokud se relativní pořadí prvků se stejnou hodnotou klíče může po seřazení pole změnit
			- Např. pokud budu řadit pole osob s atributy jméno a příjmení podle příjmení, pořadí osob se stejným příjmením nemusí zůstat zachované
				- Neseřazené osoby: Jana Volná, Tomáš Marný, Petr Dobrý, Martin Marný, Lenka Malá, Jitka Volná
				- Seřazené osoby: Petr Dobrý, Lenka Malá, Tomáš Marný, Martin Marný, Jitka Volná, Jana Volná
		- Má význam pouze u řazení objektů
			- Pokud řadíme pole základních datových typů, vzájemná poloha dvou stejných prvků není důležitá
				- Protože prvky stejné hodnoty stejně nemůžeme rozlišit
				- „Je jedno, která trojka bude první a která druhá“
			- Objekty se mohou shodovat v klíči, podle kterého jsme řadili, ale můžou se lišit (a často liší) v hodnotách dalších atributů
				- Jejich pořadí může mít význam
- Složitost
	- Vlastnost každého algoritmu (nejen algoritmu řazení)
	- Dá se použít pro zhodnocení „jak rychlý“ daný algoritmus je nebo „kolik paměti“ daný algoritmus potřebuje
	- Udává, jak roste časová (nebo paměťová) náročnost algoritmu v závislosti na velikosti vstupu
		- V případě řadících algoritmů je velikost vstupu počet řazených prvků
	- Podrobně viz předmět KIV/PPA2 

### Základní algoritmy řazení
- U všech příkladů budeme předpokládat, že posloupnost prvků, kterou chceme seřadit, je uložená v poli
	- Všechny zmíněné algoritmy procházejí pole, přičemž alespoň část pole se prochází opakovaně
	- Pro průchod polem jsou využity dva vnořené cykly – typicky cykly for, nebo kombinace cyklů for a while
- Základní operace, které se provádějí v běžných algoritmech řazení, je porovnání prvků a prohození prvků
	- Postupným prohazováním dvojic prvků na základě porovnání jejich hodnoty se z neseřazené posloupnosti uložené v poli stane seřazená posloupnost
- **Základní algoritmy řazení**
	- Jsou **jednoduché na implementaci** (a tedy i na pochopení jejich principu)
	- Všechny mají **časovou složitost Ο(n²)**
	- Udává, jak roste čas potřebný pro seřazení posloupnosti prvků v závislosti na počtu prvků n (v nejhorším případě)
	- Pokud bude algoritmus potřebovat čas t pro seřazení n prvků, bude pro seřazení 2n prvků potřebovat čas 4t
	- Čas roste kvadraticky v závislosti na počtu prvků n
- **Pokročilé algoritmy řazení**
	- Jsou složitější na implementaci a pochopení
	- Mají **nižší časovou složitost (typicky Ο(nlog2n)**)
	- Podrobně viz předmět KIV/PPA2

#### Řazení výběrem (selection sort)
- Též řazení výběrem mezního prvku, řazení s přímým výběrem
- Princip řešení
	- V celém poli nalezneme index prvku s nejnižší hodnotou
	- Vyměníme nalezený prvek s prvním prvkem pole (na indexu 0)
	- V poli vyjma prvního prvku nalezneme index prvku s nejnižší hodnotou
	- Vyměníme nalezený prvek s druhým prvkem pole (na indexu 1)
	- Pokračujeme stejným způsobem pro další prvky, dokud nedosáhneme konce pole
- Vlastnosti **řazení výběrem**
	- Řazení **je nestabilní**
	- **Složitost Ο(n²)**

#### Řazení vkládáním (insertion sort)
- Princip řešení
	- Pole máme rozdělené na seřazenou (na začátku jeden prvek) a neseřazenou část (na začátku všechny prvky kromě prvního (na indexu 0))
	- Vezme se první prvek z neseřazené části a vloží se na správné místo do seřazené části
	- Prvky v seřazené části větší než zařazovaný prvek se posunou o jedno místo doprava => seřazená část se zvětší o jeden prvek
	- Opakuji, dokud není pole celé seřazené
- Vlastnosti **řazení vkládáním**
	- Řazení **je stabilní**
	- **Složitost Ο(n²)**

#### Řazení záměnou (bubble sort)
- Též bublinkové řazení
- Princip řešení
	- Porovnáváme vždy dva sousední prvky, začínáme odzadu
	- Pokud jsou prvky v nesprávném pořadí (prvek s nižším indexem je větší), prohodíme je
	- Porovnávání a prohazování opakujeme, dokud nedojdeme na začátek pole
		- Tím se nejmenší prvek dostane na začátek pole („vybublá nahoru“)
		- V průběhu vybublání se i ostatní prvky částečně řadí
	- Celý postup opakujeme znovu, ale pouze do druhého prvku pole
		- Tím vybublá nahoru druhý nejmenší prvek
	- Opakujeme pro třetí nejmenší prvek, atd.
	- Předčasné ukončení
		- Pokud nedojde při běhu vnitřního cyklu k žádné výměně, je pole seřazené a mohu skončit
- Vlastnosti **řazení záměnou**
	- Řazení **je stabilní**
	- **Složitost Ο(n2)**

#### Porovnání základních algoritmů řazení
- **Všechny** tři zmíněné algoritmy mají stejnou **složitost Ο(n²)**
	- To neznamená, že jsou **všechny stejně efektivní**, pouze, že **doba řazení roste stejným tempem** (s druhou mocninou počtu řazených prvků)
- Všechny algoritmy řazení provádějí převážně **dvě základní operace**
	- **Porovnání** – typicky porovnání dvou prvků
	- **Přiřazení** – typicky při prohození dvou prvků (celkem tři přiřazení na jedno prohození)
	- Různé řadící algoritmy provedou různý počet porovnání a přiřazení pro stejnou neseřazenou posloupnost
	- Podle počtu provedených porovnání a přiřazení lze algoritmy porovnat
		- Do algoritmů se přidají dva čítače
			- Jeden pro počet porovnání a druhý pro počet přiřazení
			- Inkrementují se „ručně“ (tj. je nutné inkrementaci ručně přidat do kódu) při každém provedeném porovnání/přiřazení
- **Základní algoritmy** řazení jsou **efektivní pro malé posloupnosti** (cca několik desítek prvků) 
- Pro **větší množství prvků** se používají **algoritmy se složitostí Ο(nlog²n)**, které jsou typicky **obsažené v knihovních metodách většiny běžných programovacích jazyků**

### Řazení pole řetězců (lexikografické řazení)
- **Řazení řetězců funguje stejně** jako řazení základních datových typů **s výjimkou porovnání**
	- Pro porovnání dvou prvků nelze použít operátory „```<```“ a „```>```“
	- Je potřeba použít metodu instance třídy ```String compareTo()```, která vrací 0, kladnou či zápornou hodnotu podle pořadí porovnávaných řetězců v abecedě
		- 0 – řetězce jsou stejné (včetně velikosti písmen)
		- **Záporná hodnota** – řetězec, nad kterým je metoda volaná, je „menší“ než řetězec v parametru metody
		- **Kladná hodnota** – řetězec, nad kterým je metoda volaná, je „větší“ než řetězec v parametru metody
		- POZOR! – Kladné a záporné hodnoty jsou obecně různá kladná a záporná čísla v závislosti na obsahu řetězců – není to jen -1 a 1

#### Problémy s lexikografickým řazením
- Uspořádání podle abecedy však může mít neočekávané důsledky, typicky při řazení názvů souborů (což je nejčastěji podle názvu)
	- Pokud seřadíme čísla ```1, 40, 10, 3, 17, 4```, očekáváme výsledek ```1, 3, 4, 10, 17, 40```
	- Pokud ale budeme řadit řetězce (názvy souborů) ```"1.txt", "40.txt", "10.txt", "3.txt", "17.txt", "4.txt"```, dostaneme výsledek ```"1.txt", "10.txt", "17.txt", "3.txt", "4.txt", "40.txt"```
	- Toto seřazení je **důsledkem porovnání řetězců**
	- Běžné porovnávání řetězců implementované i v metodě ```compareTo()``` probíhá postupně podle jednotlivých znaků od začátku řetězce
		- Pokud se řetězce shodují v prvním znaku, porovnají se podle druhého znaku atd.
			- Jednotlivé znaky se porovnávají podle jejich hodnot
			- Jakmile se narazí na znak, který není shodný, hodnota tohoto znaku určí výsledek porovnání řetězců
				- Např. při porovnání řetězců ```"Jana"``` a ```"Janicka"``` rozhodnou až znaky ```'a'``` a ```'i'``` na indexu 3  protože ```'a'``` má nižší hodnotu než ```'i'```, „menší“ (tj. blíže začátku abecedy) je řetězec ```"Jana"```
			- Pokud je jeden řetězec předponou druhého, je „menší“ ten kratší řetězec (např. ```"Jan"``` je „menší“ než ```"Jana"```)
			- Pokud se porovná řetězec ```"10.txt"``` a ```"3.txt"```, tak hned první znaky (na indexu 0) jsou rozdílné – ```'1'``` a ```'3'```
				- Protože ```'1'``` je menší než ```'3'```, je řetězec ```"10.txt"``` „menší“ než řetězec ```"3.txt"```, i když číslo 3 je menší než 10 
		- Řešení – **doplnit nevýznamové nuly**, které jsou však z hlediska lexikografického řazení významové => místo ```"3.txt"``` použít ```"03.txt"```

### Řazení pole objektů
- Pole objektů lze řadit **stejnými algoritmy** jako pole základních datových typů
- **Je** ale **nutné určit**, **podle čeho se mají jednotlivé instance porovnávat** (tj. **určit, co bude klíčem**)
	- Podle jednoho atributu
	- Podle více atributů (víceúrovňové řazení) 

#### Řazení podle jednoho atributu
- Jediný rozdíl oproti řazení pole základních datových typů je, že porovnáváme hodnoty atributů, nikoliv samotné instance
	- Pokud je atribut základního datového typu, použijeme přímo operátory porovnání „```<```“ a „```>```“
	- Pokud je atribut referenční proměnná na instanci jiné třídy, musíme použít porovnání definované pro danou třídu
		- Např. pro třídu ```String``` je to metoda ```compareTo()```

#### Víceúrovňové řazení provedené najednou (běžný postup)
- Poměrně často se může stát, že chceme řadit pole objektů podle více atributů
	- Např. osoby podle příjmení a následně podle jména
		- Osoby se tedy seřadí podle příjmení, a pokud mají stejné příjmení, seřadí se ještě podle jména 
	-  Je možné udělat v řazení komplexnější podmínku pro prohození prvků obsahující všechny atributy, podle kterých chceme řadit
		- Tento postup podstatně znepřehledňuje samotné řazení, zvláště pokud je atributů, podle kterých řadíme, větší množství
	- Je vhodnější udělat metodu pro porovnání dvou instancí stejné třídy, která bude vracet hodnoty indikující, která instance je „větší“
		- Tato metoda může obsahovat i poměrně složitou podmínku skládající se z porovnání několika atributů
		- Díky umístění v metodě instance nebude znepřehledňovat kód řazení
		- Metodu můžeme po vzoru třídy ```String``` nazvat ```compareTo()``` a může vracet hodnoty ```0```, ```1``` a ```-1```
			- Metoda ```compareTo()``` se využívá i při řazení objektů knihovní metodou řazení
			- Metoda ```compareTo()``` se může využít i při řazení podle jediného atributu

#### Víceúrovňové řazení provedené postupně (nepoužívat)
- Další možnost seřazení pole objektů podle více atributů je seřadit ho nejprve podle jednoho atributu a následně podle dalšího
	- Je potřeba použít stabilní algoritmus řazení
	- Nejprve se pole seřadí podle nejméně důležitého atributu (u osoby podle jména)
	- Následně se pole seřadí podle více důležitého atributu (u osoby podle příjmení)
	- Protože pořadí prvků se stejným klíčem zůstává při použití stabilního řazení nezměněno, seřazení podle méně důležitého atributu (jména) zůstane zachováno (pro osoby se stejným příjmením)
	- Tento postup vyžaduje zopakovat řazení dvakrát a je proto rozumné ho nevyužívat, pokud není nezbytně nutno
		- Pokud však není možné řadit podle více atributů najednou (např. v GUI MS Access), tento postup se může hodit

### Metody řazení v Java Core API
- V **naprosté většině případů není důvod si programovat algoritmus řazení** – využijí se **knihovní metody pro řazení** z třídy ```Arrays``` (nebo ```Collections```) z balíku ```java.util```
- Pro pole základních datových typů i pole objektů se používají metody ```Arrays.sort(pole)``` a ```Arrays.sort(pole, indexOd, indexDo)```
	- Metody jsou překryté pro pole všech základních datových typů a pole objektů
	- Metoda s indexy řadí pouze část pole od indexu ```indexOd``` (včetně) do indexu ```indexDo``` (vyjma)

#### Řazení polí základních datových typů metodou z Java Core API 
- Řazení pole základních datových typů **nevyžaduje žádnou speciální úpravu**, **pouze se zavolá metoda řazení**
- Metody ```sort()``` pro pole základních datových typů obsahují **algoritmus quick sort**
	- Je **velmi rychlý**
	- Má **složitost Ο(nlog²n)** (v průměrném případě)
	- **Není stabilní** – u základních datových typů nepodstatné
	- Viz předmět KIV/PPA2

#### Řazení polí objektů metodou z Java Core API
- Aby bylo možné **řadit pole objektů** knihovními metodami řazení, **je potřeba, aby třída implementovala rozhraní** ```Comparable<Třída>```
	- Mnoho knihovních tříd to dělá, a dají se tak řadit knihovními metodami – např. ```String```
	- Podrobnosti viz předměty KIV/PPA2 a KIV/OOP
		- Existuje i alternativní možnost, umožňující řadit podle různých kritérií podle toho, které řazení aktuálně potřebujeme
		- Je potřeba, aby třída měla rozšířenou hlavičku
			- ```public class Třída implements Comparable<Třída>```
		- Je potřeba, aby třída obsahovala metodu pro porovnání dvou instancí třídy
			- ```public int compareTo(Třída třída)```
			- Tato metoda musí vracet zápornou hodnotu, pokud je instance, nad kterou se metoda volá, „menší“ než instance v parametru metody, kladnou hodnotu, pokud je „větší“, a nula, pokud jsou obě instance stejné
			- Podle čeho se instance porovnávají, **záleží na těle metody** ```compareTo()```, může to být podle jednoho či více atributů

### Kopie pole
- Protože při knihovním řazení metodami ```Arrays.sort()``` dojde přímo k seřazení zadaného pole, může se hodit pole před řazením zkopírovat, abychom měli uloženou seřazenou i neseřazenou posloupnost
	- Pole lze překopírovat ručně
		- Vytvořit nové pole stejného typu o stejné velikosti jako původní pole
		- V cyklu ```for``` projít původní pole a do prvků nového pole přiřadit odpovídající prvky původního pole
	- **Pole lze překopírovat využitím knihovní metody** ```Arrays.copyOf(pole, nováDélkaPole)```
		- **Metoda je rychlejší** než ruční kopírování
	- Metoda umožňuje **pole** také **zkrátit** nebo **prodloužit** (**při zadání jiné délky** než původní délky pole)
		- Při zadání **menší délky** se **pole ořízne**
		- Při zadání **větší délky** se **prvky navíc nastaví na hodnotu** ```0, 0.0, false``` nebo ```null``` **podle typu pole**

#### Kopie polí základních datových typů
- Při kopírování polí základních datových typů, kdy jednotlivé hodnoty jsou přímo prvky pole, dostaneme „plnohodnotnou“ kopii pole
	- Pokud provedeme změnu prvku v kopii pole, změna se nijak neprojeví v původním poli

#### Kopie polí objektů
- Při **kopírování polí objektů** jsou v prvcích pole uloženy **pouze reference na jednotlivé instance**
	- Zkopírováním pole se **zkopírují pouze reference**, které ale **stále ukazují na původní instance**
	- Pokud provedu změnu atributu prvku v kopii pole, projeví se tato změna i v odpovídajícím prvku původního pole (protože se stále jedná o stejnou instanci)
	- Jedná o tzv. **mělkou kopii pole**

## Vyhledávání
- Vyhledávání je velmi často prováděná činnost
- **Zjišťujeme**, **zda je prvek určité hodnoty** (též prvek s hodnotou klíče) **přítomen v poli**
	- Někdy stačí informace, zda je či není (```true```/```false```)
	- Většinou je potřeba zjistit index, na kterém se hledaný prvek nachází
- Typ vyhledávání
	- **Neúplné**
		- Nalezneme **první výskyt** prvku
	- **Úplné**
		- Nalezneme **všechny výskyty** prvku
- Výsledek neúplného vyhledávání
	- Typicky první index od začátku pole, na kterém se prvek nachází (prvek může být v poli obsažen vícekrát), nebo záporná hodnota, pokud se prvek v poli nenachází (typické použití, protože index prvku nemůže být záporný)
	- Pokud je důležité pouze, zda prvek v poli je či není, ale není důležité kde je, je výsledek vyhledávání pouze ```true``` (prvek je obsažen) nebo ```false``` (prvek není obsažen)
- Výsledek úplného vyhledávání
	- Pole (případně výpis) všech indexů, na kterých se hledaný prvek nachází, nebo prázdné pole, pokud prvek není v poli obsažen
	- Pokud není důležité, na kterých indexech se prvek nachází, ale zajímá nás, kolikrát je v poli obsažen, výsledkem je počet výskytů prvku (0 pokud prvek není obsažen)

### Vyhledávání v neseřazené posloupnosti (poli) 
- Pokud není pole, ve kterém prvek hledáme, seřazené, je jediná možnost sekvenční vyhledávání 

#### Neúplné sekvenční vyhledávání v poli základních datových typů
- Neúplné sekvenční vyhledávání má **složitost Ο(n)**
	- V **nejhorším případě je nutné projít celé pole**, tedy všech n prvků 
- Princip vyhledávání
	- Procházíme pole od začátku do konce a porovnáváme hodnoty prvků pole s hodnotou hledaného prvku
	- Když prvek nalezneme, ukončíme procházení pole a vrátíme index, na kterém jsme prvek nalezli
	- Pokud dojdeme až do konce pole a prvek nenajdeme, vrátíme zápornou hodnotu (typicky ```-1```)

#### Neúplné sekvenční vyhledávání v poli objektů
- Vyhledávání v poli objektů je velice podobné, jako vyhledávání v poli základních datových typů 
	- Pro porovnání ale **nemůžeme použít operátor** „```==```“, protože pro objekty vrací true pouze v případě, že se jedná o stejnou instanci
		- Můžeme **porovnávat přímo jeden či více atributů instance**
		- Můžeme **využít metodu** ```equals()```, **pokud je** v dané třídě **správně implementovaná**

#### Úplné sekvenční vyhledávání
- Úplné sekvenční vyhledávání má **složitost Ο(n)**
	- V každém případě **je nutné projít celé pole**, tedy všech n prvků
- Princip vyhledávání
	- **Princip** je **stejný jako u neúplného sekvenčního vyhledávání**, pouze **neukončíme procházení pole při nalezení prvního výskytu** prvku, ale projdeme pole **vždy až do konce**
	- Protože indexů s pozicemi prvků je více, nestačí vrátit jeden index  místo jednoho indexu **vrátíme pole s jednotlivými indexy**
		- Délka pole indexů může být maximálně stejná, jako je počet prvků prohledávaného pole a minimálně může být 0, pokud hledaný prvek nebyl v poli nalezen
		- Počet výskytů hledaného prvku v poli (a tedy délku pole indexů) na začátku neznáme
			- Délku pole indexů tedy volíme jako délku prohledávaného pole
			- Délku můžeme po skončení algoritmu zkrátit vytvořením kratší kopie pole na skutečný počet indexů 

### Vyhledávání v seřazené posloupnosti (poli)
- **Pokud je posloupnost seřazená** (předpokládáme vzestupně, ale mohla by být i sestupně), je možné **použít vyhledávání půlením intervalů** (též binární vyhledávání)
	- Sekvenční vyhledávání je možné použít také, stejně jako na neseřazenou posloupnost, ale je podstatně pomalejší, takže není důvod ho používat, pokud je posloupnost seřazená 
	- Pokud provádíme vyhledávání opakovaně a pořadí prvků v prohledávaném poli není důležité, vyplatí se pole jednou seřadit a následně opakovaně používat vyhledávání půlením intervalů

#### Neúplné vyhledávání půlením intervalů v poli základních datových typů
- Neúplné vyhledávání půlením intervalů (binární vyhledávání) má **složitost Ο(log₂n)**
	- Čas vyhledávání tedy roste pouze s logaritmem počtu prvků prohledávaného pole  pro **velký počet prvků** prohledávaného pole je **podstatně rychlejší než sekvenční vyhledávání**
- Princip vyhledávání
	- V každém kroku rozdělíme prohledávaný interval na dvě poloviny a následně hledáme jen v jedné z polovin
		- Zjistíme hodnotu prvku ležícího na prostředním indexu
		- Pokud je rovna hledané hodnotě, algoritmus končí
		- Pokud je větší než hledaná hodnota, hledáme v levé polovině
		- Pokud je menší než hledaná hodnota, hledáme v pravé polovině

#### Úplné vyhledávání půlením intervalů
- Pokud je hledaný prvek v poli obsažen vícekrát, vyhledávání půlením intervalů najde jeden z výskytů, ale není jasné, který výskyt to je
	- Nalevo i napravo od nalezeného indexu se mohou vyskytovat prvky se stejnou hodnotou
	- Pro úplné vyhledávání je potřeba sekvenčně prohledat pravé i levé okolí nalezeného indexu, dokud se nenarazí na jiný prvek nebo konec či začátek pole
	- Protože stejné prvky jsou v seřazeném poli vždy u sebe, není třeba vracet pole všech indexů, na kterých se hledaný prvek nachází, stačí vrátit první a poslední index

#### Metody pro vyhledávání půlením intervalů z Java Core API
- Třída ```Arrays``` obsahuje metody pro vyhledávání půlením intervalů
	- Metoda ```Arrays.binarySearch(pole, klíč)```
		- Prohledává celé pole
	- Metoda ```Arrays.binarySearch(pole, od, do, klíč)```
		- Prohledává pouze část pole udanou indexy ```od``` (včetně) a ```do``` (vyjma)
	- Metody jsou překryté pro pole všech základních datových typů a pro pole objektů
	- Prohledávané pole musí být seřazené, typicky vzestupně (typicky knihovní metodou ```Arrays.sort()```)
	- Metoda vrací index nalezeného prvku, nebo zápornou hodnotu, pokud prvek nebyl nalezen
		- Tato hodnota obecně není ```-1```  nutno testovat hodnotu, zda je menší než ```0```, nikoliv rovna ```-1```
		- Absolutní hodnota záporného čísla udává index, na kterém by prvek byl, kdyby v poli byl 

#### Vyhledávání půlením intervalů v poli objektů
- Pokud bychom chtěli použít binární vyhledávání v poli objektů, je nutné určit, podle čeho se mají objekty porovnávat (podle jakého atributu)
	- Je nutné seřadit pole podle tohoto vybraného porovnání a stejné porovnání použít i v algoritmu binárního vyhledávání
	- Nejrozumnější je použít metodu ```compareTo()```, kterou jsme použili při ručním i knihovním řazení
- Pro správné použití knihovní metody ```Arrays.binarySearch()``` je nezbytné, aby třída, jejíž instance jsou v poli, implementovala rozhraní ```Comparable<Třída>```
	- Hlavička třídy, jejíž instance jsou v prohledávaném poli, musí být ```public Třída implements Comparable<Třída>```
	- Musí obsahovat metodu ```public int compareTo(Třída třída)```
	- Podrobnosti viz předměty KIV/PPA2 a KIV/OOP

## Výjimky
- Mechanizmus výjimek je silným bezpečnostním mechanizmem nejen v Javě, ale i v mnoha jiných jazycích
- Umožňuje (a v některých případech vynucuje) řešení chybových stavů, které za běhu programu mohou z různých důvodů nastat

### Základní pojmy
- **Výjimka** (exception)
	- Též výjimečný stav (exceptional event) či (nepřesně) chyba (error)
	- **Událost, u které si nepřejeme, aby v programu vznikla**
	- Např. očekáváme od uživatele jako vstup celé číslo, ale on zadá reálné
	- Bez výjimky by program fungoval lépe – podle očekávání
- **Vyhození výjimky** (throw exception)
	- Okamžik, kdy výjimka vznikne

#### Popis výjimky
- **Výjimka** v Javě je **instance konkrétní speciální třídy**
- Samotná třída výjimky udává, k jaké chybě došlo
- Obsahuje upřesňující informace
	- Přesnější popis chyby
	- Obsah zásobníku (stack trace)

### Druhy výjimek
- Existují **dva** základní druhy výjimek
	- **Exception**
		- Je NUTNÉ je ošetřit ve zdrojovém kódu
	- **RuntimeException**
		- Je MOŽNÉ je ošetřit ve zdrojovém kódu, ale není to nutné
	- Způsob práce s oběma typy je zcela stejný 
- Od základních typů odvozeno (odděděno) mnoho dalších výjimek, které jsou více specifické
	- Výjimky mají hierarchickou strukturu, na vrcholu je ```Exception```
	- Protože všechny jsou původně odvozené (odděděné) od základních, je možné při ošetřování výjimek používat názvy nadřazených nebo základních druhů
		- Např. ```FileNotFoundException``` (soubor nenalezen) je možné nahradit ```IOException``` (obecná chyba vstupu a výstupu) nebo rovnou ```Exception```

#### Výjimky (Exception)
- Též kontrolované výjimky (checked exceptions)
- Všechny tyto výjimky jsou odvozené (přímo nebo přes delší hierarchii) od ```Exception``` a nikde v hierarchii odvození (dědění) se nevyskytuje ```RuntimeException```
- Je nutné se o ně v programu postarat, tj. ošetřit je přidáním speciální části zdrojového kódu
- Vyskytují se v souvislosti s voláním metod, u kterých je zvýšená pravděpodobnost, že se při jejich použití může vyskytnout problém
	- Typicky metody, které pracují se vstupy a výstupy
	- Tyto metody jsou napsány tak, že při jejich použití je nutné na potenciální nebezpečí reagovat
		- Pokud není přidána část kódu pro ošetření případné výjimky, program nejde ani přeložit

#### Výjimky za běhu (RuntimeException)
- Všechny tyto výjimky jsou odvozeny (přímo nebo přes delší hierarchii) od ```RuntimeException```
- Není nutné se o ně v programu postarat, protože mohou nastat kdekoliv
	- Příkladem je přístup do neexistujícího prvku pole (```ArrayIndexOutOfBoundException```), volání metody nad referenční proměnnou, která je ```null``` (```NullPointerException```),dělení nulou (```ArithmeticException```) a mnoho dalších
	- Program lze přeložit – **překladač nás nenutí, abychom je ošetřili** pomocí speciální části zdrojového kódu
	- Považujeme-li to za vhodné, můžeme je ošetřit (stejným způsobem jako kontrolované výjimky)
		- Typicky je to v místech, kde je zvýšená pravděpodobnost problému (např. vstupy od uživatele)
	- Nemá větší smysl ošetřovat tyto výjimky v místě, kde jsme si stoprocentně jisti, že výjimka nemůže nastat (nemůže být vyhozena)
		- Přesto se může stát, že výjimka v tomto místě nastane, protože jsme nezvážili všechny možnosti
	- Pokud je výjimka za běhu programu vyhozena a není ošetřena, dojde k předčasnému ukončení programu a výpisu výjimky na standardní chybový výstup (na obrazovku)
		- Z chybového výpisu lze poznat, kde k výjimce došlo 
		- Dalším krokem je oprava programu – odstranění důvodu výjimky nebo její ošetření

### Reakce na výjimku
- Existují tři základní přístupy, jak reagovat na výjimku
	- Předání výjimky výše
		- Programátor výjimku nechce (nebo neumí) ošetřovat v místě vyhození, a proto informaci o jejím výskytu předá do nadřazené úrovně (tzn. do volající metody)
	- Kompletní ošetření výjimky
		- Výjimka je zachycena a ošetřena v místě vyhození (vzniku)
	- Kombinace obou přístupů
		- Výjimka je zachycena a (částečně či kompletně) ošetřena v místě vyhození, ale informace o ní se navíc předá do nadřazené úrovně (tzn. do volající metody)
- Všechny tyto postupy se běžně používají
	- Často se využívá nejprve předání výjimky výše a následně její ošetření ve vyšší úrovni

#### Předání výjimky výše (deklarace výjimky)
- Metoda, ve které se výjimka vyskytla (byla vyhozena), se zříká odpovědnosti za její zpracování
	- Předání odpovědnosti výše se deklaruje v hlavičce metody
	- Tento postup je velice jednoduchý, ale pouze odsouvá řešení problému, které bude muset být nakonec provedeno (ale toto řešení může být např. provedeno na vhodnějším místě, než je metoda, kde výjimka vznikla)
	- Na první pohled nejjednodušší řešení
		- Není třeba žádných zásahů do těla metody
		- Do hlavičky metody se přidá ```throws NázevVýjimky```
			- Např. ```throws IOException```

#### Kompletní ošetření výjimky
- Případná vyhozená výjimka nepronikne ven z metody
	- Nadřazená úroveň (volající metoda) se nemusí o nic starat 
- Ošetření výjimky se provede pomocí konstrukce ```try-catch-finally```
	- Vlastní výkonný kód se nemění, jen se uzavře do bloku začínajícího klíčovým slovem ```try```
		- Prakticky je často nutné přesunout některé deklarace vně bloku ```try```
		- V tomto bloku předpokládáme vznik výjimky
		- Výjimka vždy vznikne na konkrétní řádce => touto řádkou skončí vykonávání bloku ```try```, pokud k výjimce dojde
	- Blok ```catch```, který za blokem ```try``` bezprostředně následuje, určuje, na jakou výjimku se bude reagovat a jak
		- Kód v bloku ```catch``` se provede pouze v případě, že k uvedené výjimce (někde v bloku ```try```) dojde
		- Bloků ```catch``` může být více, každý může reagovat na jinou výjimku
		- Blok ```catch``` reaguje pouze na výjimku, která je deklarovaná v závorce a všechny výjimky od ní odvozené (potomky)
			- Pokud nastane jiná výjimka, blok ```catch``` se neprovede
			- Pokud není uveden žádný vhodný blok ```catch```, výjimka není odchycena
	- Blok ```finally```
		- Blok ```finally``` následuje za blokem catch
		- Obsahuje část kódu, která se provede vždy – ať už k výjimce dojde, nebo ne (i když dojde k jiné výjimce, která není odchycena)
		- Nepoužívá se příliš často
- Možné ošetření výjimky – pouze vypsání chyby a ukončení programu Primitivní, ale často rozumný způsob
	- Hodí se v případech, kdy vznik výjimky znamená, že program dál stejně nemůže smysluplně pokračovat
	- Umožní program přeložit (pokud ošetřujeme kontrolovanou výjimku)
	- V případě, že je výjimka vyhozena, se o ní z chybového výpisu dozvíme
	- Pokud ošetřujeme výjimku přímo v místě vzniku v nějaké hluboce zanořené metodě, je to často jediný smysluplný způsob kompletního ošetření výjimky
		- Vhodnější alternativa je předání výjimky výše a její ošetření na vyšší úrovni, kde se dá smysluplně reagovat
- Ošetření více různých výjimek
	- Za blokem ```try``` může následovat více bloků ```catch```, odchytávajících různé výjimky
		- Je tak možné reagovat různě podle toho, k jaké výjimce došlo
	- Je možné reagovat i na více různých výjimek stejně 
		- Je možné uvést výjimku, která je společným předkem všech výjimek, na které chceme reagovat stejně – často to může být přímo ```Exception```
			- V tom případě jsou ale odchyceny všechny výjimky (i ty, o kterých jsme neuvažovali) a to není žádoucí
		- Je možné uvést více výjimek do jednoho bloku ```catch```
			- Výjimky jsou odděleny svislítkem „|“
			- Lepší postup, protože jsou zachycené pouze uvedené výjimky (a výjimky od nich odvozené), ale žádné další

#### Předání výjimky výše a její ošetření výše
- Běžný postup
- Výjimka je z metod na nižší úrovni (např. zajišťující čtení ze souboru) propagována výše, až do úrovně, kde je vhodné ji ošetřit, a tam je výjimka vhodně ošetřena (např. v GUI zobrazením dialogu s varováním)

#### Nejhorší reakce na výjimku
- Důvod je v naprosté většině případů lenost programátora
	- Nechce výjimku propagovat, protože by to následně musel udělat i ve všech volajících metodách
	- Použije se konstrukce ```try-catch```, ale do bloku ``catch`` se nic nenapíše
- Zmíněným postupem jsme se připravili o všechny výhody mechanizmu výjimek a vlastně jsme situaci ještě zhoršili
	- Výjimka proběhne, ale nikdo se nedozví kdy a kde
- Někdy je však skutečně potřeba na zachycenou výjimku nijak nereagovat a také ji nepropagovat
	- Typickým příkladem je odchycení ```InterruptedException``` při synchronizaci vláken (viz předmět KIV/PGS)
	- V tom případě je možné nechat blok ```catch``` bez výkonného kódu, ale je nutné doplnit dostatečně podrobný vysvětlující komentář, proč tomu tak je
	- Je také možné převést kontrolovanou výjimku na výjimku za běhu

#### Konstrukce try-with-resources
- Po skončení práce se soubory (čtení/zápis) je obecně dobrým zvykem soubor zavřít metodou ```close()```
	- V předchozích příkladech nebylo použito
		- Protože to nebylo z hlediska výkladu podstatné a bude to podrobněji zmíněno později
		- Protože neuzavřením souboru ```data.txt``` se ve skutečnosti nic špatného nestane
			- Byl otevřen pouze pro čtení
			- JVM při ukončení programu (ať už s výjimkou nebo bez) automaticky uzavře všechny soubory, které program otevřel
	- Neuzavření souboru však může vadit např. při zápisu do něj, a proto je rozumné soubory uzavírat vždy
- Čtení nebo zápis do souboru může často skončit výjimkou
- Pokud se vyskytne výjimka, program neprovede část kódu uvedenou za řádkou, kde výjimka nastala
	- Buď okamžitě ukončí metodu (pokud je výjimka předána výše) nebo skočí do odpovídajícího bloku ```catch```
	- V této části kódu (která se při vyhození výjimky neprovede) se typicky vyskytuje volání metody ```close() ```pro uzavření souborů, které se tím pádem při výskytu výjimky neprovede
		- Řešení
			- Přesunout volání ```close()``` do bloku ```finally```
				- Běžný postup, ale metoda ```close()``` může také vyhodit výjimku a tu je třeba ošetřit 
			- Využít konstrukci ```try```-with-resources
- Konstrukce ```try```-with-resources
	- Umožňuje automatické uzavření souboru, bez ohledu na to, zda k výjimce došlo nebo ne
	- Instance použitá pro práci se souborem (např. instance třídy ```Scanner```) se uvede do kulatých závorek za klíčové slovo ```try```
	- Třída musí implementovat rozhraní ```AutoCloseable```
	-	 Splňují knihovní třídy pro práci se soubory
	- V závorce za klíčovým slovem ```try``` může být uvedeno i více instancí různých tříd, jednotlivé deklarace jsou odděleny středníkem

### Ruční vyhození výjimky
- Výjimka může v programu nejen vzniknout, může být i vyhozena ručně
	- Příkaz ```throw výjimka;```
		- POZOR! – Nikoliv ```throws```
	- Např. ```throw new IOException("Soubor je prazdny.");```
		- Vytvořena a vyhozena nová instance výjimky ```IOException```
		- Za příkazem ```throw``` je normální vytvoření instance výjimky jedním z jejích konstruktorů
	- Např. ```throw ex;```
		- Vyhozena existující instance výjimky, na kterou ukazuje referenční proměnná ```ex```
		- Vyhozena může být kontrolovaná výjimka (```Exception```) i výjimka za běhu (```RuntimeException```)
		- Ruční vyhození výjimky se používá poměrně často
			- Při zadání nesprávných parametrů metody
			- Při kombinaci ošetření výjimky v místě výskytu a předání výjimky výše

#### Vyhození výjimky při zadání nesprávných parametrů metody
- Způsob, jak zareagovat např. v setru při zadání neplatné hodnoty atributu
	- Dosud jsme řešili nevhodně tím, že se v případě zadání neplatné hodnoty nic nestalo
	- Výjimka je vyhozena příkazem ```throw```
	- Pokud se jedná o kontrolovanou výjimku (```Exception```), musí být v hlavičce metody uvedena za klíčovým slovem ```throws```
	- Pokud se jedná o výjimku za běhu (```RuntimeException```), nemusí být v hlavičce metody uvedena
		-  Přesto je dobré ji tam uvést
			- Dá se tak jasně najevo, jakou výjimku či výjimky může metoda vyhazovat
			- Pokud se jedná o výjimku za běhu, není nutné výjimku ošetřovat při volání metody, i když je uvedena v hlavičce
	- Příklad vyhození vlastní výjimky v setru ve třídě ```Ctverec```
		- Použití třídy ```Ctverec``` je ve třídě ```VlastnostiCtverce```

#### Ošetření výjimky v místě výskytu a její předání výše
- Výjimka je v místě výskytu (částečně nebo úplně) ošetřena, ale informace o ní je propagována výše
- Propagování výše se provede v bloku ```catch``` příkazem ```throw```
	- Výjimky jsou zachyceny blokem ```catch```, ve kterém se provede ošetření (zde není žádné potřeba) a výjimka se následně předá výše
	- Uzavření souboru (pokud je otevřen) se provede v bloku ```finally``` (chceme ho zavřít v každém případě, ať už výjimka vznikla nebo ne) 
- Pokud potřebujeme v ošetření výjimky provést pouze uzavření souboru (a ne jinou akci), je možné (a lepší) použít konstrukci ```try```-withrerources
	- Bloky ```catch``` ani ```finally``` se vůbec neuvedou, ale k uzavření souboru dojde
	- Kvůli chybějícímu bloku ```catch``` se výjimka ani nezachytí a není tedy ani nutné znovu ji vyhazovat příkazem ```throw```

## Práce se soubory a složkami (adresáři)
- Se soubory se dá pracovat jako s nedělitelnými jednotkami, kdy je lze přesouvat, kopírovat, mazat atd.
- Obsah souboru se rovněž dá číst a zapisovat

### Základní pojmy
- Některé základní pojmy již byly zmíněny, zde budou uvedeny systematicky

#### Soubor a složka (adresář)
- Soubor (file)
	- Základní jednotka uspořádání dat na disku (z pohledu uživatele i z pohledu programátora)
	- Obsahuje data v závislosti na typu souboru
	- Název souboru
		- Např. ```data.txt, TBBT.s10.e13.avi```
		- Jednoznačná identifikace souboru v rámci jedné složky
			- V jedné složce nemůžou být dva soubory se stejným jménem
			- POZOR!
				- Linux je „case-sensitive“ (citlivý na velikost písmen), jména ```soubor.txt``` a ```Soubor.txt``` jsou tedy různá a mohou být v jedné složce (ale není to rozumné)
				- Windows není „case-sensittive“, jména ```soubor.txt``` a ```Soubor.txt``` jsou tedy stejná a nemohou být v jedné složce
		- Délka názvu je omezena (např. ve Windows na 255 znaků), ale je dostačující
		- Název může obsahovat většinu běžných znaků s několika výjimkami (např. lomítko „/“ a zpětné lomítko „\“)
	- Přípona souboru 
		- Vše od poslední tečky do konce názvu souboru (tj. je součástí názvu)
		- Typicky udává typ souboru
		- Většina souborů příponu má, ale mít ji nemusí
	- Složka/adresář (folder/directory)
		- Složky mají hierarchickou strukturu
		- Název složky (adresáře)
			- Platí stejná pravidla a omezení jako pro soubory
		- Přípona složky
			- Složky příponu většinou nemají
			- Ale mohou ji mít 
		- Každá složka (adresář) může obsahovat další soubory a složky (adresáře) 
		- Ve skutečnosti se jedná o speciální soubor, který má v sobě (v nějaké formě) uložený seznam souborů a složek, které obsahuje
			- Podrobněji viz předmět KIV/ZOS

#### Cesta a související pojmy
- Cesta (ke složce či k souboru)
	- Posloupnost názvů složek, které jsou oddělené lomítkem „/“ (Linux i Windows) nebo zpětným lomítkem „\“ (Windows)
- Důležité složky (adresáře) se speciálním označením 
	- Kořenová složka (adresář) – root folder (directory)
		- Složka, která je v hierarchii nejvýše (sama v žádné složce neleží)
		- Označuje se lomítkem „/“ (v Linuxu i ve Windows) nebo zpětným lomítkem „\“ (ve Windows)
		- Ve Windows je kořenová složka na každém logickém disku (označeném písmenem)
		- V Linuxu je jen jedna kořenová složka a další disky se připojují do hierarchické struktury složek
			- Lze i ve Windows, ale příliš často se to nepoužívá 
	- Aktuální složka (adresář) – current folder (directory)
		- Složka, ve které se právě nacházíme (typicky složka, ze které je spuštěn náš program)
		- Označuje se jednou tečkou „.“
		- Tato speciální složka ukazuje sama na sebe a nachází se v každé složce
	- Nadřazená složka (adresář) – parent folder (directory)
		- Složka, která je v hierarchii bezprostředně nad aktuální složkou
		- Označuje se dvěma tečkami „..“
		- Tato speciální složka odkazující na nadřazenou složku aktuální složky (tj. ve které se aktuální složka nachází) se nachází v každé složce
		- V kořenové složce ukazuje stejně jako „.“ sama na sebe
- Absolutní cesta
	- Začíná v kořenové složce, začíná lomítkem
	- Např. /home/skola/ppa1
	- Např. D:\Users\tpotuzak\Skola\PPA1
	- Ve Windows má každý logický disk (označený písmenem) svou kořenovou složku, proto je písmeno (D:) součástí absolutní cesty – v rámci jednoho disku začíná absolutní cesta „\“
	- Při použití absolutní cesty je jedno, jaká je aktuální složka
	- Z každé aktuální složky ukazuje na stejný objekt (složku nebo soubor)
- Relativní cesta
	- Je relativní k aktuální složce – k jednomu objektu jsou relativní cesty z různých aktuálních složek různé
	- Může začínat
		- Aktuální složkou „.“ (v Linuxu často nutné, ve Windows není nutné) nebo názvem podřazené složky (ve Windows)
		- Nadřazenou složkou „..“
		- Např. ```./skola/ppa1```
- Úplné jméno souboru (či složky)
	- Jednoznačná identifikace souboru (či složky) v rámci celého souborového systému
	- Absolutní cesta včetně názvu souboru (či složky) 
	- Např. ```D:\Users\tpotuzak\Skola\PPA1\data.txt```

### Rozhraní Path a třídy Paths a Files
- Pro práci se soubory jako s celky se dají využít třídy ```Paths, Files``` a rozhraní ```Path``` z balíku ```java.nio.file```
	- Rozhraní ```Path``` reprezentuje cestu, tj. soubor nebo adresář (složku)
		- Podrobně o rozhraní viz předmět KIV/OOP 
		- V dalším textu se budeme k rozhraní ```Path``` chovat, jako by to byla třída 
	- Třída ```Files``` obsahuje mnoho statických metod pro práci se soubory 
		- Kromě práce se souborem jako celkem umožňuje i práci s obsahem souboru
- Lze pracovat se soubory i složkami
	- V názvech metod se používá se výhradně název „adresář“ („directory“), název „složka“ („folder“) se nepoužívá
	- S adresáři lze provádět téměř stejné operace jako se soubory (mazání, přesun, kopírování, atd.), proto existuje jedna třída pro práci jak se soubory tak s adresáři

#### Zajištění nezávislosti na operačním systému 
- Protože různé operační systémy používají různé oddělovače složek v cestě, je ve třídě ```File``` definována proměnná (řetězec) s oddělovačem, která je nastavená podle operačního systému, na kterém je program spuštěn
	- ```File.separator```
	- Tato proměnná by se měla používat, pokud vytváříme cestu z jednotlivých jmen adresářů
	- V Linuxu je její hodnota "/", ve Windows je její hodnota "\"
	- Např. ```String jmeno = File.separator + "ppa1" + File.separator + " data.txt";```
	- Třída File je z balíku java.io a původně se používala pro práci se soubory jako s celky (místo ```Path```, ```Paths```, a ```Files```)
- Pokud místo této proměnné použijeme přímo jedno z lomítek, pak je lepší použít obyčejné lomítko „/“, protože funguje na Linuxu i na Windows
- Zpětné lomítko se navíc v Javě používá pro zápis speciálních znaků (např. „\n“ pro konec řádky) a je tedy nutné ho zdvojovat „\\“ 

#### Základní operace s cestou
- Rozhraní ```Path```
	- Používá se jako parametr v mnoha metodách třídy ```Files``` (jako parametr určující soubor či složku, se kterou bude metoda pracovat)
	- Soubor či adresář (složka) reprezentovaný instancí ```Path``` může, ale nemusí existovat
	- Obsahuje pouze operace pro práce s cestou samotnou
- Vytvoření nové instance
	- Nová instance se nevytváří konstruktorem, ale s využitím metody třídy ```get()``` pomocné třídy ```Paths```
		- POZOR!
			- Jedná se o jinou třídu než je rozhraní ```Path```
			- Její metoda třídy ```get()``` vrací instanci rozhraní ```Path```
	- ```Path cesta = Paths.get(retezecSCestou);```
	- Např. ```Path soubor = Paths.get("data.txt");```
	- Např. ```Path soubor = Paths.get("D:\\ppa1\\data.txt");```
	- Je vhodné používat ```File.sepearator``` pro oddělení jednotlivých názvů adresářů
- Absolutní cesta
	- Metoda ```toAbsolutPath()```
	- Vrátí novou instanci ```Path``` reprezentující soubor nebo složku jako absolutní cestu
		- Pokud už současná instance je absolutní cesta, vrátí stejnou instanci
		- Pokud je současná instance relativní cesta, vytvoří z ní absolutní doplněním aktuálního adresáře (složky)
- Zjištění jména souboru či adresáře (složky)
	- Metoda ```getFileName()```
	- Vrátí poslední položku cesty (za posledním oddělovačem)
		- Pokud je cesta ukončena oddělovačem, nevadí to, metoda stejně vrátí poslední položku cesty, nikoliv prázdný řetězec
- Převod na ```File``` (dříve používáno místo ```Path```) a obráceně 
	- Metoda instance ```Path.toFile()```
		- Převede instanci ```Path``` na instanci ```File```
	- Metoda instance ```File.toPath()```
		- Převede instanci ```File``` na instanci ```Path```
	- Převod na řetězec
		- Standardní metoda ```toString()```

#### Práce se souborem nebo adresářem pomocí třídy Files
- Třída ```Files``` obsahuje mj. metody pro práci se souborem či adresářem jako celkem
	- Jedná se o metody třídy a jako parametr mají instanci rozhraní ```Path``` určující, s jakým souborem mají pracovat
	- Metody třídy ```Files``` pro práci se soubory a adresáři jako s celkem obecně vyhazují konkrétní výjimku odvozenou typicky od ```IOException```, podle toho, k jakému problému dojde
- Zjištění existence souboru
	- Metoda ```Files.exists(soubor)```
		- Vrátí ```true```, pokud zadaný soubor nebo adresář (instance ```Path```) fyzicky existuje na disku, jinak vrátí ```false```
- Zjištění, zda se jedná o adresář
	- Metoda ```Files.isDirectory(soubor)```
		- Vrací ```true```, pokud je zadaný souboru (instance ```Path```) adresář
		- Pokud objekt neexistuje, nebo je to soubor, vrací ```false```
- Zjištění informací o souboru nebo adresáři 
	- Metoda ```Files.getLastModifiedTime(soubor)```
		- Vrátí datum a čas poslední modifikace zadaného souboru nebo adresáře jako instanci třídy ```FileTime```
			- Metoda ```toString()``` této třídy vrací datum a čas v čitelném formátu
		- Pro neexistující soubory nebo adresáře vyhodí výjimku
	- Metoda ```Files.size(soubor)```
		- Vrátí velikost souboru v bytech
		- Pro neexistující soubor vyhodí výjimku
		- Pro adresář vrátí 0 
- Smazání souboru či adresáře 
	- Metoda ```Files.delete(soubor```
		- Smaže soubor nebo adresář
		- Pokud soubor nebo adresář neexistuje, nebo adresář není prázdný, vyhodí výjimku
- Přejmenování/přesunutí souboru či adresáře
	- Metoda ```Files.move(původníSoubor, cílovýSoubor)```
		- Přejmenuje nebo přesune soubor nebo adresář
		- Při neúspěchu (např. cílový soubor již existuje) vyhodí výjimku
- Kopírování souboru či adresáře
	- Metoda ```Files.copy(původníSoubor, cílovýSoubor)```
		- Překopíruje soubor nebo adresář
		- Pokud se jedná o adresář, nezkopíruje se jeho obsah
		- Při neúspěchu vyhodí výjimku
- Vytvoření adresáře
	- Metoda ```createDirectories(adresář)```
		- Vytvoří adresář (v případě nutnosti všechny dosud neexistující adresáře v cestě)
		- Při neúspěchu vyhodí výjimku

## Souborový vstup a výstup
- Dosud jsme vstupní data četli z klávesnice (standardní vstup) a vypisovali výstupní data na obrazovku (standardní výstup)
- Je však běžné, že programy čtou a zapisují vstupní a výstupní data z a do souborů

### Proudový vstup a výstup dat 
- Na vstupní a výstupní operace lze nahlížet tak, že se jedná o proud dat (stream)
	- To má tu výhodu, že zdroj dat (source – v případě vstupu) nebo cíl dat (target – v případě výstupu) mohou být různých typů (např. klávesnice/obrazovka nebo vstupní/výstupní soubor) a program tento proud dat zpracovává stejným způsobem
	- Tj. můžeme pracovat stejně s různými zdroji a cíli dat, liší se pouze počáteční inicializace zdroje a/nebo cíle 

#### Vlastnosti proudu dat
. Základní vlastnost – „teče spojitě vpřed“
	- Není možné se v něm vracet, nebo přeskakovat dopředu
		- Tyto možnosti ale prakticky nejsou potřeba příliš často
- Typické zdroje dat jsou
	- Klávesnice, soubor a síťové spojení
- Typické cíle dat jsou
	- Obrazovka, soubor a síťové spojení
- Klávesnici a obrazovku jsme používali ve všech příkladech uvedených doposud
- Na soubory se zaměříme nyní
- Síťové spojení bude probráno v navazujících předmětech


### Typy souborů
- **Soubory** se dají rozdělit na **textové** a **binární**
- Oba typy souborů **obsahují pouze binární čísla**
	- V textovém souboru jsou jednotlivé byty interpretovány jako znaky v pevně
daném kódování
	- V binárním souboru je význam jednotlivých bytů dán aplikací, která soubor zapisuje a/nebo čte
		- I binární soubor lze zobrazit jako textový, ale typicky uvidíme jen změť znaků, ze které se nic užitečného nedozvíme 

#### Textové soubory
- Připomínají vstup z klávesnice
- Jsou **čitelné pro člověka** (obsahují prostý text)
	- POZOR!
		- Nejde o soubory textových procesorů (např. MS Word), které sice obsahují mj. text, ale kromě něj i jeho formátování, styly, obrázky, atd.
	- Jde o soubory čitelné (zobrazitelné) obecným textovým editorem (např. PSPad, Notepad++, Poznámkový blok)
- Jsou organizovány po řádcích
	- Ve skutečnosti je v souboru jen posloupnost znaků (do důsledku binárních čísel), která do řádků organizovaná není => je potřeba konce řádků vyznačit 
	- Pro vyznačení se používají značky konce řádku
		- Značky se skládají z jednoho či dvou znaků (bytů) označovaných ```<CR> ```(znak '\r' v Javě, dekadické číslo znaku 13)a ```<LF>``` (znak '\n' v Javě, dekadické číslo znaku 10)
	- Konkrétní značka závisí na systému
		- Windows
			- ```<CR><LF>```
			- Pořadí je důležité, ```<LF><CR>``` není chápána jako značka konce řádku 
		- Linux
			- ```<LF>```
		- Mac OS/OS X
			- Dříve ```<CR>``` (do Mac OS verze 9)
			- Novější verze ```<LF>```
		- V Javě stačí zapsat znak '\n' a Java doplní konec řádku podle toho, na jakém operačním systému je spuštěna 
	- Textový soubor zapsaný v jednom operačním systému nemusí mít správně zobrazené řádky v jiném operačním systému 
		- Záleží na konkrétním programu, který otevírá textový soubor, většina textových editorů umí správně zobrazit konce řádků ze všech běžných operačních systémů
- Typická univerzální přípona je ```.txt```
	- Pouze dodržovaná konvence
- Textové soubory mohou mít i mnoho jiných specifických přípon podle toho, o jaký soubor se jedná 
	- Zdrojové soubory programovacích jazyků
		- ```.java, .cpp, .c, .h, .pas, .js, .php``` a další 

#### Binární soubory
- Pro běžného uživatele jsou mnohem častější
- Běžné binární soubory 
	- Obrázky
		- ```.jpg, .png, .gif, .bmp``` a další
	- Hudba
		- ```.mp3, .ogg, .wav``` a další
	- Video
		- ```.avi, .mp4, .mkv, .mov``` a další
	- Komprimované archivy
		- ```.zip, .rar, .7z``` a další
	- Dokument MS Word, MS Excel
		- ```.doc, .docx, .xls, .xlsx```
	- Soubory ```.docx``` a ```.xlsx``` jsou ve skutečnosti komprimované složky obsahující množství ```xml``` souborů, obrázky a další data
- Nejsou čitelné pro člověka a nejsou uspořádané po řádcích
	- Pro jejich prohlížení a editaci jsou potřeba specializované programy (např. přehrávače médií pro hudbu a video) 
- Jejich vnitřní organizace je daná formátem souboru 
	- Formát souboru je indikován příponou 
		- Tu ale lze libovolně měnit (je to jen součást názvu souboru), proto nemusí odpovídat skutečnému obsahu souboru
		- Nesoulad přípony a skutečného obsahu souboru někdy působí potíže prohlížečům daného formátu (soubor nemusí jít otevřít)
		- Jak formát vypadá – tj. co který byte znamená a jaké jsou povolené hodnoty – závisí na tvůrci formátu 

#### Výhody a nevýhody textových a binárních souborů
- Výhody textových souborů 
	- Jsou čitelné pro člověka
		- Člověk dokáže informaci přečíst, ale to nutně nemusí znamenat, že jí porozumí
			- Např. řádka ```21, 37, 54, diference 0.3888``` je sice čitelná, ale těžko říci, co znamená 
	- Je možné je číst a upravovat obecným textovým editorem
- Nevýhody textových souborů
	- Stejné množství informace většinou zabírá více místa
	- Pomalejší zpracování (čtení/ zápis kvůli převodu z/do čitelné formy) 
- Výhody binárních souborů
	- Paměťově úspornější
	- Rychlejší zpracování
- Nevýhody binárních souborů
	- Pro každý formát či skupinu formátů je potřeba speciální prohlížeč
	- Nečitelnost v případě nedokumentovaných proprietárních formátů 
		- Tuto vlastnost někteří výrobci považují za výhodu
- V dalším textu se budeme zabývat proudovým čtením a zápisem textových souborů, pokud nebude řečeno jinak

### Využití prostředků pro standardní vstup/výstup 
- Již dříve jsme využívali přesměrování standardního vstupu a/nebo výstupu pomocí prostředků operačního systému
	- rogramy vytvořené pro práci se standardním vstupem a výstupem fungovaly i po přesměrování vstupu a/nebo výstupu bez problémů
	- Prostředky použité pro čtení standardního vstupu a zápis do standardního výstupu lze tedy použít i pro práci se soubory 
- Pro práci se soubory obecně platí (bez ohledu na to, jaký prostředek použijeme)
	- Soubor (vstupní i výstupní) je nutné před použitím otevřít
		- Soubor se připraví pro čtení a/nebo zápis, konkrétní soubor na disku se „spojí“ s prostředkem pro práci se souborem
		- Většinou se provede už při vytvoření instance prostředku pro práci se souborem 
	- Soubor (vstupní i výstupní) je vhodné po posledním použití uzavřít
		- Konkrétní soubor na disku se „odpojí“ od prostředku pro práci se souborem
		- Provede se voláním metody ```close()``` nebo automaticky při využití konstrukce ```try```-with-resources
		- Všechny otevřené soubory jsou automaticky uzavřeny JVM po ukončení programu, takže nehrozí, že by zůstaly otevřené
		- Při čtení ze souboru se z hlediska obsahu souboru nic nestane, pokud soubor neuzavřeme
			- Souborů, které mohou být najednou otevřeny, je však omezený počet
			- Pokud je soubor otevřen, typicky do něj nelze zapisovat jinou aplikací
		- Při zápisu do souboru se může stát, že se data nezapíší všechna, pokud soubor neuzavřeme
	- Téměř vždy je nutné ošetřit výjimky (typicky odvozené od ```IOException```)
		- Čtení a zápis do souboru je operace, která může často selhat z nejrůznějších příčin, které často nejsou ovlivnitelné naším programem
		- Proto je ošetření nutné (```IOException``` je kontrolovaná výjimka a je vyhazována většinou metod pro práci se soubory)

#### Použití třídy Scanner pro čtení ze souboru
- Třídu ```Scanner``` lze přímo použít pro čtení ze souboru
- Stačí do konstruktoru uvést soubor místo standardního vstupu (```System.in```) 
	- Nelze uvést pouze název souboru, je potřeba vytvořit instanci rozhraní ```Path```
	- ```Scanner s = new Scanner(Paths.get("vstup.txt"));```
		- POZOR!
			- Instance rozhraní ```Path``` se vytváří metodou třídy ```get()``` třídy ```Paths```
	- Je nutné ošetřit ```IOException```
- Test konce souboru
	- Protože se často může stát, že nevíme, kolik hodnot či řádek je ve čteném souboru uvedeno, lze využít metody pro testování, zda se v souboru nachází další hodnota daného typu 
		- Pokud ne, lze skončit
	- Metody ```hasNextTyp()```
		- Např. metoda ```hasNextInt()```
			- Vrací ```true```, pokud je ve vstupním souboru další celé číslo
		- Např. metoda ```hasNextDouble()```
			- Vrací ```true```, pokud je ve vstupním souboru další reálné číslo
		- Např. metoda ```hasNext()```
			- Vrací ```true```, pokud je ve vstupním souboru další řetězec
		- Např. metoda ```hasNextLine()```
			- Vrací ```true```, pokud je ve vstupním souboru další řádka
