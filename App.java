import myFiles.Parent;

public class App {
    public static void main(String[] args) {
        Parent c = new Parent("Rashmi",46, new String[]{"Preet", "Pranay"});
        Parent d = new Parent("Bharath", 50, new String[]{"Preet", "Pranay"});

        System.out.println(c.getName() + " has " + c.numberOfchildren() + " children.");
        System.out.println(d.getName() + " has " + d.numberOfchildren() + " children.");
    }
}
