package whiledemo;
//�ҳ�1~99֮���ܱ�5��������,��while��do while
public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
while(i<=99){
	if(i%5==0){
		System.out.println(i+"\t");
	}
	i++;
}
int i1=1;
do{
	if(i1%5==0){
		System.out.println(i1+"\t");
	}
	i1++;
}while(i1<=99);
	}

}