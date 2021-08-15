package June11_Array;

import java.util.Scanner;

public class Array_2D {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows");
	int row=sc.nextInt();

	System.out.println("Enter number of column");
	int col=sc.nextInt();

	int [][] num=new int[row][col];        //rows:2   col: 3
	
/*  num[0][0]=0;
	num[0][1]=0;
	num[0][2]=0;

	num[1][0]=0;
	num[1][1]=0;
	num[1][2]=0;  */
	
	for (int i=0; i<row ; i++ )
	{
		int temp=1;
		System.out.println("Enter values of row "+(temp+i));
		for(int j=0;  j<col;  j++)
		{
			num[i][j]=sc.nextInt();
		}
	}
	System.out.println("Arrays after printing are-");
	for(int i=0;  i<row;  i++)
	{
		int temp=1;
		System.out.println("Values of Row no."+(temp+i)+" are");
			for(int j=0; j<col;  j++)
		{
			System.out.println(num[i][j]);
		}
	}
}
}
