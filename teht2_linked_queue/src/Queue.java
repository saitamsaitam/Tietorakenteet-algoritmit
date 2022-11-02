
import java.util.ArrayList;



public class Queue {

	ArrayList<String> list = new ArrayList<>();

	private ListItem head; // viite pinon huipulle
	private int mSize; // pinottujen alkioiden lukumäärä

	private ListItem tail;

	public Queue() {
		head = null;
		tail = null;
		mSize = 0;

	}

	// muodostaa uuden alkion ja vie sen jonoon
	public void push(String aData) {

		ListItem item = new ListItem();
		item.setData(aData);

		
		if(mSize == 0) {
			item.setNext(head);
			head = item;
		} else {
			tail.setNext(item);
		}
		
		
		tail = item;
		
		mSize++;
	}

	// poista alkio pinon huipulta, jos pino on tyhjä palauta null
	public ListItem pop() {
		if (mSize == 0) {
			return null;
		} else {
			ListItem poistettu = new ListItem();
			poistettu = head;
			head = head.getNext();
			mSize--;

			return poistettu;
		}
	}

	public void printItems() {
		ListItem apu = head;
		while (apu != null) {
			System.out.println(apu.getData());

			apu = apu.getNext();
		}
	}
	


	public int getSize() {
		return mSize;
	}

}
