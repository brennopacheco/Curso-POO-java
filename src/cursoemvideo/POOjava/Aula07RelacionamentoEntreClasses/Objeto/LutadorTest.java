package cursoemvideo.POOjava.Aula07RelacionamentoEntreClasses.Objeto;

import cursoemvideo.POOjava.Aula07RelacionamentoEntreClasses.Classe.Lutador;

public class LutadorTest {
    public static void main(String[] args) {

        Lutador L[] = new Lutador[6];

        L[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 3, 1);

        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2,3);

        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2,1);

        L[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0,2);

        L[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.7, 119.3, 5, 4,3);

        L[5] = new Lutador("Nerdaar", "EUA", 30, 1.81, 105.7, 12, 2,4);

        L[3].ganharLuta();
        L[5].perderLuta();
        L[0].ganharLuta();
        L[1].empatarLuta();



        L[0].status();
        L[1].status();
        L[2].status();
        L[3].status();
        L[4].status();
        L[5].status();
    }
}
