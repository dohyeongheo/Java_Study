package ex_220121;
import java.util.Random;
import java.util.Scanner;
public class test01 {
   public static void main(String[] args) {
      Random r = new Random();      
      Scanner sc = new Scanner(System.in);
      String how ="";
      String level = "";
      int count = 0; //문제 번호
      int t_c = 0; //연속으로 맞춘 문제 수
      int K = 0; //맞춘 문제 수
      System.out.print("난이도 상, 중, 하 입력 >> ");
      switch (level=sc.next()) {
      case "하" : while(count<=19) {    //문제번호는 20번까지만 받겠습니다
         count++;
         int num1 = r.nextInt(10)+1;   // 랜덤숫자1
         int num2 = r.nextInt(10)+1;   // 랜덤숫자2
         int result = num1 + num2;   // 결과
         System.out.print(num1 + "+" + num2 + "=");
         int input = sc.nextInt(); //1번문제 입력값
         if (result == input) {
            K++;
            t_c++;
            switch(t_c % 10) {
            case 5: {
               if(count==20) {break;}
               System.out.print( t_c+"연속 정답"+"??연속 정답이면 커피쿠폰! >");
               System.out.println("계속할래?");}
            break;
            case 0:{System.out.println(t_c+"연속 정답 커피쿠폰!");
            if(count==20) {break;}
                     }
            default :{
               System.out.print(count +"번 문제 성공 > 계속할래? Y/N >> ");}
            }if(count==20) {break;}
            how = sc.next();
            if( how.equals("N")) {
               System.out.println(count+"번 문제에서 게임을 종료합니다");
               break;
               }
            }else { 
               while(result !=input) {
               t_c =0;
               System.out.println(count + "번 문제 실패 다시!!!!");
               System.out.print(num1 +"+"+ num2 +"=");
               input = sc.nextInt();
               if(result == input) {
                  t_c++;
                  System.out.print(count + "다시 풀어서 성공! > 계속할래? Y/N >> ");
                  how = sc.next();
                  if (how.equals("N")) {
                     System.out.println(count + "번 문제에서 게임 종료");
                     break;
                  }
               }
               }
               if(how.equals("N")){break;}
               }
      }break;
      case "중" : while(count<=19) {    //문제번호는 20번까지만 받겠습니다
         count++;
         int num1 = r.nextInt(1000)+1;   // 랜덤숫자1
         int num2 = r.nextInt(1000)+1;   // 랜덤숫자2
         int result = num1 + num2;   // 결과
         System.out.print(num1 + "+" + num2 + "=");
         int input = sc.nextInt(); //1번문제 입력값
         if (result == input) {
            K++;
            t_c++;
            switch(t_c % 10) {
            case 5: {
               if(count==20) {break;}
               System.out.print( t_c+"연속 정답"+"??연속 정답이면 커피쿠폰! >");
               System.out.println("계속할래?");}
            break;
            case 0:{System.out.println(t_c+"연속 정답 커피쿠폰!");
            if(count==20) {break;}
                     }
            default :{
               System.out.print(count +"번 문제 성공 > 계속할래? Y/N >> ");}
            }if(count==20) {break;}
            how = sc.next();
            if( how.equals("N")) {
               System.out.println(count+"번 문제에서 게임을 종료합니다");
               break;
               }
            }else { 
               while(result !=input) {
               t_c =0;
               System.out.println(count + "번 문제 실패 다시!!!!");
               System.out.print(num1 +"+"+ num2 +"=");
               input = sc.nextInt();
               if(result == input) {
                  t_c++;
                  System.out.print(count + "다시 풀어서 성공! > 계속할래? Y/N >> ");
                  how = sc.next();
                  if (how.equals("N")) {
                     System.out.println(count + "번 문제에서 게임 종료");
                     break;
                  }
               }
               }
               if(how.equals("N")){break;}
               }
      }break;
      case "상" :while(count<=19) {    //문제번호는 20번까지만 받겠습니다
         count++;
         int num1 = r.nextInt(10000)+1;   // 랜덤숫자1
         int num2 = r.nextInt(10000)+1;   // 랜덤숫자2
         int result = num1 + num2;   // 결과
         System.out.print(num1 + "+" + num2 + "=");
         int input = sc.nextInt(); //1번문제 입력값
         if (result == input) {
            K++;
            t_c++;
            switch(t_c % 10) {
            case 5: {
               if(count==20) {break;}
               System.out.print( t_c+"연속 정답"+"??연속 정답이면 커피쿠폰! >");
               System.out.println("계속할래?");}
            break;
            case 0:{System.out.println(t_c+"연속 정답 커피쿠폰!");
            if(count==20) {break;}
                     }
            default :{
               System.out.print(count +"번 문제 성공 > 계속할래? Y/N >> ");}
            }if(count==20) {break;}
            how = sc.next();
            if( how.equals("N")) {
               System.out.println(count+"번 문제에서 게임을 종료합니다");
               break;
               }
            }else { 
               while(result !=input) {
               t_c =0;
               System.out.println(count + "번 문제 실패 다시!!!!");
               System.out.print(num1 +"+"+ num2 +"=");
               input = sc.nextInt();
               if(result == input) {
                  t_c++;
                  System.out.print(count + "다시 풀어서 성공! > 계속할래? Y/N >> ");
                  how = sc.next();
                  if (how.equals("N")) {
                     System.out.println(count + "번 문제에서 게임 종료");
                     break;
                  }
               }
               }
               if(how.equals("N")){break;}
               }
      }break;
      
   }   System.out.println("수학점수는" + K*5+"입니다");
   if ( K <= 10) {System.out.println("수학 공부좀 하세요 ^^");}
   
   }
}