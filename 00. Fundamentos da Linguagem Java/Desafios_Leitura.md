### Desafio 00 - Corre��o de erros

Marinheiros de primeira viagem costumam cometer erros comuns, porque a linguagem Java � um pouco burocr�tica.

Vamos exercitar a resolu��o dos principais erros cometidos por iniciantes neste desafio.

Voc� deve baixar os c�digos-fonte de diversos programas que est�o com problemas de compila��o, tentar compilar, interpretar e analisar a mensagem de erro (importante fazer isso para se acostumar com elas) e s� depois corrigir o problema, at� compilar e executar corretamente.

Tem gente que entra em p�nico quando v� uma mensagem de erro, ainda mais em ingl�s. Mas fica tranquilo, se precisar, traduza as palavras que voc� n�o conhece. � bom que voc� comece a fazer amizade coma as mensagens de erro, porque elas ajudam muito.


### Desafio 01 - 

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