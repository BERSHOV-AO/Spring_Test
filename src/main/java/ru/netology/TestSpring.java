package ru.netology;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    /**
     * Когда мы внедряем зависимость с помощью setter'a, Spring создает объект musicPlayer
     * MusicPlayer musicPlayer = new MusicPlayer();
     * Использует пустой конструктор
     * Вызывает у обьекта musicPlayer setter, и в setter передает наш musicBean который был создан заранее!
     * musicPlayer.setMusic(musicBean);
     */
    public static void main(String[] args) {

        // ClassPathXmlApplicationContext - это класс обращается к файлу (applicationContext.xml), считываем его,
        // и помещает все бины которые описаны в ApplicationContext
        // Обязательно, переданная строчка в аргументы ClassPathXmlApplicationContext(), имя должно совпадать с фалом
        // applicationContext.xml (так мы его назвали), и файл обязательно должен лежать в папке resources -
        // resources данная папка обязательна должна быть помечена как Resources Root
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        // создаем наш MusicPlayer через контекст, и в метод получения бина указываем id - musicPlayer
//        // В качестве второго аргумента передаем сам класс MusicPlayer.class
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        // musicPlayer.playMusic();
//
//        //  System.out.println(musicPlayer.getName());
//        //  System.out.println(musicPlayer.getVolume());
//        // В конце, мы должны обязательно закрыть context
        context.close();
    }
}
