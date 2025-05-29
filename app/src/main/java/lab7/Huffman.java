// Author(s): Lu Franco, Cooper Ward
// Date: 5/29
// Purpose: Decode and Encode into Binary/Strings


package lab7;

import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Huffman {
    
    private static String decode(){
        throw new UnsupportedOperationException();
    }

    private static String encode(){
        throw new UnsupportedOperationException();
    }

    private static int frequency(){
        throw new UnsupportedOperationException();
    }

    
    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return;
        }
    scanner.close();
    }
}
