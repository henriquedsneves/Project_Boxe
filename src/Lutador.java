
public class Lutador {
    private String nome;
    private double peso;
    private String nacionalidade;
    private String categoria;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;



    public void categoria(){
        if(getPeso() <= 48 && getPeso( ) == 46){
            setCategoria("Minimumweight");
        }else if(getPeso() <= 51){
            setCategoria("Flyweight ");
        } else if(getPeso() <= 54){
            setCategoria("Batamweight ");
        }else if(getPeso() <= 57){
            setCategoria("Featherweight ");
        }else if(getPeso() <= 60){
            setCategoria("Lightweight ");
        }else if(getPeso() <= 63.5){
            setCategoria("Light Welterweight ");
        }else if(getPeso() <= 67){
            setCategoria("Welterweight");
        }else if(getPeso() <= 71){
            setCategoria("light Middleweight ");
        }else if(getPeso() <= 75){
            setCategoria("Middleweight");
        }else if(getPeso() <= 80){
            setCategoria("Light Heavyweight  ");
        }else if(getPeso() <= 86){
            setCategoria("CruiseWeight");
        }else if(getPeso() <= 92){
            setCategoria("Heavyweight ");
        }else if(getPeso() > 92){
            setCategoria("Super Heavyweight ");
        }else{
            System.out.println("Não pode Lutar");
        }

    }
    public Lutador(String nome, double peso, String nacionalidade, String categoria, Integer vitorias, Integer empates,
        Integer derrotas) {
        this.nome = nome;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }



    public Lutador(){

    }


    public void aprensentarLutador(){
        System.out.printf("Lutador com um cartel de %d vitorias, %d empates e %d derrotas. Lutando de %s, ele %s \n \n", this.vitorias, this.empates,this.derrotas, this.nacionalidade, this.nome);
    }

    public void treinar(){
        System.out.println("treinando....");
    }

 



    @Override
    public String toString() {
        return "Lutador [nome=" + nome + ", peso=" + peso + ", nacionalidade=" + nacionalidade + ", categoria="
                + categoria + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + "]";
    }



    
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Integer getVitorias() {
        return vitorias;
    }
    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }
    public Integer getEmpates() {
        return empates;
    }
    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
    public Integer getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }





    
}
