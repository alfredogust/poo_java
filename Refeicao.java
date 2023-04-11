package entities;

public class Refeicao {
    private Integer prato;
    private Integer sobremesa;
    private Integer bebida;
    private Integer[][] tabelaCalorias;

    public Refeicao(Integer prato, Integer sobremesa, Integer bebida) {
        this.prato = prato;
        this.sobremesa = sobremesa;
        this.bebida = bebida;
        this.tabelaCalorias = new Integer[][] {
            {180, 230, 250, 350},
            {75, 110, 170, 200},
            {20, 70, 100, 65}
        };
    }

    public Integer calculaTotalCalorias() {
        return tabelaCalorias[0][prato-1] + tabelaCalorias[1][sobremesa-1] + tabelaCalorias[2][bebida-1];
    }
}
