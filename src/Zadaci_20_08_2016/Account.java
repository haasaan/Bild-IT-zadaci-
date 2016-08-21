package Zadaci_20_08_2016;

import java.util.ArrayList;
import java.util.Date;

//Klasa Account
public class Account {
	protected String mName;
	protected int mId;
	protected double mBalance;
	protected double mAnnualInterestRate; // AnnualInterestRate is percentage.
	protected Date mDateCreated;
	protected ArrayList<Transaction> mTransactions;

	// Novi konstruktor
	public Account() {
		// Pravimo danasnji datum
		mDateCreated = new Date();
		// Dodajemotransakcije na arraylistu
		mTransactions = new ArrayList<>();
	}

	// Konstruktor sa argumentima
	public Account(int id, double balance) {
		this();
		mId = id;
		mBalance = balance;
	}

	public Account(String name, int id, double balance) {
		this(id, balance);
		mName = name;

	}

	// Getter za ID
	public int getId() {
		return mId;
	}

	// Setter za ID
	public void setId(int id) {
		mId = id;
	}

	// Getter za Balance
	public double getBalance() {
		return mBalance;
	}

	// Setter za balance
	public void setBalance(double balance) {
		mBalance = balance;
	}

	// Getter za AnulaIntTare
	public double getAnnualInterestRate() {
		return mAnnualInterestRate;
	}

	// Setter za AnnIntRate
	public void setAnnualInterestRate(double annualInterestRate) {
		mAnnualInterestRate = annualInterestRate;
	}

	// Getter za datum
	public Date getDateCreated() {
		return mDateCreated;
	}

	// Getter za MonthlyIntRate
	public double getMonthlyInterestRate() {
		return mBalance * (mAnnualInterestRate / 12) / 100;
	}

	// Metoda koja racuna withdraw i dodaje na arraylist
	public void withdraw(double amount) {
		mTransactions.add(new Transaction('W', amount, mBalance, "withdraw"));
		mBalance -= amount;
	}

	// Metoda koja racuna depozit te dodaje na arraylist
	public void deposit(double amount) {
		mTransactions.add(new Transaction('D', amount, mBalance, "deposit"));
		mBalance += amount;
	}

	// Overridana metoda to string ispisuje nam ime iNtrested rate anuIntRate i
	// transakcije
	@Override
	public String toString() {
		return "Account name: " + mName + "\n" + "Interest rate: " + mAnnualInterestRate + "\n" + mTransactions;
	}

	public ArrayList<Transaction> getTransactions() {
		return new ArrayList<>(mTransactions);
	}

}
