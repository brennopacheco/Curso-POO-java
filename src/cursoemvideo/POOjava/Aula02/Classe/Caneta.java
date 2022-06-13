package cursoemvideo.POOjava.Aula02.Classe;

public class Caneta {
    // criar Classe caneta

    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
        /* 'this' é o nome do objeto que chamou. No caso quem está
        chamando tampada é c1. Então 'this' vai ser substituido por c1.tampada
        */
    }

    public void destampar() {
        this.tampada = false;
    }
}
