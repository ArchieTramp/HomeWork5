import java.util.ArrayList;
import java.util.List;

public class Pet {
    public Pet(/*String petName*/String personName, int weight) {
//        this.petName = petName;
        this.personName = personName;
        this.weight = weight;
    }
//    private String petName;
    private String personName;
    private int weight;

    @Override
    public String toString() {
        return /* petName + " " +*/ personName + " " +  weight;
    }

    public static void main(String [] args) {


        ArrayList<Pet> petlist = new ArrayList<Pet>();
        petlist.add(new Pet("Mark", 300));
        petlist.add(new Pet("Arch",  1400));
        petlist.add(new Pet( "Kate",  4500));
        petlist.add(new Pet( "Adele",  8000));

        System.out.println(petlist);

    }


}
