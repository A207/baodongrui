package methoddemo;

public class Fruit {

	/**
	 * @param args
	 */
	String name;
	int price;
	String addr;
	
	Fruit(){}
	Fruit(String n,int p,String m){
		name=n;
		price=p;
		addr=m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit("ÌÒ×Ó",6,"ÔÆÄÏ");
        System.out.println(f.name);

	}

}
