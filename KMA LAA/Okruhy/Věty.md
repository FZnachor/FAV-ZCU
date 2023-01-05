# Formulujte následující tvrzení a věty
### vlastnosti sčítání, násobení matic
- **sčítání matic**
    - matice $A, B$ - pouze matice stejného typu
    - sčítá se po prvcích => $c_{ij} = a_{ij} + b_{ij}$
    - $C = A + B$
    - odečítání analogicky
- **násobení matic**
    - konstantou
        - máme matici $A$ a koeficient $k \in \mathbb{C}$
        - **každý prvek matice vynásobíme číslem k**
        - $c_{ij} = k * a_{ij}$
    - násobení dvou matic
        - $C = A * B$: $A$ typu m/n, $B$ typu n/p
        - počet sloupců první matice se musí rovnat počtu řádků druhé matice
        - **skalární součin i-tého řádkového vektoru $A$ a j-tého sloupcového vektoru $B$**
        - násobení matic není komutativní!
        - výsledná matice typu m/p

### Vietovy vzorce, věta o rozkladu polynomu na součin kořenových činitelů
- Vietovy vzorce
    - máme **polynom proměnné x** - $p(x)$ a kořeny $c_1, c_2, ...,  c_n$ polynomu p(x)
        - $a_{n-1} = -a_n(c_1, c_2, ..., c_n)$

- věta o rozkladu polynomu na součin kořenových činitelů
    - každý polynom lze vyjádřit jako:
        -  $p(x) = (x-c_1)(x-c_2)...(x-c_n)$
    - $c_1, c_2, ..., c_n$ - kořeny polynomu p(x)

### věta o lin. závislosti prvků
- prvky $v_1, v_2, ..., v_n$ jsou LZ pokud se alespoň jeden z nich dá vyjádřit jako LK ostatních
- každá podmnožina LN pvrků je LN
- každá nadmnožina LZ prvků je LZ
- LZ množina může obsahovat LN množinu
- množina s nulovým prvkem je LZ, {0} je LZ

### věta o existenci báze, Steinitzova věta o výměně
- **věta o existenci báze**
    - v každém nenulovém konečně generovaném $L. V. P. \ \exist$ alespoň jedna báze
    - báze nulového (triviálního) $L. V. P.$ je {0}

- **Steinitzova věta o výměně**
    - máme $L. V. P.$ - V, $M = \{g_1, g_2, ..., g_m\}$ ... generátory V, $N = \{b_1, b_2, ..., b_n\}$ ... báze V
    - $dim (N) \leq dim (M)$
    - LZ prvky z $M$ lze nahradit prvky z $N$ => $N$ znovu generuje V

### věta o souřadnicích prvků v bázi
- máme:
    - V - nenulový, konečně generovaný $L. V. P.$
    - $B = \{\vec b_1, \vec b_2, ..., \vec b_n\}$ uspořádaná báze V
    - koeficienty $c_1, c_2, ..., c_n \in R$ 
    - $\vec v \in V$
- **souřadnice prvku** $\vec v$ v bázi $B$ je LK $\vec v = c_1b_1 + c_2b_2 + ... + c_nb_n$
- značí se $\widehat{\vec v_B} = [c_1, c_2, ..., c_n]^T$
- je nutné dávat si pozor na pořadí!
- **souřadnice součtu dvou prvků** jsou **součtem souřadnic těchto prvků**
    - $\widehat {(\vec v_1 + \vec v_2)} = \widehat {(\vec v_1)} + \widehat {(\vec v_2)}$
- **souřadnice $\lambda$ - násobku** jsou **rovny $\lambda$ - násobku souřadnic tohoto prvku**
    - $\widehat {(\lambda * \vec v)} = \lambda * \widehat {(\vec v)}$

###  věta o rozvoji determinantu podle řádku
- máme: $A$ - čtvercová matice řádu n, $i \in \{1, 2, ..., n\}$
- rozvoj podle $i$-tého řádku - $det(A) = a_{i1}A_{i1} + a_{i2}A_{i2} + ... + a_{in}A_{in}$
- věta platí analogicky i podle sloupce ($det(A) = det(A^T)$)

### věty o elementárních úpravách determinantu
- **elementární úpravy**
    - **prohození dvou řádků matice**
    - **vynásobení jednoho řádku matice** (nenulovým číslem)
    - **přičtění k-násobku jednoho řádku k jinému**
    - pouze pro determinanty platí elementární úpravy i pro sloupce
- **prohození dvou řádků**
    - matice $B$ vznikne prohozením dvou řádků $A$
    - $det(B) = -det(A)$
    - má-li matice A dva stejné řádky / sloupce => $det(A) = 0$
- **vynásobení číslem**
    - matice $B$ vznikne vynásobením $i$-tého řádku číslem $c$
    - $det(B) = c * det(A)$
    - má-li $A$ nulový řádek / sloupec => $det(A) = 0$

### věta o stupňovitém tvaru matice
- pivot - první nenulový prvek na řádku
- matice je ve **stupňovitém tvaru** pokud:
    - pro každý řádek platí:
        - je-li pivot na pozici j => ve všech dalších řádcích je pivot na pozici $j' > j$
    - je-li i-tý řádek nulový => další řádky nulové

### věta o existenci inverzní matice
- inverzní matice $\exist$ pouze pro regulární matice
- inverzní matice je jednoznačně určena

### věta o dimenzích jádra a obrazu lin. zobr
- Nechť $U, V$ ... lineární vektorové prostory a $\mathbb{L}: U \rightarrow V$ ... lineární zobrazení
    - Ker($\mathbb{L}$) ... podprostorem $U$
    - Im($\mathbb{L}$) ... podprostorem $V$
- dim($U$) = dim(ker($\mathbb{L}$)) + dim(Im($\mathbb{L}$))

### vlastnosti izomorfního zobrazení
- Nechť $U, V$ ... lineární vektorové prostory a $\mathbb{L}: U \rightarrow V$ ... lineární zobrazení
- izomorfní zobrazení: $\mathbb{L}: U \rightarrow V$
    - je **prosté** a zároveň **"na"**
- inverzní izomorfní zobrazení: $\mathbb{L}^{-1}: U \rightarrow V$ je též izomorfní
-  $\mathbb{L}$ je izoformizmus:
    - <=> Ker($\mathbb{L}$) = {$0_U$} a zároveň Im($\mathbb{L}$) = V
    - <=> dim($U$) = dim(V)
- pokud je zobrazení izomorfní => $x_1, x_2, ..., x_n \in U$ jsou LZ pokud $\mathbb{L}(x_1), (x_2), ..., (x_n) \in V$ jsou LZ

### vlastnosti matice přechodu
- nechť $C$, $D$ jsou dvě báze prostoru $U$
- $T$ je **matice přechodu** od báze $D$ k bázi $C$
    - => 1. $T$ je regulární
    - => 2. $T_{\vec u_C} = \vec u_D \forall \vec u \in U$
    - => 3. $T^{-1}$ ... matice přechodu od báze $C$ k bázi $D$

### Frobeniova podmínka řešitelnosti soustav
- máme soustavu rovnic ($A*x = b$)
- soustava rovnic má 1 řešení pokud:
    - hod($A|b$) = hod($A$)
- soustava nemá řešení pokud:
    - hod($A|b$) $\neq$ hod($A$)
- soustava má nekonečně mnoho řešení pokud:
    - hod($A|b$) $<$ n (počet neznámých)