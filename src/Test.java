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
		//���Բ�������
//		Integer[] b=a;
//		b=(Integer[]) Insertion.sort(b);
//		for(int i:b){
//			System.out.println(i);
//		}
		//����ϣ������
//		a=(Integer[]) Shell.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
//		//���Թ鲢����
//		a=(Integer[]) Merge.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
//		//�����Ե����Ϲ鲢����
//		a=(Integer[]) MergeBU.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
//		//���Կ�������
//		a=(Integer[]) Quick.sort(a);
//		for(int i:a){
//			System.out.println(i);
//		}
		//���������зֵĿ�������
		a=(Integer[]) Quick3way.sort(a);
		for(int i:a){
			System.out.println(i);
		}
		Arrays.sort(a);

	}

}
