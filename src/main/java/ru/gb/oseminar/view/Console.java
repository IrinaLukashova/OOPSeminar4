package main.java.ru.gb.oseminar.view;

public class Console implements Printer{

    @Override
    public void print() {
        System.out.println("Печатаем в консоль");
    }
}
