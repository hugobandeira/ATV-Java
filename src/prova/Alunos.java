
package prova;
public class Alunos {
    private String nome;
    private float n1;
    private float n2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

 
  
    
    public float media(){
        //this.n1 = n1;
        //this.n2 = n2;
        return ((this.n1 + this.n2)/2);
       
    }
    
    public void imprimir(){
        System.out.println("Media do aluno "+this.nome+" é:" +this.media());
        System.out.println("");
    }
    
    
    
    
    
    
    
    
}
