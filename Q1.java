
public class Q1 {

	public static void main(String[] args) {
		int []a= {1,2,3,5,2,4,1,6,3,5};
		for(int i=0; i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&i!=j) {
					System.out.println("The Duplicate element is : "+a[j]);
				}
			}
		}
		
		
	}

}
