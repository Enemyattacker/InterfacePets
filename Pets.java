package ru.stetsenko;

/**
 * @Author Стеценко Алексей
 *
 * Интерфейс Pets.
 */
public interface Pets {
    /**
     * typeOfAnimal() - метод, задающий тип животного
     * nameOfAnimal() - метод, задающий имя животного
     * voiceOfAnimal() -метод, задающий говор животного
     * toString() - метод вывода
     */
    String typeOfAnimal();
    String nameOfAnimal() ;
    String voiceOfAnimal();
    String toString();
}
