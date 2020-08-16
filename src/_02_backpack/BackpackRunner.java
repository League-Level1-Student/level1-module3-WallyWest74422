package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
	Pencil pencil=	new Pencil();
	 pencil.write("writing");
    Ruler ruler = new Ruler();
    ruler.measure();
    Textbook textbook = new Textbook();
    textbook.read();
    Backpack backpack = new Backpack();
    backpack.putInBackpack(pencil);
    backpack.putInBackpack(ruler);
    backpack.putInBackpack(textbook);
	backpack.packAndCheck();
	}
}
