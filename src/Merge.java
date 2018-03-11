import javax.activation.CommandInfo;

public class Merge {
	private static Comparable[] aux;
	public static Comparable[] sort(Comparable[] a){
		aux=new Comparable[a.length];
		sort(a,0,a.length-1);
		return a;
	}
	private static void sort(Comparable[] a,int lo,int hi){
		if(hi<=lo) return;
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		//此处可优化，当a[mid]<a[mid+1]时说明这个小数组已经排好序，则无需对其排序
		if(a[mid].compareTo(a[mid+1])>0)
			merge(a,lo,mid,hi);
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
