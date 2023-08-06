import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Учитель 1", "отчество Учителя 2", 12345);
        Teacher teacher2 = new Teacher("Учитель 2", "Отчество учителя 222", 543345);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        TeacherGroup teachers = new TeacherGroup("Biology", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Учитель 1", "отчество Учителя 2", 12345);
        teacherController.create("Учитель 2", "Отчество учителя 222", 543345);

        teacherController.naPechat(teacherList);
    }
}