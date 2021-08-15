package OJT_Tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Task6 {
public static void main(String[] args) {
	HashMap<String, Integer > hm=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	String name=new String();
	int phone=0;
	
	whileloop:
		while(true){
			System.out.println("1.	Add new entry"); 
			System.out.println("2.	Remove entry");
			System.out.println("3.	Search phone number");
			System.out.println("4.	Update phone number ");
			System.out.println("5.	Display all entries");
			System.out.println("6.	Exit");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println(" Enter name: ");
				name=sc.next();
				System.out.println("Enter phone");
				phone=sc.nextInt();
				hm.put(name, phone);
				break;
			case 2:
				System.out.println("Enter the name which you want to remove : ");
				name = sc.next();
				hm.remove(name);
				System.out.println("Removed Successfully...");
				break;
			case 3:
				System.out.println("Enter the phone number that you want to search : ");
				phone = sc.nextInt();
				if(isPresent(phone,hm)) System.out.println("Phone is present "+hm.get(name));
				else System.out.println("phone is not present.");
				break;
			case 4:
				System.out.println("Enter the name whose phone number to update : ");
				name = sc.next();
				System.out.println("Enter new phone number : ");
				phone = sc.nextInt();
				hm.put(name, phone);
				System.out.println("Successfull Updated.");
				break;	
			case 5:
				Iterator<String> itr=hm.keySet().iterator();
				while(itr.hasNext()){
					name=itr.next();
					phone=hm.get(name);
					System.out.println(name+" "+phone);
				}
				break;
			case 6:
				System.out.println("Thank you");
				break whileloop;
			}
			
		}
}

private static boolean isPresent(int phone, HashMap<String, Integer> hm) {
	Set<String> keys=hm.keySet();
	int temp=0;
for (String key : keys) {
	if(!(temp==phone)){
		return true;
	}
	
}
	return false;
}
}
