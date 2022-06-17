package cursoemvideo.POOjava.Aula15ExercicioContinuacao.Objeto;

import cursoemvideo.POOjava.Aula15ExercicioContinuacao.Classe.Gafanhoto;
import cursoemvideo.POOjava.Aula15ExercicioContinuacao.Classe.Video;
import cursoemvideo.POOjava.Aula15ExercicioContinuacao.Classe.Visualizacao;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de Python");
        video[1] = new Video("Aula 12 de Java");
        video[2] = new Video("Aula 10 de HTML5");


        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        gafanhoto[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");


        Visualizacao visualizacao[] = new Visualizacao[5];

        visualizacao[0] = new Visualizacao(gafanhoto[0], video[2]);
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());

        System.out.println("----------------");

        visualizacao[1] = new Visualizacao(gafanhoto[0], video[0]);
        visualizacao[1].avaliar(87.0);
        System.out.println(visualizacao[1].toString());
    }
}
