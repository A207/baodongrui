package whiledemo;
//找出1~99之间能被5整除的数,用while与do while
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
