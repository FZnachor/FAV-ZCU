# Grafy 2

#### Prohledávání do šířky (BFS)

**Strom dosažitelnosti**
- tvoří se z nějakého určeného vrcholu (kořen)
- ukazuje, jaká je nejkratší cesta do ostatních vrcholů
- reprezentován polem, kde na indexu vrcholu je uložen předek
- nemusí být jednoznačný (může existovat více nejkratších cest)


#### Prohledávánı́ do hloubky (DFS)

- Depth-First Search
- algoritmus postupuje do většı́ vzdálenosti od počátečnı́ho vrcholu, pokud může
+ předpokládáme, že označenı́ (mark) je před volánı́m DFS inicializováno na 0 pro všechny vrcholy
+ DFS je potřeba doplnit o nějaký užitečný kód
	+ záleží to na řešeném problému

**Značenı́ vrcholů**
- nezpracovaný (”bı́lá”), kód 0
- rozpracovaný (”šedá”), kód 1
- dokončený (”černá”), kód 2

**Složitost**
- rekurzivní metoda se pro každý vrchol volá pouze jednou - $\Omega(\vert V\vert)$
- pro každý vrchol se prochází seznam hran:
	- reprezentace maticí - $\Omega(\vert V\vert^2)$
	- reprezentace seznamem - $\mathcal{O}(\vert E\vert)$
- celkem: $\mathcal{O}(\vert V\vert + \vert E\vert)$ při reprezentaci seznamem
	- může být i $\Omega(\vert V\vert^2)$, pokud $\vert E\vert = k\vert V\vert^2$

**Použití DFS**
- Zjištění dosažitelnosti vrcholu
	- pokud předpokládáme, že bude vrchol daleko, je DFS vhodnější než BFS
+ Zjištění cyklu v grafu
	+ vrchol označíme jedničkou a poté ho znovu hledáme
+ Topologické řazení
	+ prvně je potřeba ověřit, že graf nemá cykly
	+ vrcholy jsou činnosti, hrany jsou závislosti
	+ hrana $A \to B$ značí, že se prvně musí vykonat A a potom až B
	+ pomocí DFS můžeme snadno určit pořadí činností (pomocí otočeného grafu)

**DFS bez rekurze**
- pravděpodobně nastanou problémy s hloubkou zásobníku
+ vystačíme si se zásobníkem celých čísel (vrcholů)
+ `segment` (jaký je stav vrcholu) je v označení vrcholu (`mark`)

**Nejkratší cesta v ohodnoceném grafu**
- velmi častý problém
- ohodnocení: čas, vzdálenost, ...
- úkol: nalézt nejkratší vzdálenost ke všem vrcholům
- **Dijkstrův algoritmus**
	- je potřeba prioritní fronta
		- přidání dvojice vrchol + ohodnocení
		- vybrání/odebrání vrcholu s nejmenším ohodnocením
		- změna ohodnocení vrcholu