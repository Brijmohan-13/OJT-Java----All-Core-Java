package June14_15_16_17_Collection;
import java.util.TreeMap;

public class TreeMap1 {
	
	//In TreeMap,sorting is done based on keys...if sorting is to be done based on value we have to use comparable interface 
	//TreeMap do not allow null key (since it has to do sorting)and but allows multiple null values

	/*Map example for interview -MCQ Exam
	Key    Value
	Question 	Answer
	1			D
	2			B
	3			A
	4			C
	2			D						//latest key,value pair is considered
	*/
	
	public static void main(String[] args) {
		 
		TreeMap<Integer, Character>  tm=new java.util.TreeMap<Integer, Character>();
		
		tm.put(1, 'D');
		tm.put(2, 'B');
		tm.put(3, 'A');
		tm.put(4, 'C');
		tm.put(2, 'D');    //latest key,value pair is considered 

		System.out.println(tm);
		System.out.println(tm.size());

}// main ends
}// class ends