import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a=new Integer[3000];
		for(int i=0;i<a.length;i++){
			a[i]=(int) (Math.random()*2000000);
		}
		//²âÊÔ²åÈëÅÅÐò
//		Integer[] b=a;
//		b=(Integer[]) Insertion.sort(b);
//		for(int i:b){
//			System.out.println(i);
//		}
		//²âÊÔÏ£¶ûÅÅÐò
//		a=(Integer[]) Shell.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
//		//²âÊÔ¹é²¢ÅÅÐò
//		a=(Integer[]) Merge.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
//		//²âÊÔ×Ôµ×ÏòÉÏ¹é²¢ÅÅÐò
//		a=(Integer[]) MergeBU.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
//		//²âÊÔ¿ìËÙÅÅÐò
//		a=(Integer[]) Quick.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
		//²âÊÔÈýÏòÇÐ·ÖµÄ¿ìËÙÅÅÐò
		a=(Integer[]) Quick3way.sort(a);
		for(int i:a){
			System.out.println(i);
		}
		Arrays.sort(a);

	}

}
