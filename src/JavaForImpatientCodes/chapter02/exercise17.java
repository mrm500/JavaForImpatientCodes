package JavaForImpatientCodes.chapter02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args){
        queue q = new queue();
        for(int i=0; i<5; i++){
            System.out.println("Enter Name : ");
            Scanner sc = new Scanner(System.in);
            q.add(sc.nextLine());
        }

        queue.Iterator iterator = q.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class queue{
    ArrayList<String> list = new ArrayList<>();

    public void add(String s){
        list.add(s);
    }
    public void remove(){
        if(!list.isEmpty())
            list.remove(0);
    }
    public Iterator iterator(){
        Iterator it = new Iterator();
        return it;
    }

    class Iterator{
        int index;
        public Iterator(){
            index = 0;
        }
        public String next(){
            if(hasNext())
                return list.get(index++);
            else
                return "";                      //Should throw error.
        }
        public boolean hasNext(){
            if(index < list.size())
                return true;
            else
                return false;
        }
    }

}
