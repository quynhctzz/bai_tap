import java.util.Arrays;

public class baitap2 {
    
    public static void main(String[] args) {
        int i;
        int array[] = { 5, 3, -15, 4, 2, -1, -5, 10 };
        System.out.println("giam dan");
        for (i = 0; i < array.length; i++)



            System.out.println(array[i]);


        Arrays.sort(array);
        System.out.println("tang dan");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }



    }









}

