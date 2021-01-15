package edu.matkosoric.io.serialization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2021.
 * Created by © Matko Soric.
 */

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteAndRead {

    // write and read serializable Java object

    // write data to the file
    private static void write (List<ApolloMission> missions, File destination) throws IOException {

        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(destination)))) {
            for (ApolloMission element : missions)
                output.writeObject(element);
        }

    }

    // read serialised data from the file and return proper Java object
    private static List<ApolloMission> read (File source) throws IOException, ClassNotFoundException {

        List<ApolloMission> missions = new ArrayList<ApolloMission>();

        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(source)))) {
            while (true) {
                Object o = input.readObject();
                if (o instanceof ApolloMission)
                    missions.add((ApolloMission) o);
            }
        } catch (EOFException e) {
            System.out.println("Loading is done!");
        }
        return missions;
    }




    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<ApolloMission> missionsToWrite = new ArrayList<>();

        // Apollo 7
        ArrayList<String> crew7 = new ArrayList<>(Arrays.asList("Wally Schirra", "Donn F. Eisele", "Walter Cunningham"));
        ApolloMission apollo7 = new ApolloMission("Apollo 7", LocalDate.of(1968, Month.OCTOBER, 11), crew7);
        missionsToWrite.add(apollo7);

        // Apollo 11
        ArrayList<String> crew11 = new ArrayList<>(Arrays.asList("Neil Armstrong", "Michael Collins", "Edwin \"Buzz\" Aldrin"));
        ApolloMission apollo11 = new ApolloMission("Apollo 11", LocalDate.of(1969, Month.JULY, 16), crew11);
        missionsToWrite.add(apollo11);

        // Apollo 17
        ArrayList<String> crew17 = new ArrayList<>(Arrays.asList("Eugene Cernan", "Ronald Evans", "Harrison Schmitt"));
        ApolloMission apollo17 = new ApolloMission("Apollo 17", LocalDate.of(1972, Month.DECEMBER, 7), crew17);
        missionsToWrite.add(apollo17);

        // writing
        File listOfMissions = new File("/home/matko/IdeaProjects/OCP/src/edu/matkosoric/io/serialization/file_missions.data");
        write(missionsToWrite, listOfMissions);

        // reading
        List<ApolloMission> listAM = read(listOfMissions);
        for (ApolloMission element : listAM)
            System.out.println(element);


        // reading without deserialization

        System.out.println("\nRAW FILE CONTENT: ");
        try (BufferedReader input = new BufferedReader(new FileReader(listOfMissions))) {
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        }

    }

}


