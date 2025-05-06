public class SmartTv {

    boolean ligada  = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
     // ou volume = volume +1;   Mesma coisa.
    }
    public void diminuirVolume(){
        volume --;
     // ou volume = volume -1;   Mesma coisa.
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void desligarCanal(){
        canal --;
    }
}
