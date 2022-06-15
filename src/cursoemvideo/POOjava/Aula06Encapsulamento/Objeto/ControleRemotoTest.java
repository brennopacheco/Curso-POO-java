package cursoemvideo.POOjava.Aula06Encapsulamento.Objeto;

import cursoemvideo.POOjava.Aula06Encapsulamento.Classe.ControleRemoto;

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
