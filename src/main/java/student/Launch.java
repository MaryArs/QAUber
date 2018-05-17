package student;

public class Launch {

    public static void main(String[] args){
        Student student1 = new Student("Marina", "aa", 1);
        Student student2 = new Student("Peter", "bb", 2);
        Student student3 = new Student("Val", "cc", 3);
        Student student4 = new Student("Eugene", "dd", 4);
        Student student5 = new Student("Nat", "ee", 5);
        Student studentArray[] = {student1,student2,student3,student4,student5};
        for ( int i = 0; i < studentArray.length; i++){
            System.out.println(studentArray[i].getName());
        }
    }
}
