/*
 * Classe Produto: um produto possui os atributos nome e preco (sem cedilha). Esta classe possui os seguintes métodos:
 * Método Construtor: crie 1 construtor que um recebe parâmetros para inicializar todos os atributos.
 * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
 * Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, retornando uma String 
 * formatada da forma que você desejar, desde que contenha as informações de todos os atributos da classe.

 */


package Etapa2;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade; //data de validade do produto
    private Data estaVencido; //dataatual

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        // this.dataValidade = dataValidade;
        // this.estaVencido = estaVencido;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public Data getEstaVencido() {
        return estaVencido;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setEstaVencido(Data estaVencido) {
        this.estaVencido = estaVencido;
    }

    @Override
    public String toString(){
        return "Produto{"+
                "nome='"+nome+'\''+
                ", preço =" + preco +
                '}';    
    }

    public boolean estaVencido(Data dataValidade, Data estaVencido){
        if (dataValidade.getAno() <= estaVencido.getAno()){
            return true;
        }else{
            return false;
        }

    }
}
