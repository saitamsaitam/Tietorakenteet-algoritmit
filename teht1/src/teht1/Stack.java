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

		mTop = new ListItem();

		mTop.setNext(head);
		head = mTop;

		mTop.setData(aData);
		list.add(aData);
		mSize++;

	}

	// poista alkio pinon huipulta, jos pino on tyhjä palauta null
	public ListItem pop() {
		if (list.size() == 0) {
			return null;
		} else {
			mTop.setData(list.remove(list.size() - 1));
			mSize--;

			return mTop;
		}
	}

	// tulosta pinon sisältö muuttamatta pinoa
	public void printItems() {
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	// tulostaa pinona (kesken)
//	public void printItems() {
//		ListItem apu = mTop;
//		while(apu != null) {
//			System.out.println(apu.getData());
//			
//			apu = apu.getNext();
//		}
//	}

	public int getSize() {
		return mSize;
	}

}
