/**
 * @author Artur Gilyazov
 * Разработать программу – картотеку домашних животных. У каждого животного есть уникальный идентификационный номер,
 * кличка, хозяин (объект класс Person с полями – имя, возраст, пол), вес.
 * Реализовать методы добавления, поиска, изменения и вывода на экран отсортированной информации.
 */

import java.util.*;

/**
 * Основной класс реализации
 */

class Pets {

    private Map<String, Pet> petMap = new HashMap<String, Pet>();
    private Map<Integer, Pet> idpetMap = new HashMap<Integer, Pet>();
    private List<Pet> petList = new ArrayList<>();
    private int z;

    /**
     * Метод добавления животного в список
     */

    public void addPet(Pet pet) {

        petList.add(pet);
        petMap.put(pet.getPetName(), pet);
        idpetMap.put(pet.setId(petList.size()), pet);
    }

    /**
     * Метод замены информации животного по кличке
     *
     * @return
     */

    private int findKey(Pet value) {
        return value.getId();
    }

    public void changePet(Pet pet) {

        String q = pet.getPetName();
        Pet w = petMap.get(q);
        z = findKey(w);


        idpetMap.put(z, pet);
        petMap.put(pet.getPetName(), pet);


    }


    /**
     * Метод поиска животного по кличке
     */

    public Pet searchPet(String petname) {

        System.out.print("Данные питомца - ");
        return petMap.get(petname);

    }

    /**
     * Метод сортировки и вывода данных
     */

    public void dump() {
        TreeMap<String, Pets> petsTreeMap = new TreeMap(petMap);
        TreeMap<Integer, Pets> petsidTreeMap = new TreeMap(idpetMap);

        for (Map.Entry<String, Pets> entry : petsTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (Map.Entry<Integer, Pets> entry : petsidTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }


}

/**
 * Класс реализующий создание данных о животном
 */

class Pet implements Comparable<Pet> {

    private final String petName;
    private final int weight;
    private final String personName;
    private int id;

    public Pet(String petName, String personName, int weight) {
        this.personName = personName;
        this.petName = petName;
        this.weight = weight;

    }

    public String getPetName() {
        return petName;
    }

    public String getPersonName() {
        return personName;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return petName + " " + personName + " " + weight;
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }
}

class Start {

    public static void main(String[] args) {

        Pets pets = new Pets();

        pets.addPet(new Pet("Tortic", "Mark", 800));
        pets.addPet(new Pet("Sonya", "Arch", 1400));
        pets.addPet(new Pet("Iris", "Kate", 4500));
        pets.addPet(new Pet("Peach", "Adele", 8000));
        pets.addPet(new Pet("Cesar", "Ivan", 12000));

        pets.dump();

        pets.changePet(new Pet("Sonya", "Arch", 950));

        pets.dump();

    }
}