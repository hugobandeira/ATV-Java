package prova;
public class Estoque {
    public String nome;
    public int qtdatual;
    public int qtdminima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdatual() {
        return qtdatual;
    }

    public void setQtdatual(int qtdatual) {
        this.qtdatual = qtdatual;
    }

    public int getQtdminima() {
        return qtdminima;
    }

    public void setQtdminima(int qtdminima) {
        this.qtdminima = qtdminima;
    }

    public Estoque(){}
    
    public Estoque(String nome,int qtdatual,int qtdminima){
        this.nome = nome;
        this.qtdatual = qtdatual;
        this.qtdminima = qtdminima;        
    }
    
    
    public void repor(int qtd){
            this.qtdatual+=qtd;
    }
    public void darBaixa(int qtd){
        this.qtdatual = this.qtdatual - qtd;
    }
    
    public boolean pricisaRepor(){
        return this.qtdatual >= this.qtdminima;
    }
    
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Quantidade atual: "+this.qtdatual);
        System.out.println("Quantidade minima: "+this.qtdminima);
        System.out.println("");
    }
}
