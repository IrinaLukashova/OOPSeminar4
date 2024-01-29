package main.java.ru.gb.oseminar.view;

import main.java.ru.gb.oseminar.data.Student;
import main.java.ru.gb.oseminar.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView extends UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendToPrint(List<Student> students, Printer printer) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
