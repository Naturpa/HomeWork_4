package org.example;

//класс Circle описывает круг
public class circle implements figure {
    private double radius; //радиус круга

    //конструктор создает новый круг с заданным радиусом
    public circle(double radius) throws InvalidRadiusException{
        if (radius < 0) {
            throw new InvalidRadiusException("The radius cannot be negative");
        }
        this.radius = radius;
    }

    //метод, вычисляющий площадь круга
    @Override // метод переопределения
    public double area() {
        return Math.PI * radius * radius;
    }

    //метод, вычисляющий периметр круга.
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    //метод, возвращающий строковое представление круга
    @Override
    public String toString() {
        return "Circle {" + "radius=" + radius + ", area=" + area() + ", perimeter=" + perimeter() + '}';
    }
}