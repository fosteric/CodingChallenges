package Challenge2Test;

import Challenge2.ClosestNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClosestNumbersTest {

    @Test
    public void closestNumbersTest1(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {8,24,3,20,1,17};
        int actual = closestNumbers.minDistance(arr);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void closestNumbersTest2(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {8};
        int actual = closestNumbers.minDistance(arr);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void closestNumbersTest3(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {};
        int actual = closestNumbers.minDistance(arr);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void closestNumbersTest4(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {-1, 1, 5};
        int actual = closestNumbers.minDistance(arr);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void closestNumbersTest5(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int actual = closestNumbers.minDistance(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void closestNumbersTest6(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {5,15,30,50,51};
        int actual = closestNumbers.minDistance(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void closestNumbersTest7(){
        ClosestNumbers closestNumbers = new ClosestNumbers();
        int[] arr = {-2,-6,-50,-34,-9};
        int actual = closestNumbers.minDistance(arr);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
