package com.example.lesson24;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QuadraticEquationTest {
    private QuadraticEquation equation;

    @Test
    public void testGetTwoRoots() {
//        given
        double a = 1;
        double b = 5;
        double c = 6;

        double expectedFirstRoot = -2;
        double expectedSecondRoot = -3;

//        when
        equation = new QuadraticEquation(a, b, c);
        double[] actualRoots = equation.getRoots();

//        then
        Assert.assertEquals(actualRoots.length, 2);
        Assert.assertEquals(actualRoots[0], expectedFirstRoot, 0.0001);
        Assert.assertEquals(actualRoots[1], expectedSecondRoot, 0.0001);
    }

    @Test
    public void testGetOneRoot() {
        //        given
        double a = 4;
        double b = 4;
        double c = 1;

        double expectedRoot = -0.5;

//        when
        equation = new QuadraticEquation(a, b, c);
        double[] actualRoots = equation.getRoots();

//        then
        Assert.assertEquals(actualRoots.length, 1);
        Assert.assertEquals(actualRoots[0], expectedRoot, 0.0001);
    }

    @Test(dataProvider = "coefficientsNoRoot")
    public void testWithoutRoots(double a, double b, double c) {
//        given
//        double a = 1;
//        double b = 2;
//        double c = 3;

//        when
        equation = new QuadraticEquation(a, b, c);
        double[] actualRoots = equation.getRoots();

//        then
        Assert.assertNull(actualRoots);
    }

    @DataProvider
    private Object[][] coefficientsNoRoot() {
        return new Object[][] {
                {1, 2, 3},
                {7, 2, 4},
                {2, 3, 4},
                {3, 4, 5}
        };
    }
}