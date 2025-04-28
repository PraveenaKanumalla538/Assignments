package assignmentsjava;

 class Employees
{
	// Initializing the variables
	String emp1Name= "Bharath";
	String emp2Name= "ABC";
	String emp3Name= "XYZ";
	int emp1id = 1234;
	int emp2id = 1235;
	int emp3id = 1236;
	}	


public class Assignment3_EmpGroups {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			{
			// Storing the empnames and ids in 2 arrays

			Employees e1 = new Employees();
			String[] names = new String[3];
			int[] ids = new int[3];
			names[0] = e1.emp1Name;
			names[1] = e1.emp2Name;
			names[2] = e1.emp3Name;
			ids[0] = e1.emp1id; 
			ids[1] = e1.emp2id;
			ids[2] = e1.emp3id;
			System.out.println ("Employee Name: " + names[0]+","+"Employee ID: " + ids[0]);
			System.out.println ("Employee Name: " + names[1]+",Employee ID: " + ids[1]);
			System.out.println ("Employee Name: " + names[2]+",Employee ID: " + ids[2]);
			
			
			}
	}

}
 	