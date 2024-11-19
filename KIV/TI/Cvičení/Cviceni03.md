Příklad z minulého cvičení

|       | 0   | 1   |
| ----- | --- | --- |
| <-> A | B   | A   |
| <-- B | C   | A   |
| <-- C | C   | D   |
| D     | D   | D   |

|       | 0   | 1   |
| ----- | --- | --- |
| --> 0 | 0   | 1   |
| 1     | 0   | 2   |
| 2     | 3   | 2   |
| 3     | 0   | 4   |
| <-- 4 | 4   | 4   | 

|            | 0   | 1   |
| ---------- | --- | --- |
| **A0**     | B0  | A1  |
| **B0**     | C0  | A1  |
| **A1**     | B0  | A2  |
| **C0**     | C0  | D1  |
| **A2**     | B3  | A2  |
| **D1**     | D0  | D2  |
| **B3**     | C0  | A4  |
| **D0**     | D0  | D1  |
| **D2**     | D3  | D2  |
| <-- **A4** | B4  | A4  |
| **D3**     | D0  | D4  |
| <-- **B4** | C4  | A4  |
| **D4**     | D4  | D4  |
| <-- **C4** | C4  | D4  |

**Př. 1**: L je množina všech řetězců, které splňují právě jednu z podmínek:
- $w$ obsahuje $-babb-$
- počet znaků $b$ ve $w$ je dělitelný 3

viz. excalidraw

**Př. 2**: Navrhněte konečně automatový model algoritmu pro softwarovou implementaci vstupní konverze textového řetězce reprezentujícího zápis konstanty typu integer do vnitřní reprezentace PC. (formát v pevné řádové čárce)

|     | 7   | 6   | 5   | 4   | 3   | 2   | 1   | 0   |      |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- |
| MAX | 0   | 1   | 1   | 1   | 1   | 1   | 1   | 1   | 127  |
| MIN | 1   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | -128 |

314 = 256 + 32 + 16 + 8 + 2

`0000 0001 0011 1010`

| číslo | zobrazení     |
| ----- | ------------- |
| 314   | `00 00 01 3A` |
|       | `33 31 34 20` |
| -314  | `FF FF FE C6` |

**Př. 3**: Navrhněte RKA akceptující syntakticky správné řetězce reprezentující konstantu integer.
- správné: 0, 121, -15, +6, ...
- nesprávné: +-3
- $\sum = \{D, +, -, x\}$
	- \\ je koncový znak

Pomocné stavové proměnné

|             | počáteční hodnota |
| ----------- | ----------------- |
| znam. INT   | 1                 |
| hodnota INT | 0                 |

transformace PSP
- 0: nic
- 1: $\text{znam} \leftarrow 1$
- 2: $\text{hodnota} \leftarrow \text{hodnota} \cdot 10 + \text{cislice}$
	- znak je v ASCII kódu $\to$ odečíst '0' (30)
- 3: $\text{hodnota} \leftarrow \text{znak} \cdot \text{hodnota}$

$(3x^2 + x + 4) x = 10$
- 314

viz. excalidrawPř. 1

1: $\text{hodnota} \leftarrow \text{hodnota} \cdot 10 + (\text{vstup} - \text{'0'})$
2: $\text{hodnota} \leftarrow \text{hodnota} \cdot 10 - (\text{vstup} - \text{'0'})$