// #include<iostream>
// #include<cmath>
// #include<stdio.h>
// #include<conio.h>
// #include<iomanip>
// using namespace std;
// int main()
// {
//     double x[3]={0,1,2};
//     double p[3]={0.25,0.5,0.25}; //0+0.5+0.5   // ex1 = 0+0.5+0.5 = 1  // (0-0)*0.25 + (1-0.5)^2*0.5 + (2-0.5)^2*0.25
//     //calculate EX, EX^2,Var(x)
//    
//    ;
//     
//     int size_Of = sizeof(x)/sizeof(x[0]);
//     
//     
//        
//         
//         
//          
//     
//     
//     
//     
//     
//         
//     

//     
// }

public class Main
{
  public static void main (String[]args)
  {
	Main m = new Main ();
	double x[] = new double[3];
	  x[0] = 0;
	  x[1] = 1;
	  x[2] = 2;
	double p[] = new double[3];
	  p[0] = 0.25;
	  p[1] = 0.5;
	  p[2] = 0.25;
	double sum1_EX = 0;
	double sum2_EX2 = 0;
	double sum3_var = 0;
	for (int i = 0; i < x.length; i++)
	  {
		// cout<<"Expectation of X is: \n";
		sum1_EX += (x[i] * p[i]);
		sum2_EX2 += (Math.pow (x[i], 2) * p[i]);	// 
// sum3_var+=(((x[i] - sum1_EX) * (x[i] - sum1_EX)) * p[i]);   => sai logic
	  }
	System.out.println (sum1_EX);
	System.out.println (sum2_EX2);
	for (int j = 0; j < x.length; j++)
	  {
		sum3_var += Math.pow (x[j] - sum1_EX, 2) * p[j];
	  }
	System.out.println (sum3_var);

  }

}
