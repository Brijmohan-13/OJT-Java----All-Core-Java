package June11_Array;

import java.util.Scanner;

//2D Array is Array of Array
//When the number of elements in each Array/row are different it is jagged Array
//i.e number of columns are different for different row

//Jagged Array saves memory
//it is used when number of rows are fixed and number of columns are not.

public class JaggedArray {
	public static void main(String[] args) {
		
		int [][] age=new int [3][];
		
		age[0]=new int [2];
		age[1]=new int [3];
		age[2]=new int [5];
		
		Scanner sc=new Scanner(System.in);	
//	1	2
//	3	4	5
//	6	7	8	9	10				
		
// int[][] age={{1,2} , {3,4,5} , {6,7,8,9,10}};	
		for(int i=0; i<age.length;  i++)
		{
			for(int j=0; j<age[i].length;  j++)
			{
				System.out.println("Enter age");
				age[i][j]=sc.nextInt();
			}
		}		
		
		for(int i=0; i<age.length;  i++)
		{
			for(int j=0; j<age[i].length;  j++)
			{
				System.out.print(age[i][j]+" ");        //printing on same line
			}
			System.out.println();
		}	
	}//main ends	
	}//class ends