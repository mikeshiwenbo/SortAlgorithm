
public class MergeBU {
	//自底向上的归并算法
	private static Comparable[] aux;
	public static Comparable[] sort(Comparable[] a){
		int N=a.length;
		aux=new Comparable[N];
		for(int sz=1;sz<N;sz=sz+sz){
			for(int lo=0;lo<N-sz;lo+=sz+sz){
				//此处可以优化，优化原理同Merge算法一致
				if(a[lo+sz-1].compareTo(a[lo+sz])>0)
				merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1, N-1));
			}
		}
		return a;
		
	}
	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		// TODO Auto-generated method stub
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++){
			aux[k]=a[k];
		}
		for(int k=lo;k<=hi;k++){
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(less(aux[j],aux[i])) a[k]=aux[j++];
			else a[k]=aux[i++];
		}
	}
	private static boolean less(Comparable comparable, Comparable comparable2) {
		// TODO Auto-generated method stub
		return comparable.compareTo(comparable2)<0;
	}

}
