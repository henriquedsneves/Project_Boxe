
public class Arbitro {
    private String nome;
    private String nacionalidade;
    private Integer idade;

    

    public Arbitro(String nome, String nacionalidade, Integer idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Arbitro(){

    }

    public void separarLuta(){
        System.out.printf("Arbitro %s separou a luta", this.nome);
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    





    
}