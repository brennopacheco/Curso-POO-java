package cursoemvideo.POOjava.Aula06.Objeto;

import cursoemvideo.POOjava.Aula06.Classe.ControleRemoto;

public class ControleRemotoTest {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
