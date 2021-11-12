package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {



     public static int arraycreator(int i,int numcount, int mirrorlist[]) {
         Scanner input = new Scanner(System.in);

         while (i < numcount) {
             System.out.println("Input number "+i+" : ");
             int whilenum = input.nextInt();
             mirrorlist[i] = whilenum;
             i++;
         }
         return mirrorlist[10];
     }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// i haven't even written anything and i know this is gonna be painful.

        System.out.println("How many numbers do you want?");
        int numcount = input.nextInt();
        int i = 0;
        int mirrorlist[]=new int[10];
        System.out.println(mirrorlist.length);

        arraycreator(i,numcount,mirrorlist);

        System.out.println(mirrorlist);




        }




    }
