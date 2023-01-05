# Pojmy z LAA
### inverzní matice, regulární a singulární matice
- **inverzní matice**
    - X je inverzní k A, jestliže platí $A * X = X * A = I$

- **regulární matice**
    - **čtvercová** matice
    | vlastnost                                 | výraz                     |
    | ----------------------------------------- | ------------------------- |
    | její **hodnost** se rovná jejímu **řádu** | $hod(A) = n$              |
    | má **nenulový determinant**               | $\det{A} \neq 0$          |
    | **existuje** k ní **inverzní matice**     | $\text{existuje } A^{-1}$ |
    - Každou **regulární matici** lze řádkovými elementárními úpravami převést **na jednotkovou matici**.

- **singulární matice**
    | vlastnost                                  | výraz                       |
    | ------------------------------------------ | --------------------------- |
    | její **hodnost** je **menší než její řád** | $hod(A) < n$                |
    | má **nulový determinant**                  | $\det{A} = 0$               |
    | **neexistuje** k ní **inverzní matice**    | $\text{neexistuje } A^{-1}$ |

### lineární zobrazení, jádro, obraz, matice lineárního zobrazení
