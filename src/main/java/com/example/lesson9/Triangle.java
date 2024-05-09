package com.example.lesson9;

//  POJO
public class Triangle extends Shape {
    protected int firstSide;
    protected int secondSide;
    protected int thirdSide;

    protected double firstAngle;
    protected double secondAngle;
    protected double thirdAngle;

    private double square;
    private double perimeter;

    protected Triangle() {
    }

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide > thirdSide &&
        secondSide + thirdSide > firstSide && thirdSide + firstSide > secondSide) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            calculateAngles();
//            calculate firstAngle, second and third angles
        } else {
            throw new IllegalArgumentException("Not valid argument for triangle");
        }

    }

    public Triangle(int firstSide, int secondSide, double angleBetweenSides) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        thirdSide = (int)(Math.pow(firstSide, 2) + Math.pow(secondSide, 2) -
                firstSide*secondSide*Math.cos(angleBetweenSides));
        firstAngle = angleBetweenSides;
//        calculate second and third angles
    }

    public void setFirstSide(int side) {
        this.firstSide = side;
//        this.secondSide = calculate
//        this.thirdSide = calculate
    }

    @Override
    public double getPerimeter() {
        if (perimeter == 0) {
            perimeter = firstSide + secondSide + thirdSide;
        }
        return perimeter;
    }

    @Override
    public double getSquare() {
//        if (square == 0) {
//            square =
//        }
        return 0;
    }

    protected void calculateAngles() {
//        calculating process
    }
}
