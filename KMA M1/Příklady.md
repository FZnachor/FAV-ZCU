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

**Výpočet definičního oboru**:

Pokud máme **jednu funkci** (např. $\log(3x+2)$), stačí vypočítat lineární nerovnici $3x + 2 > 0$. Výsledkem bude $x > -\frac{2}{3}$, takže tedy $D(f) = \left( -\frac{2}{3}, \infty \right)$.

Pro **více funkcí** je potřeba funkce rozložit na vnější a vnitřní a poté postupně zjišťovat definiční obory.

| funkce     | definiční obor                                                           |
| ---------- | ------------------------------------------------------------------------ |
| $\log(x)$  | $(0, \infty)$                                                            |
| $\sqrt{x}$ | $\langle0, \infty)$                                                      |
| $\tan(x)$  | $\mathbb{R} - \left\{  \frac{\pi}{2} + k\pi  \right\}; k \in \mathbb{Z}$ |
| $\cot(x)$  | $\mathbb{R} - \left\{  k\pi  \right\}; k \in \mathbb{Z}$                 |

### Lokální extrémy funkce