public class Metodos {

    public static void main(String[] args) throws Exception {
        
        Usuario usuario = new Usuario();

        System.out.println("Tv ligada ? " + usuario.ligada);
        System.out.println("Qual canal atual ? " + usuario.canal);
        System.out.println("Qual volume esta ? " + usuario.volume);

        usuario.ligar ();
        System.out.println("Novo statu -> Tv ligada ? " + usuario.ligada);

        usuario.desligar ();
        System.out.println("Novo statu -> Tv ligada ? " + usuario.ligada);

        usuario.aumentarVolume();
        usuario.diminuirVolume();
        usuario.diminuirVolume();

        System.out.println("Qual volume esta ? Volume atual : " + usuario.volume);

        usuario.mudarCanal(13);
        System.out.println("Qual canal atual ? " + usuario.canal);
    }


}
