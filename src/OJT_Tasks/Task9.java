package OJT_Tasks;

public class Task9 {
	
	public static void main(String[] args) {
		
		int [][] series= new int [3][];
		
		series[0]= new int[3];
		
		series[1]= new int[3];

		series[2]= new int[2];
		
		
		series[0][0]= 200;
		series[0][1]= 100;
		series[0][2]= 350;
		series[1][0]= 100;
		series[1][1]= 190;				
		series[1][2]= 120;			
		series[2][0]= 90;				
		series[2][1]= 135;
		
		int maxRun=0;
		int temp= series[0][0];
		for (int i = 0; i < series.length; i++) {
			for (int j = 0; j < series[i].length; j++) {
				if(temp<series[i][j]){
				maxRun=series[i][j];
				}
			}
		}
		System.out.println("Highest score in series 3 : "+maxRun);	
		System.out.println("------------------------------");
		
		int sum=0;
		int[] sum1=new int[3] ;
		for (int i = 0; i < series.length; i++) {
			sum=0;
			for (int j = 0; j < series[i].length; j++) {
				sum = sum +series[i][j];
			}
			System.out.println("Sum of each row : "+sum);
			
			
			sum1[i]=sum;
		}
		
		System.out.println("------------------------------");

		int lowestscore= sum1[0];
		for (int i = 0; i < sum1.length; i++) {
			if(lowestscore > sum1[i]){
				lowestscore=sum1[i];
			}
		}
		System.out.println("Lowest score in three series by rahul and score is "+lowestscore);
	}
}
