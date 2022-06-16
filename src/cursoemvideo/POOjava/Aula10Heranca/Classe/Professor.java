package cursoemvideo.POOjava.Aula10Heranca.Classe;

public class Professor extends Pessoa{
//    Atributos
    private String especialidade;
    private double salario;

//    Métodos Públicos
    public void receberAumento(double valor){
        this.setSalario(this.getSalario() + valor);
    }

//    Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
