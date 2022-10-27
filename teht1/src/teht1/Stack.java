package teht1;

import java.util.ArrayList;

public class Stack {

	ArrayList<String> list = new ArrayList<>();

	private ListItem mTop;	// viite pinon huipulle
	private int mSize;		// pinottujen alkioiden lukumäärä
	
	
	public Stack() {
		mTop = null;
		mSize = 0;
	}

	
	// muodostaa uuden alkion ja vie sen pinon huipulle
	public void push(String aData) {
		list.add(aData);
	}
	
	// poista alkio pinon huipulta, jos pino on tyhjä palauta null
	public ListItem pop() {
		if(list.size() == 0) {
			return null;			
		}
		else {
			list.remove(list.size() - 1);
			return null;
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
