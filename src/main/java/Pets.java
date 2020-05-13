import java.util.*;
import java.util.stream.Collectors;

class Pets implements Comparable<Pets> {

    public Map<String, Pet> petMap = new HashMap<String, Pet>();
    public Map<Integer, Pet> idpetMap = new HashMap<Integer, Pet>();

    public static void main(String[] args) {

        Pets pets = new Pets();
        List<Pet> petList = new ArrayList<>();

        petList.add(new Pet("Mark", 800));
        petList.add(new Pet("Arch", 1400));
        petList.add(new Pet("Kate", 4500));
        petList.add(new Pet("Adele", 8000));

        Pet[] array = petList.toArray(new Pet[0]);
        System.out.println(Arrays.toString(array));



        pets.petMap.put("Tortic", petList.get(0));
        pets.petMap.put("Sonya", petList.get(1));
        pets.petMap.put("Iris", petList.get(2));
        pets.petMap.put("Peach", petList.get(3));


        pets.idpetMap.put(1147, petList.get(0));
        pets.idpetMap.put(2289, petList.get(1));
        pets.idpetMap.put(9678, petList.get(2));
        pets.idpetMap.put(4876, petList.get(3));


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
