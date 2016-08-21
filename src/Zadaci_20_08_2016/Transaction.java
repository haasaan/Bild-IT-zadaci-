package Zadaci_20_08_2016;

import java.util.Date;

//Klasa transakcija
public class Transaction {
	private Date mDate; // Datum transakcije
	private char mType; // Tip transakcije da li je to withdraw ili deposit
						//

	private double mAmount; // Iznost transakcije
	private double mBalance; // Novi balans nove transakcije
	private String mDescription; // Te opis nove transakcije
	// Konstrktor sa argumentima

	public Transaction(char type, double amount, double balance, String description) {
		mType = type;
		mAmount = amount;
		mBalance = balance;
		mDescription = description;
		mDate = new Date();
	}

	// Pravimo getter i settere za sve fieldove
	public Date getDate() {
		return mDate;
	}

	public char getType() {
		return mType;
	}

	public double getAmount() {
		return mAmount;
	}

	public double getBalance() {
		return mBalance;
	}

	public String getDescription() {
		return mDescription;
	}

	// Zatim ispisujemo sve filedove tj transakciju
	@Override
	public String toString() {
		return "Type: " + mType + " Date: " + mDate + "Description: " + mDescription + "Amount: " + mAmount
				+ " Balance: " + mBalance + "\n";
	}
}
