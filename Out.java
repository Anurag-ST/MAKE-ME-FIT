 package anurag;
 
import java.util.Scanner;
public class Out extends Bmi
{
void ex(int a)
 { 
	switch(a)
	{
	case 1: System.out.print("Today is Monday\nWORKKOUT 'A'\n");
	        System.out.print("1.Squats\r\n" +"\t3 sets of 8-10 reps.\r\n" + "\t2 minutes rest between sets.\r\n"+"2.Bench Press\r\n" + "\t3 sets of 8-10 reps.\r\n" + "\t2 minutes rest between sets.\r\n" + "3.Rows\r\n" + "\t3 sets of 8-10 reps.\r\n" + "\t2 minutes rest between sets.\n");
	        break;
	case 2:System.out.print("Today is Tuesday\nWORKOUT 'B'\n");
	       System.out.print("1.Deadlifts\r\n"+"\t3 sets of 6-8 reps.\r\n"+"\t2 minutes rest between sets.\n");
	       System.out.print("2.Pull-Ups (or Lat Pull-Downs)\r\n"+"\t3 sets of 8-10 reps.\r\n"+"\t2 minutes rest between sets.\n");
           System.out.print("3.Overhead Shoulder Press\r\n"+"\t3 sets of 8-10 reps.\r\n"+"\t2 minutes rest between sets.\n");	
           break;
	case 3:System.out.print("Today is Wednesday\nREST DAY\n") ;
	       break;
	case 4:System.out.print("Today is Thusday\nWORKKOUT 'A'\n");
           System.out.print("1.Squats\r\n" +"\t3 sets of 8-10 reps.\r\n" + "\t2 minutes rest between sets.\r\n"+"2.Bench Press\r\n" + "\t3 sets of 8-10 reps.\r\n" + "\t2 minutes rest between sets.\r\n" + "3.Rows\r\n" + "\t3 sets of 8-10 reps.\r\n" + "\t2 minutes rest between sets.\n");
           break;      
	case 5:System.out.print("Today is Friday\nWORKOUT 'B'\n");
           System.out.print("1.Deadlifts\r\n"+"\t3 sets of 6-8 reps.\r\n"+"\t2 minutes rest between sets.\n");
           System.out.print("2.Pull-Ups (or Lat Pull-Downs)\r\n"+"\t3 sets of 8-10 reps.\r\n"+"\t2 minutes rest between sets.\n");
           System.out.print("3.Overhead Shoulder Press\r\n"+"\t3 sets of 8-10 reps.\r\n"+"\t2 minutes rest between sets.\n");	
           break;
	case 6:System.out.print("Today is Saterday\nREST DAY\n") ;
           break;
	case 7:System.out.print("Today is Sunday\nREST DAY\n") ;
           break;
    default:System.out.print("There are only seven days in a week\n");
            System.out.print("Enter again"); 
            Scanner sc=new Scanner(System.in);
            int b=sc.nextInt();
            Out ob=new Out();
            ob.ex(b);
            break; 
            
	}
	
 }
}
