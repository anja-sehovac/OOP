package lab6;

import java.util.Arrays;

public class Binary {
    public static int smallest (int[] array){
        int smallest = array[0];
        for (int num : array){
            if (smallest>num){
                smallest=num;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest (int[] array){
        int smallest= smallest(array);
        for (int i=0; i<array.length; i++){
            if (array[i]==smallest){
                return i;
            }
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom (int[] array, int index){
        int[] newArray = Arrays.copyOfRange(array, index, array.length);
        return indexOfTheSmallest(newArray)+index;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp=0;
        array[index1]= temp;
        array[index1]=array[index2];
        array[index2]=temp;
    }

    boolean search(int[] array, int searchedValue){
        int start=0;
        int end=array.length-1;
        int mid;

        while (start<=end){
            mid=(start+end)/2;
            if (array[mid]<searchedValue){
                start=mid+1;
            }
            else if (array[mid]>searchedValue) {
                end=mid-1;
            }
            else if (array[mid]==searchedValue){
                return true;
            }
        }
        return false;
    }

    public static void printElegantly(int[] array){
        for (int i=0; i<array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1]);
    }



}
