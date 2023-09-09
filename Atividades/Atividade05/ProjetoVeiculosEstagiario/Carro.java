import java.time.LocalDate;

public class Carro extends Veiculo {

    private String tipoVeiculo;
    private int rodas;
    private int portas;
    private int assentos;


    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Carro(int codigo, String nome, String modelo, String cor, String chassi, String placa,
            int anoModelo, int anoFabricacao, String fabricante, double potencia, String tipoCombustivel,
            String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int rodas, int portas, int assentos) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia, tipoCombustivel,
        codigoRenavam, nomeProprietario, estadoUF, cidadeUF);
        
        this.tipoVeiculo = tipoVeiculo;
        this.rodas = rodas;
        this.portas = portas;
        this.assentos = assentos;
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
        System.out.println("Quantidade de Rodas:" + this.rodas);
        System.out.println("Quantidade de Portas:" + this.portas);
        System.out.println("Assentos:" + this.assentos);
    }
}