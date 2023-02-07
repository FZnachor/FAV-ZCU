# Řešení příkladů

### Limita se zlomkem

$\displaystyle\lim_{ n \to \infty } \left(\frac{2n^3+3n}{3n^3+n^2}\right) = \frac{2}{3}$
- Ve jmenovateli i čitateli jsou nejvyšší mocniny $n^a$ stejné (zde $n^3$), proto se limita bude rovnat koeficientům před nimi ve zlomku.

$\displaystyle\lim_{ n \to \infty } \left(\frac{3n^2 + n}{5n - 4}\right) = +\infty$
- Pokud je v čitateli vyšší mocnina $n^a$ než ve jmenovateli, je limita $+\infty$.

$\displaystyle\lim_{ n \to \infty } \left(\frac{2n^3 + n^2}{9n^4 - 2n}\right) = 0$
- Pokud je ve jmenovateli vyšší mocnina $n^a$ než v čitateli, je limita $0$.

$\displaystyle\lim_{ n \to \infty } \left( \frac{n^2}{n+3} - \frac{n^2}{n+2} \right) = \lim_{ n \to \infty } \left( \frac{n^3+2n^2-n^3-3n^2}{(n+3)(n+2)} \right) = \dots$
- Pokud jsou v limitě dva zlomky, které po dosazení vyjdou jako neurčitý výraz, je potřeba je roznásobit.

### Limita s odmocninou

$\displaystyle\lim_{ n \to \infty } \left(\sqrt{ n+1 } - \sqrt{ n }\right) = \lim_{ n \to \infty } \left(\frac{n+1-n}{\sqrt{ n+1 } + \sqrt{ n }}\right) = 0$
- Vynásobíme $\displaystyle\frac{\sqrt{ n+1 } + \sqrt{ n }}{\sqrt{ n+1 } + \sqrt{ n }}$, čímž získáme $\frac{n+1-n}{\sqrt{ n+1 } + \sqrt{ n }}$. (Využití vzorečku $(a-b)(a+b) = a^2+b^2$.)

### Limita s Eulerovým číslem

$\displaystyle\lim_{ n \to \infty } \left( 1 + \frac{1}{n+5} \right)^{n-3} = e$
- Hodnota před $n$ je stejná jak ve jmenovateli, tak v mocnině, limita je tedy $e^1$ (na číslo v čitateli zlomku).

$\displaystyle\lim_{ n \to \infty } \left( 1 + \frac{-1}{n+9} \right)^{7n} = \lim_{ n \to \infty } \left( 1 + \frac{-7}{7n+63} \right)^{7n} = e^{-7}$
- Hodnota před $n$ není ve jmenovateli a v mocnině stejná, proto musím zlomek vynásobit vhodným číslem, aby tato rovnost platila, v tomto případě číslem $7$.

$\displaystyle\lim_{ n \to \infty } \left( 1+\frac{9}{n^2} \right)^{7-5n^3} = e^{\frac{n^2}{-n^3}} = 0$
- Každé $n$ je umocněno jiným číslem, proto výsledek zapíšu jako $e$ umocněné na $\displaystyle\frac{\text{jmenovatel}}{\text{mocnina}}$ a tento výraz dále upravuji.

### Limita funkce

### Derivace

### Neurčitý intergrál

### Určitý integrál

### Průběh funkce

V příkladech bude pracováno s funkcí $f(x) = -2x^4 + 4x^2 + 6$.

**Definiční obor**:

Pokud máme **jednu funkci** (např. $\log(3x+2)$), stačí vypočítat lineární nerovnici $3x + 2 > 0$. Výsledkem bude $x > -\frac{2}{3}$, takže tedy $D(f) = \left( -\frac{2}{3}, \infty \right)$.

Pro **více funkcí** je potřeba funkce rozložit na vnější a vnitřní a poté postupně zjišťovat definiční obory.

| funkce     | definiční obor                                                           |
| ---------- | ------------------------------------------------------------------------ |
| $\log(x)$  | $(0, \infty)$                                                            |
| $\sqrt{x}$ | $\langle0, \infty)$                                                      |
| $\tan(x)$  | $\mathbb{R} - \left\{  \frac{\pi}{2} + k\pi  \right\}; k \in \mathbb{Z}$ |
| $\cot(x)$  | $\mathbb{R} - \left\{  k\pi  \right\}; k \in \mathbb{Z}$                 |

**Limity v krajních bodech D(f)**:

Vypočítám limitu jdoucí ke krajům $D(f)$, v případě $D(f) = (-\infty, \infty)$:

- $\displaystyle \lim_{ n \to -\infty } f(x) = \dots$
- $\displaystyle \lim_{ n \to \infty } f(x) = \dots$

**Sudost / lichost funkce**:

- sudá: $f(x) = f(-x)$
- lichá: $-f(x) = f(-x)$

**Průsečíky s osami**:

| osa      | dosazení               |         |
| -------- | ---------------------- | ------- |
| s osou y | $y = 0 + 0 + 6$        | $x = 0$ |
| s osou x | $0 = -2x^4 + 4x^2 + 6$ | $y = 0$ |

**První derivace** - monotonie a lokální extrémy funkce:

- $f'(x = -8x^3 + 8x = 8x(1-x)(1+x)$

Nulové body: $\{0, 1, -1\}$

V prvním kroce zderivuji funkci $f(x)$ a ze získané funkce $f'(x)$ mohu zjistit, kde je funkce rostoucí a klesající. Funkci je dobré si rozložit na součin, aby byly zřejmé nulové body, tedy body, kde funkce nebude růst ani klesat. Je také možné najít lokální maxima a minima.

|         | $(-\infty, -1)$ | $(-1, 0)$ | $(0, 1)$ | $(1, \infty)$ |
| ------- | --------------- | --------- | -------- | ------------- |
| $8x$    | -               | -         | +        | +             |
| $(1-x)$ | +               | +         | +        | -             |
| $(1+x)$ | -               | +         | +        | +             |
| $f'(x)$ | **+**           | **-**     | **+**    | **-**         |
| $f(x)$  | roste           | klesá     | roste    | klesá         |

Existenci lokálního minima/maxima ověříme druhou derivací.

- **lokální maxima**: $f(-1) = f(1) = 8$
- **lokální minimum**: $f(0) = 6$

**Druhá derivace** - konvexita/konkávita, inflexní body:

- $f''(x) = -24x^2 + 8 = 8(1-\sqrt{ 3 }x)(1+\sqrt{ 3 }x)$

Ověření lokálních maxim a minim provedeme zjištěním druhé derivace v podezřelých bodech.
- $f''(-1) = f''(1) = -16 < 0, \quad$ jedná se tedy o lokální maxima
- $f''(0) = 8 > 0, \quad$ jedná se tedy o lokální minimum

Poté najdu nulové (inflexní) body pomocí druhé derivace a určím jejich hodnotu na původní funkci:
- $\left\{ \frac{\sqrt{ 3 }}{3}, -\frac{\sqrt{ 3 }}{3} \right\}$
- $f\left( \frac{\sqrt{ 3 }}{3} \right) = f\left( -\frac{\sqrt{ 3 }}{3} \right) = 7 + \frac{1}{9}$