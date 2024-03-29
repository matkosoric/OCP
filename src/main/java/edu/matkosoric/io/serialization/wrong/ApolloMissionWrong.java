package edu.matkosoric.io.serialization.wrong;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class ApolloMissionWrong implements Serializable {

    private static final long serialVersionUID = 32423;

    private transient String name;

    private static LocalDate launchDate;

    private ArrayList<String> crew;

    public ApolloMissionWrong(String name, LocalDate launchDate, ArrayList<String> crew) {
        this.name = name;
        this.launchDate = launchDate;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public ArrayList<String> getCrew() {
        return crew;
    }

    public String toString() {
        return "Apollo Mission [name=" + name + ", launch date=" + launchDate + ", crew=" + crew + "]";
    }
}

