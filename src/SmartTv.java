public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.print("Aumentando o volume para:" + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.print("Diminuindo o volume para:" + volume);

    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}