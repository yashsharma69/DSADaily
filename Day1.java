Reverse the array in place and display it 
  package TillFebDSA;

public class ReverseArray {
    public static void main(String[] args) {
        // Given an array you have to reverse it
        int arr[] = {10,20,30,40};
        int last = arr.length-1;
        int i = 0;

      
        while(i < last){
            int temp = arr[i]; // 10
            arr[i] = arr[last]; // last = 10
            arr[last] = temp; //
            i++;
            last--;
        }

        for(int z = 0 ; z < arr.length ; z++){
            System.out.print(arr[z]);
        }

    }
}



----------------------------------------------------------------------------------------------------------------------------------------------
Find the largest element in the array -
  package TillFebDSA;

public class Day1 {
    // Given an array of integers, find and return the largest element.
    static int findLargest(int [] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {10,8,99,1,7};
        int answer =findLargest(arr);
        System.out.println(answer);
    }
}


------------------------------------------------------------------------------------------------------------------------------------------------
  Find the second largest - 


  package TillFebDSA;

public class SecondLargest {
    //Find the second largest distinct element in an array. If it doesn't exist, return -1
    static int secondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }

            if(arr[i] > second && arr[i] < largest){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        else {
            return second;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10 , 90 , 86 , 97 , 32};
        int value =secondLargest(arr);
        System.out.println(value);
    }
}






