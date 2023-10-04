## Diferenční rovnice a jejich soustavy

homogenní diferenční rovnice - lineární

- $h_n = h(n)$
- $h_{n} - a_{n-1}h_{n-1}-a_{n-2}h_{n-2}-\dots-a_{n-k}h_{n-k} = 0$ ... řádu $k$
- trik:
$$
\begin{matrix}
h_{n-1} = h_{n-1} \\
\vdots \\
h_{n-k+1} = h_{n-k+1}
\end{matrix}
$$

$$
F_{n} = \begin{bmatrix}
h_{n} \\
h_{n-1} \\
\vdots \\
h_{n-k+1}
\end{bmatrix} = \begin{bmatrix}
a_{n-1} & a_{n-2} & a_{n-3} & \dots & a_{n-k} \\
1 & 0 & 0 & \dots & 0 \\
0 & 1 & 0 & \dots & 0 \\
0 & \dots & 0 & 1 & 0
\end{bmatrix} \cdot \begin{bmatrix}
h_{n-1} \\
\vdots \\
h_{n-k}
\end{bmatrix}
$$

- $\det(A - \lambda I) = 0 \dots \text{ char. polynom}$ (A je velká matice nahoře)
- $\lambda^n - a_{n-1}\lambda^{n-1} - a_{n-2}\lambda^{n-2} - \dots - a_{n-k}\lambda^{n-k} = 0$
- kořeny vl. č. matice ... $\lambda^k - a_{n-1}\lambda^{k-1} - a_{n-2}\lambda^{k-2} - \dots - a_{n-k} = 0$

1) vl. č. jsou vzájemně různá
	- $\lambda_{1}, \lambda_{2}, \dots, \lambda_{k}$
	- pak obecné řešení reálných rovnic $h_{n} = c_{1}\lambda^n_{1} + c_{2}\lambda^n_{2} + \dots + c_{k}\lambda^n_{k}, c_{i} \in \mathbb{R}$
	- příklad
		- $h_{n} = 2h_{n-1} + 2h_{n-2} - 2h_{n-3} \quad (n \geq 3)$ počáteční podmínky $h_{0} = 1, h_{1} = 2, h_{2} = 0$
		- charakteristická rovnice $\lambda^3 - 2\lambda^2 - \lambda + 2$
		- $\lambda_{1} = 1, \lambda_{2} = -1, \lambda_{3} = 2$
		- obecné řešení: $h_{n} = c_{1} 1^n + c_{2}(-1)^n + c_{3}2^n$
		- dosadím
			- $n = 0 : h_{0} = 1 = c_{1} + c_{2} + c_{3}$
			- $n = 1 : h_{1} = 2 = \dots$
			- $n = 2 : h_{2} = 0 = \dots$
		- $h_{n} = 2 - \frac{2}{3}(-1)^n - \frac{1}{3}2^n$
2) předp. kořen $\lambda_{i}$ má násobnost $s_{i}$
	- $\lambda_{i}^n, n \cdot \lambda_{i}^n, \dots, n^{s_{i}-1} \cdot \lambda_{i}^n$
	- $c_{i_{1}}\lambda^n_{i} + c_{i_{2}}n\lambda^n_{i} + \dots + c_{i_{s_{i}}}n\lambda^n_{i} = (c_{i_{1}} + c_{i_{2}}n + \dots + c_{i_{s_{i}}}n^{s_{i}-1}) \lambda_{i}^n$
	- příklad
		- $h_{n} = -h_{n-1} + 3h_{n-3} + 2h_{n-4}, n \geq 4$
		- poč. podmínky: $h_{0} = 1, h_{1}=0, h_{2} = 1, h_{3} = 2$
		- $\lambda^4 + \lambda^3 - 3\lambda^2 - 5\lambda - 2 = 0$ ... kořeny -1, -1, -1, 2
		- obecné řešení: $h_{n} = (c_{1} + c_{2}n + c_{3}n^2) \cdot (-1)^n + c_{4}2^n$
		- pro poč. podmínky:
			- $h_{n} = \frac{7}{9}(-1)^n - \frac{3}{9}n(-1)^n + \frac{2}{9}2^n$

### Počet rozkladů n-prvkové množiny

počet prvků rozkladu $k$

\# všech takových rozkladů *(# je počet)*

- $S(n,k) \quad |x| = n$
- $k = n \quad S(n,n) = 1, S(n,1) = 1$
- $S(n,k) = S(n-1, k-1) + k \cdot S(n-1, k)$

Stirlingova čísla (2. druhu)

### Asymptotický růst fcí

- $\displaystyle x \to \infty \quad \lim_{ x \to \infty } \frac{e^x}{x} = \infty$
- $\displaystyle x^2, x^3, \dots, x^n, \dots, \lim_{ x \to \infty } \frac{e^x}{x^n} = \infty$

Bachmannovy-Landavovy-(Knothovy) symboly
- $g(x) > 0$
- $O(g(x)) = \{ h(x) \mid \exists \, c > 0 \space \exists \, x_{0} : \forall \, x > x_{0} : 0 \leq h(x) \leq c \cdot g(x) \}$
- Big-Oh
- $f(x) = O(g(x))$
- $x^n = 0(e^x)$
- $e^x = O(2^x) \quad a^x = e^{x \ln a} = e^x \cdot e^{\ln a}$
- $n! \leq n^n \quad n! = 0(n^n)$

### Modulární počítání

$a, b \in \mathbb{Z} \quad gcd(a,b) \quad nsd(a,b)$

Eukleidův algoritmus
- $a-b$
- $d | a \wedge d | b \implies d | (a-b)$
- $a = q \cdot b + r, 0 \leq r < b$
- $r = a-q \cdot b \qquad d | a \wedge d | b \implies d | r \qquad gcd(a,b) = gcd(b,r)$
- $57 = 2 \cdot 25 + 7 \qquad gcd(57, 25) = gcd(25, 7)$
- $25 = 3 \cdot 7 + 4 \qquad = gcd(7, 4) = 1$
- $7 = 1 \cdot 4 + 3$
- $4 = 1 \cdot 3 + 1 \qquad = gcd(57, 25)$
- $1 = 4 - 1 \cdot 3$
- $= 4 - 1 \cdot (7 - 1 \cdot 4) = 2 \cdot 4 - 7$
- $= 2 \cdot (25 - 3 \cdot 7) - 7 = 2 \cdot 25 - 7 \cdot 7$
- $= 16 \cdot 25 - 7 \cdot 57$
- $\implies \exists \, \alpha, \beta \in \mathbb{R} : gcd(a,b) = \alpha \cdot a + \beta \cdot b$

Věta
- Mějme $a, b \in \mathbb{Z}$ (ne obě nulová), pak $\gcd(a,b)$ je roven nejmenšímu kladnému číslu tvaru $\alpha \cdot a + \beta \cdot b$ pro $\alpha, \beta \in \mathbb{Z}$.
- Dk: $D = \alpha \cdot a + \beta \cdot b, \alpha, \beta \in \mathbb{Z}$ nejmenší kladné číslo na množině čísel
	1) nechť $d|a$ a $d|b$, pak $d|D$
		- $a = k \cdot d \qquad b = l \cdot d \qquad D = \alpha \cdot k \cdot d + \beta \cdot l \cdot d$
	2) zbytek po dělení čísla a číslem D je nulový
		- platí $a = q D + r, O \leq r < D$
		- $O \leq r = a - qD = a - q(\alpha \cdot a + \beta \cdot b) = (1-q\cdot\alpha)\cdot a - q \cdot \beta \cdot b$
		- $\implies r= 0$

$\mathbb{Z}$ množina všech celých čísel
- $n \geq 2, \quad n \in \mathbb{N}$
- $n = 3 \quad$ možné zbytky $0, 1, 2$
	- $\mathbb{Z}_{3}(0) = \{ \dots, -3, 0, 3, \dots \}$
	- $\mathbb{Z}_{3}(1) = \{ \dots, -2, 1, 4, \dots \}$
	- $\mathbb{Z}_{3}(2) = \{ \dots, -1, 2, 5, \dots \}$
- $x, y \in \mathbb{Z} \quad x \equiv y \quad$ (mod $n$)
- $x$ je kongurentní s $y$ modulo $n$ (např. 3)
- relace kongurence je ekvivalence
	- reflexivní: $x \equiv x$ (mod n), symetrická $x \equiv y$ (mod n) $\implies y \equiv x$ (mod n)
	- tranzitivita: $x \equiv y$ (mod n) $\wedge y\equiv 2$ (mod n) $\implies x \equiv 2$ (mod n)

Lemma
- $x, y \in \mathbb{Z}, n \in \mathbb{N}, x \in \mathbb{Z}_{n}(i), y \in \mathbb{Z}(j)$, pak
	- $x \cdot z \in \mathbb{Z}_{n}(i\cdot j) \qquad x \cdot y = (i + kn) \cdot (j + ln) = ij + n(kj + il) + kln^2$
	- $x + y \in \mathbb{Z}_{n}(i+j) \qquad x + y = i + j + n(k + l)$
- Dk: $x = i + kn, y = j + ln$

$n \in \mathbb{N} \quad \mathbb{Z}_{n} = \{ \mathbb{Z}_{n}(0), \mathbb{Z}_{n}(1), \dots, \mathbb{Z}_{n}(n-1) \}$
- $(\mathbb{Z}_{n}, +, \times)$
	- $\mathbb{Z}_{n}(i) + \mathbb{Z}_{n}(j) = \mathbb{Z}_{n}(i + j)$
	- $\mathbb{Z}_{n}(i) \times \mathbb{Z}_{n}(j) = \mathbb{Z}_{n}(ij)$
- $\mathbb{Z}_{4}(3) \to 3$
- $\mathbb{Z}_{4}(3) + \mathbb{Z}_{4}(2) = \mathbb{Z}_{4}(1) \to 3 + 2 \to 3 + 2 \mod 4 = 1$

$n = 3$

| $+$   | 0   | 1   | 2   |
| --- | --- | --- | --- |
| 0   | 0   | 1   | 2   |
| 1   | 1   | 2   | 0   |
| 2   | 2   | 0   | 1   |

| $\cdot$  | 0   | 1   | 2   |
| --- | --- | --- | --- |
| 0   | 0   | 0   | 0   |
| 1   | 0   | 1   | 2   |
| 2   | 0   | 2   | 1   |

- aritmetika modulo $n$
- inverzní prvek $a \neq 0 \quad a \cdot a^{-1} = 1$
	- $1^{-1} = 1$
	- $2^{-1} = 2$

opačný prvek $\qquad a + (-a) = 0 \qquad (-1) + 1 = 0$
nulový prvek 0 $\qquad -1 = 2 \quad -2 = 1$

$\mathbb{Z}_{3}$ vždy existuje inverzní prvek $\forall \, x \in \mathbb{Z}_{3}, x \neq 0$
