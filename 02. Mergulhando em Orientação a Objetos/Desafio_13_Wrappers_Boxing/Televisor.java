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
