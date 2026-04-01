package Ders83_84;
import java.util.Arrays;

public class siralamakontrol {
    public static void main(String[] var0) {
        int[] karmasikdizi = {45,58,1,42,14,56,89,74,574,15,23,1,6,4,8,6,415,468,684,413,418,415,74,4,1,68,74,1,6,854,864,1,68,4,41,34,86689,4};

        System.out.println(Arrays.toString(karmasikdizi));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        SecmeliSiralama.SecmeliSiralama(karmasikdizi);
        
        System.out.println(Arrays.toString(karmasikdizi));

        System.out.println("********************************************************************************************************************************************************");

        int[] karmasikdizi2 = {45,58,1,42,14,56,89,74,574,15,23,1,6,4,8,6,415,468,684,413,418,415,74,4,1,68,74,1,6,854,864,1,68,4,41,34,86689,4};

        System.out.println(Arrays.toString(karmasikdizi2));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        EklemeliSiralama.EklemeliSiralama(karmasikdizi2);
        
        System.out.println(Arrays.toString(karmasikdizi2));

    }
}
