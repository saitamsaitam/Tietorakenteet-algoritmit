
import java.util.ArrayList;

public class Queue {

	ArrayList<String> list = new ArrayList<>();

	private ListItem mTop; // viite pinon huipulle
	private int mSize; // pinottujen alkioiden lukumäärä

	private ListItem head;
	private ListItem tail;

	public Queue() {
		mTop = null;
		mSize = 0;

	}

	// muodostaa uuden alkion ja vie sen pinon huipulle
	public void push(String aData) {

		mTop = new ListItem();
		mTop.setData(aData);

		mTop.setNext(head);

//		head = mTop;
//		tail = mTop;

		if (list.size() == 0) {
			head = mTop;
			tail = mTop;
		} else {
			tail = mTop;
		}

		list.add(aData);
		mSize++;
	}

	// poista alkio pinon huipulta, jos pino on tyhjä palauta null
	public ListItem pop() {
		if (list.size() == 0) {
			return null;
		} else {
			mTop.setData(list.remove(0));
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

	public int getSize() {
		return mSize;
	}

}
