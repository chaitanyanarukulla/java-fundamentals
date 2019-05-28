import java.time.LocalDateTime;
import java.util.Random;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    pluralize("Dog", 1);
    pluralize("cat", 2);
    pluralize("turtle", 0);
    flipNHeads(5);
    clock();

  }
  public static void pluralize(String x, int y){
    if(y == 1){
      System.out.println("I own " + y + " " + x + ".");
    }else{
      System.out.println("I own " + y + " " + x + "s.");
    }
  }

  public static void flipNHeads(int n){
    Random r = new Random();
    int heads = 0;
    int totalflips = 0;
    do{
      double result = r.nextDouble();
      if (result > .5){
        System.out.println("Heads");
        heads++;
        totalflips++;
      }else{
        System.out.println("tails");
        totalflips++;
        heads = 0;
      }
    }while(heads < n);
    System.out.println("It took " + totalflips + " flips to flip " + n + " heads in a row.");
  }
  public static void clock(){
    LocalDateTime previousTime = LocalDateTime.now();
    while(true){
        LocalDateTime currTime = LocalDateTime.now();
    if(previousTime.getSecond() != currTime.getSecond()){
        previousTime = currTime;
        System.out.println(currTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
      }
    }
}
}
