
public class adventureStartScreen {
    public static void main(String[] args) {
        System.out.println("Welcome to the Awesome Text Adventure\n\nPress enter"
                + " to Continue");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        adventureMain.adventure();
    }
}