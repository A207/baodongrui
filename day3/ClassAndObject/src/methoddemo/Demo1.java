package methoddemo;

public class Demo1 {

	/**
	 * @param args
	 */ 
	String name;
	int age;
	String address;
	/*//�޲�Ĭ�Ϲ��췽��
	Demo1(){}*/
	//�вι��췽��
	Demo1(String n,int a,String add){
		name=n;
		age=a;
		address=add;
	}
	//���ҽ���
	void introduce(){
		System.out.println("��Һã��ҽ�"+name+"���ҽ���"+age+"���ˣ��Ҽ���"+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Demo1 person=new Demo1();//ʵ����һ��demo����
		person.name="С��";
		person.age=21;
		person.address="�Ϸ�";*/
		
		Demo1 person=new Demo1("jim",21,"�Ϸ�");
		
		person.introduce();
		//��û�й��췽��ʱ��ϵͳ���Զ�����һ��Ĭ�Ϲ��췽��Demo1����
		//���췽����һ�ֱȽ�����ķ�����û�з������ͣ�����������ͬ��

	}

}