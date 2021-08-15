package June02_Interface_this_super_;

public class RemoteTest {

	
	public static void main(String[] args) {
		Remote remote;        //remote is reference here with address[1000]
		remote=new SONY();
		remote.on();
		
		remote= new SAMSUNG();  //reference is same ,now this reference is pointing to SAMSUNG class object at address[2000]
		remote.on();
	}
}
