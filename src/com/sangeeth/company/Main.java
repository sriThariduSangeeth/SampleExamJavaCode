package com.sangeeth.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dtsangeeth
 * @created 11 / 03 / 2020
 * @project SampleExamJavaCode
 */
public class Main {

    public ArrayList <EmployeeSalary>  employee = new ArrayList<>();
    public int empcount = 0 ;
    public Scanner scan ;

    public static void main(String[] args) {

        Main main = new Main();
        main.getValidEmployeeCount();

    }


    public void getValidEmployeeCount (){

        scan = new Scanner(System.in);

        do {
            System.out.println("Enter Number of Empolyees :");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid !!! - That's not a number!");
                System.out.println("Enter Number of Empolyees :");
                scan.next(); // this is important!
            }
            empcount = scan.nextInt();
            if(empcount <= 0 || empcount >= 101){
                System.out.println("Error !! You must enter employee 1 to 100. Try again !");
            }

        } while (empcount <= 0 || empcount >= 101);

        getEmployeeDetails(empcount);
    }

    private void getEmployeeDetails(int empcount) {

        scan = new Scanner(System.in);
        System.out.println("Fill each employee details ");

        for (int i = 0 ; i < empcount ; i++){


        }
    }


}
