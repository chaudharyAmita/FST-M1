package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {
        try{
        File file = new File("C:\\Users\\AmitaChaudhary\\Desktop\\example.txt");
        boolean fStatus = file.createNewFile();
        if(fStatus) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists at this path.");
        }
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(65);
        fout.close();

        /*FileWriter myWriter = new FileWriter(file);
        myWriter.append("I am writing capital A");
        myWriter.close();*/
        
        File fileUtil = FileUtils.getFile("C:\\Users\\AmitaChaudhary\\Desktop\\example.txt");
        System.out.println("Read file to String "+FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("Resources");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "example.txt");
        String fileData = FileUtils.readFileToString(newFile, "UTF8");

        System.out.println("Data in the file is : "+fileData);
    }
    catch(IOException ioe){
        System.out.println(ioe.getMessage());
    }

    }

}
