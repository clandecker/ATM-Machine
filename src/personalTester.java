
public class personalTester {
	public static void main (String[]args) {
		ATM chaseATM=new ATM();
		ATM amexATM=new ATM();
		chaseATM.openAccount(1234,123.45);
		amexATM.openAccount(5678);
		System.out.println(chaseATM.closeAccount());
		System.out.println(amexATM.closeAccount());
		
		
		
		
		
		
	}

}
