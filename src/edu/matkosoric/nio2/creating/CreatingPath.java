package edu.matkosoric.nio2.creating;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingPath {

    // several ways to create Path object

    public static void main(String[] args) throws URISyntaxException {

        Path path1 = Paths.get("/home/matko/selfie.jpg");

        Path path2 = Paths.get("/", "home", "selfie.jpg");

//        Paths path3 = Paths.get("/home");   // does not compile, extra 's' on file type

//        Path path4 = Path.get ("/home");    // does not compile, missing 's' on the class name

        Path path5 = Paths.get(new URI("file:///home/matko/selfie.jpg"));

    }

}
