# Nalezení UDNF a UKNF

Př.: $f(x, y) = [\overline{(\overline{x} \wedge y)} \wedge \overline{x}] \vee y = [\overline{(\overline{x} \cdot y)} \cdot x] + y$

## 1. Tabulkou

| $x$ | $y$ | $\overline{x} \wedge y$ | $a = \overline{(\overline{x} \wedge y)}$ | $b = a \wedge \overline{x}$ | $b \vee y$ |
| --- | --- | ----------------------- | ---------------------------------------- | --------------------------- | ---------- |
| 0   | 0   | 0                       | 1                                        | 1                           | **1**      |
| 0   | 1   | 1                       | 0                                        | 0                           | **1**      |
| 1   | 0   | 0                       | 1                                        | 0                           | 0          | 
| 1   | 1   | 0                       | 1                                        | 0                           | **1**      |

Postup
1. vybereme řádky, kde funkce vyšla **1** (**ÚDNF**) nebo **0** (**ÚKNF**)
2. zapisujeme jednotlivé klauzule podle prvků ($x, y, z, \dots$) v řádcích
	- prvek zapíšeme jako komplement, pokud je rovna **0** (**ÚDNF**) nebo **1** (**ÚKNF**)
	- když je výsledek funkce **1**, čáru napíšeme nad prvkem s hodnotou **0**

Výsledek
- ÚDNF: $f_{D}(x, y) = (\overline{x} \wedge \overline{y}) \vee (\overline{x} \wedge y) \vee (x \wedge y)$ 
- ÚKNF: $f_{K}(x, y) = (\overline{x} \vee y)$

## 2. Pomocí Booleovského kalkulusu

Využijeme pravidel Booleovského kalkulusu a pokusíme se funkci zjednodušit a roznásobit.

$f(x, y) = [\overline{(\overline{x} \wedge y)} \wedge \overline{x}] \vee y = [(x \vee \overline{y}) \wedge \overline{x}] \vee y = [(x \wedge \overline{x}) \vee (\overline{y} \wedge \overline{x})] \vee y = (\overline{y} \wedge \overline{x}) \vee y = (\overline{y} \vee y) \wedge (\overline{x} \vee y) = \overline{x} \vee y$
- máme jedinou spojovou klauzuli, ve které je spojení, jedná se tedy o ÚKNF

Zkusíme získat i ÚDNF:

$f(x, y) = (\overline{y} \wedge \overline{x}) \vee y = (\overline{y} \wedge \overline{x}) \vee (y \wedge 1) = (\overline{y} \wedge \overline{x}) \vee [y \wedge (\overline{x} \vee x)] = (\overline{y} \wedge \overline{x}) \vee (\overline{x} \wedge y) \vee (x \wedge y)$
- máme spojení 3 průsekových klauzulí, jedná se tedy o ÚDNF
