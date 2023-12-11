package ie.atu;
import java.util.Scanner;
public class Trawler {

    private string Name;
    private string TransponderID;
    private string Trawlertype;

    public Trawler(String name, String transponderID, String trawlertype) {
        Name = name;
        TransponderID = transponderID;
        Trawlertype = trawlertype;


    }
 public void getName(String Name) {
     System.out.println("enter a name:");
     Scanner myscan = new Scanner(System.in);

     String input = myscan.nextLine();
     int myName = Integer.parseInt(input);

     if (myName == Integer.parseInt("Rory")) {
         System.out.println("name:" + myName);
     } else {
         System.out.println("Name provided is not valid");
     }
 }
    public void getID(String ID) {
        System.out.println("enter a Transponder ID:");
        Scanner myscan = new Scanner(System.in);

        String input = myscan.nextLine();
        int mytid = Integer.parseInt(input);

        if (mytid == Integer.parseInt("12345678912")) {
            System.out.println("ID:" + mytid);
        } else {
            System.out.println("ID provided is not valid");
        }
    }
    public void getTrawler(String tr) {
        System.out.println("enter a trawler:");
        Scanner myscan = new Scanner(System.in);

        String input = myscan.nextLine();
        int mytr = Integer.parseInt(input);

        if (mytr == Integer.parseInt("freezer")) {
            System.out.println("trawler:" + mytr);
        }
        else if (mytr == Integer.parseInt("stern")) {
            System.out.println("trawler:" + mytr);
        }
        else if (mytr == Integer.parseInt("outrigger")) {
            System.out.println("trawler:" + mytr);
        }
        else {
            System.out.println("trawler provided is not valid");
        }
    }

    @Override
    public String toString() {
        return "Trawler{" +
                "Name=" + Name +
                ", TransponderID=" + TransponderID +
                ", Trawlertype=" + Trawlertype +
                '}';
    }
}
