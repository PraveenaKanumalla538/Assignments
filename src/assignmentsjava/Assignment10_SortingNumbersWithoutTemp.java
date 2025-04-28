package assignmentsjava;

public class Assignment10_SortingNumbersWithoutTemp {

   public static void main(String[] args) {
	        int[] numbers = {12, 34, 11, 36, 87, 98, 93};

	        int firstLargest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        int thirdLargest = Integer.MIN_VALUE;

	        for (int num : numbers) {
	            if (num > firstLargest) {
	                thirdLargest = secondLargest;
	                secondLargest = firstLargest;
	                firstLargest = num;
	            } else if (num > secondLargest && num < firstLargest) {
	                thirdLargest = secondLargest;
	                secondLargest = num;
	            } else if (num > thirdLargest && num < secondLargest) {
	                thirdLargest = num;
	            }
	        }

	        System.out.println("Second largest number: " + secondLargest);
	        System.out.println("Third largest number: " + thirdLargest);
	    }
}