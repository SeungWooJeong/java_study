package QuickCoding3;

import java.util.Scanner;

public class ExceptionTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      try {
         
         String input1;
         String input2;
         
         System.out.println("숫자 2개를 입력하세요");
         
         input1 = scan.next();
         input2 = scan.next();
         
         int num1 = Integer.parseInt(input1);
         int num2 = Integer.parseInt(input2);
         
         SizeOver se = new SizeOver("2자리 숫자만 입력하세요");
         
         if (num1 >= 100 || num2 >= 100) throw se;
         
         float result = num1 / num2;
      }
      catch (ArithmeticException e) {
         System.out.println("0으로 나눌수 없습니다.");
      }
      catch(NumberFormatException ie){
         System.out.println("숫자만 입력하세요");
      }
      catch(SizeOver s){
         System.out.println(s.toString());
      }
      
   }

}

class SizeOver extends Exception {
   public SizeOver (String msg) {
      super(msg);
   }
      
   public SizeOver (Exception e){
      super(e);
   }
}