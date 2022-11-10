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

	private String current;
	private Stack container; // container on tietorakenne, jota iteroidaan
	private int i;

	StackIterator(Stack c) { // konstruktori on "package visible"
		container = c;
		current = container.getCurrent(container.getSize() - 1);
		i = container.getSize() - 1;
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

	// palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä
	// eteenpäin
	public String next() {
		String oldCurrent = current;

//		System.out.println("current: " + current);
//		System.out.println("i :" + i);
		
		if (i < 0) {
			current = null;
//			return current;
		}

//		System.out.println("getcurrent: " + container.getCurrent(0));
		System.out.println("ennen get i: " +i);
		current = container.getCurrent(i); // no work
		i--;
		return oldCurrent;
	}

}
