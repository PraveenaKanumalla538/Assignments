package assignmentsjava;

public class Assignment7_ConditionalStatements_Bankloan {
	
			   	public class LoanEligibilityCheck {
		    	    public static void main(String[] args) {
		    	        String customerName = "John Doe";
		    	        int creditScore = 720;
		    	        double income = 55000.0;
		    	        boolean isEmployed = true;
		    	        double debtToIncomeRatio = 35.0;

		    	        boolean isEligible = false;

		    	     if (creditScore > 750) {
		    	            isEligible = true; // Loan automatically approved
		    	        } else if (creditScore >= 650 && creditScore <= 750) {
		    	            // Additional checks required
		    	            if (income >= 50000) {
		    	                if (isEmployed) {
		    	                    if (debtToIncomeRatio < 40) {
		    	                        isEligible = true; // Loan approved
		    	                    } else {
		    	                        isEligible = false; // Loan rejected due to high DTI
		    	                    }
		    	                } else {
		    	                    isEligible = false; // Loan rejected  due to unemployment
		    	                }
		    	            } else {
		    	                isEligible = false; // Loan rejected due to low income
		    	            }
		    	        } else {
		    	            isEligible = false; // Loan rejected due to low credit score
		    	        }

		    	       if (isEligible) {
		    	            System.out.println(customerName + " is eligible for the loan.");
		    	        } else {
		    	            System.out.println(customerName + " is not eligible for the loan.");
		    	        }
		    	    }
			   	}
			   	
}
