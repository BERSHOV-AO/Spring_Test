package ru.netology;

// Применим "инверсион контрол" инверсию управления
public class MusicPlayer {
    // В качестве поля, в качестве зависимости у нас будет интерфейс Music
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // В аргументы конструктора, в конструктор мы будем передавать зависимости
    // IoC это пу сти и есть инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    // Создаем конструктор в ручную, так как в файле applicationContext.xml, мы используем setter для Dep. Injection
    // , а конструктор с параметрами не используем
    public MusicPlayer() {
    }

    // Внедрение зависимостей через setter setMusic(Music music)
    public void setMusic(Music music) {
        this.music = music;

    }

    // В данном методе и будем использовать внедренную зависимость
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
