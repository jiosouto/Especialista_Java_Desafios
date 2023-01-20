### Desafio 05 - Operadores de igualdade e lógicos

Você sabia que existem anos no calendário com 365 dias e outros com 366 dias?

Os anos com 366 dias são chamados de anos bissextos.

Isso acontece para manter o calendário anual ajustado com a translação do planeta Terra e com os eventos sazonais relacionados às estações do ano.

As seguintes regras definem se um ano é ou não um ano bissexto:

•São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, etc\
•São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, etc\
•Não são bissextos todos os demais anos

Desenvolva um programa que, dado um ano digitado pelo usuário, imprime na tela se é um ano bissexto ou não.

Dica de matemática: para saber se um número é múltiplo de outro, basta realizar o cálculo de módulo (resto da divisão). Um número é múltiplo de outro se o módulo for igual a 0.


### Desafio 06 - Calculadora complexa de IMC

Em aulas anteriores, nós implementamos as regras da Organização Mundial de Saúde para calcular o IMC (Índice de Massa Corporal).

Existem outras regras mais detalhadas, como as da NHANES II survey (USA 1976-1980), que indicam os seguintes critérios para adultos:

| Condição | IMC em mulheres | IMC em homens |
| --- | --- | --- |
| `Abaixo do peso` | Menor que 19.1 | Menor que 20.7|
| `No peso ideal` | Entre 19.1 e 25.8 | Entre 20.8 e 26.4|
| `Um pouco acima do peso` | Entre 25.9 e 27.3 | Entre 26.5 e 27.8|
| `Acima do peso ideal` | Entre 27.4 e 32.3 | Entre 27.9 e 31.1|
| `Obeso` | Maior que 32.3 | Maior que 31.1|

Implemente um programa que obtém os valores como entrada do usuário e imprime na tela o resultado (condição da pessoa), usando essas regras e aplicando todos os conteúdos que você aprendeu até agora neste módulo.