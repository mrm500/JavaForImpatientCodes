package JavaForImpatientCodes.chapter03;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class exercise10 {
    public static void main(String[] args){
        File directory = new File("C:\\Users\\Administrator\\Downloads\\");
        File[] list = directory.listFiles( file ->  file.isDirectory()
        );
        File checker;
        for(File file: list){
                System.out.println(file.getAbsolutePath());
        }
    }

}
