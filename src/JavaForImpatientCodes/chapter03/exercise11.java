package JavaForImpatientCodes.chapter03;

import java.io.File;
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args){
        File directory = new File("C:\\Users\\Administrator\\Downloads\\");
        System.out.println("Enter the file extension : ");
        Scanner in = new Scanner(System.in);
        String ext = in.next();
        String[] subDirectories = directory.list((file,name) -> {
            //return  ext.compareToIgnoreCase(name.substring(name.lastIndexOf("."))) == 0;
            return name.endsWith("." + ext);
        });
        for(String s : subDirectories){
            System.out.println(s);
        }
    }
}
