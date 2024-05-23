package CadastroVeiculos;

public class Veiculos {
    private Long idVeiculo;
    private String placa;
    private String descricao;
    private String marca;
    private Double precoLocacao;

    public void generateId(){
        idVeiculo++;
    }


    public Long getIdVeiculo() {
        return idVeiculo;
    }


    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public Double getPrecoLocacao() {
        return precoLocacao;
    }


    public void setPrecoLocacao(Double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }
}
