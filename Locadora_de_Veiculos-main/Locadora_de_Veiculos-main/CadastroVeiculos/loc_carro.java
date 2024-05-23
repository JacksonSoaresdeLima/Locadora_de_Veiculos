public class loc_carro{
    protected String modelo;
    protected int ano;
    protected int km;
    protected boolean cambio;
    protected int placa;
    protected int id_veiculo;
    protected String marca;
    protected  String descricao;
    protected float preco;

//    se o cabio for true e automatico o carro


    public loc_carro(String modelo, int ano, int km, boolean cambio, int placa, int id_veiculo, String marca, String descricao, float preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.cambio = cambio;
        this.placa = placa;
        this.id_veiculo = id_veiculo;
        this.marca = marca;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public boolean isCambio() {
        return cambio;
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
        modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKm(int km) {
        km = km;
    }

    public void setMarcha(boolean marcha) {
        this.cambio = cambio;
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
