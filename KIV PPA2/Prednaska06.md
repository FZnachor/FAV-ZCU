# Odstranění rekurze

**Proč?**
- problémy s hloubkou zanoření (velikost zásobníku je malá)
- neefektivní , protože se při volání metod kopírují hodnoty skutečných parametrů do zásobníku

### Koncová rekurze

- kód končí jediným rekurzivním voláním
- nejjednodušší druh rekurze, je snadné přepsat na cyklus

### Eliminace vlastním zásobníkem

- použití zásobníku jako seznamu úkolů (například třída `Task`)
- položky v zásobníku budou obsahovat:
	- co se má udělat (parametry)
	- v jaké čísti úkolu jsme (segment)
	- data nutná pro pokračování výpočtu (mezivýsledky)
- pokud je potřeba pro dokončení úkolu rekurze, přidá se do zásobníku nový úkol
- až se dojde k triviálnímu úkolu, data se předají dalšímu úkolu

**Jak rekurzi odstranit?**
- rozdělíme kód na segmenty mezi rekurzivními voláními
- na začátku do zásobníku vložíme pouze hlavní úkol
- zpracováváme položky zásobníku, dokud není prázdný
- místo rekurzivního volání:
	- uložíme stav výpočtu položky na vrcholu zásobníku (stavové proměnné)
	- zvýšíme segment na vrcholu zásobníku (jsme o jednu část úkolu dál)
	- do zásobníku přidáme nový úkol reprezentující rekurzi
	- ukončíme zpracování aktuálního úkolu (smyčka se k němu vrátí později)
- místo vrácení hodnoty:
	- uložíme výsledek do proměnné `result`
	- odebereme úkol z vrcholu zásobníku
- při pokračování dalším segmentem:
	- obnovíme stavové proměnné z položky na vrcholu zásobníku
	- výsledek posledního rekurzivního volání se nachází v proměnné `result`
- na konci vrátímě proměnnou `result`

**Závěr**
- každou rekurzivní funkci je možné přepsat bez použití rekurze
	- pracný mechanický postup
	- horší přehlednost kódu
	- potřeba implementace zásobníku
- přepsání bez rekurze zachovává třídu složitosti (nezajišťuje efektivitu)
- pro nalezení efektivnější implementace mechanický postup neexistuje

# Fronta

- abstraktní datová struktura
- podobá se zásobníku
- FIFO - first in, first out

**Operace**
- přidání prvku na konec
- vybrání prvku na začátku začátku
- odebrání prvku na začátku začátku

### Implementace spojovým prvkem

- velmi podobná zásobníku
- kromě odkazu na první prvek uchovává i **odkaz na poslední prvek**

**Složitost operací**
- všechny $\Theta(1)$
- vyšší náročnost na paměť

### Implementace polem

- velmi podobná zásobníku
- po odebrání vznikají prázdná místa v poli
	- je možné je využít pro přidávání
- struktura obsahuje:
	- index prvního prvku
	- počet obsazených indexů
- při přidávání prvku:
	- kontrolujeme, jestli se prvek do pole vejde
		- pokud je **místo na začátku**, vložíme prvek na začátek pole
		- pokud je **pole plné** zvětšíme pole a zkopírujeme od indexu prvního prvku až do délky pole
	- využijeme modula - pomocí něj index "přeteče" na začátek pole
		- máme pole o 5 prvcích
		- vkládáme na index 5, nicméně 5 % 5 je 0 (začátek pole)

**Složitost operací**
- vybrání/odebrání prvního prvku $\Theta(1)$
- přidání prvku na konec:
	- většinou $\Theta(1)$
	- při zvětšení pole $\Theta(n)$
	- v průměru $\Theta(1)$

# Třídy s typovým parametrem

- často potřeba kolekce pro různé datové typy
- není vhodné vytvářet samostatné kolekce (třídy) pro různé datové typy

### Řešení pomocí Object

- všechny třídy dědí z Object
- vkládání není problém
- při vybrání prvku je potřeba **jej přetypovat**
- případná chyba se objeví až za běhu programu

**Obalovací třída**
- anglicky wrapper
- poskytuje metody, které provádějí **přetypování na správnou třídu**
- skrývá vnitřní implementaci s `Object`
- je potřeba ji vytvořit pro každý datový typ

**Generická třída**
- třída s typovým parametrem `class MyStack<T>`
	- datový typ `Object` poté nahradíme typem `T`
	- bohužel nefunguje všude
		- typ `T` pouze přebíráme a vracíme
		- vnitřně používáme `Object`, který poté přetypujeme
- typovým parametrem nemůže být primitivní datový typ
	- využijeme obalovací třídu (`Integer`, `Double`, ...)
	- přetypování (boxing a unboxing) probíhá automaticky, je ale dobré o něm vědět
- někdy je potřeba, aby typový parametr něco uměl
	- je možné použít rozhraní
	- `class MyStack<T extends IProcessable>`
	- pokud potřebujeme použít nějakou metodu tohoto rozhraní ve třídě, můžeme `Object` přetypovat na `T`