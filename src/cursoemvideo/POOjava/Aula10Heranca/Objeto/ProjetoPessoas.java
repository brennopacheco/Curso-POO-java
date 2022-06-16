package cursoemvideo.POOjava.Aula10Heranca.Objeto;

import cursoemvideo.POOjava.Aula10Heranca.Classe.Aluno;
import cursoemvideo.POOjava.Aula10Heranca.Classe.Funcionario;
import cursoemvideo.POOjava.Aula10Heranca.Classe.Pessoa;
import cursoemvideo.POOjava.Aula10Heranca.Classe.Professor;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Pedro");
        aluno.setNome("Maria");
        professor.setNome("Cláudio");
        funcionario.setNome("Fabiana");

        pessoa.setSexo('M');
        professor.setSexo('M');
        funcionario.setSexo('F');
        aluno.setSexo('F');


        aluno.setCurso("Informática");
        professor.setSalario(2500.75);
        funcionario.setSetor("Estoque");

        professor.receberAumento(550.2);


        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }
}
