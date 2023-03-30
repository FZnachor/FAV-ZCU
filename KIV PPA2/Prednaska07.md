# Seznam

- abstraktní datová struktura
- umožňuje vložení i odebrání prvku z jakékoliv pozice

Jak specifikovat pozici?
- indexem
- aktuální pozice

### Ukazovátko

- ukazuje na aktuální pozici v seznamu
- posun dopředu i na začátek
- operace v $\Theta(1)$
- **možné interpretace**:
	- ukazuje na prvek
		- některé operace problematické (např. vložení - před nebo za prvek?)
	- ukazuje mezi prvky
		- jednožnačné vkládání: sem
		- vybírání/odebírání dohodou - třeba prvek napravo

### Implementace spojovou strukturou

- opět spojovací dílek - data a následující prvek
- reference na první (`first`) a aktuální prvek (`current`)
- ukazovátko míří na `current` a `current.next`
- je-li `current = null`, míří se před první prvek seznamu
- **pohyb ukazovátka**:
	- `moveToFirst` - na začátek
	- `next` - na další prvek
		- potřeba myslet na posun z `null` a neexistující další prvek
- **přidávání** mezi dva prvky:
	- přepíše se odkaz `current.next` na vložený prvek
	- vloženému prvku se nastaví původní `current.next`
- **mazání** prvku
	- vyřešení speciálních případů (na začátku, na konci)
	- `current.next = current.next.next`, prvek se přeskočí
- **vybrání** prvku na zadané pozici
	- projdeme seznam od začátku
	- $\Omega(n)$ složitost!

### Iterátor

- seznam neumožňuje prácí **na více místech**
- vznik odděleného ukazovátka od dat - **iterátoru** (návrhový vzor)
- třída, která má aktuální index `current` a referenci `list
- stejná implementace jako u seznamu (místo `first` se použije `list.first`)`

**Operace**
- vybrání dat napravo (`get()`)
- posunutí doprava (`next()`)
- vrácení na začátek (`moveToFirst()`)
- přidání prvku na pozici (`insert(...)`)
- odstranění prvku napravo (`remove()`)
- vytvoření klonu (`clone()`), který ukazuje na stejný prvek

**Problémy**
- iterátory o sobě nevědí
	- jeden smaže prvek, na který odkazuje jiný iterátor
	- řešení
		- používat více iterátorů pouze pro čtení
		- při editaci zajistit, aby nebyl zasažen jiný iterátor 
- pohyb pouze dopředu
	- řešení: obousměrně zřetězený seznam
	- spojovací prvek s `next` i `previous `
	- v iterátoru nová metoda `previous()`
	- složitější konzistence struktury
	- 2x více režijní paměti

### Implementace paralelními poli

- jen dopředné zřetězení
- dvě stejně dlouhá pole
	- pro data
	- pro index následovníka (`next`) - prázdného či obsazeného prvku
- index začátku `first`
- index volného pole `empty`
- index aktuálního prvku `current`

# Kolekce v Javě

Java poskytuje knihovní třídy pro základní implementaci kolekcí

### Třída `LinkedList<T>`

- spojová datová struktura

**Operace**
- operace v $\mathcal O(1)$
	- `void addFirst(T)`, `void addLast(T)`
	- `T getFirst()`, `T getLast()`
	- `void removeFirst()`, `void removeLast()`
- operace v $\Omega(n)$
	- `void add(int, T)` - vložení na daný index
	- `T get(int)` - získání z indexu
	- `void remove(int)` - smazání z indexu
- `Iterator<T> iterator()`
- `ListIterator<T> listIterator()` - lepší iterátor

### Třída `ArrayList<T>`

- dynamické pole

**Operace**
- operace v $\mathcal O(1)$
	- `void add(T)`
	- `T get(int)`
- operace v $\Omega(n)$
	- `void remove(int)
- operace pro získání iterátorů - ale s **vyšší složitostí**!

### Třída `Iterator<T>`

**Operace**
- `T next()` - vrátí přeskočený prvek a posune se dopředu
	- na konci vyhodí výjimku
- `boolean hasNext()` - existence dalšího prvku
- `void remove()` - odstraní poslední prvek vrácený metodou `next()`
	- před dalším odstraněním potřeba zavolat `next()`
- chybí:
	- návrat na začátek (stačí si vyžádat nový iterátor)
	- metoda pro vložení prvku

**Vylepšený `ListIterator<T>`**
- má navíc:
	- `T previous()` - vrátí hodnotu předchozího prvku a posune iterátor zpět
		- na začátku vyhodí výjimku
	- `void add(T)` - vloží prvek na pozici iterátoru

### Rozhraní `Queue<T>`

- rozhraní fronty
- `LinkedList<T>` toto rozhraní implementuje

**Operace**
- `void add()`
- `T element()`
- `T remove()`

### Třída `Stack<T>`

implementace zásobníku dynamickým polem - `ArrayList`
- stejné metody poskytuje i `LinkedList`

**Operace**
- `void push(T)`
- `T pop()`
- `T peek()`

### Obecná zásada

Kolekce v čase $\mathcal O(1)$ umí buď
1) vybrat prvek na specifickém indexu, anebo
2) vyjmout/vložit prvek na pozici iterátoru,

ale nikdy ne obojí současně!

Najít i-tý prvek ve spojovém seznamu zabere vždy $\Omega(n)$.