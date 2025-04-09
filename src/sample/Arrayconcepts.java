package sample;

public class Arrayconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] empNames = new String [3];
		empNames[0]="Bharath";
		empNames[1]="Veena";
		empNames[2]="Rohan";
		//empNames[3]="Srikanth";
		System.out.println(empNames.length);
		System.out.println(empNames[0]);
// 3,2,4
		//company 1, project 2, employee 4 is Chaitra
		String [][][] companies= new String [3][2][4];
		companies[0][1][3]="Chaitra";
	    System.out.println(companies[0][1][3]);
	}

}
