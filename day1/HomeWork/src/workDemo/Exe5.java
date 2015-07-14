package workDemo;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|1.增加一个学生|\n|2.显示所有学生|\n|3.退出程序|\n|请输入选择(1-3):");
		    Scanner scanner=new Scanner(System.in);
		    int i=scanner.nextInt();
		    if(i==1){
		    	System.out.println("|1.增加一个学生|");
		    }
		    else if(i==2){
		    	System.out.println("|2.显示所有学生|");
		    }
		    else if(i==3){
		    	System.out.println("|3.退出程序|");
		    }
		    else{
		    	System.out.println("|输入错误|");
		    }
		    }

}
