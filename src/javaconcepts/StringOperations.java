package javaconcepts;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String Value= " Username: Praveena | Password: Veena@123 ";
//To Calculate Length of the string ->> length()
System.out.println("The total characters in the Given string is:"+Value.length());
// To Print the particular Character with in a string ->> charAt(index number)
System.out.println("The Character available at index 5 is:" +Value.charAt(5));
//Reverse the string
String reverseString="";
for(int i=Value.length()-1;i>=0;i--) {
reverseString= reverseString+Value.charAt(i);
	}
System.out.println(reverseString);
//Remove unwanted spaces from the string ->> String.trim()
System.out.println("normal value: "+Value);
System.out.println("trim value  : "+Value.trim());
//Remove all spaces from the string ->> String.replace(old chars, new chars)
System.out.println("Value with out spaces:"+Value.replace(" ",""));
// Remove all Alphabets from the string ->> String.replaceALL(regular Expression, new chars);
System.out.println("With out Alphabets:"+Value.replaceAll("[a-zA-Z]",""));
//Remove all numbers from the string ->> String.replaceALL(regular Expression, new chars);
System.out.println("With out Numbers:"+Value.replaceAll("[0-9]",""));
//Remove all Special characters from the string ->> String.replaceALL(regular Expression, new chars);
System.out.println("With out Special characters:"+Value.replaceAll("[0-9a-zA-Z]",""));
//Change the case of the character in string->>String.toUppercase(), String.toLowercase()
System.out.println("Normal Value:"+Value);
System.out.println("Uppercase Value:"+Value.toUpperCase());
System.out.println("Lowercase Value:"+Value.toLowerCase());
//Extract Part of the string->> Value.substring(BegininningIndex); Value.substring(BegininningIndex, ending Index+1);-->Static
System.out.println("User name is:"+Value.substring(11,19));
//Dynamic- extract Part of the string from dynamic text->> Value.split(expression);
String[] splittedtext= Value.split("");
System.out.println(splittedtext[14]);
System.out.println(splittedtext[11]);
//Compare String Values->>Equals(exact match),equalsIgnoreCase(Excat match)etc
String name="Praveena";
System.out.println(name.equals("Veena"));
System.out.println(name.equalsIgnoreCase("PRAVEENA"));
System.out.println(name.equals("praveena"));
System.out.println(name.contains("Veena"));
System.out.println(name.startsWith("Pra"));
System.out.println(name.endsWith("vee"));
//Join the strings together ->> Concatenation-->String.concat("String");
System.out.println(name.concat("Sarma"));
//String is Empty or Blank
}
}

