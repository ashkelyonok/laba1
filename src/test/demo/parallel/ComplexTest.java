package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {
    private final double delta = 0.001;

    @Test
    void testConjugate() {
        Complex c = new Complex(1, 2);
        Complex conjugated = c.conjugate();
        assertEquals(1, conjugated.getRe(), delta);
        assertEquals(-2, conjugated.getIm(), delta);
    }

    @Test
    void testConjugateWithZeroImage() {
        Complex realNum = new Complex(1, 0);
        Complex conjugated = realNum.conjugate();
        assertEquals(1, conjugated.getRe(), delta);
        assertEquals(0, conjugated.getIm(), delta);
    }

    @Test
    void testConjugateWithNegativeImage() {
        Complex negIm = new Complex(1, -2);
        Complex conjugated = negIm.conjugate();
        assertEquals(1, conjugated.getRe(), delta);
        assertEquals(2, conjugated.getIm(), delta);
    }

    @Test
    void testSquare() {
        Complex c = new Complex(1, 2);
        Complex squared = c.square();
        assertEquals(-3, squared.getRe(), delta);
        assertEquals(4, squared.getIm(), delta);
    }

    @Test
    void testSquareWithZeroImage() {
        Complex realNum = new Complex(3, 0);
        Complex squared = realNum.square();
        assertEquals(9, squared.getRe(), delta);
        assertEquals(0, squared.getIm(), delta);
    }

    @Test
    void testSquareWithZeroReal() {
        Complex imageNum = new Complex(0, 3);
        Complex squared = imageNum.square();
        assertEquals(-9, squared.getRe(), delta);
        assertEquals(0, squared.getIm(), delta);
    }

    @Test
    void testSquareWithNegativeImage() {
        Complex negIm = new Complex(3, -4);
        Complex squared = negIm.square();
        assertEquals(-7, squared.getRe(), delta);
        assertEquals(-24, squared.getIm(), delta);
    }
}