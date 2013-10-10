public class atm {
	
	// state
	private boolean userPresent;
	private boolean logIn;
	private boolean hasAccount;

	public atm(boolean userPresent, boolean logIn, boolean hasAccount) {
		String accounts[] = {"Bob", "Alice", "JT"};
		checkPresence(userPresent);
		checkLogin(logIn);
		checkAccount(hasAccount, "Bob", accounts);
	}

	public static void main(String[] args) {
		// User present, user is logged in, and user has an account
		atm atm = new atm(true, true, true);
		atm.login();
	}

	// behaviour
	
	public boolean login() {
		if (userPresent && logIn && hasAccount) {
			return true;
		} else {
			return false;
		}
	}

	public boolean userPresent() {
		return userPresent;
	}

	public void checkPresence(boolean userPresent) {
		this.userPresent = userPresent;
	}

	public boolean logIn() {
		return logIn;
	}

	public void checkLogin(boolean logIn) {
		this.logIn = logIn;
	}

	public boolean hasAccount() {
		return hasAccount;
	}

	public void checkAccount(boolean hasAccount, String entry, String[] account) {
		for (int i = 0; i<account.length; i++) {
			if (account[i] == entry) {
				this.hasAccount = hasAccount;
			}
		}
	}

}