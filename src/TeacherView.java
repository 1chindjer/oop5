
import java.util.List;

public class TeacherView implements TeacherViewInterface<Teacher> {
    @Override
    public void naPechat(List<Teacher> teacherList) {
        System.out.println("Список учителей: ");
        for (Teacher t: teacherList) {
            System.out.println(t);
        }

    }
}