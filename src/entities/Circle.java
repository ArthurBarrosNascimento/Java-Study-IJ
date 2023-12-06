package entities;

import entities.enums.Color;

public class Circle extends Shape{
    private Double radios;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radios) {
        super(color);
        this.radios = radios;
    }

    public Double getRadios() {
        return radios;
    }

    public void setRadios(Double radios) {
        this.radios = radios;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radios, 2);
    }
}
