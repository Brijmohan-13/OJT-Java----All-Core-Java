package Assignment1;

public class Stringex {
	
	public static void main(String[] args) {
		
		
		String s1="j av a";
		
		
		char [] ch=s1.toCharArray();
		
		String s2="";
		
		for(char c:ch)
		{
			if(c!=' ')
			{
				s2=s2+c;
			}
		}//loop ends
		
		System.out.println(s2);
	}//main ends

}//class ends
