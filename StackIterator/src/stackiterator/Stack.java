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
public class Stack {

//        ListItem top; // top näkyy oletuspakkaukseen
	private int size;

	private String[] taulukko = new String[5];

	public Stack() {
//                top = null;
		size = 0;
	}

	// palautetaan pino-iteraattori
	public StackIterator iterator() {
		return new StackIterator(this);
	}

	// muodostetaan uusi alkio ja viedään se huipulle
	public void push(String aData) {
		taulukko[size] = aData;
		size++;
	}

	// poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
	public String pop() {
		String takeAway;
		if (size == 0) {
			takeAway = null; // pino on tyhjä
		} else {
			size--;
			takeAway = taulukko[size];
			taulukko[size] = null;
		}
		return takeAway;
	}

	// palautetaan pinottujen alkioiden lukumäärä
	public int getSize() {
		return size;
	}

	// listataan sisältö
	public void printItems() {
		for (int i = size; i > 0; i--) {
			System.out.print(taulukko[i-1]);
		}
	}
	
	public String getCurrent(int i) {
		return taulukko[i];
	}
}
