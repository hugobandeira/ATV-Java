package prova;

public class Pacientes {
    public String nome;
    public double peso;
    public double altura;

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    public Pacientes(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        return (this.peso/ (this.altura *2));
    }
    
   public void imprimir(){
       System.out.println("Massa corea: "+this.calcularIMC());
   }
}
