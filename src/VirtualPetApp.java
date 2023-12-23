import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of your pet: ");
        String name = scanner.nextLine();

        VirtualPet pet = new VirtualPet(name);
        int choice;
        do {
            pet.display();
            System.out.println("1) Feed pet");
            System.out.println("2) Give pet water");
            System.out.println("3) Play with pet");
            System.out.println("0) Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.thirst();
                    break;
                case 3:
                    pet.play();

                default:
                    break;
            }

        } while (choice != 0);
    }
}
