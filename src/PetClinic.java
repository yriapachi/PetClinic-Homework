import java.util.Scanner;

public class PetClinic {

    public static void main(String[] args) {

        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);

        Pet.pet();


        String answer = "Y";

        String[] speciesArrayPet = pet.getSpecies();
        String[] nameArrayPet = pet.getNames();
        int count = 0;

        while (answer.equals("Y")) {

            System.out.println("Enter the species of the pet you want the names of: ");
            String species = scanner.nextLine();
            for (int i = 0; i < 10; i++) {
                if (speciesArrayPet[i] != null && speciesArrayPet[i].equals(species)) {
                    System.out.println(nameArrayPet[i]);

                    count++;

                }
            }
            if (count == 0) {
                System.out.println("no pets found with species: " + species);
            } else {
                System.out.println(count + " " + species + " found.");
            }

            System.out.println("Do you want to continue? (Y/N)");
            answer = scanner.nextLine();
        }
    }}

