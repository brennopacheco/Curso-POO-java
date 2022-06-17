package cursoemvideo.POOjava.Aula13PolimorfismoPart2.Objeto;

import cursoemvideo.POOjava.Aula13PolimorfismoPart2.Classe.Cachorro;

public class Test {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.reagir("olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11,45);
        cachorro.reagir(21,00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2,12.5);
        cachorro.reagir(17,4.5);
    }
}
