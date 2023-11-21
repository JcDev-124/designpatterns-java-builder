package org.example.domain;

public interface CarBuilder {

    CarBuilder setModelo(String modelo);
    CarBuilder setCor(String cor);
    CarBuilder setMotor(String motor);
    CarBuilder setTransmissao(String transmissao);
    Car build();
}
