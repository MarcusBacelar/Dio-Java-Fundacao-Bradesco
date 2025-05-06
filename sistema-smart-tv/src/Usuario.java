public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? :" + smartTv.ligada);
        System.out.println("Qual o canal ? :" + smartTv.canal);
        System.out.println("Qual o volume ? :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume ? "+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume ? "+ smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Qual o canal ? :" + smartTv.canal);
    }
    
}
