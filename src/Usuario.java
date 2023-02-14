public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        System.out.print("TV ligada?" + smartTv.ligada);

        System.out.print("Canal atual!" + smartTv.canal);

        System.out.print("Volume atual!" + smartTv.volume);

        smartTv.ligar();
        System.out.print("Novo Status -> TV ligada?" + smartTv.ligada);

    }

}
