package aula01;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta(123);
        p1.setDono("Manu");
        p1.estadoAtual();
        p1.abrirConta("CP");
        p1.depositar(400);
        p1.sacar(100);
        p1.estadoAtual();
    }
}
