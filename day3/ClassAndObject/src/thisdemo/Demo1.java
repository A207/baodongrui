package thisdemo;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person("jim",21,"USA");
        person.introduce();
	}//�÷����е���������System.out.println(this);���һ������һ�㲻�ú��ߣ���main�����е����

}

class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;//thisָ��ǰʵ�����󣺡��ҡ������﷨�൱�ڡ�����
		this.age=age;
		
	}
	
	public Person(String name,int age,String address){
		this(name,age);//���õ�ǰ���ǰ���������Ĺ��췽��
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
//this�������ڹ��췽���ڲ�����������ͬ���ĳ�Ա�����;ֲ�����
//this�������ڵ��ù��췽�������ٴ������ࣨ�ڹ��췽����ͨ��this�����������췽�����������ǵ�һ�䣩
//this�������ڵ��ó�Ա���Ժͳ�Ա����