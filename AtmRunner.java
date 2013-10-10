public class AtmRunner{
	
	private static Account account;

	public static void main(String[] args) {
		account = new Account("Joseph", 8180);
		account.initialBalance(5000.0);
		account.changeName();
		account.getName();
	}

}