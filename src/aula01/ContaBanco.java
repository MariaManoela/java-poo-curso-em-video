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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        tipo = tipo;
        status = true;

        if (tipo == "CC"){
            saldo = 50;
            System.out.println("Conta Corrente aberta com sucesso!");
        }
        else if (tipo == "CP") {
            saldo = 150;
            System.out.println("Conta Poupança aberta com sucesso!");
        }
        else {
            System.out.println("Infome um valor válido!");
        }
    }

    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta com dinheiro");
        }
        else if (saldo < 0){
            System.out.println("Conta em débito");
        }
        else {
            status = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(double valor){
        if (status){
            saldo = saldo + valor;
        }
        else {
            System.out.println("Conta fechada! Não é possível depositar");
        }
    }

    public void sacar(){

    }

    public void pagarMensal(){

    }
}
