import java.util.Scanner;

class Grade{
	public String grade(int avgp){
	     switch(avgp / 10){
                  case 10:
                     return "A+";
                  case 9:
                     return "A";
                  case 8:
                      return "B+";
                  case 7:
                      return "B";
                  case 6:
                       return "C";
                   case 5:
                       return "D";
                   default:
                       return "F";
             }
       }
}

public class Grade_Calculator{
             public static void main(String[] args){
                   Grade g=new Grade();
                   Scanner sc=new Scanner(System.in);

                   //taking input of how many subjects are there
                   System.out.println("enter the number of subjects");
                   int tsubs = sc.nextInt();
                   int tmarks= 0;

                   //taking and adding all the marks
                    for(int i=0;i<tsubs;i++){
                       System.out.println("enter the marks obtained in subject" +(i+1));
                       int marks = sc.nextInt();
                       tmarks += marks;
                     }
               
                     //calculating percentage
                     int avgp=tmarks / tsubs;

                     //calculating Grades
                     String Grade=g.grade(avgp);

                     //displaying all the data
                     System.out.println("total marks obtained :" + tmarks);
                     System.out.println("percentage obtained:" + avgp+ "%");
                     System.out.println("Grade obtained:" + Grade);

                     sc.close();
             }
}
