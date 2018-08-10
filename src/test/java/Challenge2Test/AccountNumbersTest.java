package Challenge2Test;

import Challenge2.AccountNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountNumbersTest {

    @Test
    public void rearrangeAcctNum1(){
        AccountNumbers accountNumbers = new AccountNumbers();
        int actual = accountNumbers.rearrangeAcctNum(123456);
        int expected = 162534;
        assertEquals(expected, actual);
    }

    @Test
    public void rearrangeAcctNum2(){
        AccountNumbers accountNumbers = new AccountNumbers();
        int actual = accountNumbers.rearrangeAcctNum(130);
        int expected = 103;
        assertEquals(expected, actual);
    }

    @Test
    public void rearrangeAcctNum3(){
        AccountNumbers accountNumbers = new AccountNumbers();
        int actual = accountNumbers.rearrangeAcctNum(10450);
        int expected = 10054;
        assertEquals(expected, actual);
    }

    @Test
    public void rearrangeAcctNum4(){
        AccountNumbers accountNumbers = new AccountNumbers();
        int actual = accountNumbers.rearrangeAcctNum(10);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void rearrangeAcctNum5(){
        AccountNumbers accountNumbers = new AccountNumbers();
        int actual = accountNumbers.rearrangeAcctNum(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void rearrangeAcctNum6(){
        AccountNumbers accountNumbers = new AccountNumbers();
        int actual = accountNumbers.rearrangeAcctNum(10101010);
        int expected = 10011001;
        assertEquals(expected, actual);
    }

}
