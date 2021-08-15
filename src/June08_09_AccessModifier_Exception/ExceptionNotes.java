package June08_09_AccessModifier_Exception;

public class ExceptionNotes {
 
/*Refer Exception tree from JBK tutorial
 
    Checked Exceptions must be handled.If they are not handled,compiler gives error----There is NO concept of compile time exception
	UnChecked Exception's handling is optional
	
	Exception-It is run time error
	Exception Handling is prevention of abnormal termination of program
	
	throws-it is used to delegate/handover responsibility of Exception Handling to the caller of the method
	throws-it gives declaration/indication that this method may give exception
	throw- it generates/raises exception explicitly
	
	Exception is handled by using try and catch block only, not by throws
	Error prone statement is written is try block.If there is exception then catch block will get executed immediately(control goes to catch block immediately)
	If a method can generate exception, we can handle it in method definition by using try and catch block but we do not do that usually we handle it while calling

	if there any statement regarding exception,then according to compiler Exception should be handled using try,catch or it should be thrown or both

(All these are Pre-defined exception classes)
Throwable--
Exceptions--
ClassNotFoundException
ClassNotSupportedException
FileNotFoundException
ArithmeticException
ArrayIndexOutOfBoundsException
StringIndexOutOfBoundsException
NullPointerException
NumberFormatException




	Object o= String str;    ---implicit class casting    (parent child relation must)
	String str=(String) o;     ---explicit class casting  (parent child relation must)
	(casting not possible between String & StringBuffer since there is no relation)
	*/
}
//Object class is the part of API