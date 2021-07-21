package edu.matkosoric.io.serialization.wrong;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import edu.matkosoric.io.serialization.wrong.ApolloMissionWrong;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteAndReadWrong {

    // write and read serializable Java object with transient and static fields

    // write data to the file
    private static void write (List<ApolloMissionWrong> missions, File destination) throws IOException {

        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(destination)))) {
            for (ApolloMissionWrong element : missions)
                output.writeObject(element);
        }

    }

    // read serialised data from the file and return proper Java object
    private static List<ApolloMissionWrong> read (File source) throws IOException, ClassNotFoundException {

        List<ApolloMissionWrong> missions = new ArrayList<ApolloMissionWrong>();

        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(source)))) {
            while (true) {
                Object o = input.readObject();
                if (o instanceof ApolloMissionWrong)
                    missions.add((ApolloMissionWrong) o);
            }
        } catch (EOFException e) {
            System.out.println("Loading is done!");
        }
        return missions;
    }




    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // name field will be null, since it is marked with transient and therefore excluded from serialization
        // launch date is static, meaning that all instances share the same variable, which is last set by apollo17đ
        // crew filed is properly serialized and de-serialized.

        List<ApolloMissionWrong> missionsToWrite = new ArrayList<>();

        // Apollo 7
        ArrayList<String> crew7 = new ArrayList<>(Arrays.asList("Wally Schirra", "Donn F. Eisele", "Walter Cunningham"));
        ApolloMissionWrong apollo7 = new ApolloMissionWrong("Apollo 7", LocalDate.of(1968, Month.OCTOBER, 11), crew7);
        missionsToWrite.add(apollo7);

        // Apollo 11
        ArrayList<String> crew11 = new ArrayList<>(Arrays.asList("Neil Armstrong", "Michael Collins", "Edwin \"Buzz\" Aldrin"));
        ApolloMissionWrong apollo11 = new ApolloMissionWrong("Apollo 11", LocalDate.of(1969, Month.JULY, 16), crew11);
        missionsToWrite.add(apollo11);

        // Apollo 17
        ArrayList<String> crew17 = new ArrayList<>(Arrays.asList("Eugene Cernan", "Ronald Evans", "Harrison Schmitt"));
        ApolloMissionWrong apollo17 = new ApolloMissionWrong("Apollo 17", LocalDate.of(1972, Month.DECEMBER, 7), crew17);
        missionsToWrite.add(apollo17);

        // writing
        String currentDirectory = System.getProperty("user.dir");
        File listOfMissions = new File(currentDirectory + "/src/main/java/edu/matkosoric/io/serialization/wrong/file_missions.data");
        write(missionsToWrite, listOfMissions);

        // reading
        List<ApolloMissionWrong> listAM = read(listOfMissions);
        for (ApolloMissionWrong element : listAM)
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
