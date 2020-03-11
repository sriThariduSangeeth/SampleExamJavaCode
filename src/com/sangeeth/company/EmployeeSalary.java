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

    public EmployeeSalary(String empNuber, String empName, int attendCount, float dailyWage, int fullService) {
        this.empNuber = empNuber;
        this.empName = empName;
        this.attendCount = attendCount;
        this.dailyWage = dailyWage;
        this.fullService = fullService;
    }


    @Override
    public String toString() {

        return super.toString();
    }
}
