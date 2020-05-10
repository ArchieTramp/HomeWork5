import java.util.*;

class Pets implements Comparable<Pets> {

    public static Map<Integer, Pet> petMap = new HashMap<>();

    public static void main(String[] args) {

        petMap.put(1248, new Pet("Tortic", "Mark", 800));
        petMap.put(1578, new Pet("Sonya", "Arch", 1400));
        petMap.put(3690, new Pet("Iris", "Kate", 4500));
        petMap.put(4587, new Pet("Peach", "Adele", 8000));

        for (Map.Entry<Integer, Pet> entry : petMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.print("Задайте новый 4хзначный ID для животного - ");
        Scanner scan = new Scanner(System.in);
        int addID = scan.nextInt();
        petMap.put(addID, addPet());
        System.out.println(petMap);


        changePet();

//        searchPet();

        sortPet();



    }

    public static Pet addPet() {
        Pet newpet = new Pet("Cesar", "Ivan", 2000);
        return newpet;
    }

    public static void changePet() {
        petMap.put(1248, new Pet("Tortic", "Mark", 950));
        System.out.println(petMap);
    }

    public static void searchPet() {

    }

    public static void sortPet() {
        TreeMap<String, Pets> sorted = new TreeMap(petMap);
        System.out.println(sorted);

    }



    @Override
    public int compareTo(Pets o) {
        return 0;
    }
}
