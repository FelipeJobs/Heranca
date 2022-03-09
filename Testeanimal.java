package Herança.EXE;

public class Testeanimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Cavalo ca = new Cavalo();
        Preguica p = new Preguica();
        c.setNome("Bob");
        c.setIdade(5);
        c.setEmiteSom(true);
        c.setCorrer(true);
        System.out.println("O seu nome é: " + c.getNome());
        System.out.println("A sua idade é: " +c.getIdade());
        System.out.println("Ele emite som: " + c.getEmiteSom());
        System.out.println("Ele consegue correr: " + c.getCorrer());
        System.out.println();
        ca.setNome("Ted");
        ca.setIdade(10);
        ca.setEmiteSom(true);
        ca.setCorrer(true);
        System.out.println("O seu nome é: " + ca.getNome());
        System.out.println("A sua idade é: " +ca.getIdade());
        System.out.println("Ele emite som: " + ca.getEmiteSom());
        System.out.println("Ele consegue correr: " + ca.getCorrer());
        System.out.println();
        p.setNome("Dorminhoca");
        p.setIdade(8);
        p.setEmiteSom(false);
        p.setSobArvore(true);
        System.out.println("O seu nome é: " + p.getNome());
        System.out.println("A sua idade é: " +p.getIdade());
        System.out.println("Ele emite som: " + p.getEmiteSom());
        System.out.println("Ele consegue correr: " + p.getSobArvore());
        System.out.println();

    }
}
