import java.util.*;

class Pets {
    private static final Object UID = UUID.randomUUID();
    private Object Pet;


    static HashMap<Object, Pet> petMap = new HashMap<Object, Pet>();

    public static void main(String [] args) {

        petMap.put(UID, new Pet("Tortic", "Mark", 800));
        petMap.put(UID, new Pet("Sonya", "Arch",  1400));
        petMap.put(UID, new Pet("Iris", "Kate",  4500));
        petMap.put(UID, new Pet("Peach", "Adele",  8000));

        for(Map.Entry<Object, Pet> entry: petMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
//        petMap.add(addPet());
//        sortPet();

    }


//    public static Pets addPet() {
//
//        Pets newpet = new Pets(0000,"Barsik","MisterX", 2800);
//        return newpet;
//    }
//
//    public static Pets sortPet() {
//        Collections.sort(petMap, new Comparator<Pets>() {
//            @Override
//            public int compare(Pets o1, Pets o2) {
//                return o1.toString().compareTo(o2.toString());
//            }
//        });
//        System.out.println(petMap);
//        return null;
//    }

}
