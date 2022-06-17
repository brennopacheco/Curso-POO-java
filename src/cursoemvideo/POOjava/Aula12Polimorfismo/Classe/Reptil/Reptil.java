package cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Reptil;

import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Animal;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() { // Polimorfismo de sobreposição
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() { // Polimorfismo de sobreposição
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() { // Polimorfismo de sobreposição
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
