package moa.classifiers.algorithm;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class newAlgorithmTest {
    @Test
    public void testSumFunction() {
        newAlgorithm summation=  new newAlgorithm(2, 3);
        assertEquals(5,summation.sum());
    }
    @Test
    public void testSetAndGet(){
        newAlgorithm summation = new newAlgorithm(0,0);
       summation.setA(100);
       assertEquals(100,summation.getA());
    }
    @Test
    public void testMultiplication(){
        newAlgorithm summation = new newAlgorithm(10,15);
       assertEquals(150,summation.multiplication());
    }
    @Test
    public void testDivision(){
        newAlgorithm summation = new newAlgorithm(15,5);
       assertEquals(3,summation.division());
    }
    @Test
    public void testSubstraction(){
        newAlgorithm summation = new newAlgorithm(15,5);
       assertEquals(10,summation.subtraction());
    }
}
