import java.util.Arrays;
public class StudentsGPAscore {
    static double[] calculateGPA(int[] studentIdList, char[][] studentGrades){
        double[] gpaList = new double[studentIdList.length];
        int count=0;
        for(char[] studentGrade:studentGrades){
            double gpa=0.0;
            for(char grade:studentGrade){
                if(grade=='A'){
                    gpa=gpa+4.0;
                }
                else if(grade=='B'){
                    gpa=gpa+3.0;
                }
                else if(grade=='c'){
                    gpa=gpa+2.0;
                }
            }
            gpaList[count] = gpa/studentGrade.length;
			count++;
        }
        return gpaList;
    } 
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        if (lower < -1 || higher < -1 || lower > higher){
            return null;
        }
        double[] gpaList = StudentsGPAscore.calculateGPA(studentIdList, studentsGrades);
		
		int count = 0;
		for (double gpa : gpaList){
            if (gpa >= lower && gpa <= higher) {
				count++;
			}
        }
        int[] result = new int[count];
		int index = 0;
		for (int i = 0; i <  gpaList.length; i++){
            if (gpaList[i] >= lower && gpaList[i] <= higher) {
				result[index] = studentIdList[i];	
				index++;
			}
        }
        return result;

    }  
    public static void main(String[] args){
        int[] studentIdList={1,2,3,4};
        char[][] studentGrades={{'A','B','A','C'},{'A','B','B','A'},{'A','C','B','A'},{'C','A','A','A'}};
        double[] gpaList=calculateGPA(studentIdList, studentGrades);
        for(double gpa:gpaList){
            System.out.println(gpa);    
        }
        int[] filteredStudents = StudentsGPAscore.getStudentsByGPA(3.0, 4.0, studentIdList, studentGrades);
        System.out.println();
        System.out.println( Arrays.toString(filteredStudents));

        }
}
