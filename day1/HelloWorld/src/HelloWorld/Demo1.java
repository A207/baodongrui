package HelloWorld;
//�������number�ķ���
public class Demo1 {
	static int number;//�����number�Ķ���,�����������棬����ͨ�ĳ�Ա����ǰ��static

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ�ַ�������main��������һ�����
        System.out.println(Demo1.number);//���ʷ�ʽ������.������
        //�ڶ��ַ������´�����Ķ���ͨ����������������������������ʵ��������
        Demo1 demo2=new Demo1();//�´����ĵ�ǰ��Ķ���
        System.out.println(demo2.number);//���ʷ�ʽ������.������
	}

}