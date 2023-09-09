import java.time.LocalDate;

public class Caminhao extends Veiculo {

    private String tipoVeiculo;
    private int eixos;
    private double pesoLiquido;
    private double pesoTotal;
    private int rodas;

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa,
            int anoModelo, int anoFabricacao, String fabricante, double potencia, String tipoCombustivel,
            String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int eixos, double pesoLiquido, double pesoTotal, int rodas) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia, tipoCombustivel,
        codigoRenavam, nomeProprietario, estadoUF, cidadeUF);
        
        this.tipoVeiculo = tipoVeiculo;
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.rodas = rodas;
    }
    @Override
    public void imprimir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano do Modelo " + this.anoModelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potência:" + this.potencia);
        System.out.println("Tipo de Combustivel:" + this.tipoCombustivel);
        System.out.println("Código do Renavam:" + this.codigoRenavam);
        System.out.println("Nome do Proprietário:" + this.nomeProprietario);
        System.out.println("Estado UF:" + this.estadoUF);
        System.out.println("Cidade UF:" + this.cidadeUF);
        System.out.println("Tipo de Veículo:" + this.tipoVeiculo);
        System.out.println("Quantidade de Eixos:" + this.eixos);
        System.out.println("Peso Liquido:" + this.pesoLiquido);
        System.out.println("Peso Total:" + this.pesoTotal);
        System.out.println("Quantidade de Rodas:" + this.rodas);
    }
}