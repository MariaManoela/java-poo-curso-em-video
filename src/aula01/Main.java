package aula01;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.destampar();
        c1.rabiscar();
        c1.status();

        System.out.println("========================");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}
