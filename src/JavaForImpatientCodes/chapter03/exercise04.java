package JavaForImpatientCodes.chapter03;

public class exercise04 {
    public static void main(String[] args){
        IntSequence intSeq = IntSequence.of(3, 1, 4, 1, 5, 9);
        System.out.println(intSeq.next());
        System.out.println(intSeq.getLength());
        System.out.println(IntSequence.constant(1));
    }
}

abstract class IntSequence{
    private int[] ar;
    public IntSequence(int... list){
        ar = list;
    }
    int getLength(){
        return ar.length;
    }
    static int constant(int number){
        return 1;
    }
    abstract int next();
    abstract boolean hasNext();
    static IntSequence of(int... list){
        return new IntSequence(list) {
            private int position = 0;
            public int length(){
                return list.length;
            }
            public boolean hasNext(){
                return position < list.length;
            }
            public int next(){
                return hasNext()? list[position++] : -1;
            }
        };
    }
}