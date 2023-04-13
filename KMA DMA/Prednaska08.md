Podgrafy
- mám graf G
- graf H je
	- podgrafem G, pokud platí
		- $V(H) \leq V(G), E(H) \leq E(G)$
	- indukovaným podgrafem G, pokud platí
		- $V(H) \leq V(G), E(H) = E(G) \cap {V(H) \choose 2}$
	- faktorem G, pokud
		- $H \leq G, V(H) = V(G)$
	- vlastním faktorem, pokud H je faktor G a $H \neq G$

Souvislost grafu
- **uv-sled** je posloupnost vrcholů $u = u_{0}, u_{1}, u_{2}, \dots, uu_{k} = v$ pokud platí, že $u_{i}u_{i+1} \in E(G) \quad \forall \, 0 \leq i \leq k-1$ (k je délka sledu = # hran)
- **uv-tah** - neopakují se hrany
- **uv-cesta** - neopakují se vrcholy
- různé pohledy na sledy:
	- posloupnost hran $e_{1}, e_{2}, \dots, e_{k}$ - 2 sousední hrany sdílí vrchol
	- posloupnost vrcholů a hran $v_{1}e_{1}v_{2}e_{2}\dots v_{k}e_{k+1}$ - $e_{i}$ spojuje vrcholy $v_{i}v_{i+1}$
- homomorfismus cesty
- nejkratší uv-sled je uv-cestou
- Def.: G je souvislý, pokud $\forall$ dva vrcholy u, v existuje G uv-sled (uv-cesta)
- Relace na množině vrcholů V(G)
	- $u, v \in V(G)$ jsou relací u a v, pokud eixstuje v G uv-sled (sledová relace)
- vlastnosti sledové relace
	- a) reflexivní - reiviální sled u nulové délky
	- b) symetrická
	- c) tranzitivní - složením sledů získám opět sled
		- reflexivní a tranzitivní = ekvivalnce - rozklad množiny V(G) na třídy ekvivalence
- komponenta grafu G ... indukovaný podgraf na třídě ekvivalence
	- maximální souvislé podgrafy (ve smyslu inkluze)
	- ? jak zjistit souvislost grafu (komponenty grafu)

Kružnice v grafech
- uzavřený sled ... sled začínající a končící stejným vrcholem
- uzavřený tah ... tah začínající a končící stejným vrcholem
- kružnice ... uzavřený sled délky alespoň 3 tak, že se v něm žádný vrchol (kromě počátečního a koncového) neopakuje
- Věta: G je souvislý a e leží na nějaké kružnici $\iff$ G-e je souvislý

Stromy
- neorientovaný souvislý graf bez kružnic
- list stromu - vrchol stupně 1
- les - graf, jehož každá komponenta je stromem
- Tvrzení: má-li strom T alespoň dva vrcholy, pak má alespoň dva listy
- Věta: G strom $\iff$ $\forall$ dva vrcholy $u, v \in V(G)$ existuje v G právě jedna cesta
- Věta: G strom $\iff$ G je souvislý a má n-1 hran
- Věta: G strom $\iff$ G je souvislý a nemá žádný souvislý vlastní faktor (odmazáním lib. hrany získm nesouvislý graf)

Kostry grafu
- kostra grafu (souvislého) je libovolný faktor izomorfní se stromem
- každý souvislý graf má kostru