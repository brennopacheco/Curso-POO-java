package cursoemvideo.POOjava.Aula12Polimorfismo.Objeto;

import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Mamifero.Cachorro;
import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Mamifero.Canguru;
import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Mamifero.Mamifero;

public class Test02 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();
        Canguru canguru = new Canguru();

        mamifero.setPeso(5.7);
        mamifero.setIdade(8);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        System.out.println("----------");

        canguru.setPeso(55.3);
        canguru.setIdade(3);
        canguru.setMembros(4);
        canguru.locomover();
        canguru.alimentar();
        canguru.emitirSom();
        canguru.usarBolsa();

        System.out.println("----------");


        cachorro.setPeso(3.94);
        cachorro.setIdade(5);
        cachorro.setMembros(4);
        cachorro.locomover();
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        cachorro.enterrarOsso();




    }
}
