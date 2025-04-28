package assignmentsjava;
import java.util.HashMap;
import java.util.Map;
public class Assignment_5CollectionsExceldata_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Simulating reading data from Excel into Map
        Map<String, Map<String, String>> productDetails = new HashMap<>();

        // Adding 3 rows manually
        Map<String, String> row1 = new HashMap<>();
        row1.put("Product ID", "P001");
        row1.put("Name", "Laptop");
        row1.put("Category", "Electronics");
        row1.put("Price", "$1200");
        row1.put("Stock Quantity", "50");
        row1.put("Supplier", "Tech Supplied");
        row1.put("Warranty", "2 years");
        row1.put("Rating", "4.5");
        row1.put("Manufacturing Date", "1/15/2023");
        row1.put("Expiry Date", "1/15/2025");

        Map<String, String> row2 = new HashMap<>();
        row2.put("Product ID", "P002");
        row2.put("Name", "Desk Chair");
        row2.put("Category", "Furniture");
        row2.put("Price", "$150");
        row2.put("Stock Quantity", "60");
        row2.put("Supplier", "Office Depot"); // Important
        row2.put("Warranty", "1 year");
        row2.put("Rating", "4.0");
        row2.put("Manufacturing Date", "2/10/2023");
        row2.put("Expiry Date", "N/A");

        Map<String, String> row3 = new HashMap<>();
        row3.put("Product ID", "P003");
        row3.put("Name", "Coffee Maker");
        row3.put("Category", "Kitchen");
        row3.put("Price", "$75");
        row3.put("Stock Quantity", "80");
        row3.put("Supplier", "KitchenWorld");
        row3.put("Warranty", "6 months");
        row3.put("Rating", "4.2");
        row3.put("Manufacturing Date", "3/20/2023");
        row3.put("Expiry Date", "3/20/2024");

        // Storing in main map
        productDetails.put("TC01", row1);
        productDetails.put("TC02", row2);
        productDetails.put("TC03", row3);

        // Now, print the row where Supplier = "Office Depot"
        for (Map.Entry<String, Map<String, String>> entry : productDetails.entrySet()) {
            Map<String, String> dataRow = entry.getValue();
            if ("Office Depot".equalsIgnoreCase(dataRow.get("Supplier"))) {
                System.out.println("Data for Supplier 'Office Depot':");
                for (Map.Entry<String, String> innerEntry : dataRow.entrySet()) {
                    System.out.println(innerEntry.getKey() + " : " + innerEntry.getValue());
                }
            }
        }
    }
} 
	
