public class Account{

		private int pin;
		private String name;
		private double balance;


	public Account(int pin, String name){

		this.pin = pin;
		this.name = name;

	}

	public void initialBalance(double money){
		balance = money;
	}

	public void withdraw(){
		Scanner liger = new Scanner(System.in);

		System.out.println("how much money would you like to withdraw?");

		int amount = liger.nextDouble();

		balance -= amount;
	}

	public void deposit(){
		Scanner seuss = new Scanner(System.in);

		System.out.println("how much would you like to deposit?");

		int amount = seuss.nextDouble();

		balance += amount;
	}

}