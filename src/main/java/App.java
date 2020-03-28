public class App {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        int[] arr = { 1, 2, 3, 4, 5 };
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
