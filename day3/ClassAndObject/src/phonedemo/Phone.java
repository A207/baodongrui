package phonedemo;

public class Phone {

	/**
	 * @param args
	 */
	//属性（特征），定义属性
	String name;
	String brand;
	int price;
	
	//行为（方法）
	void call(){//方法的返回类型叫void，call为方法名称
		System.out.println("打电话。。。。");//方法主体
	}
	void sendMsg(){
		System.out.println("发短信。。。。");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化一个手机
		Phone p=new Phone();
		
		p.name="note";
		p.brand="sanxing";
		p.price=1900;

		System.out.println(p.name);
		p.sendMsg();
		p.call();
	}
	

}
