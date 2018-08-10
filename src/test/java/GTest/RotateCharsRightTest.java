package GTest;

import G.RotateCharsRight;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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


}
