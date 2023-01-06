# Poznámky ke zkoušce ze ZPI
- 3 základní prvky IoT architektury
    - **zařízení**
    - **síť**
    - **Cloud**
- komunikační technologie vhodné pro IoT: 
    - Wifi, Bluetooth, BLE (Bluetooth Low Energy), LoRa
    - LPWAN (Low Energy Wide Area Network): LoraWAN, Sigfox, Zigbee apod.
- Klíčové faktory komunikačních technologií:
    - **přenosová rychlost**
    - **spotřeba energie**
    - **dosah**
    - **frekvence**

## Věc
- obvykle se skládá z:
    - senzorů
    - mikropočítače / mikrokontroléru
    - komunikačního modulu
- **senzor**
    - **zdroj informací** pro měřicí nebo řídicí systém
    - je určen ke **sledování stavu prostředí**
    - **snímá fyzikální veličinu** ve svém okolí (= vždy má fyzikální princip)
    - druhy senzorů:
        - pasivní / aktivní
        - dotykové a bezdotykové senzory

## Mikrokontrolér
- získává data ze senzorů
- zpracovává data
- odesílá data do cloudu
- Základní architektury
- mikroprocesor doplněný o další obvody k řízení elektroniky
- **Harvardská** architektura
    - použití => **účelové počítače**
    - oddělený paměťový prostor pro data a program – umožňuje vyšší rychlost zpracování
- **Von Neumannova** architektura
    - použití => **univerzální počítače**
    - společný prostor pro data i program
- Podle šířky datové sběrnice se µC dělí na:
    - 8 – bitové
    - 16 – bitové
    - 32 – bitové

### Piny mikrokontroléru
- GPIO, ADC, DAC, SPI, I2C, UART, PWM

### Programování mikrokontrolerů
- **jazyky nízké úrovně** – strojový kód, assembler
- **vyšší programovací jazyky** - základní příkazy jsou nezávislé na µC, vyžadují překladač nebo interpretr
    - základní jazyk pro programování mikrokontrolerů C/C++, popř. jazyky z nich odvozené (Wiring – Arduino)
    - Mbed platforma
    - výkonnější µC mohou využívat micro-Python
- 2 typy překladačů:
    - **interpretační**
    - **kompilační**

### Vývojová prostředí pro µC
- Arduino, ESP32, Nucleo, Micro:bit
- univerzální vývojové IDE
    - VisualStudio Code, Platforma Mbed

### Struktura programu pro mikrokontrolér
- inicializační část
    - Nastavení pinů µC, komunikační rychlosti, definice proměnných programu, definice podprogramů pro obsluhu přerušení, inicializace časovačů apod.
- výkonná část
    - Hlavní program µC – test vstupních pinů, čtení dat ze senzorů, nastavení výstupních pinů, komunikace s okolím apod.

### Jednoduchý program pro M5Stack
- Zobrazení textu na obrazovce
    - ```from m5stack import lcd```
    - ```lcd.clear()```
    - ```lcd.print('Hello World',100,100, lcd.WHITE)```

## Typový systém 
- **Dynamický**
    - datový typ proměnné nemusíme definovat => datový typ se automatický mění
- **Statický**
    - musíme definovat typ proměnné a tento typ je dále neměnný

## Proměnná, identifikátor, typy proměnných
- **Proměnná** – objekt ve kterém jsou uložena data
    - **identifikátor** - název proměnné
- **základní datové typy**:
    - int, float, str, bool

## Přiřazovací příkaz
- **identifikátor = výraz**
- výraz může obsahovat:
    - matematické operátory
    - logické operátory
    - relační operátory
- výraz se vyhodnocuje zleva do prava podle priority
    - prioritu operací lze měnit závorkami ()

## Výpis hodnoty proměnné
- print(object(s), sep=separator, end=end)

## Větvení
- if podmínka:
    - blok příkazů
- další příkaz
- if podmínka:
    - blok příkazů
- else:
    - blok příkazů
- další příkaz
- if podmínka:
    - blok příkazů
- elif podmínka:
    - blok příkazů
- else:
    - blok příkazů
- další příkaz

## Cykly
- S pevným počtem opakování:
    - for proměnná in posloupnost:
        - blok příkazů
    - další příkaz
    - ```for i in range(5):```
- S ukončovací podmínkou:
    - while logická_podmínka:
        - blok příkazů
    - další příkaz

## Funkce v Pythonu
- procedura - funkce, která nic nevrací
- definice funkce:
    - def jméno_funkce(a,b,c):
        - blok příkazů
    - return res
- volání funkce:
    - příkazy
    - p=jméno_funkce(3,7,10)
    - příkazy

## Balíčky, moduly, import
- **balíček** = knihovna funkcí, které spolu nějakým způsobem souvisí, může být členěn do modulů
    - Balíček může obsahovat konstanty, funkce, datové typy
- **Modul** – soubor funkcí

### Import balíčku a jeho částí 
- ```import jméno_balíčku```
- Přístup k funkcím přes tečkovou notaci
- ```import jméno_balíčku as xx```
- ```from jméno_balíčku import jméno```
    - Z balíčku se importuje pouze modul (nebo funkce) jméno
- ```from jméno_balíčku import *```
    - Z balíčku se importují všechny moduly

### Výpis obsahu balíčku
- ```import jméno_balíčku```
- ```dir(jméno_balíčku)```

## GPIO – (General Purpose Input Output) 
- mohou být nastaveny jako **vstupní** nebo jako **výstupní**
- Nastavení pinů se provádí před hlavním cyklem mikrokontroleru ( while True: ) (např. u arduina ve funkci void setup() )
- Ovládání pinů je obsaženo v modulu ```machine```, který je u M5Stack součástí balíčku ```m5stack```
- nastavení Pinu pro výstup:
    - ```import m5stack```
    - ```pin26= machine.Pin(26,machine.Pin.OUT)```
    - ```pin26.on() # výstup v úrovni 1```
    - ```Pin26.off() # výstup v úrovni 0```
- U výstupního pinu musíme dát pozor, aby pinem netekl větší proud
- nastavení Pinu pro vstup:
    - ```import m5stack```
    - ```pin26= machine.Pin(26,machine.Pin.IN,machine.Pin.PULL_UP)```
    - ```print(pin26.value())```

## Obsluha tlačítek u M5Stack Fire
- 3 tlačítka , která mají v API přiřazena jména ```btnA```, ```btnB```, ```btnC```
- funkce pro práci s tlačítky:
    - ```isPressed()```, ```wasPressed()```, ```isReleased()```, ```wasReleased()```, ```pressFor(delay)```, ```wasDoublePress()```

## Přerušení vs pooling
- **pooling**
    - mikrokontrolér cyklicky testuje zda mají senzory připravená data
- **přerušení**
    - reakce mikrokontroléru na asynchronní událost
    - pokud má senzor připravená data „vyzve procesor“ k jejich zpracování
    - procesor může mezi událostmi zpracovávat jinou část programu nebo může „spát“ 

## MicroPython vs. Python
- Micropython je redukovaná implementovaná verze interpreteru jazyka Python 3
- od klasického Pythonu se liší pouze množstvím knihoven (modulů) – některé chybí, některé jsou naopak přidány

## LCD - API
- Soubor funkcí, které pracují s obrazovkou
- ``` from m5stack import lcd ```
- barvy => ```lcd.BLACK```, ```WHITE```, ...
- fonty =>  ```lcd.FONT_Default```, , ```FONT_Ubuntu```
- ```lcd.clear([color])```
- ```lcd.print(text [,x,y, color, …])```
- ```lcd.fontSize()```

## Seznamy v micropythonu
- seznam je heterogenní datová struktura => lze do ní ukládat proměnné různých datových typů
- prázdný seznam: ```seznam = []```
- vytvoření proměnné x typu seznam, obsahující prvky: ```x=[1.5, 3, ‘text’]```
- délka seznamu: ````delka = len(x)```
- procházení seznamu: ```for i in x:```
- vložení prvku na konec: ```x.append(val)```
- vložení prvku na index: ```x.insert(index, val)```
- smazání prvku podle hodnoty: ```x.remove(val)```
- smazání prvku podle indexu: ```x.pop(index)```

## IMU (Inertial Measurement Unit)
- měří **polohu** a **orientaci** objektu obvykle je složený z **akcelerometru** a **gyroskopu**, někdy s magnetometrem

## Časovače
- **čítač**, který používá **taktovací signál**
- použití (např.):
    - generování periodických impulsů
    - PWM (pulsně šířková modulace)
- U ESP32 jsou k dispozici 4 hardwarové časovače
- Micropython:
    - Pro práci s časovači se používá třída ```machine.Timer```
    - Nastavení parametrů časovače:
        - ```from machine import Timer```
        - ```tim0=Timer(0)```
        - ```tim0.init(period=2000,mode=Timer.PERIODIC,callback=tim_callback)```
    - ```Timer.ONE_SHOT``` / ```Timer.PERIODIC```
    - obslužná rutina přerušení časovače:
        - ```def tim_callback(timer):```
            - ```global i```
            - ```lcd.clear()```
            - ```lcd.print(i,100,100,lcd.RED)```
            - ```i=i+1```
    - ukončení časovače: ```tim0.deinit()```

## A/D (analog/digital) převodníky
- Převádí spojitou hodnotu napětí na číslicovou reprezentaci
- Základní charakteristiky:
    - **Počet kvantizačních úrovní**
    - **Kvantizační krok**
    - Souměrnost
    - Typ převodníku
    - **Rozsah vstupního napětí**

### Typy převodníků
- **Paralelní** (flash) **převodník**
    - Princip: Vstupní napětí Vin se porovnává komparátory s referenčním napětím na napěťovém děliči. Výstup komparátorů je kódován do binární podoby.
    - +: rychlý převod (převod se provádí paralelně) -: vyšší spotřeba, drahé
- **Převodník s následnou aproximací** (SAR)
    - tři bloky:
        - SAR (successive aproximation register) – registr postupné aproximace
        - komparátor
        - D/A převodník
    - **Tento typ převodníku se používá u většiny mikrokontrolerů**
- **Sigma-delta převodní**
    - moderní typ převodníku, dosahuje vysokého rozlišení (16-24 bit) za relativně nízkou cenu
    - jednoduchý hardware
    - složitý software
    - jádrem převodníku je integrátor a komparátor

## Použití ADC převodníku na ESP32
- obecně 2 dostupné ADC převodníky
- V micropythonu na ESP32 je modul ```ADC``` pro převod součástí knihovny ```machine```
- import modulu a vytvoření objektu adc s nastavením pinu na kterém je převodník:
    - ```from machine import ADC, Pin```
    - ```adc=ADC(Pin(36))```
- Čtení hodnoty převodníku do proměnné ```xx```:
    ```xx=adc.read()```
- Změna parametrů převodu:
    - ```ADC.atten(attenuation)```
    - ```ADC.width(width)```

## D/A – (digital/analog) převodníky 
- Převádí číslicovou reprezentaci na analogový signál
- Charakteristiky:
    - Rozsah výstupního napětí (u ESP32 - 0-3.3V)
    - Počet kvantizačních úrovní (počet bitů) (u ESP32 je 8 bitový DAC – tj. lze zadat číslo v rozsahu 0-255)
- Typy převodníků:
    - přímé
        - vstupní datové slovo je přímo převedeno na výstupní napětí (proud)
    - nepřímé

## D/A nepřímý převodník
- U nepřímých převodníků – pomocná veličina je impulz
    - převodníky s pulzně šířkovou modulací (PWM)

### Použití DAC převodníku na ESP32
- Obecně jsou na ESP32 dostupné 2 převodníky
- Převodník je 8 bit (255 úrovní) a vstupní rozsah napětí je 0-3.3V
- Použití: 
    - generátor funkcí
    - v kombinaci s ADC jako digitální signálový procesor
- V micropythonu na ESP32 je modul ```DAC``` pro převod součástí knihovny ```machine```
- Aktivace modulu a vytvoření objektu dac s nastavením pinu na kterém je převodník
    - ```from machine import DAC, Pin```
    - ```dac=DAC(Pin(26))```
- Převod číslicové hodnoty xxx na analogové napětí
    - ```dac.write(xxx)```

## PWM – Pulse Width Modulation
- Jedná se o způsob, jak uměle získat analogové napětí na digitálním pinu
- rychlým přepínáním digitálního pinu z úrovně H do úrovně L a naopak
- PWM je charakterizováno základní frekvencí změny úrovně a tzv. střídou (duty cycle) což je poměr mezi tím, jak dlouho je signál v úrovni H oproti úrovni L v rámci jedné periody (střída 50% značí že doba v úrovni H je stejná jako v úrovni L)
- U ESP32 => lze použít PWM na všech pinech, které lze nastavit jako výstupní
- Použití:
    - Řízení rychlosti motorů
    - Stmívání LED
    - Řízení servomotorů apod. 
- V micropythonu na ESP32 je modul ```PWM``` součástí knihovny ```machine```
- Aktivace modulu a vytvoření objektu pwm0 s nastavením pinu na kterém bude PWM použito
    - ```from machine import PWM, Pin```
    - ```pwm0=PWM(Pin(26))```
    - ```Pwm0=PWM(Pin(26),freq=1000,duty=200) ```
- Zjištění základní frekvence, nastavení základní frekvence PWM na 1000 Hz
    - ```print(pwm0.freq())```
    - ```pwm0.freq(1000)```
- Zjištění duty-cycle a nastavení duty-cycle
    - ```print(pwm0.duty())```
    - ```pwm0.duty(200)```
- Ukončení práce s PWM
    - ```pwm0.deinit()```

## Co je Mbed
- Mbed OS je operační systém s otevřeným zdrojovým kódem a vývojový nástroj pro platformy využívající mikrokontroléry
-  Platforma Mbed je postavena na jazyku C/C++
- Mbed OS obsahuje ovladače pro mnoho různých hardware:
    - moduly, desky, komponenty

### Mikrokontrolery ARM
- 32 bitová architektura typu RISC
- velmi často využíván v mobilních odvětvích 
- ARM1 (1984), aktuální ARM11

### Vývoj aplikací v Mbed
- 3 možnosti vývoje aplikace:
    - 1. Online překladač
    - 2. Mbed Studio
    - 3. PlatformIO

### Struktura programu v Mbed
- ```#include <mbed.h>```
- ```// deklarace globálních proměnných```
- ```void main() {```
    - ```// deklarace lokálních proměnných```
- ```while (1) {```
    - ```…```
    - ```}```
- ```}```

## UART/USART
- jednoduchá komunikační linka mezi dvěma zařízeními
- asynchronní plně duplexní komunikace
- někdy se používá USART => podporuje i synchronní verzi
- typické parametry - 8/N/1 - bity se přenáší od LSB k MSB
- Propojení modulů vždy „křížem“

### UART – konfigurace a použití
- Micropython:
    - Pro práci s UART se používá třída ```machine.UART```
- Práce s UART:
    - Vytvoření objektu ```uart2``` typu UART
        - ```from machine import UART```
        - ```uart2=UART(2)```
        - ```Uartx=UART(id, tx=číslo_pinu,rx=číslo_pinu)```
    - Nastavení parametrů komunikace
        - ```uart2.init(baudrate=9600,bits=8,parity=None,stop=1)```
    - Komunikace (u ESP32 lze použít pouze metodu „pooling“)
        - ```uart.any()```
        - ```xxx=uart.read()```
        - ```xxx=uart.read(n)```
        - ```xxx=uart.readln()```
        - ```uart.write(txt)```
    - Ukončení činnosti sériového rozhraní
        - ```uart2.deinit()```

## Bluetooth komunikace M5stack
- M5stack micropython API nepodporuje bluetooth komunikaci
- Lze to vyřešit použitím BT-UART modulů
- POZOR!!!! Moduly jsou sice napájeny 3-6V, ale RX a TX piny nejsou 5V tolerant
- BT modul se konfiguruje AT příkazy

## I²C – (Inter- Integrated Circuit)
- synchronní poloduplexní komunikace (= jeden vodič pro data a jeden vodič pro taktovací signál)
- používá se pro připojení nízkorychlostních zařízení
- Zařízení typu master zahajuje a ukončuje komunikaci, adresuje zařízení slave se kterým chce komunikovat a generuje hodinový signál SCL
- Zařízení slave je adresované masterem, obvykle poskytuje data

### I²C – konfigurace a použití
- Micropython: 
    - Pro práci s I²C se používá třída machine.I2C
- Práce s UART:
    - Vytvoření objektu i2c typu I2C
        - ```from machine import I2C```
        - ```i2c=I2C(1,sda=21, scl=22[,freq=400000])```
    - hledání adres zařízení
        - ```lst=i2c.scan()```