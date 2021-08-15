package June11_Array;

//2D array is array of array(imagine in table format)
//each row in 2D array is Array
public class Array2D {
	
	public static void main(String[] args) {
		
		int [][] num=new int[2][3];        
		
		num[0][0]=15;
		num[0][1]=20;
		num[0][2]=50;
		num[1][0]=25;
		num[1][1]=45;
		num[1][2]=60;

		
//						 column
//					    0	1   2
//   row         0     15  20   50
//   row         1     25  45   60
		
		
		for (int i=0; i<2;  i++)
		{
			for (int j=0;  j<3;  j++)
			{
				System.out.println(num [i][j]);
			}
		}	
	}
}
//Nested forLoop is used for 2D array
//forLoop is used for 1D array

//		int [][] num={{15,20}, {25,45}};      we can write like this

