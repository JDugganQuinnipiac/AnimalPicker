import java.util.Scanner;
public class AnimalPicker{

    public static void main(String[] args){
        
        System.out.println("Would you like to see a Dog or a Cat? (Type '1' for Dog, '2' for Cat)");
        Scanner reader = new Scanner(System.in);
        int animal = reader.nextInt();
        reader.close();

        if(animal == 1){
            System.out.println("DOG ASCII ART HERE");
        }else if(animal == 2){
            System.out.println("CAT ASCII ART HERE");
        }else{
            System.out.println("Invalid selection");
        }
        }
}