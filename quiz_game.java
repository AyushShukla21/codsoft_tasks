import java.util.Scanner;
public class quiz_game{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int score=0;
      int count=5;
      System.out.println("Welcome To The Quiz");
      String q1="Question.1 How many numbers of primitive data types in Java ?";
      String q2="Question.2 What is the size of float and double in java?";
      String q3="Question.3 Automatic type conversion is possible in which of the possible cases?";
      String q4="Question.4 When an array is passed to a method, what does the method receive?";
      String q5="Question.5 Identify the corrected definition of a package.";
      
      String questionlist[][]={{q1,"1. 6","2. 7","3. 8","4. 9" },{q2,"1. 32 and 64",
      "2. 32 and 32","3. 64 and 64","4. 64 and 32"},{q3,"1. Byte to Int","2. Int to Long","3. Long to int",
      "4. Short to Int"},{q4,"1. The reference of array","2. A Copy of the array","3. length of the array",
      "4. copy of the first element"},{q5,"1. A package is a collection of editing tools",
      "2.  A package is a collection of classes","3.  A package is a collection of classes and interfaces",
      "4.  A package is a collection of interfaces"}};
      System.out.println("Enter the Game Mode");
      System.out.println("1.EASY\n2.MEDIUM\n3.HARD");
      int mode=sc.nextInt();
      int t=0;
      System.out.println("Rules for the Quiz");
      if(mode==1){
        t+=30;
        System.out.println("Your time limit is "+t+" seconds per question");
      }
      else if(mode==2){
        t+=20;
        System.out.println("Your time limit is "+t+" seconds per question");
      }
      else if(mode==3){
        t+=10;
        System.out.println("Your time limit is "+t+" seconds per question");
      }
      System.out.println("Enter any key to start the quiz");
      String startquiz=sc.next();

      int[] questiontimelimit={t,t,t,t,t};
      for(int i=0;i<count;i++){
        for(int j=0;j<5;j++){
          System.out.println(questionlist[i][j]);
          }
      System.out.println("Choose any Option to enter the answer");
      long start_time=System.currentTimeMillis();
          int ans=sc.nextInt();
          long end_time=System.currentTimeMillis();
          long time_taken=(end_time-start_time)/1000;
          System.out.println("time taken : "+time_taken);
          if(time_taken>questiontimelimit[i]){
            System.out.println("Time's Up!\nTry Again !");

          }
          if(i==0){
            if(ans==3){
              score++;
              if(time_taken>questiontimelimit[i]){
                score--;
              }
              System.out.println("Right Answer\nYour Score is "+score);
              
              }
            else{
              System.out.println("Incorrect Answer");
            }
            System.out.println("Enter any key for next Question");
            String a=sc.next();
          }
          else if(i==1){
            if(ans==1){
              score++;
              if(time_taken>questiontimelimit[i]){
                score--;
              }
              System.out.println("Right Answer\nYour Score is "+score);
            }
            else{
              System.out.println("Incorrect Answer");
            }
            System.out.println("Enter any key for next Question");
            String a=sc.next();
          }
          else if(i==2){
            if(ans==2){
              score++;
              if(time_taken>questiontimelimit[i]){
                score--;
              }
              System.out.println("Right Answer\nYour Score is "+score);

            }
            else{
              System.out.println("Incorrect Answer\nYour Score is "+score);
            }
            System.out.println("Enter any key for next Question");
            String a=sc.next();
          }
          else if(i==3){
            if(ans==1){
              score++;
              if(time_taken>questiontimelimit[i]){
                score--;
              }
              System.out.println("Right Answer\nYour Score is "+score);

            }
            else{
              System.out.println("Incorrect Answer \nYour Score is "+score);
            }
            System.out.println("Enter any key for next Question");
            String a=sc.next();
          }
          else if(i==4){
            if(ans==3){
              score++;
              if(time_taken>questiontimelimit[i]){
                score--;
              }
              System.out.println("Right Answer");

            }
            else{
              System.out.println("Incorrect Answer");
          }
         System.out.println("Your Total Score is "+score+"/5");
         System.out.println("Quiz Ended");
        }
    
    }
}
}

