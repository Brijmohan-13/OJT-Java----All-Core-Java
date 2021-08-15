package Assignment2;

public class TwoDimentionalArray {
	
public static void main(String[] args) {
	
	int [][] numbers=new int[3][3];
	
	numbers[0][0]=10;
	numbers[0][1]=20;
	numbers[0][2]=30;
	numbers[1][0]=40;
	numbers[1][1]=50;
	numbers[1][2]=60;
	numbers[2][0]=70;
	numbers[2][1]=80;
	numbers[2][2]=50;
	
	boolean flag=true;
	
        for(int i=0; i<3; i++)
    		{
    			for(int j=0; j<3; j++)
    			{
    				if(numbers[i][j]==50)
    				{
    					numbers[i][j]=45;
    					flag=false;
    				}
    			}
    		}// for loop for replacing 50 by 45
        
           
        if(flag)   // if element not found
        {
        	System.out.println("Element is not found");
        }
        else
        {
	        	System.out.println("Array After replacing 50 by 45");
				for(int i=0; i<3; i++)
				{
					for(int j=0; j<3; j++)
					{
						{
						System.out.println(numbers[i][j]);			
						}
					}
				}
        }
      	
			
	//for loop -Minimum number from each row		
	for (int i=0;   i<3;  i++)
			{
				int temp=1;
				int minNumber=numbers[i][0];
				for(int j=0;   j<3;  j++)
				{
					if(minNumber>numbers[i][j])
					{
						minNumber=numbers[i][j];
					}
				}
				System.out.println("Minimum number in row no. "+(temp+i)+" is "+minNumber);
			}
	
	
	//for loop -Minimum number from each column		
		for (int i=0;   i<3;  i++)
				{
					int temp=1;
					int minNumber=numbers[0][i];
					for(int j=0;   j<3;  j++)	
					{
						if(minNumber>numbers[j][i])
						{
							minNumber=numbers[j][i];
						}
					}
					System.out.println("Minimum number in column no. "+(temp+i)+" is "+minNumber);
				}
		}//main ends here
}//class ends here
