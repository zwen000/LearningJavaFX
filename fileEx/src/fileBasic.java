import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class fileBasic {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file path");
        Path mypath = Paths.get(scan.nextLine());
        if (Files.exists(mypath)){
            System.out.println("The file "+mypath.getFileName() + " exist...");
            System.out.println("The directory：\n " + (Files.isDirectory(mypath) ? " is ":" is not ")+ "a directory" );
            System.out.println((mypath.isAbsolute() ?" is ":" is not ") + "absolute path...");
            System.out.println("Last modified: "+  Files.getLastModifiedTime(mypath) );
            System.out.println("Size of the file: " + Files.size(mypath) );
            System.out.println("path: " + mypath);
            System.out.println("absolute path: " + mypath.toAbsolutePath());

            if (Files.isDirectory(mypath)){
                System.out.println("Directory Contents: 内容");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(mypath);
                for(Path p: directoryStream){
                    System.out.println(p);
                }
            }
        }

        else{
            System.out.println("File "+ mypath.getFileName() + " doesn't exist ");
        }


    }





}

