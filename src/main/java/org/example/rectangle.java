package org.example;

//класс Rectangle описывает прямоугольник
public class rectangle implements figure {
    private double width; //ширина прямоугольника
    private double height; //высота прямоугольника

    //конструктор Rectangle создает новый прямоугольник

    public rectangle(double width, double height) throws InvalidDimensionException{
        if (width < 0 || height < 0) {
            throw new InvalidDimensionException("The dimensions cannot be negative");
        }
        this.width = width;
        this.height = height;
    }

    //метод, вычисляющий площадь прямоугольника
    @Override
    public double area() {
        return width * height;
    }

    //метод, вычисляющий периметр прямоугольника
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    //метод, возвращающий строковое представление прямоугольника
    @Override
    public String toString() {
        return "Rectangle {" + "width=" + width + ", height=" + height + ", area=" + area() + ", perimeter=" + perimeter() + '}';
    }
}