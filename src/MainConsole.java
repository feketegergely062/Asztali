/*
* File: MainCosole.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1 N
* Date: 2023-02-13
* Github: https://github.com/feketegergely062/
* Licenc: GNU GPL
*/
 
import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        System.out.println("Feladat 301");
        String radiusStr = input("Sugár: ");
        String heightStr = input("Magasság: ");
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Cone cone = new Cone();
        System.out.println(cone.calcVolume(radius,height ));

    }
    public String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg+" ");
        String text = scanner.nextLine();
        return text;

    }
    public void about(){
        this.about();
        System.out.println("-----------");
        System.out.println("Fekete Gergely");
        System.out.println("Szoft I-1 N");
        System.out.println("2023-02-13");
        System.out.println("-----------");
    }
}
   

