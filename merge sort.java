import java.util.Scanner;

public class MergeSort {

private static int[] b;

public static void mergeSort(int[] a, int low, int high) {
if (low < high) {
int mid = (low + high) / ;
mergeSort(a, low, mid);
mergeSort(a, mid + , high);
merge(a, low, mid, high);
}
}

public static void merge(int[] a, int low, int mid, int high) {
int i = low, j = mid + , k = low;

while (i <= mid && j <= high)
if (a[i] <= a[j])
b[k++] = a[i++];
else
b[k++] = a[j++];

while (i <= mid)
b[k++] = a[i++];
while (j <= high)
b[k++] = a[j++];

for (int h = low; h <= high; h++)
a[h] = b[h];
}

// Main method to test MergeSort
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the number of elements in the array:");
int n = scanner.nextInt();
int[] array = new int[n];
b = new int[n];

System.out.println("Enter the elements of the array:");
for (int i = ; i < n; i++)
array[i] = scanner.nextInt();

mergeSort(array, , array.length - );

System.out.println("Sorted Array:");
for (int num : array)
System.out.print(num + " ");

scanner.close();
}
}
