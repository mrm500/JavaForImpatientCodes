package JavaForImpatientCodes.chapter01;
import java.util.*;
import java.math.BigInteger;

public class exercise01{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
		/*
		System.out.println("Enter integer : ");
		int i1 = in.nextInt();
		System.out.printf("Binary = %s\nOctal = %o\nHexadecimal = %x",Integer.toBinaryString(i),i,i);

		System.out.println("Enter angle : ");
		int i2 = in.nextInt();
		System.out.println((i2+360)%360);

		System.out.println(Math.nextUp(0));

		System.out.println("1000! = " + HelloWorld.fact(1000));

		Random generator = new Random();
		Long l = generator.nextLong();
		System.out.println("long number = " + l + ",\t radix 36 format = " + Long.toString(l, 36));

		String str;
		str = in.nextLine();
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.codePointAt(i) + " ");
		}


		ArrayList <Integer> lotteryCombination = new ArrayList<>(49);
		for(int i = 1; i < 50; i++) {
			lotteryCombination.add(i-1, i);
		}
		Random generator = new Random();
		for(int i = 1; i <= 6; i++) {
			lotteryCombination.remove(Math.abs(generator.nextInt())%49);
		}
		for(Integer n:lotteryCombination)
			System.out.println(n + " ");
		*/

        in.close();
    }

    public static BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
