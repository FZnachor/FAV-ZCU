**Př. 1**: Kolik informace obsahuje trabulka náhodných čísel, která má 50 stran, na každé stránce je 20 řádků a jeden řádek je 25 dekadických cifer.

- $H_{\text{jedna číslice}} = \log_{2}10$
- $H_{\text{tabulka}} = 25 \cdot 20 \cdot 50 \cdot \log_{2}10 = 25000 \cdot \log_{2}10$
- $I_{\text{tabulka}} = H_{\text{tabulka}}$
	- $I = H_{\text{před}} - H_{\text{po}}$
	- neurčitost $H_{\text{po}}$ je nulová

## Strategie volby experimentu

Je dáno 12 mincí, jedna z nich je falešná (liší se vahou). Máme rovnoramenné váhy, detekují tři stavy. Cílem je najít falešnou minci, určit je-li těžší nebo lehčí.

- Kolik je potřeba vážení?
- Může se nevhodným výběrem stát, že jich bude potřeba víc?

+ Kolik neurčitosti je v úloze?
	+ $H(X) = \log_{2}24$
+ Kolik informace poskytuje jedno vážení (ve střední hodnotě)?
	+ $I(Y) = \log_{2}3$

- $n \cdot \log_{2}3 \geq \log_{2}24$
- $\log_{2}3^n \geq \log_{2}24$
- $3^n \geq 24$
- $n \geq 3$
- je možné, že by stačily 3 vážení

| L   | P   | a) > | b) =  | c) < | H(Y)        |
| --- | --- | ---- | ----- | ---- | ----------- |
| 1   | 1   | 1/12 | 10/12 | 1/12 |             |
| 2   | 2   | 2/12 | 8/12  | 2/12 |             |
| 3   | 3   | 3/12 | 6/12  | 3/12 |             |
| 4   | 4   | 4/12 | 4/12  | 4/12 | $\log_{2}3$ |
| 5   | 5   | 5/12 | 2/12  | 5/12 |             |
| 6   | 6   | 6/12 | 0     | 6/12 |             |

vybrali jsme 4 4, protože má největší střední entropii

1. vážení
	- $H_{\text{před}}(X) = \log_{2}24$
	- **a)** 4 podezřelé $\uparrow$, 4 podezřelé $\downarrow$, 4 v pořádku
	- **b)** 4 podezřelé $\uparrow\downarrow$, 8 v pořádku
	- **c)** jako a)
	- v každém výsledku bude $H_{\text{po}}(X) = \log_{2}8$

- $I(y_{i}) = H_{\text{před}} - H_{\text{po}}$
- $I(y_{i}) = -\log_{2} p(y_{i}) = -\log_{2}\frac{1}{3} = \log_{2}3$ ($p$ = pravděpodobnost)

+ $H_{\text{po}}(X) = H_{\text{před}}(X) - I(y_{i}) = \log_{2}24 - \log_{2}3 = \log_{2} \frac{24}{3} = \log_{2}8$

### Jak dál po b)

- máme 4 podezřelé $\uparrow\downarrow$, 8 v pořádku
- první číslo podezřelé
- druhé číslo dorovnání těma v pořádku
- $H_{\text{před}}(X) = \log_{2} 8$

| L ($\uparrow\downarrow, \circ$) | P ($\uparrow\downarrow, \circ$) | a)  | b)  | c)  | H(X)                         |
| ------------------------------- | ------------------------------- | --- | --- | --- | ---------------------------- |
| 4 0                             | 0 4                             | 1/2 | 0   | 1/2 | 1                            |
| 3 0                             | 1 2                             | 1/2 | 0   | 1/2 | 1                            |
| 2 0                             | 2 0                             | 1/2 | 0   | 1/2 | 1                            |
| 3 0                             | 0 3                             | 3/8 | 1/4 | 3/8 | největší entropie - vybereme |
| 2 0                             | 1 1                             | 3/8 | 1/4 | 3/8 | největší entropie            |
| 2 0                             | 0 2                             | 1/4 | 1/2 | 1/4 |                              |
| 1 0                             | 1 0                             | 1/4 | 1/2 | 1/4 |                              |
| 1 0                             | 0 1                             | 1/8 | 3/4 | 1/8 |                              |

Nemáme žádné rozdělení na 1/3, ale můžeme pokračovat.
- $3\log_{2}3 \geq \log_{2}24$
- $4.75 \geq 4.58$

po:
- a) 3x $\downarrow$, 9x v pořádku
	- $H_{\text{po}}(X) = \log_{2}3$
	- další vážení: vážím $\downarrow$ a $\downarrow$, vedle je $\downarrow$
- b) 1x $\uparrow\downarrow$, 11x v pořádku
	- $H_{\text{po}}(X) = \log_{2}2 = 1$
	- další vážení: vážím $\uparrow\downarrow$ a minci v pořádku
- c) 3x $\uparrow$, 9x v pořádku
	- $H_{\text{po}}(X) = \log_{2}3$
	- další vážení: vážím $\uparrow$ a $\uparrow$, vedle je $\uparrow$

a), c)
$$
H_{\text{po}}(X) = H_{\text{před}}(X) - I(y_{i}) = \log_{2}8 - \log_{2} \frac{3}{8} = \log_{2}8 - (- \log_{2}3 + \log_{2}8) = \log_{2}3
$$

b)
$$
\dots = \log_{2}8 - \left( - \log_{2} \frac{1}{4} \right) = 3 - \log_{2}4 = 1
$$

### Jak dál po a) a c)

Vysvětlivky:
- $N$ = v pořádku
- $T$ = podezřelá, že je těžší
- $L$ = podezřelá, že je lehčí

Podmínky:
- $L_{L} + P_{L} \leq 4$
- $L_{T} + P_{T} \leq 4$
- $L_{N} + P_{N} \leq 4$
- $L_{L} + L_{T} + L_{N} = P_{L} + P_{T} + P_{N}$

| L ($\uparrow, \downarrow, \circ$) | P ($\uparrow, \downarrow, \circ$) | a)                  | b)                                            | c)                      |
| --------------------------------- | --------------------------------- | ------------------- | --------------------------------------------- | ----------------------- |
| $L_{L} \, L_{T} \, L_{N}$         | $P_{L} \, P_{T} \, P_{N}$         | $\frac{4+P_{L}}{8}$ | $\frac{8-(L_{T} + L_{L} + P_{T} + P_{L})}{8}$ | $\frac{L_{L}+P_{T}}{8}$ |
| 1 2 0                             | 1 1 1                             | 3/8                 | 3/8                                           | 2/8                     |

po:
- a) 2L, 1T
	- $\log_{2}3$
- b) 1L, 2T
	- $\log_{2}3$
- c) 1L, 1T
	- $\log_{2}2 = 1$

### Závěr

Probrali jsme všechny možnosti a zjistili jsme, že to jde vyřešit pomocí 3 vážení.

Dá se to zvládnout pomocí 2 vážení?
- ano, dá
- vybereme na začátku vážení 1 1
	- je to risk, ale získáme velkou informaci
+ $p(y_{1}) = \frac{1}{6}$
+ $I(y_{i}) = -\log_{2} \frac{1}{6} = \log_{2}6$
+ $H_{\text{po}} = \log_{2}24 - \log_{2}6 = \log_{2} \frac{24}{6} = \log_{2}4 = 2 \text{ bity}$
+ máme 1L, 1T