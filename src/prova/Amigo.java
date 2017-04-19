package prova;
public class Amigo extends Pessoas{
    private String diaDoAnivesario;    

    public String getDiaDoAnivesario() {
        return diaDoAnivesario;
    }

    public void setDiaDoAnivesario(String diaDoAnivesario) {
        this.diaDoAnivesario = diaDoAnivesario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public Amigo(String nome, int idade, String sexo, String diaDoAnivessario){
        this.nome = nome;
        this.idade = idade; 
        this.sexo = sexo;
        this.diaDoAnivesario = diaDoAnivessario;    
        
    }
}
