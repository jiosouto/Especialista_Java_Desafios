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


### Desafio 07 - Estrutura switch e operador ternário

Uma financeira contratou um programador para desenvolver um programa que calcula o custo total de empréstimos para seus clientes, porém o contrato foi cancelado e você foi chamado para concluir a programação do sistema.

O código-fonte abaixo (incompleto) foi repassado para você fazer seu trabalho:

```java
import java.util.Scanner;
public class SimuladorEmprestimo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();
    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();
    double taxaJuros = // switch expression aqui
    double tarifaFixa = // use operador ternário aqui
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;
    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }
}
```

O cliente também te informou que a taxa de juros da financeira depende da quantidade de parcelas:

•1 ou 2 parcelas: 1,99% ao mês\
•3 parcelas: 2,99% ao mês\
•Outras quantidades de parcelas: 3,99% ao mês

Além disso, caso o valor do empréstimo seja maior ou igual a 100, uma tarifa fixa será cobrada no valor de R$1,50.


### Desafio 08 - Estruturas de repetição

**1) Desafio da estrutura for**\
Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.

Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.

**2) Desafio da estrutura for (intermediário)**\
Escreva um programa que solicita um número inteiro positivo para o usuário e imprime na saída uma mensagem dizendo se o número digitado é um número primo ou não.

Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.

Por exemplo, o número 1 não é um número primo, porque ele tem apenas o número 1 (ele mesmo) como divisor. O número 2 é primo, porque ele é divisível por 1 e ele mesmo. O número 4 não é primo, porque ele é divisível por 1, 2 e 4.

Para saber se um número é divisível por outro, basta usar o operador de módulo (resto) e avaliar se é igual a 0.

**3) Desafio da estrutura while**\
Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma todos os números informados.

O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas quando o valor total somado for igual ou superior a 100.

**4) Desafio da estrutura while (intermediário)**\
Escreva um programa que solicita um número inteiro para o usuário e imprime na saída o número com os dígitos invertidos.

Por exemplo, se o número digitador for 98765, a saída deve ser 56789.

Este é um exercício intermediário, especialmente porque precisará usar suas habilidades em lógica. É possível fazer isso apenas com um loop e cálculos matemáticos.

**5) Desafio da estrutura do-while**\
Escreva um programa que solicita números inteiros para o usuário de forma "infinita", até que o usuário escolha não digitar mais nenhum número (pergunte ao usuário após informar cada número).

Some todos os números ímpares e todos os números pares e imprima na saída o resultado.