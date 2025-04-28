package assignmentsjava;
import java.util.HashMap;
import java.util.Map;
public class Assignment_5CollectionsExceldata_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        Map<String, Map<String, String>> productDetails = new HashMap<>();

     // Adding 3 rows manually
        
        Map<String, String> r1 = new HashMap<>();//r1 - row1
        r1 .put("Product ID", "P001");
        r1 .put("Name", "Laptop");
        r1 .put("Category", "Electronics");
        r1 .put("Price", "$1200");
        r1 .put("Stock Quantity", "50");
        r1 .put("Supplier", "Tech Supplied");
        
        r1 .put("Warranty", "2 years");        
        r1.put("Rating", "4.5");
        r1.put("Manufacturing Date", "1/15/2023");
        r1.put("Expiry Date", "1/15/2025");

        Map<String, String> r2 = new HashMap<>();
        r2.put("Product ID", "P002");
        r2.put("Name", "Desk Chair");
        r2.put("Category","Furniture");
        r2.put("Price", "$150");
        r2.put("Stock Quantity", "60");
        r2.put("Supplier","Office Depot");
        r2.put("Warranty","1 year");
        r2.put("Rating","4.0");
        
        r2.put("Manufacturing Date", "2/10/2023");
        r2.put("Expiry Date","N/A");

        Map<String, String> r3 = new HashMap<>();
        r3.put("Product ID", "P003");
        r3.put("Name", "Coffee Maker");
        r3.put("Category", "Kitchen");
        r3.put("Price", "$75");
        r3.put("Stock Quantity", "80");
        r3.put("Supplier", "KitchenWorld");
        r3.put("Warranty", "6 months");
        r3.put("Rating", "4.2");
        r3.put("Manufacturing Date", "3/20/2023");
        r3.put("Expiry Date", "3/20/2024");

        // Storing in main map
        productDetails.put("POO1", r1);
        productDetails.put("P002", r2);
        productDetails.put("P003", r3);

        // Now, print the row where Supplier = "Office Depot"
        for (Map.Entry<String, Map<String, String>> entry : productDetails.entrySet()) {
            Map<String, String> dataRow = entry.getValue();
            if ("Office Depot".equalsIgnoreCase(dataRow.get("Supplier"))) {
                System.out.println("Data for Supplier 'Office Depot'");
                for (Map.Entry<String, String> innerEntry : dataRow.entrySet()) {
                    System.out.println(innerEntry.getKey() + " : " + innerEntry.getValue());
                }
            }
        }
    }
} 
	
