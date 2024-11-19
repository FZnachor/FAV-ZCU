
Věta: Mějme $\mathbb{Z}_{n}, a \in \mathbb{Z}_{n}$, pak existuje $a^{-1} \in \mathbb{Z}_{n} \iff \gcd(a, n) = 1$, tj. $a, n$ jsou nesoudělná.
- Dk: $a^{-1} \cdot a \equiv 1$ (mod n)
	- $\implies a^{-1} \cdot a \equiv 1 + \ln$
	- $a^{-1} \cdot a - l \cdot n = 1$
	- $d | a, d | n \implies d = 1 = \gcd(a, n)$
	- $1 = \gcd(a,n) = \alpha \cdot a + \beta \cdot n \implies \alpha a + \beta n = 1$
		- $\alpha a = 1 - \beta n$
		- $\alpha a \equiv 1$ (mod n)
- Př: $\mathbb{Z}_{8} \dots (0, 1, \dots, 7)$
	- $2^{-1}$ neex.
	- $3 \gcd(3, 8) = 1, \quad 3^{-1}$ ex.
	- Pozorování: n prvočíslo každé nenulový prvek $a \in \mathbb{Z}_{n}$ má inverzi
- Věta: $\mathbb{Z}_{n}$ je těleso $\iff$ n prvočíslo

Lineární prostory nad $\mathbb{Z}_{n}$, n prvočíslo, množina nad $\mathbb{Z}_{n}$
- Př: obecně v $\mathbb{Z}_{n}$ neplatí krácení
	- $\mathbb{Z}_{6} \quad 2 \cdot 3 \equiv 4 \cdot 3$ (mod 6)
	- $\centernot\implies 2 \equiv 4$ (mod 6)
- Př: $16^{-1}$ v $\mathbb{Z}_{45} \quad 1 \cdot 16, 2 \cdot 16, 3 \cdot 16, \dots, 44 \cdot 16$
	- Eukleidův algoritmus
		- $\gcd(45, 16)$
			- $45 = 2 \cdot 16 + 13$
			- $16 = 1 \cdot 13 + 3$
			- $13 = 4 \cdot 3 + 1$
			- $3 = 3 \cdot 1 + 0$
	- Rozšířený Eukleidův algoritmus
		- $1 = \gcd(45, 16)$
		- $1 = 13 - 4 \cdot 3 = 13 - 4 \cdot (16 - 1 \cdot 13) = 5 \cdot 13 - 4 \cdot 16 =$
		- $= 5 \cdot (45 - 2 \cdot 16) - 4 \cdot 16 = 5 \cdot 45 - 14 \cdot 16$
		- $16^{-1} = 31 (= 45 - 14)$
- Pozn: konečná tělesa s počtem prvků n existují, pokud n je mocnina prvočísla
	- $a_{n}x^n + a_{n-1}x^{n-1} + \dots + a_{1}x + a_{0}$

Věta (malá Fernantova věta)
- p prvočíslo, $a \in \mathbb{N}$, pak platí $a^p \equiv a$ (mod p), pokud $p \centernot \mid a$, $a^{p-1} \equiv 1$ (mod p)
- Dk: indukcí podle a
	- předpis $a^p \equiv a$ (mod p)
	- chci $(a+1)^p \equiv a+1$ (mod p)
	- binomická věta $(x+y)^n = \binom{n}{n}x^n + \binom{n}{n-1}x^{n-1}y + \dots + \binom{n}{k}x^{n-k}y^k + \dots + \binom{n}{0}y^n$
	- $(a+1)^p = \binom{p}{p}a^p + \binom{p}{p-1}a^{p-1} + \dots + \binom{p}{1}a$
	-  $(a+1)^p - a^p - 1 = \binom{p}{p-1} a^{p-1} + \dots + \binom{p}{k} a^{p-k} + \dots \binom{p}{1} a = 0$ (mod p)
	- $(a+1)^p - a^p - 1 \equiv 0$ (mod p)
	- $(a+1)^p - a - 1 \equiv 0$ (mod p) $\implies (a+1)^p = a+1$ (mod p)

RSA, ECC

Grupy $(G, \circ)$ - $\circ$ je binární operace na G ... $\circ : G \times G \to G$
- $(\mathbb{N}, +)$
- Def: $(G, \circ)$ tvoří grupu, pokud platí
	1) $\circ$ asociativní $: \forall \, x, y, z \in G : (x \circ y) \circ z = x \circ (y \circ z)$
	2) existence neutrálního prvku
		- $\exists \, e \in G : \forall \, x \in G : x \circ e = x = e \circ x$
	3) existence inverzního (opačného) prvku
		- $\forall \, x \in G : \exists \, x^{-1} \in G : x \circ x^{-1} = e$
- Př: $(\mathbb{Z}, +)$
	- matice $B$ regulární $M_{n,n}$, součin matic grupa, neutrální prvek je $I$, inverzní prvek $A^{-1}$
	- není $(\mathbb{N}, +)$
	- relace na množině
	- skládání relací
	- neutrální prvek ... identická relace na X
	- neplatí obecně $\rho \circ \rho^{-1} = E_{x}$
		- $X = {a, b}$
		- $\rho = \{(b,a)\}$
		- $\rho^{-1} = \{(a,b)\}$
		- $E_{x} = \{(a,a),(b,b)\}$
- pokud $\circ$ komutativní, pak $(G, \circ)$ se nazývá komutativní grupa (Abelova grupa)
- Př: grupa permutací
	- $X = \{ 1, 2, \dots, n \}$ permutace : bijekce X na X
	- množina permutací $n$-prvkové množiny $(S_{n}, \circ)$ (skládání permutací)
		- grupa nekomutativní, neutrální prvek identické permutace
		- $\pi \circ \pi^{-1} = id$
- Př: grupa symetrií rovnostranného trojúhelníku
	- $G = \{ id, r, s, x, y, z \}$, skládání $(G, \circ)$ grupa nekomutativní

Cayleyho tabulka
- latinské čtverce

Těleso a grupa
- $(M, +, \times)$ těleso (=)
- $(M, +)$ je Abelova groupa (e neutrální prvek vzhledem k +)
- $(M \setminus \{e\}, \times)$ je Abelova groupa
- $+, \times$ splňují distr. zákon
	- $\forall \, x, y, z \in M : x \times (y + z) = (x \times y) + (x \times z)$

Uzávěry relací
- $\rho$ na množině $X$
- reflexivní uzávěr $\rho^\times$ relace $\rho$
	- $\rho^\times = \rho \cup E_{x}$
	- $\rho^\times$ nejmenší nadrelace $\rho$, která je reflexivní
- tranzitivní uzávěr $\rho^+$ relace $\rho$
	- $\rho^+ = \rho \cup \rho^2 \cup \rho^3 \dots$
	- $\rho^+ = U^{\infty}_{i=0} \rho^i$
- reflexivně tranzitivní
	- TODO

Uspořádání
- $(\mathbb{R}, \leq)$ - reflexivní, slabě antisymetrické, tranzitivní
- Def: X množina, $\rho$ relace na X, $\rho$ refl., sl. antisym., tranz.
	- $(X, \rho)$ uspořádaná množina (poset)
- Př: $(\mathbb{Z}, \leq)$
	- $(\mathbb{N}, |)$ poset (dělitelnost na $\mathbb{N}$)
	- $(Z^\times, \leq)$ inkluzí uspořádaná potenční množina X množin
	- $\mathbb{R}^n : (x_{1}, \dots, x_{n}) \leq (y_{1}, \dots, y_{n})$
	- $\forall \, i = 1, \dots, n : x_{i} \leq y_{i}$
	- $\leq$ je refl., sl. antisym., tranz.
- Znázornění uspořádání
	- dělitelnost na $X = \{ 2, 3, 4, 6, 12 \}$
	- Hasseův diagram
		- relace bezprostředního předchůdce
		- $(X, \leq)$ poset
		- $\leq$  relace uspořádání $\to \dot{\leq}$
		- $x \dot{\leq} y \iff x \leq y \wedge \not\exists z \in X : x \neq z \neq y \wedge x \leq z \leq y$
	- Př: $(\mathbb{R}, \leq)$ poset
		- relace bezprostředního předchůdce je $\emptyset$
	- Def: $(X, \leq)$ poset
		- $a \in X$ je minimální, pokud $\not\exists \, x \in X : x \neq a, x \leq a$
		- $a \in X$ je maximální, pokud $\not\exists \, x \in X : x \neq a, a \leq x$
		- $a \in X$ je nejmenší, pokud $\not\exists \, x \in X : x \geq a$
		- $a \in X$ je největší, pokud $\not\exists \, x \in X : a \geq x$
	- Pozorování: X konečná množina, tak relace uspořádání je reflexivně-tranzitivní uzávěr relace bezprostředního předchůdce