/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseFour;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author AldyAkbarrizky
 */
public class CopyFile {

    public static void main(String[] args) {
        String fName;
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter File Name: ");
            fName = sc.nextLine();

            File oFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\CaseFour\\" + fName);
            try {
                sc = new Scanner(oFile);
                while(sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found, try again...");
            }
        }
    }
}