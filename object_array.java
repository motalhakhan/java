class student{
    String name;
    int age;
    int rollno;

}


public class object_array {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "talha";
        s1.age = 24;
        s1.rollno = 56;

        student s2 = new student();
        s2.name = "atif";
        s2.age = 23;
        s2.rollno = 34;

        student s3 = new student();
        s3.name = "ahad";
        s3.age = 18;
        s3.rollno = 1;
        System.out.println(s2);

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name + ": " + students[i].age +" and roll no. : " + students[i].rollno);
        }


    }
}
