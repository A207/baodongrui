package thisdemo;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person("jim",21,"USA");
        person.introduce();
	}//该方法中的语句与语句System.out.println(this);结果一样，但一般不用后者，用main方法中的语句

}

class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;//this指当前实例对象：“我”，点语法相当于“”的
		this.age=age;
		
	}
	
	public Person(String name,int age,String address){
		this(name,age);//调用当前类的前两个参数的构造方法
		this.address=address;	
	}
	void hello(){
		System.out.println("hello.....");
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();
		//System.out.println(this);
	}
}
//this可以用在构造方法内部，用来区分同名的成员变量和局部变量
//this可以用于调用构造方法，减少代码冗余（在构造方法中通过this调用其他构造方法的语句必须是第一句）
//this可以用于调用成员属性和成员方法