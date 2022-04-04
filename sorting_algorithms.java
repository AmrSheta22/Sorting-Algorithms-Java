import java.util.*;
import java.lang.*;
public class project{
public static void main(String[] args) {
    // merge sort random array 1000
    int[] x1=randomArray(1000);
    long startTime1 = System.nanoTime();
    mergeSort(x1, 0, x1.length-1);
    long endTime1   = System.nanoTime();
    System.out.println(endTime1 - startTime1);
    // merge sort random array 10000
    int[] x2=randomArray(10000);
    long startTime2 = System.nanoTime();
    mergeSort(x2, 0, x2.length-1);
    long endTime2   = System.nanoTime();
    System.out.println(endTime2 - startTime2);
    // merge sort random array 100000
    int[] x3=randomArray(100000);
    long startTime3 = System.nanoTime();
    mergeSort(x3, 0, x3.length-1);
    long endTime3   = System.nanoTime();
    System.out.println(endTime3 - startTime3);


    // selection sort random array 1000
    long startTime1y = System.nanoTime();
    SelectionSort(x1);
    long endTime1y   = System.nanoTime();
    System.out.println(endTime1y - startTime1y);
    // selection sort random array 10000
    long startTime2y = System.nanoTime();
    SelectionSort(x2);
    long endTime2y   = System.nanoTime();
    System.out.println(endTime2y - startTime2y);
    // selection sort random array 100000
    long startTime3y = System.nanoTime();
    SelectionSort(x3);
    long endTime3y   = System.nanoTime();
    System.out.println(endTime3y - startTime3y);


    // bubble sort random array 1000
    long startTime111 = System.nanoTime();
    BubbleSort(x1);
    long endTime111   = System.nanoTime();
    System.out.println(endTime111 - startTime111);
    // bubble sort random array 10000
    long startTime112 = System.nanoTime();
    BubbleSort(x2);
    long endTime112   = System.nanoTime();
    System.out.println(endTime112 - startTime112);
    // bubble sort random array 100000
    long startTime113 = System.nanoTime();
    BubbleSort(x3);
    long endTime113   = System.nanoTime();
    System.out.println(endTime113 - startTime113);


    // merge sort sorted array 1000
    int[] x4=sortedArray(1000);
    long startTime4 = System.nanoTime();
    mergeSort(x4, 0, x4.length-1);
    long endTime4   = System.nanoTime();
    System.out.println(endTime4 - startTime4);
    // merge sort sorted array 10000
    int[] x5=sortedArray(10000);
    long startTime5 = System.nanoTime();
    mergeSort(x5, 0, x5.length-1);
    long endTime5   = System.nanoTime();
    System.out.println(endTime5 - startTime5);
    // merge sort sorted array 100000
    int[] x6=sortedArray(100000);
    long startTime6 = System.nanoTime();
    mergeSort(x6, 0, x6.length-1);
    long endTime6   = System.nanoTime();
    System.out.println(endTime6 - startTime6);


    // selection sort sorted array 1000
    int[] y4=sortedArray(1000);
    long startTime4y = System.nanoTime();
    SelectionSort(y4);
    long endTime4y   = System.nanoTime();
    System.out.println(endTime4y - startTime4y);
    //selection sort sorted array 10000 
    int[] y5=sortedArray(10000);
    long startTime5y = System.nanoTime();
    SelectionSort(y5);
    long endTime5y   = System.nanoTime();
    System.out.println(endTime5y - startTime5y);
  //selection sort sorted array 100000
    int[] y6=sortedArray(100000);
    long startTime6y = System.nanoTime();
    SelectionSort(y6);
    long endTime6y   = System.nanoTime();
    System.out.println(endTime6y - startTime6y);


    // bubble sort sorted array 1000
    int[] z4=sortedArray(1000);
    long startTime114 = System.nanoTime();
    BubbleSort(z4);
    long endTime114   = System.nanoTime();
    System.out.println(endTime114 - startTime114);
    // bubble sort sorted array 10000
    int[] z5=sortedArray(10000);
    long startTime115 = System.nanoTime();
    BubbleSort(z5);
    long endTime115   = System.nanoTime();
    System.out.println(endTime115 - startTime115);
    // bubble sort sorted array 100000
    int[] z6=sortedArray(100000);
    long startTime116 = System.nanoTime();
    BubbleSort(z6);
    long endTime116   = System.nanoTime();
    System.out.println(endTime116 - startTime116);


    // merge sort reverse sorted array 1000
    int[] x7=reverseSorted(1000);
    long startTime7 = System.nanoTime();
    mergeSort(x7, 0, x7.length-1);
    long endTime7   = System.nanoTime();
    System.out.println(endTime7- startTime7);
    // merge sort reverse sorted array 10000
    int[] x8=reverseSorted(10000);
    long startTime8 = System.nanoTime();
    mergeSort(x8, 0, x8.length-1);
    long endTime8   = System.nanoTime();
    System.out.println(endTime8- startTime8);
    // merge sort reverse sorted array 100000
    int[] x9=reverseSorted(100000);
    long startTime9 = System.nanoTime();
    mergeSort(x9, 0, x9.length-1);
    long endTime9   = System.nanoTime();
    System.out.println(endTime9- startTime9);


    //selection sort reverse sort 1000
    int[] y7=reverseSorted(1000);
    long startTime7y = System.nanoTime();
    SelectionSort(y7);
    long endTime7y   = System.nanoTime();
    System.out.println(endTime7y - startTime7y);
    //selection sort reverse sort 10000
    int[] y8=reverseSorted(10000);
    long startTime8y = System.nanoTime();
    SelectionSort(y8);
    long endTime8y   = System.nanoTime();
    System.out.println(endTime8y - startTime8y);
    //selection sort reverse sort 100000
    int[] y9=reverseSorted(100000);
    long startTime9y = System.nanoTime();
    SelectionSort(y9);
    long endTime9y   = System.nanoTime();
    System.out.println(endTime9y - startTime9y);


    // bubble sort reverse sorted array 1000
    int[] z7=reverseSorted(1000);
    long startTime117 = System.nanoTime();
    BubbleSort(z7);
    long endTime117   = System.nanoTime();
    System.out.println(endTime117 - startTime117);
    // bubble sort reverse sorted array 10000
    int[] z8=reverseSorted(10000);
    long startTime118 = System.nanoTime();
    BubbleSort(z8);
    long endTime118   = System.nanoTime();
    System.out.println(endTime118 - startTime118);
    // bubble sort reverse sorted array 100000
    int[] z9=reverseSorted(100000);
    long startTime119 = System.nanoTime();
    BubbleSort(z9);
    long endTime119   = System.nanoTime();
    System.out.println(endTime119 - startTime119);

}
public static int[] randomArray(int n) {
    int[] arr1 = new int[n];
    for (int i=0; i<n; i++){
        arr1[i] =  (int) (Math.random()*n);
    }
    return arr1;
}
public static int[] sortedArray(int n) {
    int[] x = randomArray(n);
    Arrays.sort(x);
    return x;
}
public static int[] reverseSorted(int n) {
    int[] rev = new int[n];
    int[] ori = sortedArray(n);
    for (int i =n; i>0; i-- ){
        rev[n-i] = ori[i-1];
    }
    return rev;
}
public static void SelectionSort(int arr []){
    int n =arr.length;
    for (int i=0;i<n-1;i++){
       int Min_index=i;
       for(int j =i+1;j<n;j++){
           if(arr[j]<arr[Min_index]){
               Min_index = j;
           }
       }
       int temp = arr[Min_index];
       arr[Min_index]=arr[i];
       arr[i]=temp;
    }
}
public static void BubbleSort(int a[]){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
}
    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) return;
    
        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    } 
    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
         for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}