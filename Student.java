public class Student {
    static int computeCount;

    int id;
    String name;
    String gender;
    int age;
    short rank;
    long phone;
    float gpa;
    double Gpa;
    char degree;
    
    boolean international;
    double tutionFees=12000.0;
    double internationalFees=5000.0; 

    void compute(){
        computeCount=computeCount+1;
        if (international=true){
            tutionFees=tutionFees+internationalFees;
        }
        int nextId=id+1;
        System.out.println("\nid: " +id);
        System.out.println("nextid: " +nextId);
        System.out.println("age: " +age);
        System.out.println("name: " +name);
        System.out.println("gender: " +gender);
        System.out.println("rank: " +rank);
        System.out.println("phone: " +phone);
        System.out.println("gpa:  " +gpa);
        System.out.println("Gpa: " +Gpa);
        System.out.println("degree: " +degree);
        System.out.println("tutionFees: " +tutionFees);
        System.out.println("internationalFees: " +internationalFees);
        System.out.println("computeCount: " +computeCount);


    }
   public static void main(String[] args){
        Student student1=new Student();
        student1.id=1000;
        student1.name="john";
        student1.gender="male";
        student1.age=18;
        student1.rank=156;
        student1.phone=756789935;
        student1.gpa=8.0f;
        student1.Gpa=8.0d;
        student1.degree='B';
        student1.international=false;
        student1.compute();

        Student student2=new Student();
        student2.id=1001;
        student2.name="junnu";
        student2.gender="male";
        student2.age=18;
        student2.rank=157;
        student2.phone=756709935;
        student2.gpa=8.2f;
        student2.Gpa=8.2d;
        student2.degree='M';
        student2.international=false;
        student2.compute();

        Student student3=new Student();
        student3.id=1002;
        student3.name="junnu";
        student3.gender="male";
        student3.age=18;
        student3.rank=157;
        student3.phone=756709935;
        student3.gpa=8.2f;
        student3.Gpa=8.2d;
        student3.degree='M';
        student3.international=false;
        student3.compute();
    }
    
}
