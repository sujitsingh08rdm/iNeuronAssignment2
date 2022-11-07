//check whether array is subset of another array
class Q6 {

  static boolean isSubset(int arr1[], int m, int arr2[], int n) {
    if (m > n) return false;
    for (int i = 0; i < m; i++) {
      boolean present = false;
      for (int j = 0; j < n; j++) {
        if (arr2[j] == arr1[i]) {
          present = true;
          break;
        }
      }
      if (present == false) return false;
    }
    return true;
  }

  public static void main(String[] args) {

    int ar1[]={1,4,5,2};
	int ar2[]={2,4,3,7,5,1,15};

    int m = ar1.length;
    int n = ar2.length;

    boolean ans = isSubset(ar1, m, ar2, n);

    if (ans == true)
      System.out.print("ar1[] is a subset of ar2[]");
    else System.out.print("ar1[] is not a subset of ar2[]");

  }
}