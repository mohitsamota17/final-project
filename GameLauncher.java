import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        MonsterManager manager = new MonsterManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Genetic Monsters Game ---");
            System.out.println("1. Create Monster");
            System.out.println("2. View Monsters");
            System.out.println("3. Save Monsters");
            System.out.println("4. Load Monsters");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter monster name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter monster color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter monster strength: ");
                    int strength = scanner.nextInt();
                    System.out.print("Enter monster speed: ");
                    int speed = scanner.nextInt();
                    System.out.print("Enter monster wingspan: ");
                    int wingSpan = scanner.nextInt();

                    Monster flyingMonster = new FlyingMonster(name, color, strength, speed, wingSpan);
                    manager.addMonster(flyingMonster);
                    break;

                case 2:
                    manager.displayMonsters();
                    break;

                case 3:
                    manager.saveAllMonsters("monsters_data.txt");
                    break;

                case 4:
                    manager.loadAllMonsters("monsters_data.txt");
                    break;

                case 5:
                    System.out.println("Exiting game...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
