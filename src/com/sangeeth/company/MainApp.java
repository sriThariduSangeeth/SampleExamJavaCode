package com.sangeeth.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dtsangeeth
 * @created 11 / 03 / 2020
 * @project SampleExamJavaCode
 */
public class MainApp {

    public ArrayList <EmployeeSalary>  employee = new ArrayList<>();
    public int empcount = 0 ;
    public Scanner scan ;

    public static void main(String[] args) {

        MainApp main = new MainApp();
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

        EmployeeSalary employeeSalary;
        int x = 1;
        scan = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Fill each employee details ");
        System.out.println("==========================");

        for (int i = 0 ; i < empcount ; i++){

            System.out.println("Fill Details Employee number - >  " + x);

            System.out.println("Enter Employee Number :");
            String number = scan.next();

            System.out.println("Enter Employee Name :");
            String name = scan.next();

            System.out.println("Enter Employee Attendance :");
            int attend = scan.nextInt();

            System.out.println("Enter Hourly Wage :");
            float wage = scan.nextFloat();

            System.out.println("Enter Years With Company :");
            int comYear = scan.nextInt();

            //this can write in one line
            //employeeSalary = new EmployeeSalary(number,name,attend,wage,comYear);
            //employee.add(employeeSalary);
            //like this
            employee.add( new EmployeeSalary(number,name,attend,wage,comYear) );
            System.out.println("Employee num "+x+ " added");
            x++;
        }

        System.out.println("============================");
        System.out.println("Display Employee Information");
        System.out.println("============================");
        int xx = 0;
        for ( EmployeeSalary em :employee) {
            if (em.getFullService() >= 20){

                System.out.println("Employee Number :" + em.getEmpNuber());
                System.out.println("Employee Name :" + em.getEmpName());
                System.out.println("Employee Total Salary :" + em.getTotalSalary());
                xx++;
            }

        }

        if(xx == 0 ){
            System.out.println("There is no records about employees who worked more than 20 years.");
        }
    }


}

