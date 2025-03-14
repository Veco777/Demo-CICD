import java.util.Scanner;
import java.util.Random;
import java.lang.Character;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    

    public static void main(String[] args) {
        item s = new item();
        
        System.out.println(s);
        /* Exercise 1 = Pyramid Number pattern */
        /* for (int x = 1; x <= 4; x++) {
            
            int w = 1 + (x -1)*2;
            for (int y =0; y < 5-x; y++) {
                System.out.print(" ");
            } 
            for (int y =0; y < w; y++) {
                System.out.print("*");
            } 
            for (int y =0; y < 5-x; y++) {
                System.out.print(" ");
            } 
            System.out.println();

        }; */
        
        /* Exercise 2 = Square */
        /* int length = 6; int height = 12;
        for (int i =0; i < height;i++) {
            if (i == 0 || height - i == 1) {
                for (int j = 0; j < length; j++) {
                    System.out.print("* ");
                }
            } 
            else {
                for (int k = 0; k< length;k++) {
                    if (k == 0 || length - k == 1) {
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
            }
            System.out.println();
        } */

        /* Exercise 3 = Number Pattern */

    };

    int x;

}