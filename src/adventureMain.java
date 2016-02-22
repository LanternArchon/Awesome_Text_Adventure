import java.util.Scanner;

public class adventureMain {
    public static void adventure() {
        Player player = new Player();
        setup(player);
    }

    private static void setup(Player player) {
        System.out.println("Enter your character name: ");
        Scanner keyboard = new Scanner(System.in);
        player.setName(keyboard.next());
        System.out.println("Do you want to use the deafault stats? y/n");
        if (keyboard.hasNext("y")) {
            showPlayerStats(player);
        } else if (keyboard.hasNext("n")) {
            keyboard= new Scanner(System.in);
            System.out.println("Enter " + player.getName() + "'s HP: ");
            player.setHP(keyboard.nextInt());
            showPlayerStats(player);
        }

    }

    public static void showPlayerStats(Player player) {
        System.out.println("Here are your stats");
        System.out.println(
                "Name: " + player.getName() + "\nHP: " + player.getHP() + "\nStrenght: " + player.getStrenght());
    }
}
