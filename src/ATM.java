import java.util.HashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
			completeATM.replace(AcctNum, (Double)(completeATM.get(AcctNum))+Deposit);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney(Integer AcctNum, Double Withdrawal){
		if(Withdrawal>0 && completeATM.containsKey(AcctNum) && (Double)(completeATM.get(AcctNum))>Withdrawal){

			//gets new balance (rounded weirdly)
			Double newBalance=(Double)completeATM.get(AcctNum)-Withdrawal;
			
			//uses BigDecimal to round correctly
			BigDecimal bigNewBalance=BigDecimal.valueOf(newBalance); 
			bigNewBalance=bigNewBalance.setScale(2, RoundingMode.HALF_UP);
			newBalance=bigNewBalance.doubleValue();			
			
			completeATM.replace(AcctNum, newBalance);
			return true;//test
		}
		return false;
	}
	
	
	
	
	

}
