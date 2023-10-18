Jedna množina
- $A = \{ 0, 1, 2 \}$
- $A^2 = A \cdot A = \{ 00, 01, 02, 10, 11, 12, 20, 21, 22 \}$
- $A^+ = \{ 0, 1, 2, 00, 01, 02, \dots, 22, 000, 001, \dots, 222, \dots \}$
- $A^* = A^+ \cup \{e\}$

Dvě množiny
- $A = \{ 0, 1, 2 \}, \quad B = \{ a, b \}$
- $A^* \cup B^* = \{ e, 0, 1, 2, a, b, 00, 01, \dots, 22, aa, ab, ba, bb, \dots \}$
- $(A \cup B)^* = \{e, 0, 1, 2, a, b, 00, 01, 02, 0a, 0b, \dots, 2b, ab, bb, \dots\}$
- $A \cdot (B \cup B^2) = \{0a, 0b, 0aa, 0ab, 0ba, \dots, 2bb\}$

### Návrh gramatiky

**Př. 1**: Nad abecedou $0-9$ vymyslete gramatiku představující sudá čísla. Připouštíme i neplatné nuly na začátku řetězce.
- musí končit sudou číslicí $\{ 0, 2, 4, 6, 8 \}$

Gramatika:
- $S \to AB$
- $B \to 0|2|4|6|8$
- $A \to e|0A|1A|2A|3A|4A|5A|6A|7A|8A|9A$

316
- $S \to AB \to 3AB \to 31AB \to 31B \to 316$

**Př. 2**: Jako př. 1, ale nepřipouštíme nevýznamné nuly na začátku.
- nesmí začínat nulou

Gramatika:
- $S \to CAB | B$
- $B \to 0|2|4|6|8$
- $A \to e|0A|1A|2A|3A|4A|5A|6A|7A|8A|9A$
- $C \to 1|2|3|4|5|6|7|8|9$

**Př. 3**: Vytvořte gramatiku, která bude generovat všechny řetěze reprezentující korektní identifikační čísla studentů ZČU, kteří zahájili studium v roce 2020/21 a později.

Gramatika:
- $\text{<student>} \to \text{<fak><rok><typ><cislo><forma>}$
- $\text{<fak>} \to A|E|K|S|P|F|R|U|Z$
- $\text{<rok>} \to 20|21|22|23$
- $\text{<typ>} \to B|N|P|M$
- $\text{<cislo>} \to \text{<c><c><c><c>}$
- $\text{<c>} \to 0|1|2|\dots|9$
- $\text{<forma>} \to P|K$

