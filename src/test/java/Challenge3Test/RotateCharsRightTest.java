package Challenge3Test;

import Challenge3.RotateCharsRight;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RotateCharsRightTest {

    @Test
    public void rotateCharsRightTest1(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        char[] charArr = {'h','e','l','l','o'};
        char[] actual = rotateNumbersRight.rotateNumbersRight(charArr, 2);
        char[] expected = {'l','o','h','e','l'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateCharsRightTest2(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        char[] charArr = {'h','e','l','l','o'};
        char[] actual = rotateNumbersRight.rotateNumbersRight(charArr, 0);
        char[] expected = {'h','e','l','l','o'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateCharsRightTest3(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        char[] charArr = {'h','e','l','l','o'};
        char[] actual = rotateNumbersRight.rotateNumbersRight(charArr, 5);
        char[] expected = {'h','e','l','l','o'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateCharsRightTest4(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        char[] charArr = {'h','e','l','l','o'};
        char[] actual = rotateNumbersRight.rotateNumbersRight(charArr, -2);
        char[] expected = {'l','l','o','h','e'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateCharsRightTest5(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        char[] charArr = {'h','e','l','l','o','g','e','t','g','u','r','u'};
        char[] actual = rotateNumbersRight.rotateNumbersRight(charArr, 5);
        char[] expected = {'t','g','u','r','u','h','e','l','l','o','g','e'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void trueRotationTest1(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        int actual = rotateNumbersRight.findTrueRotation(5, 3);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void trueRotationTest2(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        int actual = rotateNumbersRight.findTrueRotation(5, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void trueRotationTest3(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        int actual = rotateNumbersRight.findTrueRotation(5, 5);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void trueRotationTest4(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        int actual = rotateNumbersRight.findTrueRotation(5, 7);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void trueRotationTest5(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        int actual = rotateNumbersRight.findTrueRotation(5, -3);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void trueRotationTest6(){
        RotateCharsRight rotateNumbersRight = new RotateCharsRight();
        int actual = rotateNumbersRight.findTrueRotation(5, -7);
        int expected = 3;
        assertEquals(expected, actual);
    }




}
