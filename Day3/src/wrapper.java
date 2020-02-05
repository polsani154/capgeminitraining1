
public class wrapper {

	public wrapper() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer k=new Integer(a);
		System.out.println(k.intValue());
		Character ch=new Character('s');
		System.out.println(ch.MAX_VALUE);
		String s = new String("polsani");
		byte by=-128;  //Byte is from -128 to 127
		Byte byt = new Byte(by);
		System.out.println(byt.byteValue());
		System.out.println(s.charAt(3));
	}

}
