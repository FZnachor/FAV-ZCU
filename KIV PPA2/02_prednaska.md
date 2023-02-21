# Generické programování
- **generické** = obecné, společné
- snaha podchytit společné vlastnosti různých algoritmů/datových struktur
- antonymum - specifické
- cíle:
    - **umožnit záměnu** různých generických implementací splňující nějaká generická kritéria
    - **umožnit sdílení** generického kódu

## Rozhraní (interface)
- popisuje, co nějaká třída umí: hlavičky metod
- neříká nic o tom, jak jsou metody implementovány
- různé třídy mohou implementovat stejné rozhraní
- jedna třída může implementovat více rozhraní
- **klientský kód** pracuje s rozhraním, jako by to byla třída
    - volá metody definované v rozhraní
- název rozhraní se může objevit všude tam, kde se očekává název třídy
- název rozhraní => **velké písmenko I** na začátku

## Abstraktní třída
- chová se podobně jako rozhraní
- říká co musí být implementováno (hlavičky metod)
- **může obsahovat** i **implementaci některých metod**
- nelze vytvořit instanci
    - => třída není úplná
- ostatní třídy pak mohou od abstraktní třídy "**dědit**"
    - **musí poskytnout implementaci chybějících metod** (jako u rozhraní)
    - atributy abstraktní třídy se stanou součástí odděděné třídy
    - **metody implementované v abstraktní třídě se stanou součástí odděděné třídy**

## Dědičnost
- dědit lze i od třídy, která není abstraktní
    - je možné dodat další funkcionalitu
    - je možné upravit existující funkcionalitu (tzv. **přepsání** metody)
- pokud předka neuvedeme, je předkem třída ```object```
    - ```object```je tudíž (pra)předkem **každé** třídy
    - dědí se některé metody (uvidíme časem jaké a proč)
- dědit lze vždy jen od **jednoho** předka
- referenci na potomka je možné kdykoli přetypovat na referenci na předka
    - přetypovává se **reference**, nikoli instance samotná
    - obráceně ne (runtime error) => předek nemusí implementovat vše co potomek
    - každou referenci je možné přetypovat na referenci na ```Object```

## Polymorfismus
- instanci potomka lze použít všude kde se očekává předek
    - parametr metody
    - pole předků
    - ...

# Rekurzivní programy
- programy, které volají sami sebe
- rekurze, musí někdy skončit!

## Přímá rekurze
- metoda volá přímo sebe sama
- je vidět na první pohled

## Nepřímá rekurze
- ```a``` volá ```b```, ```b``` volá ```a```

## Problémy rekurze
- problémy s hloubkou zásobníku
    - spíše programátorská chyba => přetečení zásobníku
    - pro mnoho praktických problémů je rekurze dostatečná
    - Java umožňuje nastavit velikost zásobníku
- často lze zapsat do nerekurzní formy
    - nerekurzivní => často rychlejší
    - zrychlení se projeví, pokud je samotný vykonávaný kód triviální
    - někdy je přepsání poměrně složité