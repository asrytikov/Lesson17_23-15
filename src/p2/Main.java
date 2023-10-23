package p2;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("Text.txt");
            file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.getParent());
            if (file.exists()){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

            if (file.canRead()){
                System.out.println("I can read");
            }
        }catch (IOException exception){}
    }

}
