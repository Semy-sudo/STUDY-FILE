package Test;
//Ãâ·Â °á°ú°¡ 'Áøµ¾°³ ¸Û¸ÛÀÌ'
public class MyDog {
	String name1;
	//String type2;
	
	String name2;
	//String type2;
	
	public MyDog(String name1,String name2) {
		this.name2 = name2;
		this.name1 = name1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name1+name2;
	}

	
}
