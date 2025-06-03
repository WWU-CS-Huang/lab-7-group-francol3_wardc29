// Author(s): Lu Franco, Cooper Ward
// Date: 5/29
// Purpose: Decode and Encode into Binary/Strings


package lab7;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.NoSuchElementException; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.BitSet;


public class Huffman {
    
    // an inner class defining a node in a tree
    public static class TreeNode implements Comparable<TreeNode>{ 


        public char data ;
        public int freq;
        public TreeNode left;
        public TreeNode right;

        // node constructor changing all fields
        public TreeNode(char scan, int frequency, TreeNode l, TreeNode r){
            data = scan;
            freq = frequency;
            left = l;
            right = r;
        }

        // node constructor changing only frequency
        public TreeNode(int frequency){
            freq = frequency;
        }

        // a default constuctor
        public TreeNode(){}

        // adding the use of comparable
        // to easily compare frequencies when making
        // a tree
        public int compareTo(TreeNode compare){
            return freq - compare.freq;
        }
    }

    /*
     * Use a priority queue to build a tree, 
     * organize prority by frequency.
     */
    PriorityQueue<TreeNode> p = new PriorityQueue<>();

    /* ok so this is telling the tree to form
     *  by taking the top two nodes (highest freq)
     * and setting them as new nodes, which will
     * keep going until theres only 1 thing left.
     */
    static TreeNode generateTree(PriorityQueue<TreeNode> p){
        while (p.size() != 1){
            TreeNode left = p.poll();
            TreeNode right = p.poll();

            TreeNode newNode = new TreeNode(left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;

            p.add(newNode);
        }
        return p.poll();
    }

    /*
     * takes the tree and the encoded bit string and spits
     * out a real string(compliant bc the writeup
     * says to store the bitstring as a string of binary). idk
     */
    private static String decode(TreeNode tree, BitSet encoded){
        throw new UnsupportedOperationException();
    }

    /*
     * similar to decode but now we have to encode it
     * the write up says to use BitSet and then return
     * the binary out put as a string
     * 
     * also says to use a string builder? 
     */
    private static String encode(TreeNode tree, String input){
        throw new UnsupportedOperationException();
    }

    /*
     * lowkey lost on this one. maybe it needs
     * to be a map/array list so it can store
     * characters and int frequencies?
     * sorts that by frequency using one of sorting methods??
     */

     // new note: you can use mashable 
     // to build this. idk what that is but that is
     // what my gf said. soooo look into this
    private static int frequency(String input){
        throw new UnsupportedOperationException();
    }

    /*
     * we have to compare the decode to the input
     * maybe use a tostring to make decode a string
     */
    private static boolean checkEqual(String decode, String input){
        if (decode.equals(input)){
            return true;
        } else {
            return false;
        }
    }

    /* 
     * program to return ratio in the write up
     */
    private static double findRatio(BitSet encoded, String input){
        return encoded.length() / input.length() / 8.0;
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
