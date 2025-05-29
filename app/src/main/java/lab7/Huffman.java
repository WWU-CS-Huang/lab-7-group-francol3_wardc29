// Author(s): Lu Franco, Cooper Ward
// Date: 5/29
// Purpose: Decode and Encode into Binary/Strings


package lab7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.BitSet;


public class Huffman {
    
    /*
     * Using HashMap as a Temporary Tree; Want to use 
     * A Heap but lowkey forgot how to import that
     */
    HashMap<String,Integer> hashMap = new HashMap<>(); 

    /*
     * takes the tree and the encoded bit string and spits
     * out a real string. idk
     */
    private static String decode(HashMap<String, Integer> tree, BitSet encoded){
        throw new UnsupportedOperationException();
    }

    /*
     * similar to decode but now we have to encode it
     * the write up says to use BitSet and then return
     * the binary out put as a string
     * 
     * also says to use a string builder? 
     */
    private static String encode(HashMap<String, Integer> tree, String input){
        throw new UnsupportedOperationException();
    }

    /*
     * lowkey lost on this one. maybe it needs
     * to be a map/array list so it can store
     * characters and int frequencies?
     * sorts that by frequency using one of sorting methods??
     */
    private static int frequency(String input){
        throw new UnsupportedOperationException();
    }

    /*
     * we have to compare the decode to the input
     * maybe use a tostring to make decode a string
     */
    private static boolean checkEqual(BitSet decode, String input){
        if (decode.equals(input)){
            return true;
        } else {
            return false;
        }
    }

    /* 
     * program to return ratio in the write up
     */
    private static float findRatio(BitSet encoded, String input){
        throw new UnsupportedOperationException();
    }

    /*
     * we need to make main print all this stuff out
     */
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
