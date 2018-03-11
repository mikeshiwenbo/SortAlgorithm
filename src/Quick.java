
public class Quick {
	public static Comparable[] sort(Comparable[] a){
		sort(a,0,a.length-1);
		return a;
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		if(hi<=lo) return;
		int j=partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		int i=lo,j=hi+1;
		Comparable v=a[lo];
		while(true){
			while(less(a[++i],v)) if(i>=hi) break;
			while(less(v,a[--j])) if(j<=lo) break;
			if(i>=j) break;
			exch(a,i,j);
		}
		exch(a,lo,j);
		return j;
	}

	private static void exch(Comparable[] a, int i, int j) {
		// TODO Auto-generated method stub
		Comparable v=a[i];
		a[i]=a[j];
		a[j]=v;
	}

	private static boolean less(Comparable comparable, Comparable v) {
		// TODO Auto-generated method stub
		return comparable.compareTo(v)<0;
	}
}
