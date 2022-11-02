package teht1;

import java.util.ArrayList;

public class Stack {

	ArrayList<String> list = new ArrayList<>();

	private ListItem mTop; // viite pinon huipulle
	private int mSize; // pinottujen alkioiden lukumäärä

	private ListItem head;

	public Stack() {
		mTop = null;
		mSize = 0;

	}

	// muodostaa uuden alkion ja vie sen pinon huipulle
	public void push(String aData) {

		ListItem item = new ListItem();

		item.setNext(mTop);

		item.setData(aData);

		mTop = item;
		mSize++;

	}

	// poista alkio pinon huipulta, jos pino on tyhjä palauta null
	public ListItem pop() {
		if (mSize == 0) {
			return null;
		} else {
			ListItem poistettu = new ListItem();
			poistettu = mTop;
			mTop = mTop.getNext();
			mSize--;

			return poistettu;
		}

	}

	// tulostaa pinona
	public void printItems() {
		ListItem apu = mTop;
		while (apu != null) {
			System.out.println(apu.getData());

			apu = apu.getNext();
		}
	}

	public int getSize() {
		return mSize;
	}

}
