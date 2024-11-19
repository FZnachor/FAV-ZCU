**Př. 1**: Zdroj generuje znaky z abecedy $\{a, b, c, d, e, f, g, h, i, j\}$. Pravděpodobnosti jejich výskytů jsou 20 %, 18 %, 15 %, 12 %, 10 %, 8 %, 7 %, 4 %, 4 %, 2 %. Cílová abeceda kódu je $\{0, 1, 2\}$.

Kroky
- seřadit podle pravděpodobností
- začínám od posledních dvou
	- sečtu jejich pravděpodobnost ($2+4 = 6$)
	- zařadím ji do tabulky
- pokračuji vždy se třemi dolními prvky
	- $4+6+7 = 17$
	- $8 + 10 + 12 = 30$
	- $15+17+18 = 50$
	- $20+30+50 = 100$
- vznikl strom

| znak | pravděpodobnost | kód  |
| ---- | --------------- | ---- |
| a    | 20              | 2    | 
| b    | 18              | 00   |
| c    | 15              | 02   |
| d    | 12              | 10   |
| e    | 10              | 11   |
| f    | 8               | 12   |
| g    | 7               | 010  |
| h    | 4               | 012  |
| i    | 4               | 0110 |
| j    | 2               | 0111 |
