public class Task2 {
    public static double FindAverage(int [] arr, int n){
        if (n==0) return 0;


        return  arr[n-1] + FindAverage(arr, n-1);

    }

    public static void main(String[] args) {
        int n=4;
        int [] arr={3,2,4,1};
        System.out.println(FindAverage(arr, n)/n);
    }

}