package main.java.ru.gb.oseminar.view;

import main.java.ru.gb.oseminar.data.User;

import java.util.List;

public class UserView<T extends User>{
    public Printer printer;

    public void sendToPrint(List<T> list, Printer printer){
        printer.print();
        System.out.println(list + "напечатан в" + printer);
    };
}
