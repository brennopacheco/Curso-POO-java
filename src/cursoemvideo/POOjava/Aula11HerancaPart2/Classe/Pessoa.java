package cursoemvideo.POOjava.Aula11HerancaPart2.Classe;

public abstract class Pessoa { // Classe abstrata não pode ser instânciada no objeto
    protected String nome;
    protected int idade;
    protected char sexo;

    public final void fazerAniversario() {
        // final não deixa o método ser sobreposto pelas subclasses (também podem ser usados em atributos)
        this.idade++;
    }

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
