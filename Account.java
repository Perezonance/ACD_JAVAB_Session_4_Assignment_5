package assignment_5;

public class Account {
	private int accNo;
	private String accName, accBal;
	
	public Account(){
		
	}
	public Account(int accNo, String name, String bal){
		this.accNo = accNo;
		this.accName = name;
		this.accBal = bal;
	}
	

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBal() {
		return accBal;
	}

	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}
	
}
