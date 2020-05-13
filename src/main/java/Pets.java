import java.util.*;
import java.util.stream.Collectors;

class Pets implements Comparable<Pets> {

    public Map<String, Pet> petMap = new HashMap<String, Pet>();
    public Map<Integer, Pet> idpetMap = new HashMap<Integer, Pet>();
    public List<Pet> petList = new ArrayList<>();

    public static void main(String[] args) {

        Pets pets = new Pets();

        pets.petList.add(new Pet("Mark", 800));
        pets.petList.add(new Pet("Arch", 1400));
        pets.petList.add(new Pet("Kate", 4500));
        pets.petList.add(new Pet("Adele", 8000));

        Pet[] array = pets.petList.toArray(new Pet[0]);
        System.out.println(Arrays.toString(array));

        pets.stream.collect(Collectors.toMap());
        pets.strema.collect(Collectors.groupingBy());


        pets.petMap.put("Tortic", pets.petList.get(0));
        pets.petMap.put("Sonya", pets.petList.get(1));
        pets.petMap.put("Iris", pets.petList.get(2));
        pets.petMap.put("Peach", pets.petList.get(3));


        pets.idpetMap.put(1147, pets.petList.get(0));
        pets.idpetMap.put(2289, pets.petList.get(1));
        pets.idpetMap.put(9678, pets.petList.get(2));
        pets.idpetMap.put(4876, pets.petList.get(3));


        for (Map.Entry<String, Pet> entry : pets.petMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (Map.Entry<Integer, Pet> entry : pets.idpetMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        pets.addPet();

//        pets.searchPet();
//
        pets.changePet();
//
        pets.sortPet();



    }

    public void addPet() {

        petList.add(new Pet("Ivan", 4500));
        petMap.put("Cesar", petList.get(4));
        idpetMap.put(2257, petList.get(4));

    }

    public void changePet() {

        /*изменить эллемент массива пет*/
        petList.set(0, new Pet("Mark", 950));
        petMap.put("Tortic", petList.get(0));
        idpetMap.put(1147, petList.get(0));
           }
//
//    public void searchPet() {
//
//
//
//    }
//
    public void sortPet() {

        TreeMap<String, Pets> sorted = new TreeMap(petMap);
        TreeMap<String, Pets> sortedq = new TreeMap(idpetMap);
        System.out.println(sorted);
        System.out.println(sortedq);
    }



    @Override
    public int compareTo(Pets o) {
        return 0;
    }
}
