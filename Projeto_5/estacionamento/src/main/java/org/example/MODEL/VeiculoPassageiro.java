package org.example.MODEL;

public class VeiculoPassageiro extends Veiculo{
    private int numeroPortas;
    private int numeroPassageiros;

    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi, String renavam, String procedencia, double capacidadeCarga, double altura, double largura, double profundidade, String corExterna, String corInterna, String tipoCombustivel, String motor, double quilometragem, double consumoMedio, int numeroPortas, int numeroPassageiros) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCarga, altura, largura, profundidade, corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio);

        this.numeroPassageiros = numeroPassageiros;
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
