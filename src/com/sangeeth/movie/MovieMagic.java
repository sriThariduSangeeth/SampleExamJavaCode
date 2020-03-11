package com.sangeeth.movie;

import java.util.Scanner;

/**
 * @author dtsangeeth
 * @created 12 / 03 / 2020
 * @project SampleExamJavaCode
 */
public class MovieMagic {

    private int year;
    private String title;
    private float rating;
    private Scanner scanner;

    public MovieMagic(){
        year = 0;
        title = "";
        rating = 0;

        scanner = new Scanner(System.in);

    }

    public void accept(){

        System.out.println("===========");
        System.out.println("Movie Magic");
        System.out.println("===========");

        System.out.println("Enter Titel :");
        title = scanner.next();

        System.out.println("Enter Year :");
        year = scanner.nextInt();

        System.out.println("Enter rating :");
        rating = scanner.nextFloat();

    }

    public void display(){

        System.out.println("Movie Title  -  " + this.title);

        if (0.0 >= rating || rating <= 2.0){
            System.out.println("Flop");
        }else if (2.1 >= rating || rating <= 3.4){
            System.out.println("Semi  Hit");
        }else if (3.5 >= rating || rating <= 4.5){
            System.out.println("Hit");
        }else if (4.6 >= rating || rating <= 5.0){
            System.out.println("Super Hit");
        }

    }

}
