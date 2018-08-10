package Challenge1Test;

import Challenge1.CakeCutting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CakeCuttingTest {

    @Test
    public void cakeCuttingTest1(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("abccbaabccba");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void cakeCuttingTest2(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("abcabcabcabc");
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void cakeCuttingTest3(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("aaaaaaaaaaaa");
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void cakeCuttingTest4(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("abababababab");
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void cakeCuttingTest5(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("a");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void cakeCuttingTest6(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("abcdefghijkl");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void cakeCuttingTest7(){
        CakeCutting cakeCutting = new CakeCutting();
        int actual = cakeCutting.answer("");
        int expected = -1;
        assertEquals(expected, actual);
    }


}
