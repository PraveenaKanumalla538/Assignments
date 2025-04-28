package assignmentsjava;
class Students{
	//Initializing variables student names, Student Marks
		String Student1= "Suresh";
		String Student2= "Mahesh";
		String Student3= "Naresh";
		int S1marks = 75;
		int S2marks = 80;
		int S3marks = 82;
		
		int UpdatedMarks;
}
public class Assignment6_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Storing the Students names and marks in 2 arrays
Students s1= new Students();
String[] names = new String[3];
int marks[] = new int[3];
int UpdatedMarks[]= new int[names.length];
names[0]=s1.Student1;
names[1]=s1.Student2;
names[2]=s1.Student3;
marks[0]=s1.S1marks;
marks[1]=s1.S2marks;
marks[2]=s1.S3marks;

UpdatedMarks[0]=marks[0]+10;
UpdatedMarks[1]=marks[1]+10;
UpdatedMarks[2]=marks[2]+10;

// Average Marks of all students
double average=(UpdatedMarks[0]+UpdatedMarks[1]+UpdatedMarks[2])/3;

System.out.println("Updated Marks:" );
System.out.println(names[0]+ ":" + UpdatedMarks[0]);
System.out.println(names[1]+ ":" + UpdatedMarks[1]);
System.out.println(names[2]+ ":" + UpdatedMarks[2]);
System.out.println("Average Marks:"+average);
	}

}
