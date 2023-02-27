import java.util.Scanner;
public class AnimalPicker{

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        boolean validSelection = false;

        while (!validSelection){

            System.out.println("Would you like to see a Dog or a Cat? (Type '1' for Dog, '2' for Cat)");
            int animal = reader.nextInt();

            if(animal == 1){
                System.out.println("DOG ASCII ART HERE");
                validSelection = true;
            }
            else if (animal == 2){
                System.out.println("CAT ASCII ART HERE");
                validSelection = true;
            }
            else {
                System.out.println("ERROR: Invalid Selection, Please try again.");
            }
        }     
    }
}
