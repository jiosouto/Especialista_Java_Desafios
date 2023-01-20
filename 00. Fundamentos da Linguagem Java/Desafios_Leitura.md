### Desafio 00 - Correção de erros

Marinheiros de primeira viagem costumam cometer erros comuns, porque a linguagem Java é um pouco burocrática.

Vamos exercitar a resolução dos principais erros cometidos por iniciantes neste desafio.

Você deve baixar os códigos-fonte de diversos programas que estão com problemas de compilação, tentar compilar, interpretar e analisar a mensagem de erro (importante fazer isso para se acostumar com elas) e só depois corrigir o problema, até compilar e executar corretamente.

Tem gente que entra em pânico quando vê uma mensagem de erro, ainda mais em inglês. Mas fica tranquilo, se precisar, traduza as palavras que você não conhece. É bom que você comece a fazer amizade coma as mensagens de erro, porque elas ajudam muito.


### Desafio 01 - Variáveis e operadores aritméticos

Um comerciante está curioso para saber o ticket médio das últimas 3 vendas que fez em sua loja e contratou você para desenvolver um programa que resolva isso.

Como você ainda não aprendeu a receber entrada de dados pelo usuário, você pediu ao comerciante os valores das 3 últimas vendas para incluir dentro do código-fonte do programa (mas prometeu arrumar isso assim que aprendesse).

O comerciante te passou os seguintes valores: 20, 30 e 100.

Desenvolva um programa que calcula a média desses números e exibe na saída.


### Desafio 02 - Tipos primitivos e conversão

Um programador começou a desenvolver um programa para o departamento de logística de uma empresa, que calcula o peso total das cargas de um caminhão, porém ele saiu de férias e você foi chamado para finalizar o trabalho.

Embora o peso das cargas sejam com decimais (ponto-flutuante), o usuário quer saber o peso total das cargas sem casas decimais, ou seja, o valor total deve ser "truncado".

Finalize o programa exibindo o peso total das cargas em inteiro.

```java
public class CalculadoraPesosDasCargas {

  public static void main(String[] args) {
    double pesoCarga1 = 1033.49;
    double pesoCarga2 = 849.88;

    int pesoTotalCargas = // escrever seu código aqui

    // O resultado deve ser 1883
    System.out.println("Peso total das cargas: " + pesoTotalCargas);
  }

}
```


### Desafio 03 - Promoção aritmética

Um programador Java iniciante está desenvolvendo um programa que deve calcular a idade média de 3 pessoas, porém o resultado deve ser com casas decimais.

Ele já tentou alterar o tipo da variável idadeMedia para float, mas mesmo assim o resultado não é o que ele espera (os decimais sempre ficam zerados).

Esse programador ficou sabendo que você está fazendo este curso e pediu a sua ajuda para resolver esse problema.

Altere o código para que o cálculo da idade média seja feito em ponto-flutuante.

```java
public class CalculadoraIdadeMedia {

  public static void main(String[] args) {
    int idade1 = 30;
    int idade2 = 40;
    int idade3 = 60;

    int idadeMedia = (idade1 + idade2 + idade3) / 3;

    System.out.println("Idade média: " + idadeMedia);
  }

}
```


### Desafio 04 - String, entrada de dados, printf, etc

A empresa que você trabalha descobriu que você está indo muito bem neste curso de Java e pediu para que você desenvolvesse um programa que calcula os pagamentos para os prestadores de serviços da empresa.

Este programa deve receber as seguintes entradas de dados do usuário:

Nome (texto)\
Valor por hora (decimal)\
Horas trabalhadas (inteiro)\
Valor dos descontos (decimal)

A saída do programa deve ser um resumo da folha de pagamento mostrando os cálculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria\
172 horas x R$150.20 = R$25834.40\
Descontos: R$482.88\
Total devido: R$25351.52

Use a formatação de saída com printf para imprimir na saída e o tipo Scanner para receber a entrada de dados do usuário.