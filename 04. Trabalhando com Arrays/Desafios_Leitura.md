### Desafio 14 - Arrays (Parte 1)

Refatore o c�digo da classe Calendario, substuindo o switch expression por uma l�gica usando arrays, sem usar qualquer tipo de estrutura condicional, como switch e if.

```java
public class Calendario {

    static String obterNomeMes(int numeroMes) {
        return switch (numeroMes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Mar�o";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> null;
        };
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);

        System.out.println(mes);
    }

}
```


### Desafio 15 - Arrays (Parte 2)

Uma software house est� desenvolvendo um software para gest�o de restaurantes e voc� foi designado para finalizar a implementa��o da classe Cardapio.

Implemente os m�todos conforme as tarefas pendentes comentadas no c�digo-fonte, usando o array de ItemCardapio. Depois, rode a classe Principal para fazer alguns testes.

```java
public class ItemCardapio {

    String descricao;
    double preco;

}
```

```java
public class Cardapio {

    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclus�o de item do card�pio
    }

    void removerItem(int indice) {
        // TODO implementar exclus�o de item do card�pio da posi��o informada
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar c�digo para imprimir na console os itens
        //  do card�pio que estiverem entre o pre�o m�nimo e m�ximo
    }

}
```

```java
public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        cardapio.imprimirItensCardapio(80, 150);

        cardapio.removerItem(0);
        System.out.println("---");

        cardapio.imprimirItensCardapio(0, 150);
    }

}
```

### Desafio 16 - ArrayList

Refatore o c�digo abaixo para usar ArrayList, no lugar de array.

```java
public class ItemCardapio {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        return preco >= precoMinimo && preco <= precoMaximo;
    }

    void imprimir() {
        System.out.printf("%s x R$%.2f%n", descricao, preco);
    }

}
```

```java
import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0, novosItens, 0, indice);
        System.arraycopy(itens, indice + 1,
                novosItens, indice, novosItens.length - indice);

        itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}
```

```java
public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        cardapio.imprimirItensCardapio(80, 150);

        cardapio.removerItem(0);
        System.out.println("---");

        cardapio.imprimirItensCardapio(0, 150);
    }

}
```
