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


### Desafio 07 - Estrutura switch e operador tern�rio

Uma financeira contratou um programador para desenvolver um programa que calcula o custo total de empr�stimos para seus clientes, por�m o contrato foi cancelado e voc� foi chamado para concluir a programa��o do sistema.

O c�digo-fonte abaixo (incompleto) foi repassado para voc� fazer seu trabalho:

```java
import java.util.Scanner;
public class SimuladorEmprestimo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Valor do empr�stimo: ");
    double valorEmprestimo = entrada.nextDouble();
    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();
    double taxaJuros = // switch expression aqui
    double tarifaFixa = // use operador tern�rio aqui
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;
    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }
}
```

O cliente tamb�m te informou que a taxa de juros da financeira depende da quantidade de parcelas:

�1 ou 2 parcelas: 1,99% ao m�s\
�3 parcelas: 2,99% ao m�s\
�Outras quantidades de parcelas: 3,99% ao m�s

Al�m disso, caso o valor do empr�stimo seja maior ou igual a 100, uma tarifa fixa ser� cobrada no valor de R$1,50.


### Desafio 08 - Estruturas de repeti��o

**1) Desafio da estrutura for**\
Escreva um programa que solicita 10 n�meros para o usu�rio e imprime na sa�da a soma dos n�meros digitados.

Permita que o usu�rio digite apenas n�meros pares. Caso um n�mero �mpar seja informado, ignore e solicite um novo n�mero ao usu�rio.

**2) Desafio da estrutura for (intermedi�rio)**\
Escreva um programa que solicita um n�mero inteiro positivo para o usu�rio e imprime na sa�da uma mensagem dizendo se o n�mero digitado � um n�mero primo ou n�o.

N�meros primos s�o n�meros naturais que possuem dois divisores: 1 e ele mesmo.

Por exemplo, o n�mero 1 n�o � um n�mero primo, porque ele tem apenas o n�mero 1 (ele mesmo) como divisor. O n�mero 2 � primo, porque ele � divis�vel por 1 e ele mesmo. O n�mero 4 n�o � primo, porque ele � divis�vel por 1, 2 e 4.

Para saber se um n�mero � divis�vel por outro, basta usar o operador de m�dulo (resto) e avaliar se � igual a 0.

**3) Desafio da estrutura while**\
Escreva um programa que solicita n�meros inteiros ao usu�rio de forma cont�nua e soma todos os n�meros informados.

O programa deve parar de solicitar mais n�meros e imprimir a soma deles na sa�da apenas quando o valor total somado for igual ou superior a 100.

**4) Desafio da estrutura while (intermedi�rio)**\
Escreva um programa que solicita um n�mero inteiro para o usu�rio e imprime na sa�da o n�mero com os d�gitos invertidos.

Por exemplo, se o n�mero digitador for 98765, a sa�da deve ser 56789.

Este � um exerc�cio intermedi�rio, especialmente porque precisar� usar suas habilidades em l�gica. � poss�vel fazer isso apenas com um loop e c�lculos matem�ticos.

**5) Desafio da estrutura do-while**\
Escreva um programa que solicita n�meros inteiros para o usu�rio de forma "infinita", at� que o usu�rio escolha n�o digitar mais nenhum n�mero (pergunte ao usu�rio ap�s informar cada n�mero).

Some todos os n�meros �mpares e todos os n�meros pares e imprima na sa�da o resultado.