package entities;

public class Pessoa {
    private char sexo;
    private char corOlhos;
    private char corCabelos;
    private Integer idade;
    private Double salario;

    public Pessoa(char sexo, char corOlhos, char corCabelos, Integer idade, Double salario) {
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
        this.idade = idade;
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public char getCorOlhos() {
        return corOlhos;
    }

    public char getCorCabelos() {
        return corCabelos;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getSalario() {
        return salario;
    }
}
