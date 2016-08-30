package Zadaci_29_08_2016;

public class Zadatak5 {
	public static void main(String[] args) {

		try {
			Loan x = new Loan(-2, 12, 10);
		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException: " + ex.getMessage());
		}
	}

	class Loan {
		// Data fieldovi privatni
		private double annualInterestRate;
		private int numberOfYears;
		private double loanAmount;
		private java.util.Date loanDate;

		// Defaultni konstruktor
		public Loan() {
			this(2.5, 1, 1000);
		}

		// Konstruktor koji ima argumente intrate numofYears i posudjenu svotu

		public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
			if (loanAmount <= 0)
				throw new IllegalArgumentException("Posudjena svota mora biti veca od 0.");
			if (annualInterestRate <= 0)
				throw new IllegalArgumentException("Rata mora bit veca od 0.");
			if (numberOfYears <= 0)
				throw new IllegalArgumentException("Broj godina mora biti veci od 0.");

			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();
		}

		// Vracamo annualIntRate
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		// Postavljamo novu ratu
		public void setAnnualInterestRate(double annualInterestRate) {
			if (annualInterestRate <= 0)
				throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
			this.annualInterestRate = annualInterestRate;
		}

		// Vracamo broj godina
		public int getNumberOfYears() {
			return numberOfYears;
		}

		// Postavljamo novu broj godina
		public void setNumberOfYears(int numberOfYears) {
			if (numberOfYears <= 0)
				throw new IllegalArgumentException("numberOfYears must be greater than 0.");
			this.numberOfYears = numberOfYears;
		}

		// Posudjenu svotu novca
		public double getLoanAmount() {
			return loanAmount;
		}

		// Postavljamo novu posudjenu svotu
		public void setLoanAmount(double loanAmount) {
			if (loanAmount <= 0)
				throw new IllegalArgumentException("Posudjena svota morabiti veca od 0.");
			this.loanAmount = loanAmount;
		}

		// Pronalazimo mjesecnu isplatu
		public double getMonthlyPayment() {
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
			return monthlyPayment;
		}

		// Pronalazimo ukupnu placu
		public double getTotalPayment() {
			double totalPayment = getMonthlyPayment() * numberOfYears * 12;
			return totalPayment;
		}

		// Vracamo datum posudjivanja
		public java.util.Date getLoanDate() {
			return loanDate;
		}
	}

}
