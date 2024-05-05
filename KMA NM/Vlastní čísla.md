# Vlastní čísla

## Částečný problém

Hledáme dominantní vlastní číslo (pouze jedno, s největší absolutní hodnotou).

### Mocninná metoda

Vstup: matice $A$, sloupcový vektor $y^{(0)}$

**Předpoklady**:
- matice $A$ má $n$-lineárně nezávislých vlastních vektorů
- existuje jediné dominantní vlastní číslo
- vlastní čísla lze seřadit: $|\lambda_{1}| > |\lambda_{2}| \geq |\lambda_{3}| \geq \dots \geq |\lambda_{n}|$

**Postup**:
1. pomocí iterační formule $y^{(k+1)} = A\cdot y^{(k)}$ počítáme další $y^{(k+1)}$ ($k = 0, 1, \dots$)
2. z vektoru $y^{(k+1)}$ vybereme index $i$, kde $|y^{(k+1)}_{i}|$ je největší
3. vypočítáme přibližné vl. číslo $\lambda^{(k+1)} = \frac{y^{(k+1)}_{i}}{y^{(k)}_{i}}$
	- použijeme hodnoty na $i$-tém indexu v aktuálním a předchozím vektoru $y$
4. opakujeme, pokud neplatí zastavovací podmínka

+ **zastavovací podmínka**: $|\lambda^{(k+1)} - \lambda^{(k)}| < \epsilon$

**Poznámky**:
- v Matlabu ověříme vl. čísla pomocí funkce `eig(A)`
- kvůli přetečení/podtečení je vhodné vektor $y^{(k+1)}$ v každém kroku normovat

### Rayleigho metoda

Tato metoda je velice podobná mocninné metodě, ale pro výpočet lambdy použijeme **jiný vzorec** níže.

$\displaystyle\lambda_{k} = \frac{y^{(k-1)^T} \cdot y^{(k)}}{y^{(k-1)^T} \cdot y^{(k-1)}}$

**Poznámky**:
- vhodné pouze pro matice blízce symetrické (hodnoty jsou téměř symetrické)
- konverguje k nule zhruba dvakrát rychleji

## Úplný problém

Tímto způsobem nalezneme všechna vlastní čísla matice.

### LU rozklad

**Postup**:
1. $A_{0} = A, k = 0$
2. provedeme LU rozklad matice $A_{k} = L_{k}U_{k}$
3. sestrojíme matici $A_{k+1} = U_{k}L_{k}$ (matice prohodíme)
4. pokud je $A_{k+1}$ horní trojúhelníková -> konec, jinak $k = k+1$ a jdeme na 2. krok

Pokud je matice $A_{k+1}$ horní trojúhelníková (nebo jsou hodnoty pod diagonálou blízko nule), poté máme na diagonále všechna vlastní čísla matice $A$.

### QR transformace

Podobné LU rozkladu, ale rozdílný vzoreček:

$A_{k+1} = Q^T_{k}A_{k}Q_{k}, k = 0, 1, 2, \dots$
