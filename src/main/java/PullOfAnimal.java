import java.util.*;
import java.util.stream.Collectors;

class Pets {
    private static Pets addPet;

    public Pets(long uid, String namePet, String namePerson, int weight) {

        this.uid = UUID.randomUUID();
        this.namePet = namePet;
        this.namePerson = namePerson;
        this.weight = weight;
    }
    private UUID uid;
    private String namePet;
    private String namePerson;
    private int weight;

    public Pets(ArrayList<Pets> petlist) {

    }

    @Override
    public String toString() {
        return uid + " " + namePet+ " " + namePerson+ " " + weight;
    }
    List<Pets> petlist = new ArrayList<Pets>();

    public static void main(String [] args) {



        petlist.add(new Pets(1329, "Tortic", "Mark", 300));
        petlist.add(new Pets(3218, "Sonya", "Arch", 1200));
        petlist.add(new Pets(1324, "Iris", "Kate", 3000));
        petlist.add(new Pets(9876, "Peach", "Adele", 8000));

        System.out.println(petlist);
        petlist.add(addPet());
        System.out.println(petlist);
//        petlist.contains(searchPet());
//        petlist.stream()
//                .filter(Pets -> Pets.namePet.equals("Peache"))
//                .collect(Collectors.toList());
        Collections.sort(petlist, new Comparator<Pets>() {
            @Override
            public int compare(Pets o1, Pets o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(petlist);


    }


    public static Pets addPet() {

        Pets newpet = new Pets(0000,"Barsik","MisterX", 2800);
        return newpet;

    }
    public static Pets searchPet() {


        return null;
    }
//    public static Pets setPet() {
//
//    }
//
//    public static Pets sortPet() {
//
//
//    }


}
