public class Main {
    public static  void main (String[] args){
        Student student = new Student("Saranya", 'C', 3);

        System.out.println("Name :"+student.getName());
        System.out.println("Grade: "+student.getGrade());
        System.out.println("Upgrading grade");
        student.upgrade();
        System.out.println("Grade after upgrading : " +student.getGrade());
        System.out.println("Downgrading grade");
        student.downgrade();
        System.out.println("Grade after downgrade : " +student.getGrade());

    }
}
