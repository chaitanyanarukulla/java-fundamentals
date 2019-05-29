package basiclibrary;
import org.junit.Test;
import static org.junit.Assert.*;

public class lab2Test {
    @Test
    public void test_lab2_roll() {
        lab2 classUndertest = new lab2();
        int n = 10;
      assertTrue("Arry should return the same length as n",classUndertest.roll(n).length == n);
    }


    @Test
    public void test_lab2_containsDuplicates_check_true() {
        lab2 classUndertest = new lab2();
        int [] arr = new int []{1,2,3,2,4};
        assertTrue("Array should return true if array contains ",classUndertest.containsDuplicates(arr));
    }

    @Test
    public void test_lab2_containsDuplicates_check_false() {
        lab2 classUndertest = new lab2();
        int [] arr = new int []{1,2,3,5,4};
        assertTrue("",classUndertest.containsDuplicates(arr)==false);
    }
}