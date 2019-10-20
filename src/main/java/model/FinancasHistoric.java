package model;

public class FinancasHistoric {
    private String titulo;
    private String valorTotal;
    private String desconto;
    private String valorLiq;
    private String dataVencimento;
    private String situacao;


    public FinancasHistoric(String titulo, String valorTotal, String desconto, String valorLiq, String dataVencimento, String situacao) {
        this.titulo = titulo;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.valorLiq = valorLiq;
        this.dataVencimento = dataVencimento;
        this.situacao = situacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public String getDesconto() {
        return desconto;
    }

    public String getValorLiq() {
        return valorLiq;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getSituacao() {
        return situacao;
    }

    @Override
    public String toString() {
        return "FinancasHistoric{" +
                "\ntitulo='" + titulo + '\'' +
                ",\n valorTotal='" + valorTotal + '\'' +
                ",\n desconto='" + desconto + '\'' +
                ", \nvalorLiq='" + valorLiq + '\'' +
                ", \ndataVencimento='" + dataVencimento + '\'' +
                ", \nsituacao='" + situacao + '\'' +
                '}';
    }
}
