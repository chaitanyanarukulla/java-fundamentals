package basiclibrary;
import java.util.*;

public class lab3 {
     public  String findTemp(int[][] inputArry) {
            int min = 100;
            int max = 0;
            String ans = "";
            HashSet<Integer> temp = new HashSet<Integer>();
        for (int i =0;i<inputArry.length;i++){
            for(int j = 0; j< inputArry[i].length;j++){
                if(inputArry[i][j] < min)
                    min = inputArry[i][j];
                if(inputArry[i][j] > max)
                    max= inputArry[i][j];
                temp.add(inputArry[i][j]);

            }


        }
         ans += ans.format("High: %s\nLow: %s\n",max ,min);
        for(int t = min; t < max ; t++) {
            if (!temp.contains(t)) {
                ans += ans.format("Never saw temperature: %s\n", t);
            }
        }
        return ans;
        }

    public static String tally(List<String> arr){
        HashMap<String, Integer> votes = new HashMap();
        String[] plants = new String[]{"Bush", "Shrub", "Hedge"};
        for(String plant : plants){
            votes.put(plant, 0);
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == "Bush"){
                int votesSoFar = votes.get("Bush");
                votes.put("Bush", votesSoFar + 1);
            } else if(arr.get(i) == "Shrub"){
                int votesSoFar = votes.get("Shrub");
                votes.put("Shrub", votesSoFar + 1);
            } else if(arr.get(i) == "Hedge"){
                int votesSoFar = votes.get("Hedge");
                votes.put("Hedge", votesSoFar + 1);
            }
        }
        int max = 0;
        String winner = "";
        for(String plant : plants){
            int count = votes.get(plant);
            if (count > max){
                max = count;
                winner = plant;
            }
        }
        return winner;
    }

    }



