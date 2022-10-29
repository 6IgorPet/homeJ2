public class dz3 {
    


    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        int[] arr = new int[46]; //1 <= n <= 45 по усл зд
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}

    

