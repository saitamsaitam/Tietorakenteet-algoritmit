/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

/**
 *
 * @author kamaj
 */
interface Iterator {

	boolean hasNext();

	Object next();
}

public class StackIterator implements Iterator {

	private String current = "";
	private Stack container; // container on tietorakenne, jota iteroidaan
	public int i;

	StackIterator(Stack c) { // konstruktori on "package visible"
		container = c;
//		current = container.getCurrent(container.getSize() - 1);
		i = container.getSize();
	}

	// palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
	// hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai
	// ei.
	public boolean hasNext() {
		if (current == null)
			return false;
		else
			return true;
	}

	// palautetaan nykyinen (string) ja siirretään nykypositiota pykälä
	// eteenpäin
	public String next() {
		i--;

		if(container.getSize() == 0) {
			System.out.println("Pino on tyhjä");
		}

		if (i < 0) {
			current = null;
			return "";
		}
		

		current = container.getCurrent(i);

		String oldCurrent = current;

		return oldCurrent;
	}

}
