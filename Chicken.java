package ru.stetsenko;

/**
 * Класс цыплёнок
 *
 * @Author Стеценко Алексей
 */
public class Chicken implements Pets{
    @Override
    public String typeOfAnimal(){
            return "Цыплёнок ";
        }

    public String nameOfAnimal(){
            return "Цыпа ";
        }

    public String voiceOfAnimal(){
            return " Пи-Пи";
        }

    public String toString(){
        return (typeOfAnimal() + nameOfAnimal() + "говорит" + voiceOfAnimal());
    }
}
