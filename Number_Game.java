import java.util.Scanner;

class rangen{
	public int genrate(int max,int min){
        	return (int) (Math.random()*(max - min + 1) + min);
        }
}
public class Number_Game{

     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          rangen rg = new rangen();
          int totalAttempts = 0;
          int win = 0;
          
          while (true){
               System.out.println("enter the maximum number");
               int max = sc.nextInt();
               System.out.println("enter the minimum number");
               int min = sc.nextInt();
               sc.nextLine();

               int cnum = rg.genrate(max,min);
               int attempts=0;
               
               while (true){
                   System.out.println("Guess a number between");
                   int gnum = sc.nextInt();
                   attempts++;

                  if(gnum>cnum){
                       System.out.println("its greater");
                  }else if(gnum<cnum){
                        System.out.println("its lower");
                  }else{
                       System.out.println("correct Guess");
                       win++;
                       break;
                   }
                }
                totalAttempts += attempts;
                System.out.println("Attempts = " + attempts);
                System.out.println("wins = " + win);

                double winrate = (double) win / totalAttempts*100;
                System.out.printf("your winrate is %.2f%%\n",winrate);

                System.out.println("do you want to play again(yes/no)");
                String playAgain = sc.next();
                if(!playAgain.equalsIgnoreCase("yes")){
                       sc.close();
                       System.exit(0);
                 }
                 sc.nextLine();
          }
      }
}
             











                  
                     
