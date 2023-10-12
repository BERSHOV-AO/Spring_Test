package ru.netology;

// Применим "инверсион контрол" инверсию управления
public class MusicPlayer {
    // В качестве поля, в качестве зависимости у нас будет интерфейс Music
    private Music music;

    // В аргументы конструктора, в конструктор мы будем передавать зависимости
    // IoC это пу сти и есть инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    // В данном методе и будем использовать внедренную зависимость
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
