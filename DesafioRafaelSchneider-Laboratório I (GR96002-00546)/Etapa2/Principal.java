package Etapa2;

// import Etapa1.Endereco;

public class Principal {
    public static void main(String[] args){

        Data dataValidade1 = new Data(30,9,2023); //data validade
        Data dataVencimento1 = new Data(1,10,2023); //data atual
        Produto p1 = new Produto("batata", 85.52);

        System.out.println(p1.toString());

        System.out.println(p1.estaVencido(dataValidade1, dataVencimento1));

		
    }
}
