package ex_220121;
import java.util.Random;
import java.util.Scanner;
public class test01 {
   public static void main(String[] args) {
      Random r = new Random();      
      Scanner sc = new Scanner(System.in);
      String how ="";
      String level = "";
      int count = 0; //���� ��ȣ
      int t_c = 0; //�������� ���� ���� ��
      int K = 0; //���� ���� ��
      System.out.print("���̵� ��, ��, �� �Է� >> ");
      switch (level=sc.next()) {
      case "��" : while(count<=19) {    //������ȣ�� 20�������� �ްڽ��ϴ�
         count++;
         int num1 = r.nextInt(10)+1;   // ��������1
         int num2 = r.nextInt(10)+1;   // ��������2
         int result = num1 + num2;   // ���
         System.out.print(num1 + "+" + num2 + "=");
         int input = sc.nextInt(); //1������ �Է°�
         if (result == input) {
            K++;
            t_c++;
            switch(t_c % 10) {
            case 5: {
               if(count==20) {break;}
               System.out.print( t_c+"���� ����"+"??���� �����̸� Ŀ������! >");
               System.out.println("����ҷ�?");}
            break;
            case 0:{System.out.println(t_c+"���� ���� Ŀ������!");
            if(count==20) {break;}
                     }
            default :{
               System.out.print(count +"�� ���� ���� > ����ҷ�? Y/N >> ");}
            }if(count==20) {break;}
            how = sc.next();
            if( how.equals("N")) {
               System.out.println(count+"�� �������� ������ �����մϴ�");
               break;
               }
            }else { 
               while(result !=input) {
               t_c =0;
               System.out.println(count + "�� ���� ���� �ٽ�!!!!");
               System.out.print(num1 +"+"+ num2 +"=");
               input = sc.nextInt();
               if(result == input) {
                  t_c++;
                  System.out.print(count + "�ٽ� Ǯ� ����! > ����ҷ�? Y/N >> ");
                  how = sc.next();
                  if (how.equals("N")) {
                     System.out.println(count + "�� �������� ���� ����");
                     break;
                  }
               }
               }
               if(how.equals("N")){break;}
               }
      }break;
      case "��" : while(count<=19) {    //������ȣ�� 20�������� �ްڽ��ϴ�
         count++;
         int num1 = r.nextInt(1000)+1;   // ��������1
         int num2 = r.nextInt(1000)+1;   // ��������2
         int result = num1 + num2;   // ���
         System.out.print(num1 + "+" + num2 + "=");
         int input = sc.nextInt(); //1������ �Է°�
         if (result == input) {
            K++;
            t_c++;
            switch(t_c % 10) {
            case 5: {
               if(count==20) {break;}
               System.out.print( t_c+"���� ����"+"??���� �����̸� Ŀ������! >");
               System.out.println("����ҷ�?");}
            break;
            case 0:{System.out.println(t_c+"���� ���� Ŀ������!");
            if(count==20) {break;}
                     }
            default :{
               System.out.print(count +"�� ���� ���� > ����ҷ�? Y/N >> ");}
            }if(count==20) {break;}
            how = sc.next();
            if( how.equals("N")) {
               System.out.println(count+"�� �������� ������ �����մϴ�");
               break;
               }
            }else { 
               while(result !=input) {
               t_c =0;
               System.out.println(count + "�� ���� ���� �ٽ�!!!!");
               System.out.print(num1 +"+"+ num2 +"=");
               input = sc.nextInt();
               if(result == input) {
                  t_c++;
                  System.out.print(count + "�ٽ� Ǯ� ����! > ����ҷ�? Y/N >> ");
                  how = sc.next();
                  if (how.equals("N")) {
                     System.out.println(count + "�� �������� ���� ����");
                     break;
                  }
               }
               }
               if(how.equals("N")){break;}
               }
      }break;
      case "��" :while(count<=19) {    //������ȣ�� 20�������� �ްڽ��ϴ�
         count++;
         int num1 = r.nextInt(10000)+1;   // ��������1
         int num2 = r.nextInt(10000)+1;   // ��������2
         int result = num1 + num2;   // ���
         System.out.print(num1 + "+" + num2 + "=");
         int input = sc.nextInt(); //1������ �Է°�
         if (result == input) {
            K++;
            t_c++;
            switch(t_c % 10) {
            case 5: {
               if(count==20) {break;}
               System.out.print( t_c+"���� ����"+"??���� �����̸� Ŀ������! >");
               System.out.println("����ҷ�?");}
            break;
            case 0:{System.out.println(t_c+"���� ���� Ŀ������!");
            if(count==20) {break;}
                     }
            default :{
               System.out.print(count +"�� ���� ���� > ����ҷ�? Y/N >> ");}
            }if(count==20) {break;}
            how = sc.next();
            if( how.equals("N")) {
               System.out.println(count+"�� �������� ������ �����մϴ�");
               break;
               }
            }else { 
               while(result !=input) {
               t_c =0;
               System.out.println(count + "�� ���� ���� �ٽ�!!!!");
               System.out.print(num1 +"+"+ num2 +"=");
               input = sc.nextInt();
               if(result == input) {
                  t_c++;
                  System.out.print(count + "�ٽ� Ǯ� ����! > ����ҷ�? Y/N >> ");
                  how = sc.next();
                  if (how.equals("N")) {
                     System.out.println(count + "�� �������� ���� ����");
                     break;
                  }
               }
               }
               if(how.equals("N")){break;}
               }
      }break;
      
   }   System.out.println("����������" + K*5+"�Դϴ�");
   if ( K <= 10) {System.out.println("���� ������ �ϼ��� ^^");}
   
   }
}