package cursoemvideo.POOjava.Aula09Exercicio.Classe;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor; // instância da classe Pessoa

    //    Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    //    Métodos Públicos
    public String detalhes() {
        return "Livro\n{" +
                "titulo = '" + titulo + '\'' +
                ", \nautor: '" + autor + '\'' +
                ", \ntotalPaginas: " + totalPaginas +
                ", \npaginaAtual: " + paginaAtual +
                ", \naberto: " + aberto +
                ", \nleitor: " + leitor.getNome() + // lembrar usar o get já que leitor é a instancia de uma classe
                ", \nidade: " + leitor.getIdade() + // caso não usarmos o get, ele imprimirá o local em memória
                '}';
    }

    //    Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //    Interface
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > totalPaginas) {
            System.out.println("Página indisponível.");
            setPaginaAtual(0);
        } else {
            setPaginaAtual(pagina);
        }
    }

    @Override
    public void avancarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() - 1);
    }
}
