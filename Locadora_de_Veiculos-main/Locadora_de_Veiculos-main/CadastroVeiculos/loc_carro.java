package CadastroVeiculos;

public class loc_carro{
    protected String Modelo;
    protected int ano;
    protected int Km;
    protected boolean marcha;
    protected int placa;
    protected int id_veiculo;
    protected String marca;
    protected  String descricao;
    protected float preco;

    public String getModelo() {
        return Modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return Km;
    }

    public boolean isMarcha() {
        return marcha;
    }

    public int getPlaca() {
        return placa;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKm(int km) {
        Km = km;
    }

    public void setMarcha(boolean marcha) {
        this.marcha = marcha;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
