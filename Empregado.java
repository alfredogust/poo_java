package entities;

public class Empregado {
    /*Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de instância – nome (String),
     sobrenome (String) e um salário mensal (double). A classe deve ter um construtor, métodos get e set para cada variável de instância.
     Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto.
     Então dê a cada Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.  */

    private String nome;
    private String sobrenome;
    private Double salarioMensal;

    public Empregado(String nome, String sobrenome, Double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal < 0.0 ? 0.0 : salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Double getSalarioAnual() {
        return salarioMensal * 12;
    }

    public void aumentarSalario(Double porcentagem) {
        salarioMensal += salarioMensal * (porcentagem / 100);
    }
}
