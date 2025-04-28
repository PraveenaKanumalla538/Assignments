package assignmentsjava;
import java.util.HashMap;
import java.util.Map;
public class Assignment_9ConditionalStatementsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    // Employee data
		        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		        double[] baseSalaries = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
		        double[] experiences = {5.1, 3.2, 7.1, 10.2, 2.4};
		        double[] ratings = {4.2, 3.8, 4.5, 2.5, 3.5};

		        // Result Map
		        Map<String, Double> hikePercentageMap = new HashMap<>();

		        for (int i = 0; i < names.length; i++) {
		            double baseSalary = baseSalaries[i];
		            double experience = experiences[i];
		            double rating = ratings[i];

		            double variablePayPercent = 0;
		            double bonus = 0;

		            // Determine variable pay % and bonus based on rating
		            if (rating >= 4.0) {
		                variablePayPercent = 15.0;
		                bonus = 1500;
		            } else if (rating >= 3.0 && rating < 4.0) {
		                variablePayPercent = 10.0;
		                bonus = 1200;
		            } else {
		                variablePayPercent = 3.0;
		                bonus = 300;
		            }

		            // Calculate hike
		            double variablePay = baseSalary * (variablePayPercent / 100.0);
		            double reward = (experience >= 5.0) ? 5000 : 0;
		            double totalHike = variablePay + bonus + reward;

		            // Calculate hike percentage
		            double hikePercent = (totalHike / baseSalary) * 100.0;

		            // Store in map
		            hikePercentageMap.put(names[i], hikePercent);
		        }

		        // Print the hike percentages
		        System.out.println("Employee Hike Percentages:");
		        for (Map.Entry<String, Double> entry : hikePercentageMap.entrySet()) {
		            System.out.println(entry.getKey() + " => " + String.format("%.2f", entry.getValue()) + "%");
		        }
		    }
		} 
	


