import java.util.ArrayList;
import java.util.UUID;

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


    public static void main(String [] args) {


        ArrayList<Pets> petlist = new ArrayList<Pets>();
        petlist.add(new Pets(1329, "Tortic", "Mark", 300));
        petlist.add(new Pets(3218, "Sonya", "Arch", 1200));
        petlist.add(new Pets(1324, "Iris", "Kate", 3000));
        petlist.add(new Pets(9876, "Peach", "Adele", 8000));

        System.out.println(petlist);
//        Pets petsarr = new Pets(petlist);
//        System.out.println(petsarr);
        petlist.add(addPet());
        System.out.println(petlist);
    }

    public static Pets addPet() {

        Pets newpet = new Pets(0000,"Barsik","MisterX", 2800);
//        System.out.println(newpet);
        return newpet;

    }

}
