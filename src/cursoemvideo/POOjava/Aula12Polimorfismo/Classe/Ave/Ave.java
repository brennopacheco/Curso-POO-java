package cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Ave;

import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Animal;

public class Ave extends Animal {
    private String corPena;

    public final void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
