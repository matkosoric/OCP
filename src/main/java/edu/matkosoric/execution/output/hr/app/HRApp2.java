package edu.matkosoric.execution.output.hr.app;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class HRApp2 {

    // this version compiles
    // instead of var it uses List<Employee>
    // and contains return statement

    List<Employee> employee = new ArrayList<Employee>();

    public List<Employee> display() {

        var employee = new Employee();
        var offices = new ArrayList<>();
        offices.add("Chicago");
        offices.add("Bangalre");
        for (var office : offices) {
            System.out.print("Employee location: " + office);
        }

        return null;

    }

}
