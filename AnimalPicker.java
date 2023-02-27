import java.util.Scanner;
public class AnimalPicker{

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        boolean validSelection = false;

        while (!validSelection){

            System.out.println("Would you like to see a Dog, Cat, Fish, or Bat? (Type '1' for Dog, '2' for Cat, '3' for Fish, '4' for Bat)");
            int animal = reader.nextInt();

            if(animal == 1){
                System.out.println("  ,_-~~~-,    _-~~-_\n /        ^-_/      \\_    _-~-.\n|      /\\  ,          `-_/     \\\n|   /~^\\ \'/  /~\\  /~\\   / \\_    \\\n \\_/    }/  /        \\  \\ ,_\\    }\n        Y  /  /~  /~  |  Y   \\   |\n       /   | {Q) {Q)  |  |    \\_/\n       |   \\  _===_  /   |\n       /  >--{     }--<  \\\n     /~       \\_._/       ~\\\n    /    *  *   Y    *      \\\n    |      * .: | :.*  *    |\n    \\    )--__==#==__--     /\n     \\_      \\  \\  \\      ,/\n       \'~_    | |  }   ,~\'\n          \\   {___/   /\n           \\   ~~~   /\n           /\\._._._./\\\n          {    ^^^    }\n           ~-_______-~\n            /       \\");
                validSelection = true;
            }
            else if (animal == 2){
                System.out.println(" ,_     _\n |\\\\_,-~/\n / _  _ |    ,--.\n(  @  @ )   / ,-\'\n \\  _T_/-._( (\n /         `. \\\n|         _  \\ |\n \\ \\ ,  /      |\n  || |-_\\__   /\n ((_/`(____,-\'");
                validSelection = true;
            }
            else if (animal == 3){
                System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
                validSelection = true;
            }
            else if (animal == 4){
                System.out.println("    =/\\                 /\\=\n    / \\\'._   (\\_/)   _.\'/ \\\n   / .\'\'._\'--(o.o)--\'_.\'\'. \\\n  /.\' _/ |`\'=/ \" \\=\'`| \\_ `.\\\n /` .\' `\\;-,\'\\___/\',-;/` \'. \'\\\n/.-\'       `\\(-V-)/`       `-.\\\n`            \"   \"            `");
                validSelection = true;
            }
            else {
                System.out.println("ERROR: Invalid Selection, Please try again.");
            }
        }    
        reader.close(); 
    }
}
