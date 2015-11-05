package ru.stetsenko;

/**
 * Класс Корова
 *
 * @Author Стеценко Алексей
 */
public class Cow implements Pets{
    @Override
    public String typeOfAnimal(){
        return "Коровка ";
    }

    public String nameOfAnimal(){
        return "Глаша ";
    }

    public String voiceOfAnimal(){
        return " Му-Му";
    }

    public String toString(){
        return (typeOfAnimal() + nameOfAnimal() + "говорит" + voiceOfAnimal());
    }
}
