### Desafio 13 - Wrappers e boxing

Seu chefe, que tamb�m adora programar, pediu sua ajuda para analisar o c�digo que ele desenvolveu usando classes wrapper.

O c�digo parece funcionar, mas ele gostaria de uma "consultoria" sua para saber se est� usando as melhores pr�ticas de programa��o e se no futuro n�o poderia ter algum problema.

Analise o c�digo do seu chefe:

```java
public class Televisor {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal == novoCanal) {
            System.out.println("Novo canal � tamb�m o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume == volume) {
            System.out.println("Novo volume � tamb�m o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para " + volume);
        }
    }

}
```

```java
public class Principal {

    public static void main(String[] args) {
        Televisor tv = new Televisor();

        // N�o deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }

}
```

O que voc� aprendeu neste curso que poderia usar para aproveitar essa oportunidade de mostrar para seu chefe que voc� realmente domina as profundezas do Java?

Execute o c�digo em seu computador e fa�a os ajustes que voc� achar necess�rio.