package aula01;

public class ContaBanco {
    private int numeroConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(){}

    public ContaBanco(int numeroConta, String tipo, String dono, double saldo, boolean status) {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    public void estadoAtual(){
        System.out.println("==================================");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        if (this.getTipo() == "CC"){
            this.setSaldo(50);
            System.out.println("Conta Corrente aberta com sucesso!");
        }
        else if (this.getTipo() == "CP") {
            this.setSaldo(150);
            System.out.println("Conta Poupança aberta com sucesso!");
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(double valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        }
        else {
            System.out.println("Conta fechada! Não é possível depositar");
        }
    }

    public void sacar(double valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Conta fechada! Não é possível sacar");
        }
    }

    public void pagarMensal(){
        double mensalidade = 0;

        if (this.getTipo() == "CC"){
            mensalidade = 12;
        }
        else if (this.getTipo() == "CP") {
            mensalidade = 20;
        }

        if (this.getStatus()){
            if (this.getSaldo() >= mensalidade) {
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("Mensalidade paga com sucesso!");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }
}
