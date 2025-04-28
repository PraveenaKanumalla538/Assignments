package assignmentsjava;

public class Assignment_BankTransactions {
		    public static void main(String[] args) {
	        int[] transactions = {50000, -2000, 3000, -15000, 200, -300, 4000, -3000};

	        int creditCount = 0;
	        int debitCount = 0;
	        int totalCredit = 0;
	        int totalDebit = 0;
	        int suspiciousCount = 0;

	        for (int amount : transactions) {
	            if (amount > 0) {
	                creditCount++;
	                totalCredit += amount;
	            } else {
	                debitCount++;
	                totalDebit += amount; // totalDebit will be negative
	            }

	            if (amount >= 10000 || amount <= -10000) {
	                System.out.println("Suspicious transaction detected with amount: " + amount);
	                suspiciousCount++;
	            }
	        }

	        int remainingBalance = totalCredit + totalDebit;

	        System.out.println("\nSummary:");
	        System.out.println("Total number of credit transactions: " + creditCount);
	        System.out.println("Total number of debit transactions: " + debitCount);
	        System.out.println("Total credited amount: " + totalCredit);
	        System.out.println("Total debited amount: " + totalDebit);
	        System.out.println("Remaining balance: " + remainingBalance);
	        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
	    }
	} 

