package QuickCoding3;

import java.util.Scanner;

public class ExceptionTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      try {
         
         String input1;
         String input2;
         
         System.out.println("���� 2���� �Է��ϼ���");
         
         input1 = scan.next();
         input2 = scan.next();
         
         int num1 = Integer.parseInt(input1);
         int num2 = Integer.parseInt(input2);
         
         SizeOver se = new SizeOver("2�ڸ� ���ڸ� �Է��ϼ���");
         
         if (num1 >= 100 || num2 >= 100) throw se;
         
         float result = num1 / num2;
      }
      catch (ArithmeticException e) {
         System.out.println("0���� ������ �����ϴ�.");
      }
      catch(NumberFormatException ie){
         System.out.println("���ڸ� �Է��ϼ���");
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