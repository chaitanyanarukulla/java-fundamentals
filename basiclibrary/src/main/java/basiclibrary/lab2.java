package basiclibrary;

import java.util.*;

public class lab2 {
    public int[] roll(int n) {
        int[] output = new int[n];

        Random rnd = new Random();
        for (int i = 0; i < output.length; i++) {
            int result = rnd.nextInt(6)+1;
            output[i]=result;
        }
        return output;
    }

    public boolean containsDuplicates(int[] inputarray){
        Arrays.sort(inputarray);
        for(int i = 1; i < inputarray.length; i++){
            if(inputarray[i -1] == inputarray[i]) {
                return true;
            }

        }
      return false;
    }

//    public double calculatingAverages(){
//    }
}