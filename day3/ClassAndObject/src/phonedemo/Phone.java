package phonedemo;

public class Phone {

	/**
	 * @param args
	 */
	//���ԣ�����������������
	String name;
	String brand;
	int price;
	
	//��Ϊ��������
	void call(){//�����ķ������ͽ�void��callΪ��������
		System.out.println("��绰��������");//��������
	}
	void sendMsg(){
		System.out.println("�����š�������");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ����һ���ֻ�
		Phone p=new Phone();
		
		p.name="note";
		p.brand="sanxing";
		p.price=1900;

		System.out.println(p.name);
		p.sendMsg();
		p.call();
	}
	

}
