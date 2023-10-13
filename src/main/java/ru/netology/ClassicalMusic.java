package ru.netology;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    // создаем фабричный метод, паттерн фабричного метода
    // он должен быть обязательно static
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
