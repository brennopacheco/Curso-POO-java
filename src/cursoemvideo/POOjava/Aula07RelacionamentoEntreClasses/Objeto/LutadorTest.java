package cursoemvideo.POOjava.Aula07RelacionamentoEntreClasses.Objeto;

import cursoemvideo.POOjava.Aula07RelacionamentoEntreClasses.Classe.Lutador;

public class LutadorTest {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 3, 1);

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2,3);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2,1);

        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0,2);

        l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.7, 119.3, 5, 4,3);

        l[5] = new Lutador("Nerdaar", "EUA", 30, 1.81, 105.7, 12, 2,4);

        l[3].ganharLuta();
        l[5].perderLuta();
        l[0].ganharLuta();
        l[1].empatarLuta();



        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
        l[5].status();
    }
}
