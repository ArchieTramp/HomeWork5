import java.util.*;
import java.util.stream.Collectors;

class Pets implements Comparable<Pets> {

    public Map<String, Pet> petMap = new HashMap<>();
    public Map<Integer, Pet> idpetMap = new HashMap<>();

    public static void main(String[] args) {

        Pets pets = new Pets();

        pets.petMap.put("Tortic", new Pet("Mark", 800));
        pets.petMap.put("Sonya", new Pet("Arch", 1400));
        pets.petMap.put("Iris", new Pet( "Kate", 4500));
        pets.petMap.put("Peach", new Pet( "Adele", 8000));


        pets.idpetMap.put(1147, new Pet("Mark", 800));
        pets.idpetMap.put(2289, new Pet("Arch", 1400));
        pets.idpetMap.put(9678, new Pet("Kate", 4500));
        pets.idpetMap.put(4876, new Pet("Adele", 8000));



        for (Map.Entry<String, Pet> entry : pets.petMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (Map.Entry<Integer, Pet> entry : pets.idpetMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }






//        pets.addPet();
//
//        pets.searchPet();
//
//        pets.changePet();
//
//        pets.sortPet();



    }

//    public void addPet() {
//
//        petMap.putIfAbsent(1147, new Pet("Cesar", "Ivan", 2000));
//        petsearchMap.putIfAbsent("Cesar", new Person("Ivan", "man", 45));
//    }
//
//    public void changePet() {
//
//        petMap.put(1248, new Pet("Tortic", "Mark", 950));
//        petsearchMap.put("Tortic", new Person("Mark", "man", 4));
//
//    }
//
//    public void searchPet() {
//
//
//
//    }
//
//    public void sortPet() {
//
//        TreeMap<String, Pets> sorted = new TreeMap(petMap);
//        TreeMap<String,Pets> sortedq = new TreeMap(petsearchMap);
//        System.out.println(sorted);
//        System.out.println(sortedq);
//    }



    @Override
    public int compareTo(Pets o) {
        return 0;
    }
}
