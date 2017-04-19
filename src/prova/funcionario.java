
package prova;

public class funcionario {
    public String nome;
    public double horas_trabalhadas;
    public double valor_h;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(double horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public double getValor_h() {
        return valor_h;
    }

    public void setValor_h(double valor_h) {
        this.valor_h = valor_h;
    }
    
    
    
public double calcularSalario (){
    return this.horas_trabalhadas* this.valor_h;
    
    }

public funcionario (String nome, double horas_trabalhadas, double valor_h ){
    this.nome = nome;
    this.horas_trabalhadas = horas_trabalhadas;
    this.valor_h = valor_h;
}
    
public void imprimir(){
    System.out.println("nome do funcionario "+nome);
    System.out.println("Salario do funcionario "+calcularSalario());
    System.out.println("");


}
}
