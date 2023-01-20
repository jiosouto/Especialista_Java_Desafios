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