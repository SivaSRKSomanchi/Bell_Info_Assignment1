package assignment2;

public class VisibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards card = new Cards();
		System.out.println(card.getS());
		System.out.println(card.getA());
		System.out.println(card.getB());
	}

}

class Cards extends jockey {
	String s;

	public String getS() {
		return "Inside Cards Class";
	}
}

interface king {
	public static final String a = "Inside King ";

	public String getA();
}

interface queen {
	public static final int b = 15;

	public int getB();
}

abstract class jockey implements king, queen {
	@Override
	public String getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return b;
	}
}
