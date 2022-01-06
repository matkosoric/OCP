package edu.matkosoric.streams.employee.unique;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class Employee {

    private String name;
    private String locality;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getName() {
        return name;
    }

    public String getLocality() {
        return locality;
    }

    public Employee(String name, String locality) {
        this.name = name;
        this.locality = locality;
    }
}
