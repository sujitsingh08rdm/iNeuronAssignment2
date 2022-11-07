//bubble sort
public class Q3 {

	public static void main(String[] args) {
		int []a = {42,1,6,14,3,15,11,56,9};
	for(int i=0;i<a.length;i++) {
		for(int j=1;j<a.length-i;j++) {
			if(a[j]<a[j-1]) {
				int temp = a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				}	
		}
		}
	System.out.print("sorted array : ");
	for (int el:a) {
		System.out.print(el + " ");
	}
}
}