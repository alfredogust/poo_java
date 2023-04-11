package entities;

public class Vendedor {
    Integer numeroDeCarros;
    Double valorDasVendas;
    Double salarioFixo;
    Double comissaoPorCarro;

    public Vendedor (Integer numeroDeCarros, Double valorDasVendas, Double salarioFixo, Double comissaoPorCarro) {
        this.numeroDeCarros = numeroDeCarros;
        this.valorDasVendas = valorDasVendas;
        this.salarioFixo = salarioFixo;
        this.comissaoPorCarro = comissaoPorCarro;
    }

    public Double salarioFinal() {
        return salarioFixo + (numeroDeCarros * comissaoPorCarro) + (valorDasVendas * 0.5);
    }

}