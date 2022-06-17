package cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Peixe;

import cursoemvideo.POOjava.Aula12Polimorfismo.Classe.Animal;

public class Peixe extends Animal {
    private String corEscama;

    public final void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixei não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
