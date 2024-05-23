package com.example.lesson24;

public class QuadraticEquation {

    private double zeroPowerCoefficient;
    private double firstPowerCoefficient;
    private double secondPowerCoefficient;

    public QuadraticEquation(double secondPowerCoefficient, double firstPowerCoefficient, double zeroPowerCoefficient) {
        this.zeroPowerCoefficient = zeroPowerCoefficient;
        this.firstPowerCoefficient = firstPowerCoefficient;
        this.secondPowerCoefficient = secondPowerCoefficient;
    }

    public double[] getRoots() {
        double discriminant = getDiscriminant();
        double[] roots;
//

        if (discriminant < 0) {
            return null;
        } else if (discriminant == 0) {
            roots = new double[1];
            roots[0] = (-1 * firstPowerCoefficient) / (2 * secondPowerCoefficient);
//            return roots;
        } else {
            roots = new double[2];
            roots[0] = (-1 * firstPowerCoefficient + Math.sqrt(discriminant)) / (2 * secondPowerCoefficient);
            roots[1] = (-1 * firstPowerCoefficient - Math.sqrt(discriminant)) / (2 * secondPowerCoefficient);
        }

        return roots;
    }

    private double getDiscriminant() {
        return firstPowerCoefficient * firstPowerCoefficient - 4 * secondPowerCoefficient * zeroPowerCoefficient;
    }
}
