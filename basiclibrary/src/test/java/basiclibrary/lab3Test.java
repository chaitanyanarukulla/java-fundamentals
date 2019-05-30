package basiclibrary;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class lab3Test {
    @Test
        public void test_lab3_findTemp() {
            lab3 classUndertest = new lab3();
           int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
           String ootputans = "High: 72\n" +
                   "Low: 51\n" +
                   "Never saw temperature: 63\n" +
                   "Never saw temperature: 67\n" +
                   "Never saw temperature: 68\n" +
                   "Never saw temperature: 69\n";
            assertEquals("Arry should return a string",ootputans,classUndertest.findTemp(weeklyMonthTemperatures));
        }
    @Test
    public void test_lab3_tally(){
        lab3 classUndertest = new lab3();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
//        String outputa =  "Bush received the most votes!"
        assertEquals("Arry should return a string","Bush",classUndertest.tally(votes));
    }
}
