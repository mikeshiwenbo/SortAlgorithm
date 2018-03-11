
public class Quick3way {
	//�����зֵĿ���
	public static Comparable[] sort(Comparable[] a){
		sort(a,0,a.length-1);
		return a;
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		if(hi<lo) return;
		int lt=lo,i=lo+1,gt=hi;
		Comparable v=a[lo];
		while(i<=gt){
			int cmp=a[i].compareTo(v);
			if(cmp<0) exch(a,lt++,i++);  //lt��һ�����һ����Ӧ��һֱ�����м�����ĵ�һλ����ʱ������������ֵ����
			else if(cmp>0) exch(a,i,gt--);
			else i++;
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
	}

	private static void exch(Comparable[] a, int i, int j) {
		// TODO Auto-generated method stub
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
}
