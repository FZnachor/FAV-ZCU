**Počet koster úplného grafu (různých)**
- Věta (Cayleyho formule)
	- počet různých koster úplného grafu $K_{n}$ je $n^{n-2}$
	- [= počet různých stromů na $n$ vrcholech]

**Incidenční matice** [vrcholově-hranová inc. matice]
- or. graf G bez smyček, $G = (V, E), V = \{ v_{1}, \dots, v_{n} \}, E = \{ e_{1}, \dots, e_{n} \}$
- $M(G) = (m_{ij})_{i = 1, \dots, n}^{j = 1, \dots, n}$ typu $n/m$
- $m_{ij} \begin{cases} 1 \quad \text{pokud hrana } e_{j} \text{ začíná ve vrcholu } v_{i}\\-1 \quad \text{pokud hrana } e_{j} \text{ končí ve vrcholu } v_{i}\\0 \quad \text{ jinak (} e_{j} \text{ nekoliduje s } v_{i}\text{)} \end{cases}$
- v každém sloupci je právě jedna 1 a právě jedna -1
- sloupce odpovídají dvěma protichůdným hranám (jsou lineárně závislé)

**Incidenční matice** neor. grafu
- $M(G) = (m_{ij})$ typu $n/m$
- $m_{ij} \begin{cases} 1 \quad \text{pokud hrana } e_{j} \text{ inciduje s vrcholem } v_{i}\\0 \quad \text{ jinak} \end{cases}$

**Matice sousednosti**
- $A(G) = (a_{ij})$ řádu n
- $a_{ij} = \begin{cases} 1 \quad \text{v G existuje hrana }(i,j)\\ 0 \quad \text{jinak} \end{cases}$
- obecně A není symetrická
- pro neor. graf G (matice symetrické orientace)

**Laplaceova matice** neor. grafu G na n vrcholech
- $L(G) = (l_{ij})$ řádu n (symetrická)
- $V = \{ v_{1}, \dots, v_{n} \}$
- $l_{ij} = \begin{cases} \deg(v_{i}) \quad \text{pro } i=j \\ -1 \quad\qquad v_{i}v_{j} \in E(G) \\ 0 \qquad\qquad \text{jinak} \end{cases}$
- redukovaná Laplaceova matice $L_{R}$
- Tvrzení:
	- neor. graf G, H lib. (pevná) orientace grafu G
	- pak platí $L(G) = M(H) \cdot M^T(H)$ $\quad [L_{R}(G) = M_{R}(H) \cdot M_{R}^T(H)]$
- Věty (2 lim. alg.):
	- matice A řádu n, B typu n/m
	- pokud $A = B \cdot B^T$, pak A je pozitivně semidefinitní
	- p.s.d. matice má nezáporná vl. čísla
	- Laplaceova matice neor. grafu je pozitivně semidefinitní

**Vlastnosti incidenční matice orientovaného grafu**
- G or. graf, $G = (V, E), V = \{ v_{1}, \dots, v_{n} \}, E= \{ e_{1}, \dots, e_{n} \}$
- $M(G) = (m_{ij})$
- Tvrzení:
	- or. graf G, buď K slabá komponenta G, pokud $\sum_{i=1}^{n} \alpha_{i}v_{i} = 0$, pak všechny $v_{i}$ komponenty K jsou si příslušné koeficienty $\alpha_{i}$ rovny
- Pozorování:
	- množin řádků M(G) je LZ (součet všech je nulový ř.)
	- $\text{hod}(M(G)) < n$
- Věta:
	- G or. slabě souvislý graf, pak $h(M(G)) = n-1 \quad (n = \vert  V(G)\vert)$
	- dokonce lib. podmnožina $n-1$ řádků je LN
- Věta:
	- or. graf F má k slabých komponent $\iff \text{hod}(M(G)) = n-k$

**Kostra orientovaného grafu**
- G or. graf, H je kostra G, pokud symetrizace H je kostrou symetrizace G a H neobsahuje protichůdné hrany a smyčky
- značení: M(G), S množina sloupců M(G)
	- $F_{S}$ ... faktor přiřazený vybrané množině sloupců S
	- $e_{i} \in F_{S} \iff e_{i} \in S$
- Věta:
	- G slabě souvislý or. graf bez smyček, potom čtvercová podmatice $A_{S}$ matice $M_{R}(G)$ řádu $n-1$ je regulární $\iff$ odpovídající faktor $F_{S}$ je kostrou G