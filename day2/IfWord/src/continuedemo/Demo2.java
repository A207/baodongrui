package continuedemo;
//��ӡ1~99֮���ܹ���5��������
//����¼�²�����Ҫ������ֵĸ���
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
				//���ڴ˴���дһ�����
				continue;
			}
			num++;
	}
		
		System.out.println("num:"+num);
}
}
