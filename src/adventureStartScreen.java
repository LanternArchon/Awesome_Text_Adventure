
public class adventureStartScreen {
    public static void main(String[] args) {
        System.out.println("Welcome to the Awesome Text Adventure\n\nPress any key to Continue");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        adventureMain.adventure();
    }
}