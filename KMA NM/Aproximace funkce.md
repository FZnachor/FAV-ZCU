# Aproximace funkce

## Aproximace v okolí bodu

V bodě bude mít nová funkce stejnou hodnotu, v okolních bodech bude její hodnota podobná.

### Taylorův polynom

Jedná se o aproximaci na okolí bodu pomocí Taylorova polynomu.
- čím vyšší stupeň, tím více aproximuje funkci
- $Tn(x) = f(x_{0}) + \frac{f'(x_{0})}{1!}\cdot(x-x_{0}) + \frac{f''(x_{0})}{2!} \cdot (x-x_{0})^2 + \dots + \frac{f^{(n)}}{n!}(x-x_{0})^n$

Chyba v daném bodu:
- $e(x) = f(x) - Tn(x)$
## Interpolace funkcí

Máme zadané body, které chceme proložit nějakou funkcí (hodnota funkce v bodech bude stejná).

### Lagrangeův interpolační polynom

| $i$        | 0   | 1   | 2   |
| ---------- | --- | --- | --- |
| $x_{i}$    | 0   | 1   | 3   |
| $f(x_{i})$ | 1   | 2   | 0   |

$L_{2}(x) = f(x_{0})l_{0}(x) + f(x_{1})l_{1}(x) + f(x_{2})l_{2}(x)$
- $l_{0}(x) = \frac{(x-1)(x-3)}{(0-1)(0-3)} = \frac{1}{3}(x-1)(x-3)$
- $l_{1}(x) = \frac{(x-0)(x-3)}{(1-0)(1-3)} = -\frac{1}{2}x(x-3)$
- $l_{2}(x) = \frac{(x-0)(x-1)}{(3-0)(3-1)} = \frac{1}{6}x(x-1)$

Poté dosadíme:
- $L_{2}(x) = \dots$

### Newtonův polynom

$N_{n}(x) = a_{0} + a_{1}(x-x_{0}) + a_{2}(x-x_{0})(x-x_{1}) + \dots + a_{n}(x-x_{0})\dots (x-x_{n-1})$

| $i$        | 0   | 1   | 2   | 3   |
| ---------- | --- | --- | --- | --- |
| $x_{i}$    | 0   | 1   | -1  | 3   |
| $f(x_{i})$ | 1   | 2   | 2   | 0   |

| $i$ | $x_{i}$ | $f(x_{i})$ | $\displaystyle\frac{f(x_{i}) - f(x_{i-1})}{x_{i} - x_{i-1}} = f^I(x_{i})$ | $\displaystyle\frac{f^I(x_{i}) - f^I(x_{i-1})}{x_{i} - x_{i-2}} = f^{II}(x_{i})$ | $\displaystyle\frac{f^{II}(x_{i}) - f^{II}(x_{i-1})}{x_{i} - x_{i-3}} = f^{III}(x_{i})$ |
| --- | ------- | ---------- | ------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| 0   | 0       | 1          |                                                                           |                                                                                  |                                                                                         |
| 1   | 1       | 2          | $\frac{2-1}{1-0} = 1$                                                     |                                                                                  |                                                                                         |
| 2   | -1      | 2          | $\frac{2-2}{-1-1} = 0$                                                    | $\frac{0-1}{-1-0} = 1$                                                           |                                                                                         |
| 3   | 3       | 0          | $\frac{0-2}{3-(-1)} = -\frac{1}{2}$                                       | $\frac{-\frac{1}{2}-0}{3-1} = -\frac{1}{4}$                                      | $\frac{-\frac{1}{4}-1}{3-0} = -\frac{5}{12}$                                            |

Na diagonále se nachází koeficienty $a_{0}, a_{1}, a_{2}, a_{3}$ Newtonova interpolačního polynomu, stačí je pouze dosadit.

### Nevilleův algoritmus

Umožní vypočítat pouze hodnotu polynomu $N_{n}(\alpha)$ v zadaném bodě $\alpha$.

Princip je podobný jako u Newtonova polynomu.
1. $P_{i,0} = f(x_{i}); \quad i =0, 1, \dots, n$
2. $P_{i,k} = P_{i,k-1} + (\alpha-x_{i}) \frac{P_{i,k-1} - P_{i-1,k-1}}{x_{i} - x_{i-k}};$
3. $N_{n}(\alpha)$

**Příklad**:
- $\alpha = 1.8$

| $x_{i}$    | 0      | 1       | 2       | 3       | 4       |
| ---------- | ------ | ------- | ------- | ------- | ------- |
| $f(x_{i})$ | 1.0000 | 0.36788 | 0.13534 | 0.04979 | 0.01832 |
- tabulku níže seřadíme podle vzdálenosti bodu $x_{i}$ od $\alpha$
- pokud se hodnota na diagonále změní o méně než $\epsilon$, je možné skončit dříve

| $\vert\alpha-x_{i}\vert$ | $x_i$ | $f(x_{i}) = P_{i,0}$ | $P_{i,1}$   | $P_{i,2}$   | $P_{i,3}$   | $P_{i,4}$   |
| ------------------------ | ----- | -------------------- | ----------- | ----------- | ----------- | ----------- |
| 0.2                      | 2     | **0.13534**          |             |             |             |             |
| 0.8                      | 1     | 0.36788              | **0.18185** |             |             |             |
| 1.2                      | 3     | 0.04979              | 0.24064     | **0.17009** |             |             |
| 1.8                      | 0     | 1.00000              | 0.42987     | 0.08926     | **0.16201** |             |
| 2.2                      | 4     | 0.01832              | 0.5582      | 0.27583     | 0.13901     | **0.16431** |

### Kubická spline funkce

Interpolace plynomem není vždy vhodná, proto zavádíme interpolaci spline funkcemi.

**Lineární spline funkce** - jde o lomenou čárz spojující interpolované body

**Kubická spline funkce**
- funkci na $\langle a,b\rangle$ aproximujeme vícero funkcemi (polynomy 3. stupně)
- interval $\langle a,b\rangle$ rozdělíme na $n$ dílčích intervalů
- jednotlivé funkce $\varphi_{i}(x)$ na každém intervalu $\langle x_{i},x_{i+1}\rangle$ mají tvar:
	- $\varphi_{i}(x) = a_{i} + b_{i}(x-x_{i}) + \frac{c_{i}}{2}(x-x_{i})^2 + \frac{d_{i}}{6}(x-x_{i})^3$

Podmínky interpolace:
- spojitost funkce $\varphi$
	- $\varphi_{i-1}(x_{i}) = \varphi_{i}(x_{i})$
- spojitost 1. derivace funkce $\varphi$
	- $\varphi'_{i-1}(x_{i}) = \varphi'_{i}(x_{i})$
- spojitost 2. derivace funkce $\varphi$
	- $\varphi''_{i-1}(x_{i}) = \varphi''_{i}(x_{i})$
- interpolační podmínky
	- $\varphi_{i}(x_{i}) = f(x_{i})$
- je vhodné doplnit ještě další: podm. tečen, periodicity, přirozené podmínky
