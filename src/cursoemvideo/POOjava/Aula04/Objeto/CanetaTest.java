package cursoemvideo.POOjava.Aula04.Objeto;

import cursoemvideo.POOjava.Aula04.Classe.Caneta;

public class CanetaTest {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compactor", "Vermelha", 0.4f);
        c1.status();
    /*
        c1.setModelo("BIC");
        c1.setPonta(0.5F);

        c1.status();

        System.out.println("------");

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    */
        System.out.println("----------");
        Caneta c2 = new Caneta("Faber-Castell", "Verde", 1.5f);
        c2.status();
    }
}