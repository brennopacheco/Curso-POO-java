package cursoemvideo.POOjava.Aula10Heranca.Classe;

public class Funcionario extends Pessoa{
//    Atributos
    private String setor;
    private boolean trabalhando;

//    Métodos Públicos
    public void mudarTrabalho(){

    }

//    Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
