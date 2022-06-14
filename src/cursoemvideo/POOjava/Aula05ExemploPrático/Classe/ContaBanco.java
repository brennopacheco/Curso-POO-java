package cursoemvideo.POOjava.Aula05ExemploPrático.Classe;

public class ContaBanco {
    private int numConta;
    private String tipo; // CC - conta corrente - CP - conta poupança
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        /*
         * status inicial == false
         * saldo == 0
         */
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo) {
        /*
         * status == true
         * Adicional:
         * Se abrir CC, ganha 50 reais.
         * Se for CP, ganha 150.
         */
        setStatus(true);
        setTipo(tipo);

        if (tipo == "CC" || tipo == "cc") {
            this.setSaldo(50);
            /*
            System.out.println("Parabéns! Você acaba de criar uma Conta Corrente no nosso banco.");
            System.out.println("Seu saldo inicial é de: R$" + saldo);
             */
        } else if (tipo == "CP" || tipo == "cp") {
            this.setSaldo(150);
            /*
            System.out.println("Parabéns! Você acaba de criar uma Conta Poupança no nosso banco.");
            System.out.println("Seu saldo inicial é de: R$" + saldo);
             */
        } else {
            setStatus(false);
            System.out.println("Tipo de conta inválida");
        }
    }

    ;

    public void fecharConta() {
        /*
         * status == false
         * Para fechar a conta, não pode deixar dinheiro, nem estar em débito
         */
        if (this.getSaldo() > 0) {
            System.out.println("Você precisa sacar todo o dinheiro em sua conta!");
            return;
        } else if (this.getSaldo() < 0) {
            System.out.println("Você não pode estar em débito com o nosso Banco!");
            return;
        } else {
            System.out.println("Sentimos muito por você sair do nosso Banco. Esperamos que volte em breve.");
            setStatus(false);
        }
    }

    ;

    public void depositar(double valor) {
        /*
         * status == true
         */
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Você acaba de depositar R$" + valor + " na conta de "+ getDono() +". Seu novo saldo é de: R$" + this.getSaldo());
        } else {
            System.out.println("Você precisa abrir uma conta para depositar seu dinheiro!");
        }

    }

    ;

    public void sacar(double valor) {
        /*
         * status == true
         * tem que ter saldo positivo. Não podendo sacar mais do que tem na conta
         */
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Você acaba de sacar R$" + valor + ". Seu novo saldo é de: R$" + this.getSaldo());
            } else {
                System.out.println("ERRO! O seu saque é maior que o valor em saldo");
            }
        } else {
            System.out.println("Você não possui conta ativa.");
        }
    }

    ;

    public void pagarMensal() {
        /*
         * Cliente CC paga 12 reias de mensalidade
         * Cliente CP paga 20 reais de mensalidade
         * Para cada vez que pagarMensal() for chamada
         */

        if (this.getStatus()) {
            if (this.getTipo() == "CC" || this.getTipo() == "cc") {
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Você acaba de pagar R$12 de mensalidade. Seu novo saldo é de: R$" + saldo);
            } else if (this.tipo == "CP" || this.tipo == "cp") {
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Você acaba de pagar R$20 de mensalidade. Seu novo saldo é de: R$" + saldo);
            }
        } else {
            System.out.println("Você não possui conta ativa.");
        }
    }

    ;

    public void imprimir() {
        System.out.println("-------");
        System.out.println("Número Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-------");
    }

    // Métodos Especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
