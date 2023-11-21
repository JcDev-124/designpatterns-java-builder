package org.example.domain;

public class Car {

    private String modelo;
    private String cor;
    private String motor;
    private String transmissao;

    public Car(String modelo, String cor, String motor, String transmissao) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.transmissao = transmissao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", motor='" + motor + '\'' +
                ", transmissao='" + transmissao + '\'' +
                '}';
    }
}
