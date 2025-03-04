import java.util.Scanner;


public class Pet {

    static String[] speciesArray = new String[10];
    static String[] nameArray = new String[10];

    public String[] getSpecies() {
        return speciesArray;
    }

    public String[] getNames() {
        return nameArray;
    }


    public static void pet() {
        Scanner scanner= new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the species of the pet: ");
            speciesArray[i] = scanner.nextLine();


            System.out.println("Enter the name of the pet: ");
            nameArray[i] = scanner.nextLine();
        }
        {


        }

    }}

