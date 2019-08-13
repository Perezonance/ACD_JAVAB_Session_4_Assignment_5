package assignment_5;

public class Saving extends Account{
	
	private double rateOfInt;

	public Saving(int accNo, String name, String bal, double rateOfInt){
		super(accNo, name, bal);
		this.rateOfInt = rateOfInt;
	}
	
	public void display(){
		System.out.println("Saving Account #" + this.getAccNo() + "\n Name: " + this.getAccName() +"\nBalance: $" 
				+ this.getAccBal() + "\nInterest Rate: " + this.rateOfInt);
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	
}
