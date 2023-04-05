public class App {
    //método main
    public static void main(String[] args) throws Exception {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.aumentarVolume();
        c1.diminuirVolume();
        c1.pause();
        c1.ligarMudo();
        c1.desligar();
        c1.abrirMenu();
    }
}
