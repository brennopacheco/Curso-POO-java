package cursoemvideo.POOjava.Aula09Exercicio.Objeto;

import cursoemvideo.POOjava.Aula09Exercicio.Classe.Livro;
import cursoemvideo.POOjava.Aula09Exercicio.Classe.Pessoa;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Usopp", 22, 'M');
        p[1] = new Pessoa("Nami", 20, 'F');

        l[0] = new Livro("Clean Code", "Robert C. Martin", 425, p[0]);
        l[1] = new Livro("Java®: Como Programar", "Paul Deitel", 968, p[1]);
        l[2] = new Livro("Arquitetura limpa", "Robert C. Martin", 432, p[0]);

        l[0].abrir();
        l[0].folhear(255);
        System.out.println(l[0].detalhes());
    }
}
