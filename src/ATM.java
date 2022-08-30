import java.util.HashMap;
import java.util.*;

public class ATM{
	private HashMap completeATM;
	public ATM(){
		completeATM= new HashMap<Integer,Double>();		
	}
	
	public void openAccount(Integer AcctNum){
		completeATM.put(AcctNum, 0.0);				
	}
	
	public void openAccount(Integer AcctNum, Double DepoNum){
		completeATM.put(AcctNum, DepoNum);		
	}
	
	public void closeAccount(Integer AcctNum){
		completeATM.remove(AcctNum, 0.0);		
	}
	
	public Double checkBalance(Integer AcctNum){
		if (completeATM.containsKey(AcctNum)) {
			return (Double)(completeATM.get(AcctNum));//WHY IS THIS WRONG??
		}
		return 0.0;
		
	}
	
	public Boolean depositMoney(Integer AcctNum, Double Deposit) {
		if(completeATM.containsKey(AcctNum)&&Deposit>0){
			completeATM.replace(AcctNum, Deposit);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney(Integer AcctNum, Double withdrawal){
		if(completeATM.containsKey(AcctNum)&& (Double)(completeATM.get(AcctNum))>withdrawal){
			completeATM.replace(AcctNum, (Double)(completeATM.get(AcctNum))-withdrawal);
			return true;
		}
		return false;
	}
	
	
	
	
	

}
