
import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private Arbitro arbitro;
    private String local;
    private Integer rounds;



    public Luta(Lutador desafiante, Lutador desafiando, Arbitro arbitro, String local, Integer rounds) {
        this.desafiante = desafiante;
        this.desafiado = desafiando;
        this.arbitro = arbitro;
        this.local = local;
        this.rounds = rounds;
    }


    public Luta(){

    }


    private boolean marcarLuta(Lutador l1, Lutador l2){
        if(!Objects.equals(this.desafiante.getCategoria(), this.desafiado.getCategoria())){
            return false;  
        } else if (Objects.equals(this.desafiante.getNome(), this.desafiado.getNome())){
            return false;
        } else{
            this.desafiante = l1;
            this.desafiado = l2;
            return true;
        }
    }


    public void lutar(Lutador l1, Lutador l2){
        if( marcarLuta(l1, l2) ){
           this.desafiado.aprensentarLutador();
           this.desafiante.aprensentarLutador();

            Random random = new Random();

            int resultado = random.nextInt(3);

            switch (resultado) {
                case 0 :
                    System.out.printf("Lutador %s ganhou!", this.desafiante.getNome());
                    this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                    this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
                    break;

                case 1:
                    System.out.printf("Lutador %s ganhou!", this.desafiado.getNome());
                    this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                    this.desafiante.setDerrotas(this.desafiante.getDerrotas() + 1);
                    break;  
                    
                case 2: 
                    System.out.printf("Luta empatou!");   
                    this.desafiante.setEmpates(this.desafiante.getEmpates() + 1);
                    this.desafiado.setEmpates(this.desafiado.getEmpates() + 1); 
                default:
                   
            }

        } else{
            System.out.println("Luta nao pode acontecer");
        }
    }




    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Arbitro getArbitro() {
        return arbitro;
    }
    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public Integer getRounds() {
        return rounds;
    }
    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }






    
}