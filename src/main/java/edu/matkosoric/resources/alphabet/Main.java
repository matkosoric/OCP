package edu.matkosoric.resources.alphabet;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    // pick proper code for line 1
    // try (FileChannel fileChannel = new FileOutputStream(filename).getChannel();) {

    private String[] strings = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "abcdefghijklmnopqrstuvwxyz",
            "0123456789"};

    public void write(String filename) {

//        try (FileChannel fileChannel = Channels.newChannel(new FileOutputStream(filename));) {       // line 1
//        try (FileChannel fileChannel = new FileOutputStream( new FileOutputStream(filename));){      // line 1
//        try (FileChannel fileChannel = new FileChannel(new FileOutputStream(filename));) {           // line 1

        try (FileChannel fileChannel = new FileOutputStream(filename).getChannel();) {                  // line 1

            for (String str : strings) {
                ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
                fileChannel.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Main test = new Main();
        test.write("file_to_path");

    }
}
