package main.java.ru.gb.oseminar.controller;

import main.java.ru.gb.oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
