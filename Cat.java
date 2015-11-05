package ru.stetsenko;

/**
 * Класс Кошка
 *
 * @Author Стеценко Алексей
 */
public class Cat implements Pets {
    @Override
    public String typeOfAnimal(){
            return "Кошечка ";
        }

    public String nameOfAnimal(){
            return "Мурка ";
        }

    public String voiceOfAnimal(){
            return " Мяу-Мяу";
        }

    public String toString(){
        return (typeOfAnimal() + nameOfAnimal() + "говорит" + voiceOfAnimal());
    }
}
