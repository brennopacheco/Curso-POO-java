package cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Mamifero;

import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Animal;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() { // Polimorfismo de sobreposição
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() { // Polimorfismo de sobreposição
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() { // Polimorfismo de sobreposição
        System.out.println("Som de mamífero");
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
