package BinarySearch;


import java.util.Scanner;

public class BinarySearch {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);

      int arr[] = new int[50];
      for (int i = 0; i < arr.length; i++){
         arr[i] = i;
      }
      try {
         System.out.println("key를 입력하세요");
         int key = scan.nextInt();
         IndexException ie = new IndexException("50미만의 수를 입력하세요");
         if(key >= 50)
         {
            throw ie;
         }
         System.out.println(binSearch(arr,key));
      }catch(IndexException ie){
         System.out.println(ie.toString());
      }
   }
   
   public static int binSearch(int arr[], int key){
      int left = 0;
      int right = arr.length-1;
      int middle;
      
      while(right >= left){
         middle = (left+right)/2;
         if (arr[middle] == key) return middle;
         else if (key < arr[middle]) right = middle - 1;
         else left = middle + 1;
      }
      
      return -1;
   }
}

class IndexException extends Exception{
   public IndexException(String s) {
      // TODO Auto-generated constructor stub
      super(s);
   }
   public IndexException (Exception ie){
      super(ie);
   }
}
