package edu.matkosoric.streams.employee.unique;

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
