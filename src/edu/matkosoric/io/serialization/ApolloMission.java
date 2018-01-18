package edu.matkosoric.io.serialization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ApolloMission implements Serializable{

    private static final long serialVersionUID = 32423;

    private String name;

    private LocalDate launchDate;

    private ArrayList<String> crew;

    public ApolloMission(String name, LocalDate launchDate, ArrayList<String> crew) {
        this.name = name;
        this.launchDate = launchDate;
        this.crew = crew;
    }

    public String getName() { return name; }
    public LocalDate getLaunchDate() { return launchDate; }
    public ArrayList<String> getCrew() { return crew; }

    public String toString () {
        return "Apollo Mission [name=" + name + ", launch date=" + launchDate + ", crew=" + crew + "]";
    }
}
