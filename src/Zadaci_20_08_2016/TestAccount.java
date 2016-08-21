package Zadaci_20_08_2016;

public class TestAccount {

	public static void main(String[] args) {
		// Pozivamo klasu account te prosljedjujemo argumente
		Account account = new Account(1122, 20000);
		// Prosljedjujemo annualtIntRate
		account.setAnnualInterestRate(4.5);
		// Printamo ID Balance withdraww deposit
		System.out.println("Account ID: " + account.getId());
		System.out.println("Account Balance: " + account.getBalance());

		System.out.println("Withdrawing $2,500...");
		account.withdraw(2500);

		System.out.println("Depositing $3,000...");
		account.deposit(3000);
		// Printamo info,ID,Balans i mjesecnu ratu
		System.out.println("Displaying updated info.");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Account Balance: " + account.getBalance());
		System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
		System.out.println("Date account was created: " + account.getDateCreated());

	}

}
