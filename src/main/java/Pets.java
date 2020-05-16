/**
 * @author Artur Gilyazov
 *Разработать программу – картотеку домашних животных. У каждого животного есть уникальный идентификационный номер,
 * кличка, хозяин (объект класс Person с полями – имя, возраст, пол), вес.
 * Реализовать методы добавления, поиска, изменения и вывода на экран отсортированной информации.
 */

import java.util.*;

/** Основной класс реализации */

class Pets {

    protected static Map<String, Pet> petMap = new HashMap<String, Pet>();
    protected static Map<Integer, Pet> idpetMap = new HashMap<Integer, Pet>();
    protected List<Pet> petList = new ArrayList<>();

    public static void main(String[] args) {

        Pets pets = new Pets();

        pets.petList.add(new Pet("Mark", 800));
        pets.petList.add(new Pet("Arch", 1400));
        pets.petList.add(new Pet("Kate", 4500));
        pets.petList.add(new Pet("Adele", 8000));


        petMap.put("Tortic", pets.petList.get(0));
        petMap.put("Sonya", pets.petList.get(1));
        petMap.put("Iris", pets.petList.get(2));
        petMap.put("Peach", pets.petList.get(3));

        idpetMap.put(1147, pets.petList.get(0));
        idpetMap.put(2289, pets.petList.get(1));
        idpetMap.put(9678, pets.petList.get(2));
        idpetMap.put(4876, pets.petList.get(3));

        for (Map.Entry<String, Pet> entry : petMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (Map.Entry<Integer, Pet> entry : idpetMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        pets.addPet();

        pets.searchPet();

        pets.changePet();

        pets.sortPet();

    }
/** Метод добавления животного в список*/

    public void addPet() {

        petList.add(new Pet("Ivan", 4500));
        petMap.put("Cesar", petList.get(4));
        idpetMap.put(2257, petList.get(4));
    }
/** Метод замены информации животного по кличке */

    public void changePet() {

        petList.set(0, new Pet("Mark", 950));
        petMap.put("Tortic", petList.get(0));
        idpetMap.put(1147, petList.get(0));
           }
/** Метод поиска животного по кличке */

    public void searchPet() {

        System.out.println(petMap.get("Tortic"));
    }
/** Метод сортировки и вывода данных */

    public void sortPet() {

        TreeMap<String, Pets> sorted = new TreeMap(petMap);
        TreeMap<String, Pets> sortedq = new TreeMap(idpetMap);
        System.out.println(sorted);
        System.out.println(sortedq);
    }

}
/** Класс реализует создание данных о животном */

class Pet implements Comparable<Pet>{
    public Pet(String personName, int weight) {
        this.personName = personName;
        this.weight = weight;
    }

    private final String personName;
    private final int weight;

    @Override
    public String toString() {
        return /* petName + " " +*/ personName + " " + weight;
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
