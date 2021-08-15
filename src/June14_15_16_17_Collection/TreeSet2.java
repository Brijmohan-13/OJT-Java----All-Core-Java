package June14_15_16_17_Collection;

import java.util.TreeSet;

public class TreeSet2 {
	
//In treeSet,if there are Integer class objects then sorting is done in ascending way...as it is internally defined in Integer class
//Integer class implements comparable interface and defined compareTo() 
	
//but if treeSet has Student Class objects,	then HOW ???
//implement comparable interface in student class and define compareTo()
	
	
public static void main(String[] args) {
	
	Student_Comparable student1=new Student_Comparable(10, 50);
	Student_Comparable student2=new Student_Comparable(5, 45);
	Student_Comparable student3=new Student_Comparable(1, 20);
	Student_Comparable student4=new Student_Comparable(20,90);
	Student_Comparable student5=new Student_Comparable(15,70);

	TreeSet<Student_Comparable> ts=new TreeSet<Student_Comparable>();
	
	ts.add(student1);
	ts.add(student2);
	ts.add(student3);
	ts.add(student4);
	ts.add(student5);
	
	System.out.println(ts);
	
	//If Student class do not implement comparable interface then TreeSet will definitely give Exception(ClassCastException)
	
	
}}
	