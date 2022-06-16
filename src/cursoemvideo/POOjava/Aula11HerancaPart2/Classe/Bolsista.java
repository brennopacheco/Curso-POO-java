package cursoemvideo.POOjava.Aula11HerancaPart2.Classe;

public class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista! Pagamento facilitado");
    }


    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
