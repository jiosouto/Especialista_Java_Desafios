### Desafio 05 - Operadores de igualdade e l�gicos

Voc� sabia que existem anos no calend�rio com 365 dias e outros com 366 dias?

Os anos com 366 dias s�o chamados de anos bissextos.

Isso acontece para manter o calend�rio anual ajustado com a transla��o do planeta Terra e com os eventos sazonais relacionados �s esta��es do ano.

As seguintes regras definem se um ano � ou n�o um ano bissexto:

�S�o bissextos todos os anos m�ltiplos de 400, por exemplo: 1600, 2000, 2400, etc\
�S�o bissextos todos os m�ltiplos de 4 e n�o m�ltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, etc\
�N�o s�o bissextos todos os demais anos

Desenvolva um programa que, dado um ano digitado pelo usu�rio, imprime na tela se � um ano bissexto ou n�o.

Dica de matem�tica: para saber se um n�mero � m�ltiplo de outro, basta realizar o c�lculo de m�dulo (resto da divis�o). Um n�mero � m�ltiplo de outro se o m�dulo for igual a 0.


### Desafio 06 - Calculadora complexa de IMC

Em aulas anteriores, n�s implementamos as regras da Organiza��o Mundial de Sa�de para calcular o IMC (�ndice de Massa Corporal).

Existem outras regras mais detalhadas, como as da NHANES II survey (USA 1976-1980), que indicam os seguintes crit�rios para adultos:

| Condi��o | IMC em mulheres | IMC em homens |
| --- | --- | --- |
| `Abaixo do peso` | Menor que 19.1 | Menor que 20.7|
| `No peso ideal` | Entre 19.1 e 25.8 | Entre 20.8 e 26.4|
| `Um pouco acima do peso` | Entre 25.9 e 27.3 | Entre 26.5 e 27.8|
| `Acima do peso ideal` | Entre 27.4 e 32.3 | Entre 27.9 e 31.1|
| `Obeso` | Maior que 32.3 | Maior que 31.1|

Implemente um programa que obt�m os valores como entrada do usu�rio e imprime na tela o resultado (condi��o da pessoa), usando essas regras e aplicando todos os conte�dos que voc� aprendeu at� agora neste m�dulo.