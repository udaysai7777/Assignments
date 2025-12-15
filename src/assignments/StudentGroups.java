package assignments;

public class StudentGroups {

	public static void main (String args[]) {
		
		  // Create Employees object
		Assignment3_Students stu = new Assignment3_Students();

        // Arrays to store students names and IDs
        String[] studentNames = stu.getStudentNames();
        int[] studentIds = stu.getStudentIds();

        // Print employee details
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Employee Name: " + studentNames[i]
                    + ", Employee ID: " + studentIds[i]);
        }
    }

	
}

