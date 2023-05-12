Def.: matice vážených vzdáleností (w-distanční matice) ohodnoceného grafu otientovaného grafu $(G, w), G = (V, E), V = \{ v_{1}, v_{2}, \dots, v_{n} \}$ je matice $D^w(G)$ řádu n, příčemž
- $D^w(G) = (d^w(v_{i},v_{j}))^n_{i,j=1}$

Def.: 
- $k \geq 0, k \in \mathbb{Z}$
- cesta z $v_{i}$ do $v_{j}$ je k-minimální, pokud její délka (nevážená) je nejvýše k a mezi všemi takovými cestami je minimální (tj. neexistuje cesta délky k s vahou menší)

Matice $D_{k}$ - matice, jejíž prvek $d^k_{ij}$ na pozici $(i,j)$ je roven váze k-minimální cesty z vrcholu $v_{i}$ do $v_{j}$
- $D_{n-1} = D^w(G)$ protože každá cesta v G může obsahivat nejvýše n-1 hran
- $D_{1} = d^1_{ij} \quad d^1_{ij} = \begin{cases} w(v_{i}, v_{j}) \quad (v_{i}, v_{j}) \in E \\ 0 \qquad \qquad v_{i} = v_{j} \\ \infty \qquad \qquad \text{jinak, tj. } (v_{i}, v_{j} \notin E) \end{cases}$

Tvrzení:
- $D_{n-1} = D^w(G)$
- matice $D_{k}$ je k-tou mocninou matice $D_{1}$ vzhledem k operacím $+, \cdot$
- pokud pro nějaké $q \geq 1$ platí $D_{q+1} = D_{q}$, pak $D^w(G) = D_{q}$

Tvrzení: nechť $(G, w)$ je ohodnocený neorientovaný graf
- $w: E \to R^*$
1) $d^w(x,y) \geq 0, d^w(x,y) = 0 \iff x = y$
2) $d^w(x, y) = d^{w'}(y, x)$
3) $d^w(x, y) + d^w(y, z) \geq d^w(x, z)$
- tj. $d^w$ je metrika na G

Eulerovské grafy
- existence tahu v G takového, že obsahuje všechny hrany G
- tah = sled, ve kterém se neopakují hrany

Def.: eulerovský tah v G je uzavřený tah obsahující všechny hrany G
- otevřený eulerovský tah je tak obsahující všechny hrany G

? existence eulerovských tahů ?
- eulerovský graf = graf s eulerovským tahem

Věta: G je souvislý, pak G je eulerovský $\iff$ každý vrchol má sudý stupeň v G

Hierholzerův algoritmus (G souvislý)
- najdu uzavřený tah M
- ? existuje hrana dotýkající se M (neobsažená v M)
	- ano - prodluž M
	- ne - eulerovský tah

Prostor kružnic grafu
- $G = (V, E), \vert E\vert = m$
- každému faktoru grafu G lze přiložit charakteristický vektor $x \in \mathbb{Z}^m_{2}$

Věta: množina sudých faktorů (jejich char. vektorů) tvoří lineární podprostor $\mathbb{Z}^m_{2}$
- prostor kružnic $\mathcal C(G)$ neor. grafu G - lineární prostor sudých faktorů (char. vektorů)
- ? báze, dimenze $\mathcal C(G)$, počet prvků $\mathcal C(G) (počet sudých faktorů)

Konstrukce báze $\mathcal C(G)$
1) kostra grafu G ... T (lib. ale pevná)
2) systém fundamentálních kružnic
	- pro každou hranu  e grafu G, která není na T vezmeme kružnici v T + e - fundamentální kružnice příslušného e vzhledem ke kostře T
	- počet fund. kružnic $= m-n+1$
3) $\dim(\mathcal C(G)) = m-n+1$ (G souvislý)

Věta: fundamentální kružnice tvoří bázi $\mathcal C(G)$
- $\dim(\mathcal C(G)) = m-n+1$ (G souvislý)
- počet prvků $\mathcal C(G)$ = počet sudých faktorů G = počet podmnožin fundamentálních kružnic = $2^{m-n+1}$