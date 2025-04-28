package assignmentsjava;
import java.util.*;
public class Assignment_4Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

          // 1. Create List of top 5 largest cities' areas
		
		
        List<Double> cityAreas = Arrays.asList(603.4, 468.7, 1214.9, 789.5, 1302.0); // Example areas
        double totalArea = cityAreas.get(2) + cityAreas.get(3); // 3rd and 4th cities (index2 and index3)
        System.out.println("Total area of 3rd and 4th largest cities combined: " + totalArea + " sq km");

        System.out.println();

          // 2 Create Set of top 10 most visited tourist attractions
                   Set<String> touristAttractions = new HashSet<>(Arrays.asList("Eiffel Tower", "Great Wall of China", "Statue of Liberty", "Machu Picchu",
            "Colosseum", "Christ the Redeemer", "Taj Mahal", "Disneyland", "Times Square", "Louvre Museum"
        ));
                   
        System.out.println("Top 10 Most Visited Tourist Attractions:");
        
        for (String attraction : touristAttractions) {
            System.out.println(attraction);
        }
        System.out.println("Total number of tourist attractions: " + touristAttractions.size());

        System.out.println();
        
        
          // 3. Create an array of 10 numbers and find average of 5th and 6th values
        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double average = (numbers[4] + numbers[5]) / 2.0; // 5th and 6th elements (index4 and index5)
         System.out.println("Average of 5th and 6th numbers: " + average);
 
        System.out.println();

        // 4. List of top 5 highest-grossing movies of all time and print out the third movie
        
        List<String> topMovies = Arrays.asList("Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens", "Avengers: Infinity War"
        );
          System.out.println("The third highest-grossing movie is: " + topMovies.get(2));
    }
} 

	
