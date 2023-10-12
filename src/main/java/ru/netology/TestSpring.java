package ru.netology;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // ClassPathXmlApplicationContext - это класс обращается к файлу (applicationContext.xml), считываем его,
        // и помещает все бины которые описаны в ApplicationContext
        // Обязательно, переданная строчка в аргументы ClassPathXmlApplicationContext(), имя должно совпадать с фалом
        // applicationContext.xml (так мы его назвали), и файл обязательно должен лежать в папке resources -
        // resources данная папка обязательна должна быть помечена как Resources Root
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Теперь, из applicationContext.xml нужно достать наш файл bean
        // С помощью метода getBean() у context. В аргументы getBean() передаем id нашего бина, который указан в
        // файле applicationContext.xml -> <bean id="testBean"
        // В качестве второго аргумента мы должны указать тот класс, объект которого мы хотим получить, в
        // данном случае TestBean.class
        // И кладем наш объект в переменную testBean
        TestBean testBean = context.getBean("testBean", TestBean.class);
        // У testBean вызываем метод getName(), что бы получить имя этого объекта.
        System.out.println(testBean.getName());
        // В конце, мы должны обязательно закрыть context
        context.close();
    }
}
