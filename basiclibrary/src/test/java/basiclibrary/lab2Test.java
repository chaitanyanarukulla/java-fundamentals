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
    @Test
    public void testLab2_averages(){
        lab2 classUnderTest = new lab2();
        int[] arr = new int[]{1,2,3,4,5};
        double expectedOutput = 3.0;
        assertEquals("output should return 3",
                expectedOutput,
                classUnderTest.averages(arr), 0);
    }

    @Test
    public void testLab2_avgAverages(){
        lab2 classUnderTest = new lab2();
        int[][] arr = new int[][]{
                {1,2,3,4,5},
                {2,4,6,8,10},
                {3,6,9,12,15}
        };
        double expectedOutput = 3.0;
        assertEquals("output should equal 3.0", expectedOutput,
                classUnderTest.avgAverages(arr), 0);
    }
}