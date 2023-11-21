package org.example;

import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.example.impl.CarBuilderImpl;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();

        Car carro = builder
                .setModelo("Sedan")
                .setCor("Azul")
                .setMotor("V6")
                .build();

        System.out.println("Carro construído: " + carro);
    }
}
