public class Search {

    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //System.out.println(find(array, 0));
        System.out.println(binaryFind(array,0,0,array.length-1));
    }

    public static int binaryFind(int[]array, int value,int min, int max){
        int midpoint;
        if (max < min){
            return  -1;
        } else{
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value){
            return binaryFind(array,value,midpoint+1,max);
        } else if (array[midpoint] > value) {
            return binaryFind(array,value,min,midpoint-1);
        } else return midpoint;
    }
    public static int find(int[]array,int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){return i;}
        }
        return -1;
    }
}
