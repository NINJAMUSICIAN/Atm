import java.util.Scanner;

public class Account{

		private int pin;
		private String name;
		private double balance;


	public Account(String name, int pin){

		this.pin = pin;
		this.name = name;
	}

	public void initialBalance(double money){balance = money;}

	public void withdraw(){
		Scanner liger = new Scanner(System.in);

		System.out.println("How much money would you like to withdraw?");

		double amount = liger.nextDouble();

		balance -= amount;
	}

	public void deposit(){
		Scanner seuss = new Scanner(System.in);

		System.out.println("How much would you like to deposit?");

		double amount = seuss.nextDouble();

		balance += amount;
	}

	public double checkBalance(){

		System.out.println("Your balance is " + balance);

		return balance;
	}

	public void changeName(){
		Scanner poetry = new Scanner(System.in);

		System.out.println("What would you like to change the account name to?");

		String newName = poetry.next();

		name = newName;
	}

	public String getName(){
		System.out.println("Your name is: " + name);
		return name;
	}

	public void changePin(){
		Scanner flow = new Scanner(System.in);

		if(checkPinCorrect()){

			System.out.println("What would you like to change your pin to? (cannot start with 0)");
			int newPin = flow.nextInt();
			pin = newPin;
			System.out.println("Your new pin number is: " + pin);
		}else{
			System.out.println("I'm sorry that is not the correct pin");
		}
	}

	// checks if user knows current pin
	public boolean checkPinCorrect(){
		boolean correctPassword;
		Scanner nachos = new Scanner(System.in);

		
		System.out.println("What is your current pin?");

		int password = nachos.nextInt();

		if(password == pin){
			correctPassword = true;
		} else {
			correctPassword = false;
		}

		return correctPassword;

	}


}