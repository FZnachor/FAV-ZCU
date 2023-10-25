**Př. 1**: Navrhněte NKA, který bude akceptovat všechny řetězce obsahující -abb- nebo -ba-.

Hledáme DKA A':

|      | a      | b      |
| ---- | ------ | ------ |
| -> 0 | {0, 1} | {0, 4} |
| 1    | -      | {2}    |
| 2    | -      | {3}    |
| 3    | {3}    | {3}    |
| 4    | {3}    | -      |

Druhá tabulka:

|                   | a           | b              |
| ----------------- | ----------- | -------------- |
| -> {0} A          | {0, 1} B    | {0, 4} C       |
| {0, 1} B          | {0, 1} B    | {0, 2, 4} D    |
| {0, 4} C          | {0, 1, 3} E | {0, 4} C       |
| {0, 2, 4} D       | {0, 1, 3} E | {0, 3, 4} F    |
| <- {0, 1, 3} E    | {0, 1, 3} E | {0, 2, 3, 4} G |
| <- {0, 3, 4} F    | {0, 1, 3} E | {0, 3, 4} F    |
| <- {0, 2, 3, 4} G | {0, 1, 3} E | {0, 3, 4} F    |

**Př. 2**: Jako př. 1, ale musí obsahovat -abb- i -ba-.

**Př. 3**: NKA, který bude akceptovat regulární výraz `a(a+b)*+(a+b)*aa(a+b)*`.

Vytvoříme automat a následně se z něj snažíme mazat e-hrany.

|      | a      | b      | e   | e-následníci |
| ---- | ------ | ------ | --- | ------------ |
| -> 1 | {2}, 4 | -      | {5} | {1, 5}       |
| 2    | {2}, 4 | {2}, 4 | {4} | {2, 4}       |
| <- 4 | -      | -      | -   | {4}          | 
| 5    | {5, 7} | {5}    | -   | {5}          |
| 7    | {8}, 4 | -      | -   | {7}          |
| 8    | {8}, 4 | {8}, 4 | {4} | {4, 8}       |

... ke 2 přidáme 4, k 8 přidáme 4.

Po přidání e-následníků sloupeček s **e** už nepotřebujeme.

|           | a            | b   |
| --------- | ------------ | --- |
| -> {1, 5} | {2, 4, 5, 7} | {5} |
| ...       | ...          | ... | 

Automat můžeme ještě zjednodušit.

|      | a      | b   | e   | e-následníci |
| ---- | ------ | --- | --- | ------------ |
| -> 1 | {2}    | -   | {5} | {1, 5}       |
| <- 2 | {2}    | {2} | -   | {2}          |
| 5    | {5, 7} | {5} | -   | {5}          |
| 4    | {2}    | -   | -   | {7}          |

Uděláme i druhou tabulku.

|                | a           | b        |
| -------------- | ----------- | -------- |
| -> {1, 5} A    | {2, 5, 7} B | {5} C    |
| <- {2, 5, 7} B | {2, 5, 7} B | {2, 5} D |
| {5} C          | {5, 7} E    | {5} C    |
| <- {2, 5} D    | {2, 5, 7} B | {2, 5} D |
| {5, 7} E       | {2, 5, 7} B | {5} C    |

**Př. 4**: Zdroj zpráv generuje písmena z abecedy $X = \{x_{1}, x_{2}, x_{3}, x_{4}\}$ a máme pravděpodobnostní rozložení písmen $P(X) = (0.2, 0.3, 0.4, 0.1)$. 
1. Vypočtěte entropii zdroje (zdroje, takže střední entropie).
2. Vypočtěte redundanci zdroje.

**1.** Střední entropie je střední hodnota elementárních entropií.

$$
H(X) = -\sum^{n}_{i=1} p(x_{i}) \cdot \log_{2}p(x_{i}) = - (0.2 \cdot \log_{2} 0.2 + 0.3 \cdot \log_{2} 0.3 + 0.4 \cdot \log_{2} 0.4 + 0.1 \cdot \log_{2} 0.1) = 0.4644 + 0.5211 + 0.5288 + 0.3322 = 1.847  \text{ [Shannon] bitů}
$$

**2.**

$$
\rho = 1 - \frac{H(X)}{H_{max}(X) = 1 - \frac{1.847}{2}} = 0.0765 \text{ [7.85\%]}
$$

