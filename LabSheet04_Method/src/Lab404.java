import java.util.*;

public class Lab404 {
	static String studentID,subjectCode;
    public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        //String studentID, subjectCode;
        boolean isStudentIDValid, isSubjectCodeValid;

        while (true) {
            // Input student ID
            System.out.print("Enter student ID (10 digits): ");
            studentID = scanner.nextLine();

            // Input subject code
            System.out.print("Enter subject code (7 digits): ");
            subjectCode = scanner.nextLine();

            // Check lengths of student ID and subject code
            isStudentIDValid = isLength(studentID, 10);
            isSubjectCodeValid = isLength(subjectCode, 7);

            if (isStudentIDValid && isSubjectCodeValid) {
                // Check student details
                boolean isITStudent = isITStudent(studentID);
                boolean isITSubject = isITSubject(subjectCode);

                // Display data
                displayData(isITStudent, isITSubject);
                break;
            } else {
                System.out.println("Invalid input! Student ID must be 10 digits and Subject Code must be 7 digits.");
            }
        }

        scanner.close();
    }

    public static boolean isLength(String input, int requiredLength) {
        return input.length() == requiredLength;
    }

    public static boolean isITStudent(String studentID) {
        return studentID.charAt(2) == '1' && studentID.substring(3, 6).equals("311");
    }

    public static boolean isITSubject(String subjectCode) {
        return subjectCode.startsWith("21") && subjectCode.charAt(4) == '1';
    }

    public static void displayData(boolean isITStudent, boolean isITSubject) {
        System.out.println();

        if (isITStudent) {
            System.out.println("Student id: " + studentID + " 1st year student in IT");
        } else {
            System.out.println("Student id: " + studentID + " is not 1st year student in IT");
        }


        if (isITSubject) {
            System.out.println("Enroll in courses for Year 1");
        } else {
            System.out.println("Not enroll in courses for Year 1");
        }
    }
}
