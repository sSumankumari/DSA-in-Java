package Sorting;

public class NSquareSortingMethods {
    public static void bubbleSort(int[] arr){
        System.out.println("Using bubble sort!");
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        System.out.println("Using selection sort!");
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int minPos = i;
            for (int j=i+1; j<n; j++){
                if (arr[minPos] < arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void insertionSort(int[] arr){
        System.out.println("Using insertion sort!");
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }
    public static void countingSort(int[] arr){
        System.out.println("Using counting sort!");
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j= arr.length-1;
        for (int i=0; i<count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j--;
                count[i]--;
            }
        }
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        System.out.println("Unsorted array: ");
        printArr(arr);

        // Sorting in Descending order
//        bubbleSort(arr);
//        printArr(arr);

//        selectionSort(arr);
//        printArr(arr);

//        insertionSort(arr);
//        printArr(arr);

        countingSort(arr);
        printArr(arr);
    }
}
