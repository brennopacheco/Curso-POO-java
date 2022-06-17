package cursoemvideo.POOjava.Aula12Polimorfismo.Objeto;

import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Ave.Ave;
import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Mamifero.Mamifero;
import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Peixe.Peixe;
import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Reptil.Reptil;

public class Test {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        System.out.println("#######");
        mamifero.setPeso(85.3);
        mamifero.setCorPelo("Marrom");
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();
        System.out.println("-------");

        System.out.println("#######");
        peixe.setPeso(0.35);
        peixe.setIdade(1);
        peixe.setMembros(0);
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolha();
        System.out.println("-------");

        System.out.println("#######");
        ave.setPeso(0.89);
        ave.setIdade(2);
        ave.setMembros(2);
        ave.setCorPena("Colorido");
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.fazerNinho();
        System.out.println("-------");
    }
}
