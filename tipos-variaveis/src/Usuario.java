public class Usuario {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar (){
        ligada=true;
        System.out.println("Você ligou a TV " + ligada);
    }
    public void desligar(){
        ligada=false;
        System.out.println("Você desligou a TV " + ligada);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Você aumentou o volume da tv para: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Você diminui o volume da tv para: " + volume);
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;
    }
}
