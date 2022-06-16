package cursoemvideo.POOjava.Aula11HerancaPart2.Objeto;

import cursoemvideo.POOjava.Aula11HerancaPart2.Classe.Aluno;
import cursoemvideo.POOjava.Aula11HerancaPart2.Classe.Bolsista;
import cursoemvideo.POOjava.Aula11HerancaPart2.Classe.Pessoa;
import cursoemvideo.POOjava.Aula11HerancaPart2.Classe.Visitante;

public class Test {
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa(); Pessoa não pode ser instânciada por ser um Classe abstract
        Visitante visitante = new Visitante();

//        visitante.setNome("Juvenil");
//        visitante.setIdade(22);
//        visitante.setSexo('M');
//
//        System.out.println(visitante.toString());

        Aluno aluno = new Aluno();
        aluno.setNome("Cláudio");
        aluno.setMatricula(1111);
        aluno.setCurso("Informática");
        aluno.setIdade(16);
        aluno.setSexo('M');
        aluno.pagarMensalidade();

        Bolsista bolsista = new Bolsista();
        bolsista.setMatricula(1112);
        bolsista.setNome("Jubileu");
        bolsista.setBolsa(12.5);
        bolsista.setSexo('M');
        bolsista.pagarMensalidade();

    }
}
