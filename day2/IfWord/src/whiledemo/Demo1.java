package whiledemo;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //System.out.println(1);
    //System.out.println(2);
     //初始条件
    int i=1;
    while(i<=100){
    	System.out.println(i);
    	i++;
    }
    
    System.out.println("跳出循环后i的值："+i);

	
	do{
		System.out.println(i);
		i++;//增量
	}while(i<1);
}
}
