package cursoemvideo.POOjava.Aula15ExercicioContinuacao.Classe;

public class Visualizacao {
    private Gafanhoto espector;
    private Video filme;

    public Visualizacao(Gafanhoto espector, Video filme) {
        this.espector = espector;
        this.filme = filme;
        this.espector.setTotalAssistido(this.espector.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcetagem) { // nota por porcetagem em que assistir o vídeo
        int nota = 0;
        if (porcetagem <= 20) {
            nota = 3;
        } else if (porcetagem <= 50) {
            nota = 5;
        } else if (porcetagem <= 90) {
            nota = 8;
        } else {
            nota = 10;
        }
        this.filme.setAvaliacao(nota);
    }

    public Gafanhoto getEspector() {
        return espector;
    }

    public void setEspector(Gafanhoto espector) {
        this.espector = espector;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espector= " + espector +
                ", filme= " + filme +
                '}';
    }
}
