public class Vfc {
    public static void main(String[] args) {
        Lutador lutador1 = new Lutador();
        lutador1.setNome("Charles do Bronxs");
        lutador1.setPeso(70);
        lutador1.setNacionalidade("Brasil");
        lutador1.categoria();
        lutador1.setVitorias(30);
        lutador1.setEmpates(2);
        lutador1.setDerrotas(1);


        Lutador lutador2 = new Lutador();
        lutador2.setNome("Michael Chandler");
        lutador2.setPeso(70);
        lutador2.setNacionalidade("Estados Unidos");
       lutador2.categoria();
        lutador2.setVitorias(27);
        lutador2.setEmpates(2);
        lutador2.setDerrotas(1);


        Arbitro arbitro = new Arbitro("Marc Godgard", "Estados unidos", 30);
        Luta luta = new Luta(lutador1, lutador2, arbitro, "Senai Taguantinga", 3);


        luta.lutar(lutador1, lutador2);


        System.out.println(lutador1.toString()); 
        System.out.println();
        System.out.println(lutador2.toString());
        

    }
}