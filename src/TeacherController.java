
import java.util.List;

public class TeacherController implements TeacherControllerInterface{
    private TeacherViewInterface teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, Integer teacherID) {
        Teacher newTeacher = new Teacher(firstName, secondName, teacherID);
    }
    public void printConsole(List<Teacher> teacherList){
        teacherView.naPechat(teacherList);
    }
}