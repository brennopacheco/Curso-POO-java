package cursoemvideo.POOjava.Aula14Exercicio.Objeto;

import cursoemvideo.POOjava.Aula14Exercicio.Classe.Gafanhoto;
import cursoemvideo.POOjava.Aula14Exercicio.Classe.Video;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[3];

        video[0] = new Video("Aula 1 de Python");
//        video[1] = new Video("Aula 12 de Java");
//        video[2] = new Video("Aula 10 de HTML5");


        System.out.println(video[0].toString());
//        System.out.println(video[1].toString());
//        System.out.println(video[2].toString());

        Gafanhoto gafanhoto[] = new Gafanhoto[2];

        gafanhoto[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
//        gafanhoto[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");

        System.out.println(gafanhoto[0].toString());
//        System.out.println(gafanhoto[1].toString());
    }
}
