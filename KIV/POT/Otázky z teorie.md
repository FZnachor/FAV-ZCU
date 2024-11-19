# Otázky z teorie

Registr PC v procesoru obsahuje:
- adresu následující instrukce

Je-li v programu (omylem) instrukce skoku do oblasti paměti kde jsou uložena data, reaguje procesor (typu H8S) následujícím způsobem:
- procesor skokovou instrukci normálně provede

Každá buňka dynamické paměti RAM se musí zotavovat přibližně po
- 10 ms

Kolik paměťových obvodů o kapacitě 16M × 8bitů je zapotřebí k sestavení paměti 64M × 16bitů (uveďte správný počet a/nebo označte jinou správnou odpověď):
- je zapotřebí 8ks pamětí

Jak dlouhá adresa (počet bitů) je zapotřebí k adresování paměti o kapacitě 32 kB (paměť je organizovaná po bytech)?
- 15 bitů

Maskovatelné přerušení lze povolit nebo zakázat:
- programově – nastavením příslušného registru procesoru

Při současné aktivitě několika žádostí o přerušení je nejprve obsloužen obvod (zdroj přerušení):
- jehož přerušení má nejvyšší prioritu

Ve kterém okamžiku je testován stav vstupu (vstupů) přerušení (/IRQn resp. /INT) a při jeho aktivitě je vyvolán obslužný program:
- po dokončení instrukce

Připojení vnější paměti programu k mikrokontroléru základní řady I8051
- je možné s využitím paralelních portů pro přenos adresy a dat

Dynamické paměti RAM mají kromě jiných vlastností i některé z následujících:
- velmi vysokou rychlost – nejvyšší z dostupných typů pamětí
- možnost automatického zotavení dat cyklem „CAS before RAS“ s využitím vnitřního čítače adres zotavení
- možnost rychlého stránkového čtení dat

Při probíhajícím DMA přenosu musí být procesor (např. typu H8S):
- odpojen od sběrnice

Při probíhajícím DMA cyklu – přenosu z periferie do paměti je signál pro zápis do paměti (/HWR apod.) generován
- DMA řadičem

Jaké registry (obecně) obvykle obsahují programovatelné periferní obvody? U každého registru uveďte, je-li typicky používán pro čtení (R) nebo pro zápis(W), resp. čtení i zápis (R/W):
- řídící - **W**, **R/W**
- stavový - **R**
- datový - **R/W**
- datový vstupní - **R**
- datový výstupní - **W**

Registr SP v procesoru obsahuje
- adresu vrcholu zásobníku

Jednotlivé bity v příznakovém registru („flagy“) se používají:
- k větvení programu

Které z uvedených pamětí udrží obsah i bez připojeného napájecího napětí:
- Flash
- EEPROM
- EPROM

Pro které typy přenosu je především vhodná obsluha s využitím přerušení:
- přenos po jednotlivých znacích

Ve kterém okamžiku je testován stav signálu „žádost o uvolnění sběrnice“ (BREQ) a při jeho aktivitě je sběrnice uvolněna:
- po každém dokončeném strojovém cyklu

Vnitřní paměť dat mikrokontroléru základní řady I8051 má celkovou kapacitu:
- 128 Byte

Statické paměti CMOS mají kromě jiných vlastností i některé z následujících:
- velmi malou spotřebu v klidovém stavu

Ochranu dat pomocí bateriového zálohování napájecího napětí je vhodné provádět (s ohledem na vlastnosti daného typu pamětí) především u pamětí následujícího typu:
- dynamických pamětí RAM
- statických pamětí CMOS RAM

Jakými základními typy periferních obvodů jsou obvykle vybaveny mikrokontroléry?
- ROM, EPROM, PROM, FLASH, RAM, čítače, hodiny reálného času, diskové řadiče, V/V řadiče, DMA řadiče, IRQ řadiče
- WATCHDOG, generátor PWM, USART
- A/D a D/A převodníky

Co obsahuje registr CCR
- flagy pro větvení programu

Co obsahuje registr EXR
- řízení přerušení a trasování

Nemaskovatelné přerušení lze povolit nebo zakázat
- nelze je zakázat žádným způsobem

Adresní vývody procesoru po odpovědi BUSACK na signál BREQ
- jsou odpojeny

Pro jaké přenosy je vhodné použít DMA
- blokové přenosy

Při návratu z obslužného programu přerušení se návratová adresa určí:
- přečte se z vrcholu zásobníku

Paměti EPROM
- lze po naprogramování vymazat UV zářením a znovu naprogramovat - celkem cca 100x

Napište názvy alespoň 4 různých cyklů, které lze aplikovat na dynamické paměti
- čtecí, zápisový, cyklus read-write, zotavovací cyklus

Následující tabulka porovnává vlastnosti statických a dynamických pamětí
- dynamická RAM - nízká cena, velká kapacita, nízká rychlost  
- statická RAM - opak dynamické  

Při provádění obslužného programu přerušení jsou další přerušeni  
- povolena nebo zakázána v závislosti na konkrétním obslužném programu

Které z následujících důvodu vedou k tomu, že se pamět Flash nepoužívá jako hlavní operační paměť počítače?  
- omezený počet povolených zápisů
- menší rychlost oproti RAM

Pro které typy přenosu je nejméně vhodné použití přerušení po každém znaku  
- velmi rychlé přenosy

Dynamická paměť RAM udrží obsah za předpokladu že
- je připojeno napájecí napětí a paměťové buňky jsou periodicky zotavovány

Při rozvinutí makra v určitém místě programu vloží překladač na toto místo:
- kopii instrukcí zapsaných v těle makra