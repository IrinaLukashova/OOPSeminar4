package main.java.ru.gb.oseminar.data;

import java.time.LocalDate;

public class StudentMan extends Student{
    public StudentMan(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public StudentMan(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth, studentId, "man");
    }
}
