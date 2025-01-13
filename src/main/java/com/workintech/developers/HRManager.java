package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    //constructor
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    //method
    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 100);
    }

    public void addEmployee(JuniorDeveloper developer) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println("JuniorDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("No empty slot for JuniorDeveloper!");
    }

    public void addEmployee(JuniorDeveloper developer, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Index " + index + " is out of range for JuniorDeveloper!");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Slot " + index + " is already occupied by another JuniorDeveloper!");
            return;
        }
        juniorDevelopers[index] = developer;
        System.out.println("JuniorDeveloper added at index " + index);
    }


    public void addEmployee(MidDeveloper developer) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println("MidDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("No empty slot for MidDeveloper!");
    }

    public void addEmployee(MidDeveloper developer, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Index " + index + " is out of range for MidDeveloper!");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Slot " + index + " is already occupied by another MidDeveloper!");
            return;
        }
        midDevelopers[index] = developer;
        System.out.println("MidDeveloper added at index " + index);
    }


    public void addEmployee(SeniorDeveloper developer) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println("SeniorDeveloper added at index " + i);
                return;
            }
        }
        System.out.println("No empty slot for SeniorDeveloper!");
    }

    public void addEmployee(SeniorDeveloper developer, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Index " + index + " is out of range for SeniorDeveloper!");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Slot " + index + " is already occupied by another SeniorDeveloper!");
            return;
        }
        seniorDevelopers[index] = developer;
        System.out.println("SeniorDeveloper added at index " + index);
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
