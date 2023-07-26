import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Q1

//        int [] arr = {50, -20, 0, 30, 40, 60, 50};
//        if (arr[0] == arr[arr.length-1]){
//            System.out.println("true");
//
//        }else {
//            System.out.println("false");
//        }

        //Q2

//        Scanner data = new Scanner(System.in);
//        System.out.println("enter a number ");
//        int k = data.nextInt();
//        int [] arr = new int[7];
//        arr[0] = 1;
//        arr[1] = 4;
//        arr[2] = 17;
//        arr[3] = 7;
//        arr[4] = 25;
//        arr[5] = 3;
//        arr[6] = 100;
//        int [] largest_elements = new int[k];
//        Arrays.sort(arr);
//        //System.out.println(Arrays.toString(arr));
//        int count = 0;
//
//       for(int i = arr.length-1; count < k ; i--){
//
//          // int index = 0;
//           largest_elements[count] = arr[i];
//           count++;
//       }
//        System.out.println(k+" largest elements of the said array are:"+Arrays.toString(largest_elements));

        //Q3

//        int [] numbers = {1, 4, 17, 7, 25, 3, 100};
//        int ave ;
//        int sum = 0;
//
//
//
//       for (int i = 0; i < numbers.length; i++){
//
//            sum += numbers[i];
//        }
//       ave = sum / numbers.length;
//       int index = 0;
//        System.out.println("The average of the said array is: "+ave +" The numbers in the said array that are greater than the average are:" );
//
//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] > ave){
//                System.out.println(numbers[i]);
//
//
//            }
//        }

        //Q4

//        int [] arr = {20, 30, 40};
//        if (arr[0] > arr[arr.length-1]){
//            System.out.println("Larger value between first and last element: "+ arr[0]);
//
//        }else if (arr[0] < arr[arr.length-1]) {
//            System.out.println("Larger value between first and last element: "+ arr[arr.length-1]);
//        }else{
//            System.out.println(" first = last element: "+ arr[0]);
//
//        }

        //Q5
//
//        int [] arr = {20, 30, 40};
//        int first_element = arr[0];
//        arr[0] = arr[arr.length-1];
//        arr[arr.length-1] = first_element;
//        System.out.println("New array after swapping the first and last elements: "+ Arrays.toString(arr) );
//

        //Q6

//        String [] names = { "cat", "dog", "red", "is", "am" };
//        int count = 0;
//        for (String name : names){
//            if (name.length() > count) {
//                count = name.length();
//            }
//        }
//        for (int i = 0; i < names.length; i++){
//            if ( names[i].length() == count){
//                System.out.println(names[i]);
//            }
//        }

        //Q7

        
//        Scanner data = new Scanner(System.in);
//        int choice;
//        System.out.println("select length of array");
//        int arr_length = data.nextInt();
//        int [] arr = new int[arr_length];
//        int element;
//        do{
//
//            System.out.println("Enter 1 for Accept elements of an array");
//            System.out.println("Enter 2 for Display elements of an array");
//            System.out.println("Enter 3 for Search the element within array");
//            System.out.println("Enter 4 for Sort the array");
//            System.out.println("Enter 5 To Stope");
//            choice = data.nextInt();
//
//
//             switch (choice){
//
//                 case 1:
//                         int count = 0;
//                         System.out.println("Enter elements of an array ");
//                         while (count < arr_length) {
//                             element = data.nextInt();
//                             arr[count] = element;
//                             count++;
//                         }
//                          break;
//
//                          case 2:
//                         System.out.println(Arrays.toString(arr));
//                         break;
//
//                         case 3:
//                         boolean is_found = false;
//                         System.out.println("Enter the element");
//                         int search_element = data.nextInt();
//                         for (int item : arr) {
//
//                             if (search_element == item) {
//                                 is_found = true;
//                             }
//                         }
//                         System.out.println(is_found);
//                          break;
//
//                         case 4:
//                         Arrays.sort(arr);
//                         System.out.println(Arrays.toString(arr));
//                          break;
//
//                          case 5:
//                         System.out.println("see you later");
//
//                     break;
//                     default:
//                     System.out.println("invaled option");
//             }
//
//
//        }while (choice != 5);



        //Q8

//        Scanner data = new Scanner(System.in);
//        System.out.println("enter number");
//        int num = data.nextInt();
//        int [] numbers = {1,1,1,3,3,5};
//        int count = 0;
//        for (int i: numbers) {
//            if (i == num){
//                count++;
//            }
//
//        }
//        System.out.println(num +" occurs "+count+" times");

        //Q9

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(40);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(4);
//        numbers.add(10);
//        numbers.add(7);
//        ArrayList<Integer> odd_numbers = new ArrayList<Integer>();
//        ArrayList<Integer> even_numbers = new ArrayList<Integer>();
//
//        for (int num: numbers) {
//            if (num % 2 == 0) {
//                even_numbers.add(num);
//
//            }else {
//                odd_numbers.add(num);
//
//            }
//        }
//
//        for(int num : even_numbers){
//           odd_numbers.add(num);
//        }
//        System.out.println(odd_numbers);

        //Q10

//        int [] num1 = {2,3,6,6,4};
//        int [] num2 = {2,3,6,6,4};
//        boolean isSame = true;
//        for (int i = 0; i < num1.length; i++){
//            if (num1.length != num2.length){
//               isSame = false;
//                break;
//            }
//            if(num1[i] != num2[i]){
//                isSame = false;
//                break;
//            }
//        }
//        System.out.println(isSame);












    }
}