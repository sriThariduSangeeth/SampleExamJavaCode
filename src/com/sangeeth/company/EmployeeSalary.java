package com.sangeeth.company;

/**
 * @author dtsangeeth
 * @created 11 / 03 / 2020
 * @project SampleExamJavaCode
 */
public class EmployeeSalary {

    private String empNuber;
    private String empName;
    private int attendCount;
    private float dailyWage;
    private int fullService;
    private float totalSalary;

    public EmployeeSalary(String empNuber, String empName, int attendCount, float dailyWage, int fullService) {
        this.empNuber = empNuber;
        this.empName = empName;
        this.attendCount = attendCount;
        this.dailyWage = dailyWage;
        this.fullService = fullService;

        calTotalSalary(dailyWage , attendCount );
    }

    private void calTotalSalary( float dailyWage , int attendCount) {

        this.totalSalary = dailyWage * (float) attendCount;
    }

    public float getTotalSalary(){
        return this.totalSalary;
    }

    public String getEmpName (){
        return this.empName;
    }

    public String getEmpNuber() {
        return this.empNuber;
    }

    public int getFullService (){
        return  this.fullService;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}

