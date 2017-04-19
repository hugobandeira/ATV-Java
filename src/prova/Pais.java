package prova;
public class Pais {
    public String codigo;
    public String nome;
    public double populacao;
    public double dimensao;
    public String pais_front;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    
    public Pais(String codigo, String nome, double dimencao){
        this.codigo = codigo;
        this.nome = nome;
        this.dimensao = dimencao;
        
        
    }
    
    public void verificar(String x){
        if (this.codigo == x){
            System.out.println("Paizes iguais");
        }else{
            System.out.println("\"Paizes diferentes\"");
            ;
        }
        
    }
    
}