Tabulka pokrytí

|            | x   | y   | z   | 0   | 1   | 4   | 5   | 6   |                 |
| ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --------------- |
| 0, 1, 4, 5 | -   | 0   | -   | 0   | 0   | 0   | 0   |     | $\overline y$   |
| 4, 6       | 1   | -   | 0   |     |     | 0   |     | 0   | $x \overline z$ |

- minimální disj. forma: $f(x, y, z) = \overline y + x \overline z$
- každý prvek množiny $\{ 0, 1, 4, 5, 6 \}$ musí být obsažen v alespoň jedné množině vybraných podmnožin
- $\to$ minimalizace počtu překrývajících podmnožin

| x   | y   | $x \mid y$ | $x \downarrow y$ | $(x \mid y) \mid (x \mid y)$ | $(x \downarrow y) \downarrow (x \downarrow y)$ |
| --- | --- | ---------- | ---------------- | ---------------------------- | ---------------------------------------------- |
| 0   | 0   | 1          | 1                | 0                            | 0                                              |
| 0   | 1   | 1          | 0                | 0                            | 1                                              |
| 1   | 0   | 1          | 0                | 0                            | 1                                              |
| 1   | 1   | 0          | 1                | 1                            | 1                                              |

- Schefferova NAND
	- $(x \mid y) \mid (x \mid y) = x \wedge y \quad$ "x a zároveň y"
- Peirceova NOR
	- $(x \downarrow y) \downarrow (x \downarrow y) = x \vee y \quad$ "x nebo y"
- SAT úloha (SAT problem) - otázka: je B. f. splnitelná pro alespoň 1 vstup
	- ? jak rychle to jde
	- $P \neq NP$

Teorie grafů
- Neorientované grafy
	- X množina (konečná), $x \choose 2$ - množina všech dvouprvkových podmnožin množiny X, ta má $\mid x\mid\choose 2$
	- neorientovaný graf $G = (V, E)$ - V vertex, E edge
		- V konečná množina [množina vrcholů]
		- $E \leq {V\choose 2}$ [množina hran]
		- odpovídá relaci na V, která je antireflexivní a symetrická
	- speciální grafy
		- cesta $1 - 2 - 3 - 4 - \dots - n$ na $n$ vrcholech $Pn$ délky $n-1$
	- bipartitní graf $K_{m, n}$
		- $V = A \cup B, A \cap B = \emptyset$
		- $E \subseteq \{ \{a,b\} \mid a \in A, b \in B \}$
		- $K_{2,3}$
	- úplný graf $K_{n}$
		- $V = \{ 1, \dots, n \}$
		- $E = {V\choose 2}$
	- diskrétní graf
		- $E = \emptyset$
- Rovnost grafů $G_{1} = G_{2}$
	- $G_{1} = (V_{1}, E_{1}), G_{2} = (V_{2}, E_{2})$, pokud $V_{1} = V_{2}, E_{1} = E_{2}$
- Homomorfismus
	- $G_{1} = (V_{1}, E_{1})$
	- $G_{2} = (V_{2}, E_{2})$
	- $f: V_{1} \to V_{2}$ je homomorfismus, pokud platí
		- $xy \in E_{1} \implies f(x)f(y) \in E_{2}$
	- zobrazení indukované zobrazením $f$: $f^*$ 
		- $f^* : {V_{1}\choose 2} \to {V_{2}\choose 2}$
		- $f^*(uv) = f(u)f(v)$
- Morfismy grafů
	- $f$ se nazývá
		- vzcholový monomorfismus, j-li $f$ prosté (injektivní)
		- vrcholový epimorfismus, je-li $f$ na (surjektivní)
		- hranový monomorfismus, je-li $f^*$ prosté
		- hranový epimorfismus, je-li $f^*$ na
		- monomorfismus, jsou-li $f, f^*$ prosté
		- epimorfismus, je-li $f, f^*$ na
		- izomorfizmus, je-li $f, f^*$ prosté i na
	- $G_{1}, G_{2}$ jsou izomorfní $G_{1} \approxeq G_{2}$, pokud existuje izomorfizmus
		- $f: V(G_{1}) \to V(G_{2})$
		- přenáší hrany na hrany a nehrany na nehrany
		- ? jak rychle rozhodnout, zda 2 grafy jsou izomorfní ?
	- automorfisms grafu $G:$ izomorfismus $G \to G$
		- všechny izomorfismy $G \to G$ triviální: identické zobrazení
		- složení izomorfismů (automorfismů) je opět izomorfismus (automorfismus)
		- $\forall$ izomorfismus (automorfismus) $\exists$ izomorfismus (automorfismus) inverzní
		- $\exists$ identický automorfismus
			- množina automorfismů s operací skládání tvoří grupu
			- Aut(G)
- stupeň vrcholu v
	- okolí vrcholu v
		- otevřené okolí: $N(v) = \{ u \in V \mid uv \in E \}$
		- uzavřené okolí: $N[v] = N(v) \cup \{ v \}$
	- $\deg_{G}(v) = \text{d}_{G}(v) = \vert N(v) \vert$
	- minimální stupeň grafu
		- $\delta(G) = \min\{ \deg_{G}(v) \mid v \in V \}$
	- maximální stupeň grafu
		- $\Delta(G) = \max\{ \deg_{G}(v) \mid v \in V \}$
	- časté značení $\vert V(G) \vert = n$, $\vert E(G)\vert = m$
		- $\deg_{G}(v) \leq n-1 = \vert V(G) \vert - 1$
		- $\Delta(G) \leq \vert V(G) \vert - 1$
	- Věta: $\sum_{v \in V} \deg_{G}(V) = 2m = 2 \cdot \vert E(G) \vert$
		- důsledek: počet vrcholů lichého stupně je v grafu vždy sudýv
			- handshaking lemma
- skóre grafu
	- posloupnost stupňů všech vrcholů seřazená nerostoucím způsobem
	- graf $\to$ skóre (soubor stupňů)
	- ? posloupnost čísel $\to$ skóre
		- pro danou posloupnost rozhodnout, zda je skóre nějakého grafu
		- např. 6, 6, 6 - graf neexistuje
	- Věta (Havel, Hakimi)
		- $d = (d_{1}, d_{2}, \dots, d_{n}) \quad d_{1} \geq d_{2} \geq \dots \geq d_{n}, n \geq 2$
			- je grafová, právě tehdy když
			- $d' = (d_{2}-1, \dots, d_{d_{1}+1}-1, d_{d_{1}+2}, \dots, d_{n})$ je grafová
		- Př.: $4, 4, 3, 2, 1, 1 \to 3, 2, 1, 0, 1 \to 3, 2, 1, 1, 0 \to 1, 0, 0, 0$
			- není grafová

