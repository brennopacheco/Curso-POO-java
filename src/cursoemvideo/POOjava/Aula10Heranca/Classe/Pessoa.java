package cursoemvideo.POOjava.Aula10Heranca.Classe;

public class Pessoa {
//    Atributos
    private String nome;
    private int idade;
    private char sexo;

//    Métodos Públicos
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

//    Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
