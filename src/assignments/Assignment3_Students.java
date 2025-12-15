package assignments;

public class Assignment3_Students {
	
	// Students  Names
    String stuName1 = "Bharath";
    String stuName2 = "John";
    String stuName3 = "Aarav";

    // Students  IDs
    int stuId1 = 1234;
    int stuId2 = 1235;
    int stuId3 = 1236;

    // Getter methods for names
    public String[] getStudentNames() {
        return new String[]{stuName1, stuName2, stuName3};
    }

    // Getter methods for IDs
    public int[] getStudentIds() {
        return new int[]{stuId1, stuId2, stuId3};
    }
}

