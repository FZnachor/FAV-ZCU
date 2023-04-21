**Vlastnosti souvislých grafů**
- Věta: G je souvislý, m hran, n vrcholů, pak
	1) $m \geq n - 1$
	2) pokud $n \geq 2$, pak v G existuje $v, v \in V(G)$ tak, že $G \setminus u$ je souvislý, $G \setminus v$ je souvislý

**Orientované grafy**
- Def: orientovaný graf je dvojice $G = (V, E)$, V je množina vrcholů, E je množina hran, $E \leq V \times V$
- orientované grafy odpovídají binárním relacím

**Speciální grafy**
- orientovaná cesta $P_{n}(\vec{P_{n}})$
- cyklus $C_{n}(\vec{C_{n}})$

**Podgrafy a spol.**
- G orientovaný graf
- **podgraf**: $H \leq G : V(H) \leq V(G), E(G) \leq E(G)$
- **indukovaný podgraf**: $H \leq G : V(H) \leq V(G), E(H) = E(G) \cap (V(H) \times V(H))$
- **faktor**: $V(H) = V(G), E(H) \leq E(G)$
- **vlastní faktor**: H je vl. faktor G : H je faktor $\wedge H \neq G$

**Symetrizace orientovaného grafu**
- symetrizace H, or. graf G
- z hran v G "odmažu" orientaci
- smažu násobné hrany
- smažu smyčku
- $E(H) = \{ \{x, y\} | (x, y) \in E(G), x \neq y \}$
- $V(H) = V(G)$
- orientace neorientovaného grafu H - přiřaďme orientaci neorientovaným hranám
- $2^n$ možných orientací
- v orientaci neor. grafu nejsou smyčky ani prituchůdné hrany

**Okolí a stupně v orientovaných grafech**
- G or. graf, $G = (V, E)$
- $v \in V(G)$
- $N^{out}(v) = \{ u \in V(G) \mid (v, u) \in E(G) \}$
	- vstupní okolí $N^+, N^-$
- $N^{in}_{G}(v) = \{ u \in V(G) \mid (u, v) \in E(G) \}$
- výstupní stupeň
	- $d^{out}_{G}(v) = \vert N^{out}(v) \vert$
- vstupní stupeň
	- $d^{in}(v) = \vert N^{in}(v) \vert$
- $\sum_{ n\in V(G)} d^{out}_{G}(v) = \sum_{n \in V(G)} d^{in}_{G}(v) = m$
	- m je # hran or. grafu
	- D: každá hrana započtena 1x

**Slabá souvislost** or. grafu G
- Def: or. graf G je slabě souvislý, pokud je jeho symetrizace souvislá
	- $\to$ komponenty slabé souvislosti

**Orientované sledy, tahy a cesty**
- **orientovaný sled** - posloupnost vrcholů $v_{1}, v_{2}, \dots, v_{l}$ tak, že $(v_{i}, v_{i+1}) \in E(G)$
- **orientovaný tah** - neopakují se hrany
- **orientovaná cesta** - neopakují se vrcholy
- další 3 možné pohledy
	- uzavřený orientovaný sled - počáteční a koncový vrchol posloupnosti stejné
	- uzavřený orientovaný tah
	- cyklus (uz. or. cesta)
- Def: orientovaný graf G je **silně souvislý**, pokud $\forall$ dvojice vrcholů $x, y \in V(G)$ platí, že v G $\exists$ orientovaný xy-sled (cesta) $\wedge \, \exists$ or. yx-sled (cesta)
	- nejkratší or. xy-sled je xy-cestou
- Věta: G je or. graf, slabě souvislý
	- G je silně souvislé $\iff$ každá hrana je obsažena v nějakém cyklu

**Relace oboustranné dosažitelnosti**
- or. G, $x, y \in V(G)$
- relace ob. dosažitelnosti $x \sim y$, pokud $\exists$ or. xy-sled $\wedge \, \exists$ or. yx-sled
	- reflexivní
	- symetrická
	- tranzitivní - $x \sim y \wedge y \sim z \implies x \sim z$
	- je to ekvivalence
- $\implies$ rozklad V(G) na třídy ekvivalence
- silná komponenta - je podgraf indukovaný na třídě ekvivalence (maximální silně souvislý podgraf)

**Kondenzace** or. grafu G
- $V_{C} =$ množina silných komponent G
- $G_{C} = (V_{C}, E_{C})$
- $Q_{1}Q_{2} \in E_{C}$, pokud v G $\exists \, x_{1} \in V(Q_{1}), \exists \, x_{2} \in V(Q_{2})$ tak, že $(x_{1}, x_{2}) \in E$

**Acyklické or. grafy**
- or. graf bez cyklů
- Acyklické grafy odpovídají POSETům
- sledová relace [walk relation] $\quad x\sim y \quad x, y \in V(G)$, pokud $\exists$ or. xy-sled
	- reflexivní $x\sim y$ [sled nulové délky]
	- antisymetrická
	- tranzitivní
- každý POSET odpovídá sledová relace nějakého acykl. grafu [bisekce]
- minimální prvky $\quad d^{in}_{G}(v) = 0\quad$ - vstupní vrchol
- maximální prvky $\quad d^{out}_{G}(v) = 0\quad$ - výstupní vrchol
- každý podgraf acyklického grafu je acyklický [acyklicita je dědičná]
- $\implies$ každý acyklický graf má topologické uspořádání vrcholů (odtrhávání vstupních vrcholů a jejich postupné číslování)
- lineární (topologické) uspořádání
	- očíslování vrcholů ac. grafu tak, že $(i,j) \in E(G) \implies i < j$
- or. graf G je acyklický $\iff$ vrcholy G lze lineárně uspořádat
- Věta: G or. graf
	1) kondenzace $G^C$ je acyklická
	2) G je silně souvislý $\iff$ $G^C$ má jediný vrchol
	3) G acyklický $\iff G^C = G$

**Matice přířazené grafům** (or. & neor.)
- Laplaceova matice L(G) neorientovaného grafu G řádu $n = \vert V(G) \vert$
- redukovaná Laplaceova matice $L_{R}(G)$
	- vynecháním i-tého řádku a i-tého sloupce pro nějaké (pevné) i
- Věta: počet různých koster neor. grafu G je roven $\det L_{R}(G)$