package JavaForImpatientCodes.chapter03;

import java.util.stream.Stream;

public class exercise13 {
    public static void main(String[] args){
        Runnable[] taskList = new Runnable[5];
        for(int i = 0; i < taskList.length; i++){
            taskList[i] = () -> System.out.println(" hello ");
        }

        Runnable master = runInOrder(taskList);
        master.run();
    }

    static Runnable runInOrder(Runnable[] list){
        return () -> {
            for(Runnable i : list)
                i.run();
        };
    }
}
