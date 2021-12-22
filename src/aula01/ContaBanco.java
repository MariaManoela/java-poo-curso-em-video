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
}
