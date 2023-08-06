import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void createStudentGroup(Teacher teacher, List<User> students){
        this.studentGroup = new StudentGroup(teacher, students);
    }
    public void createStudent(User user){
        studentGroup.createStudent(user);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
    public List<User> getStudentList(){
        return studentGroup.getStudentList();
    }
    public void getTeacher(){
        studentGroup.getTeacher();
    }
}