package anurag;
import java.util.Scanner;
 
public class Bmi extends Mem 
{
  void showBmi(int k)
  {   
	  double bm,h,w;
	System.out.print("Enter the height(cm) and weight(kg)");
	Scanner mi=new Scanner(System.in);
	h=mi.nextDouble();
	w=mi.nextDouble();
	   h=(double)h/100;
	   h=h*h;
	   bm=w/h;
	   if(bm>25.5)
	   {	   
	   System.out.print("\tOVERWEIGHT\n");
	   }
	   else if(bm<18.5)
	   {
	   System.out.print("\tUNDERWIEGHT\n");
	   }
	   else 
	   {
		System.out.print("\tHEALTHY\n"); 
	   }
	System.out.print("BMI: "+bm+"\n");	   
	
  }
}
