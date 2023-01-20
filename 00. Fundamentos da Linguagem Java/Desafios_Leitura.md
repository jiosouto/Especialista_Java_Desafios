### Desafio 00 - Corre��o de erros

Marinheiros de primeira viagem costumam cometer erros comuns, porque a linguagem Java � um pouco burocr�tica.

Vamos exercitar a resolu��o dos principais erros cometidos por iniciantes neste desafio.

Voc� deve baixar os c�digos-fonte de diversos programas que est�o com problemas de compila��o, tentar compilar, interpretar e analisar a mensagem de erro (importante fazer isso para se acostumar com elas) e s� depois corrigir o problema, at� compilar e executar corretamente.

Tem gente que entra em p�nico quando v� uma mensagem de erro, ainda mais em ingl�s. Mas fica tranquilo, se precisar, traduza as palavras que voc� n�o conhece. � bom que voc� comece a fazer amizade coma as mensagens de erro, porque elas ajudam muito.


### Desafio 01 - Vari�veis e operadores aritm�ticos

Um comerciante est� curioso para saber o ticket m�dio das �ltimas 3 vendas que fez em sua loja e contratou voc� para desenvolver um programa que resolva isso.

Como voc� ainda n�o aprendeu a receber entrada de dados pelo usu�rio, voc� pediu ao comerciante os valores das 3 �ltimas vendas para incluir dentro do c�digo-fonte do programa (mas prometeu arrumar isso assim que aprendesse).

O comerciante te passou os seguintes valores: 20, 30 e 100.

Desenvolva um programa que calcula a m�dia desses n�meros e exibe na sa�da.


### Desafio 02 - Tipos primitivos e convers�o

Um programador come�ou a desenvolver um programa para o departamento de log�stica de uma empresa, que calcula o peso total das cargas de um caminh�o, por�m ele saiu de f�rias e voc� foi chamado para finalizar o trabalho.

Embora o peso das cargas sejam com decimais (ponto-flutuante), o usu�rio quer saber o peso total das cargas sem casas decimais, ou seja, o valor total deve ser "truncado".

Finalize o programa exibindo o peso total das cargas em inteiro.

```java
public class CalculadoraPesosDasCargas {

  public static void main(String[] args) {
    double pesoCarga1 = 1033.49;
    double pesoCarga2 = 849.88;

    int pesoTotalCargas = // escrever seu c�digo aqui

    // O resultado deve ser 1883
    System.out.println("Peso total das cargas: " + pesoTotalCargas);
  }

}
```


### Desafio 03 - Promo��o aritm�tica

Um programador Java iniciante est� desenvolvendo um programa que deve calcular a idade m�dia de 3 pessoas, por�m o resultado deve ser com casas decimais.

Ele j� tentou alterar o tipo da vari�vel idadeMedia para float, mas mesmo assim o resultado n�o � o que ele espera (os decimais sempre ficam zerados).

Esse programador ficou sabendo que voc� est� fazendo este curso e pediu a sua ajuda para resolver esse problema.

Altere o c�digo para que o c�lculo da idade m�dia seja feito em ponto-flutuante.

```java
public class CalculadoraIdadeMedia {

  public static void main(String[] args) {
    int idade1 = 30;
    int idade2 = 40;
    int idade3 = 60;

    int idadeMedia = (idade1 + idade2 + idade3) / 3;

    System.out.println("Idade m�dia: " + idadeMedia);
  }

}
```


### Desafio 04 - String, entrada de dados, printf, etc

A empresa que voc� trabalha descobriu que voc� est� indo muito bem neste curso de Java e pediu para que voc� desenvolvesse um programa que calcula os pagamentos para os prestadores de servi�os da empresa.

Este programa deve receber as seguintes entradas de dados do usu�rio:

Nome (texto)\
Valor por hora (decimal)\
Horas trabalhadas (inteiro)\
Valor dos descontos (decimal)

A sa�da do programa deve ser um resumo da folha de pagamento mostrando os c�lculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria\
172 horas x R$150.20 = R$25834.40\
Descontos: R$482.88\
Total devido: R$25351.52

Use a formata��o de sa�da com printf para imprimir na sa�da e o tipo Scanner para receber a entrada de dados do usu�rio.