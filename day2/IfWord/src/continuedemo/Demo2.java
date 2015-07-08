package continuedemo;
//打印1~99之间能够被5整除的数
//并记录下不符合要求的数字的个数
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.println(i);
				//请在此处填写一条语句
				continue;
			}
			num++;
	}
		
		System.out.println("num:"+num);
}
}
