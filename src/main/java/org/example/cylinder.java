package org.example;

//класс Cylinder описывает цилиндр
public class cylinder {
    private figure base; //Поле base хранит основание цилиндра.
    private double height; //Поле height хранит высоту цилиндра.

    //конструктор создает новый цилиндр с заданным основанием и высотой

    public cylinder(figure base, double height) throws InvalidHeightException {
        if (height < 0) {
            throw new InvalidHeightException("The height cannot be negative");
        }
        this.base = base;
        this.height = height;
    }

    //метод, вычисляющий объем цилиндра
    public double volume() {
        return base.area() * height;
    }

    //метод, возвращающий строковое представление цилиндра
    @Override
    public String toString() {
        return "Cylinder {" + "base=" + base + ", height=" + height + ", volume=" + volume() + '}';
    }
}