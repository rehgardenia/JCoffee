package jcoffe;
public class Cafe {
    private String nome;
    private double preco;
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cafe(){}
    public Cafe(String n, double p){
    this.setNome(n);
    this.setPreco(p);
    }
}
