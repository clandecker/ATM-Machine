
public class personalTester {
	public static void main (String[]args) {
		ATM chaseATM=new ATM();
		chaseATM.openAccount(1234,123.45);
		chaseATM.openAccount(5678);
		
		chaseATM.closeAccount(1234);
		chaseATM.closeAccount(5678);
		
		System.out.println(chaseATM.checkBalance(12345));
		System.out.println(chaseATM.checkBalance(5678));
		
				
		
	}

}
