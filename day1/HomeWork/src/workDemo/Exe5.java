package workDemo;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|1.����һ��ѧ��|\n|2.��ʾ����ѧ��|\n|3.�˳�����|\n|������ѡ��(1-3):");
		    Scanner scanner=new Scanner(System.in);
		    int i=scanner.nextInt();
		    if(i==1){
		    	System.out.println("|1.����һ��ѧ��|");
		    }
		    else if(i==2){
		    	System.out.println("|2.��ʾ����ѧ��|");
		    }
		    else if(i==3){
		    	System.out.println("|3.�˳�����|");
		    }
		    else{
		    	System.out.println("|�������|");
		    }
		    }

}
