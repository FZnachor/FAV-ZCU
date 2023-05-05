- Def.: matice A je totálně unimodulární, pokud determinant lib. čtvercové podmatice je $0, +1, -1$ (A má prvky $0, \pm1$)
- Věta: incidenční matice M(G) or. grafu G je totálně unimodulární
- Věta (Cauchy-Binet): B matice typu  $r \times s$, pak platí
	- $\det(B \cdot B^T) = \sum_{I} \det^2(B_{I})$, kde se sčítá přes všechny r-prvkové podmnožiny množiny sloupců B
- Věta: G slabě souvislý or. graf. $L_{R} = M_{R} \cdot M_{R}^T$, kde $M_{R}$ je redukovaná inc. matice G
	- pak platí, že počet různých koster $G = \det L_{R}$ [$L_R$ je red. Lapl. matice sym. or. G]

**Incidenční matice neorientovaných grafů**
- prvky M jsou 0, 1 - chápeme jako prvky tělesa $\mathbb{Z}_{2}$
- řádky M jsou prvky lineárního prostoru $\mathbb{Z}_{2}^m$ nad $\mathbb{Z}_{2}$
- spec. vektory v $\mathbb{Z}_{2}^m$ jsou LN $\iff \exists$ jejich neprázdná podmnožina s nulovým součtem 
- Věta: G neorientovaný graf
	1) hodnost $M(G)$ nad $\mathbb{Z}_{2}$ je $n-k$ $\iff$ má $k$ komponent
	2) G souvislý, pak každých $n-1$ řádků matice $M(G)$ tvoří LN množinu nad $\mathbb{Z}_{2}$
	- značení: $\text{hod}_{2}(A) \dots$ hodnost A nad $\mathbb{Z}_{2}$

**Matice sousednosti a počty sledů**
- G or. graf, A(G) matice sousednosti
- $A(G) = (a_{ij}), G$ má $n$ vrcholů, $A(G)$ má řád $n$
- $A^o(G) = I_{n}, I_{n}$ jednotková matice řádu $n$
- $A^k(G) = (a_{ij}^{(k)})$
- Věta: G orientovaný graf, $k \geq 0$ (celé)
	- pak $a_{ij}^{(k)}$ matice $A^k(G)$ je roven počtu $v_{i}v_{j}$-sledů délky přesně $k$ v $G$

**Test nilpotentnosti 0-1-matice**
- Tvrzení: or. graf G je acyklický $\iff$ nějaká mocnina matice A(G) je nulová [$\exists \, k \geq 0 : A^k(G) = 0$]

**Vzdálenost v grafech**
- Def.: G or. graf, vzdálenost $d(x,y)$ vrcholu y od x je délka nejkratší xy-cesty v G
	- pokud v G neex. xy-sled, pak $d(x,y) = \infty$
- analogicky pro neor. grafy
	- $d(x,y) = d(y,x)$
- Věta: G souvislý neor. graf, pak $d(x,y)$ je metrikou na V(G)
	1) $d(x,y) \geq 0, d(x,y) = 0 \iff x = y$ [pozitivní definitnost]
	2) $d(x,y) = d(y,x)$ [symetrie]
	3) $d(x,y) + d(y,z) \geq d(x,z)$ [trojúhelníková nerovnost]
- v or. grafech neplatí 2)
- Def.: distanční matice or. grafu G s vrcholy $v_{1}, \dots, v_{n}$ je matice řádu n
	- $D(G) = (d(v_{i}, v_{j}))^n_{i,j=1}$
- Tvrzení: prvek $d(v_{i}, v_{j})$ distanční matice D(G) je roven nejmenšímu k, pro které $a_{ij}^{(k)} \neq 0$ a pokud takové k neexistuje, pak $d(v_{i}, v_{j}) = \infty$

**Ohodnocené grafy**
- Def.: ohodnocený or. graf (G, w) je or. graf $G = (V, E)$ spolu s funkcí $w : E(G) \to (0, +\infty)$
	- $w(e) \dots$ váha (ohodnocení) hrany e
- Pozn.: neohodnocené grafy lze (často) považovat jako ohodnocené grafy s ohodnocením 1
- Def.: vážená matice sousednosti ohodnoceného or. grafu (G, w) s vrcholy $v_{1}, \dots, v_{n}$ je matice $W(G) = (w_{ij})$
	- $w_{ij} = \begin{cases} w(v_{i}, v_{j}) \quad (v_{i}, v_{j} \in E), i, j = 1, \dots, n \\ 0 \end{cases}$
- Pozn.: k ohodnocenému grafu se přiřadí nezáporná čtvercová matice
	- teorie nezáporných matic [Perrou/Frobenius]
- Def.: minimální cesta z u do v je každá cesta, jejíž váha je minimální
	- vážená vzdálenost $d^w(u, v)$ vrcholu v od u je váha (lib.) minimální cesty z u do v