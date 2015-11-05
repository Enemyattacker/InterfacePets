package ru.stetsenko;

/**
 * Класс Собачка
 *
 * @Author Стеценко Алексей
 */
public class Dog implements Pets {
    @Override
    public String typeOfAnimal(){
        return "Собачка ";
    }

    public String nameOfAnimal(){
        return "Тузик ";
    }

    public String voiceOfAnimal(){
        return " Гав-Гав";
    }

    public String toString(){
        return (typeOfAnimal() + nameOfAnimal() + "говорит" + voiceOfAnimal());
    }

}
