
public class Shell {
	//此算法为希尔排序算法，中心思想是：间隔为h的元素都是有序的
	public static Comparable[] sort(Comparable[] a){ 
		int N=a.length;
		int h=1;
		//将数组分为三段，也可以根据自己的需求改变
		while(h<N/3){
			h=3*h+1;
		}
		while(h>=1){
			for(int i=h;i<N;i++){
				for(int j=i;j>=h&&less(a[j],a[j-h]);j=j-h){
					exch(a,j,j-h);
				}
			}
			h=h/3;
		}
		return a;
		
	}

	private static void exch(Comparable[] a, int j, int i) {
		// TODO Auto-generated method stub
		Comparable t=a[j];
		a[j]=a[i];
		a[i]=t;
	}

	private static boolean less(Comparable comparable, Comparable comparable2) {
		// TODO Auto-generated method stub
		return comparable.compareTo(comparable2)<0;
	}

}
