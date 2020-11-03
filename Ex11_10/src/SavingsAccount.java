
public class SavingsAccount {
	public SavingsAccount(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public void earnInterest() {
		amount += (amount * rate);
	}
	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public static void setRate(double r) {
		rate = r;
	}
	
	private String name;
	private double amount;
	private static double rate;
}
