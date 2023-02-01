import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private Character grade;
    private Integer group;
    private final String SECRET_NICKNAME = "MySecretNickName";

    private final List<Character> grades = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
    private final List<Integer> groups = Arrays.asList(1, 2, 3, 4, 5);

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName(){
        return name;
    }

    public char getGrade(){
        return grade;
    }

    public void downgrade(){
        grade = grades.get(grades.indexOf(grade) +1);
    }

    public void upgrade(){
        grade = grades.get(grades.indexOf(grade) -1);
    }
}
