
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount.setRate(0.003);
		
		SavingsAccount acc1 = new SavingsAccount("±Ë¿œ", 300000);
		SavingsAccount acc2 = new SavingsAccount("±Ë¿Ã", 30000);
		SavingsAccount acc3 = new SavingsAccount("±ËªÔ", 80000);
		
		
		acc1.earnInterest();
		acc2.earnInterest();
		acc3.earnInterest();
		
		System.out.println(acc1.getName() + " : " + acc1.getAmount());
		System.out.println(acc2.getName() + " : " + acc2.getAmount());
		System.out.println(acc3.getName() + " : " + acc3.getAmount());
	}

}
