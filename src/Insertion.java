
public class Insertion {
	//���ǲ����㷨������˼���ǣ���a[i]���뵽a[-1]��a[i-2]��a[i-3]��a[i-4]...֮��
	public static Comparable[] sort(Comparable[] a){
		int N=a.length;
		for(int i=1;i<N;i++){
			for(int j=i;j>0&&less(a[j],a[j-1]);j--){
				exch(a,j,j-1);
			}
		}
		return a;
	}

	private static void exch(Comparable[] a, int j, int i) {
		// TODO Auto-generated method stub
		Comparable temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}

	private static boolean less(Comparable comparable, Comparable comparable2) {
		// TODO Auto-generated method stub
		return comparable.compareTo(comparable2)<0;
	}
}
