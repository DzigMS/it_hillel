package com.example.lesson9;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(int side) {
        firstSide = side;
        secondSide = side;
        thirdSide = side;

        firstAngle = 60;
        secondAngle = 60;
        thirdAngle = 60;
        calculateAngles();
    }
}
