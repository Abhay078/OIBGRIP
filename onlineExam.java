import java.util.Scanner;
class examination
{

    Scanner sc = new Scanner (System.in);
  void function (){
String n="N0";
 while(n!="yes"){
   System.out.println();
    System.out.println();
    System.out.println ("1. Take a quiz ");
    System.out.println ("2. Update profile/Password ");
    System.out.println ("3. Log out ");
    System.out.println ("                                                Choose any one following above Action:- ");
    int choose = sc.nextInt ();
    switch (choose)
      {
      case 1:
	System.out.
	  println ("                                              <-<-<-<-<-QUIZ INSTRUCTIONS->->->->->");
	System.out.println ("1->>>This exam has 2 section A & B ");
	System.out.println ("2->>>Each question are MCQs type having 4 options and only one correct answer");
	System.out.
	  println
	  ("3->>>Each question contain 2 marks in section A & 5 marks in section B");
	System.out.println ("4->>>There is negative marking of 1 marks");
	System.out.println ("                                               Are you ready to play?");
	String ready = sc.next ();
	if (ready.equals ("yes"))
	  {
	    System.out.
	      println
	      ("                                     SECTION-A                                                ");
	    int count = 0;
	      System.out.
	      println
	      ("1) What is full form of JDK? \n 1. Java Development Kit \n 2. Java Destruction Kit \n 3. Java Deployment Kit \n 4. Java Runtime Environment");
	    int ans1 = sc.nextInt ();
	    if (ans1 == 1)
	      {
		count += 2;
	      }
	    else
	      {
		count -= 1;
	      }
	    System.out.
	      println
	      ("2) Number of primitive data types in Java are? \n 1. 6 \n 2. 7 \n 3. 8 \n 4. 9");
	    int ans2 = sc.nextInt ();
	    if (ans2 == 3)
	      {
		count += 2;
	      }
	    else
	      {
		count -= 1;
	      }
	    System.out.
	      println
	      ("3) Arrays in java are- \n 1. Object references \n 2. objects \n 3. Primitive data types \n 4. None");
	    int ans3 = sc.nextInt ();
	    if (ans3 == 3)
	      {
		count += 2;
	      }
	    else
	      {
		count -= 1;
	      }
	    System.out.
	      println
	      ("4) Automatic type conversion is possible in which of the possible cases? \n 1. Byte to int \n 2. Int to long \n 3. Long to Int \n 4. Short to Int");
	    int ans4 = sc.nextInt ();
	    if (ans4 == 2)
	      {
		count += 2;
	      }
	    else
	      {
		count -= 1;
	      }
	    System.out.
	      println
	      ("5) Select the valid statement to declare and initialize an array? \n 1. int[] A={} \n 2. int[] A={1,2,3} \n 3. int[] A=(1,2,3) \n 4. int[][] A={1,2,3}");
	    int ans5 = sc.nextInt ();
	    if (ans5 == 3)
	      {
		count += 2;
	      }
	    else
	      {
		count -= 1;
	      }
	    System.out.
	      println
	      ("                                     SECTION-B                                                ");
	    System.out.
	      println
	      ("1) Find the value of A[1] after execution of the following program. \n int[] A = {0,2,4,1,3}; \n for(int i = 0; i < a.length; i++) \n {a[i] = a[(a[i] + 3) % a.length];} \n 1. 0 \n 2. 1 \n 3. 2 \n 4. 3");
	    int ans6 = sc.nextInt ();
	    if (ans6 == 2)
	      {
		count += 5;
	      }
	    else
	      {
		count -= 1;
	      }
	    System.out.
	      println
	      ("2) Identify the corrected definition of a package. \n 1. A package is the collections of editing tools \n 2. A package is a collection of classes \n 3. A package is a collection of classes and interfaces \n 4. A package is a collection of interfaces  ");
	    int ans7 = sc.nextInt ();
	    if (ans7 == 3)
	      {
		count += 5;
	      }
	    else
	      {
		count -= 1;
	      }
	      if(10>count){
	          System.out.print("                                 Result: "+count+"/20 \n Poor performance :(");
	          break;
	      }
	      else if(10<count && count<19){
	          System.out.print("                                 Result: "+count+"/20 \n Good performance :)");
	          break;
	      }
	      else if(count==20){
	          System.out.print("                                 Result: "+count+"/20 \n                                  Excellent performance 100%");
	          break;
	      }
	  }
	else
	  {
	    System.out.println ("------------------------------------THANK YOU FOR VISIT--------------------------------------");
	    break;
	  }
      case 2:
	System.out.println ("Enter old password");
	String pass = sc.next();
	    if (pass.equals ("1234"))
	      {System.out.println();
	      System.out.println();
		System.out.println ("Enter new password");
		String newPass = sc.next ();
		System.out.println();
		System.out.println();
		System.out.println ("Confirm new password");
		String conNewPass = sc.next ();	//  from user
		if (newPass.equals (conNewPass))
		  {
		    String password = newPass;
		    System.out.print ("                                                 Password Changed Successfully!!!!");
		    break;
		  }
		else
		  {
		    System.out.
		      print ("                                                          Wrong confirmation.. password not changed");
		      break;

		  }
	      }
	    else
	      {
		System.out.println("                                                    Enter the correct old password next time.........Thank you! ");
		break;
	      }
	  

      case 3:
          System.out.println();
          System.out.println();
          System.out.print("-----------------------------------THANK YOU FOR VISIT......Have a Nice Day :) ---------------------------------");
	System.exit (0);

      }

  
  System.out.println();
  System.out.println();
  System.out.println();
  System.out.println("                                                          Are u want to go home page ?");
  n=sc.next();}
}
}

class onlineExam
{

  public static void main (String[]args)
  {
    System.out.
      println
      ("                            --------------WELCOME TO OUR ONLINE EXAMINATION PORTAL--------------                      ");
    System.out.
      println ("----------Please Enter your Following Details----------");
    examination obj = new examination ();
    

    Scanner input1 = new Scanner (System.in);
      System.out.print ("Enter Username : ");
    String username = input1.next ();

    Scanner input2 = new Scanner (System.in);
    System.out.println();
      System.out.print ("Enter Password : ");
    String password = input2.next ();

    if (username.equals ("abhay078") && password.equals ("1234"))
      {System.out.println();
      System.out.println();
	System.out.println ("                                                    Access Granted! Welcome!");
	obj.function ();
      }
    else if (username.equals ("abhay078"))
      {
	System.out.println ("                   Invalid Password!");
	System.out.println ("-------------------Please Try Again------------------");
      }
    else if (password.equals ("1234"))
      {
	System.out.println ("                 Invalid Username!");
	System.out.println ("-----------------Please Try Again------------------");
      }
      
    else
      {
	System.out.
	  println ("                                             Oops.... Invalid Username & Password!   Try Again");
      }



  }

}