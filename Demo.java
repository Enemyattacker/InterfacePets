package ru.stetsenko;

/**
 * Демо-класс, демонстритующий интерфейс Pets.
 *
 * @Author Стеценко Алексей
 */
public class Demo {
    public static void main(String[] args) {
        Dog tuzik = new Dog();
        System.out.println(tuzik);
        Cat murka = new Cat();
        System.out.println(murka);
        Cow glasha = new Cow();
        System.out.println(glasha);
        Chicken tsypa = new Chicken();
        System.out.println(tsypa);

    }
}
