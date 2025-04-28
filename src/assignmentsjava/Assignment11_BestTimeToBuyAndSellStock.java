package assignmentsjava;

public class Assignment11_BestTimeToBuyAndSellStock {
		
	public static int maxProfit(int[] prices) {
		        if (prices == null || prices.length == 0) {
		            return 0;
		        }

		        int minPrice = prices[0];
		        int maxProfit = 0;

		        for (int i = 1; i < prices.length; i++) {
		            // Update minPrice if a lower price is found
		            if (prices[i] < minPrice) {
		                minPrice = prices[i];
		            }
		            // Calculate profit and update maxProfit if it's better
		            else if (prices[i] - minPrice > maxProfit) {
		                maxProfit = prices[i] - minPrice;
		            }
		        }

		        return maxProfit;
		    }

		    public static void main(String[] args) {
		        // Example 1
		        int[] prices1 = {7, 1, 5, 3, 6, 4};
		        System.out.println("Input: prices = [7, 1, 5, 3, 6, 4]");
		        System.out.println("Output: " + maxProfit(prices1));
		        System.out.println();

		        // Example 2
		        int[] prices2 = {7, 6, 4, 3, 1};
		        System.out.println("Input: prices = [7, 6, 4, 3, 1]");
		        System.out.println("Output: " + maxProfit(prices2));
		    }
		} 

		

	


