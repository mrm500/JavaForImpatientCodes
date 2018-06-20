package JavaForImpatientCodes.chapter03;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class exercise12 {
    public static void main(String[] args){
        File directory = new File("C:\\Users\\Administrator\\Downloads\\");
        File[] subFiles = directory.listFiles();
        Arrays.sort(subFiles,(file1,file2)->{
           if(file1.isDirectory() && !file2.isDirectory())
               return -1;
           else if(!file1.isDirectory() && file2.isDirectory())
               return 1;
           else
               return file1.getAbsolutePath().compareToIgnoreCase(file2.getAbsolutePath());
        });
        for (File i : subFiles){
            System.out.println(i.getAbsolutePath()   );
        }
    }
}
