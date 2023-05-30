public class Sort {


    public static void main (String[]args) {
        int [] array = new int [] {
                4, 5, 0, 1, 9, 2, 3, 6, 8, 7
        };
        //bubbleSort(array);
        //directSort(array);
        //insertSort(array);
        HeapSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void HeapSort(int[]array){
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array,array.length,i);

        for (int i = array.length - 1;  i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array,i,0);
        }
    }

    private static void heapify(int [] array, int heapSize, int baseIndex) {
        int largest = baseIndex;
        int leftBranch = 2 * largest + 1;
        int rightBranch = 2 * largest + 2;

        if (leftBranch < heapSize && array[leftBranch] > array[largest]){
            largest = leftBranch;
        }
        if (rightBranch < heapSize && array[rightBranch] > array[largest]){
            largest = rightBranch;
        }
        if (largest != baseIndex) {
            int temp = array[largest];
            array[largest] = array[baseIndex];
            array[baseIndex] = temp;

            heapify(array,heapSize,largest);
        }
    }
    public static void insertSort(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void directSort(int [] array) {
        for(int i = 0; i < array.length-1; i++) {
            int minPos = i;
            for (int j = i + 1; j< array.length; j++) {
                if (array[j] < array[minPos]){
                    minPos = j;
                }
            }
            if (i != minPos) {
                int temp = array[i];
                array[i] = array[minPos];
                array[minPos] = temp;
            }
        }
    }
    public static void bubbleSort(int[] array) {
        boolean finish;
        do{
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array [i+1];
                    array[i+1] = temp;
                    finish = false;
                }
            }
        }while (!finish);
    }
}
