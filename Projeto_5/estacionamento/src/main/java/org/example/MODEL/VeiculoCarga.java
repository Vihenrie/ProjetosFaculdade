package org.example.MODEL;

public class VeiculoCarga extends Veiculo{
    private double cargaMaxima;
    public VeiculoCarga(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi, String renavam, String procedencia, double capacidadeCarga, double altura, double largura, double profundidade, String corExterna, String corInterna, String tipoCombustivel, String motor, double quilometragem, double consumoMedio, double cargaMaxima) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCarga, altura, largura, profundidade, corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
