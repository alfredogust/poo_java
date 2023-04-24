package entities;

public class Person {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public Person(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "\nIdade: " + idade;
    }
}
