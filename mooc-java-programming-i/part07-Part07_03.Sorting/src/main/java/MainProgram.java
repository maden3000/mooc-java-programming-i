
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 4, 7, 8, 6, 9, 2, 3};
        MainProgram.sort2(numbers);
    }

    public static int smallest(int[] array) {
        int ref = array[0];
        for (int num : array) {
            if (num < ref) {
                ref = num;
            }
        }
        return ref;
    }

    public static int indexOfSmallest(int[] array) {
      int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int ref = table[startIndex];
        int index = 0;
        int ret = 0;
        for (int num : table) {
            if (index >= startIndex) {
                if (num <= ref) {
                    ref = num;
                    ret = index;

                }
            }
            index++;
        }
        return ret;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp1 = array[index1];
        array[index1] = array[index2];
        array[index2] = temp1;

    }

    public static void sort(int[] array) {
        int index = 0;
        int indexStart = 0;
        int ref = array[0];
        int small = 0;
        boolean check= false;

        while (index < array.length) {
            System.out.println(Arrays.toString(array));
            for (int num = index; num < array.length; num++) {
                if (array[num] < ref) {
                 
                    ref = array[num];
                    indexStart = num;
                    check = true;
                }

            }
            
            if(check){
            int temp1 = array[indexStart];
            array[indexStart] = array[index];
            array[index] = temp1;
            }
            check=false;
            index++;
            if(index<array.length){
          ref = array[index];
            }
        }
    }
    public static void sort2(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {
            
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }

    }

}
