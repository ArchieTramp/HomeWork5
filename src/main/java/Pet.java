import java.util.ArrayList;

public class Pet {
    public Pet(String petName, String personName, int weight) {
        this.petName = petName;
        this.personName = personName;
        this.weight = weight;
    }
    private String petName;
    private String personName;
    private int weight;

    @Override
    public String toString() {
        return petName + " " + personName + " " +  weight;
    }

    public static void main(String [] args) {


        ArrayList<Pet> petlist = new ArrayList<Pet>();
        petlist.add(new Pet("Tortik","Mark", 300));
        petlist.add(new Pet("Sonya", "Arch",  1400));
        petlist.add(new Pet("Iris", "Kate",  4500));
        petlist.add(new Pet("Peach", "Adele",  8000));

        System.out.println(petlist);

    }


}
