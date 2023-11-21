package org.example.impl;

import org.example.domain.Car;
import org.example.domain.CarBuilder;

public class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        this.car = new Car("", "", "", "");
    }

    public CarBuilder setModelo(String modelo) {
        this.car.setModelo(modelo);
        return this;
    }

    public CarBuilder setCor(String cor) {
        this.car.setCor(cor);
        return this;
    }

    public CarBuilder setMotor(String motor) {
        this.car.setMotor(motor);
        return this;
    }

    public CarBuilder setTransmissao(String transmissao) {
        this.car.setTransmissao(transmissao);
        return this;
    }

    public Car build() {
        return this.car;
    }
}
