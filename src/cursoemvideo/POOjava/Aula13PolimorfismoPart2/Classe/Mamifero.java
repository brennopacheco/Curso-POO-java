package cursoemvideo.POOjava.Aula13PolimorfismoPart2.Classe;

public class Mamifero extends Animal {
    protected String corPelo;

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
