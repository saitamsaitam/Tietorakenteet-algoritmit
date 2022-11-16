/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

import java.util.LinkedList;

/**
 *
 * @author kamaj
 */
public class Stack {


	private LinkedList<String> list;

	public Stack() {
		list = new LinkedList<String>();
	}

	// palautetaan pino-iteraattori
	public StackIterator iterator() {
		return new StackIterator(this);
	}

	// muodostetaan uusi alkio ja viedään se huipulle
	public void push(String aData) {
		list.add(aData);
	}

	// poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
	public String pop() {
		String takeAway;
		
		if(list.size() == 0) {
			return null;
		}
		
		takeAway = list.removeLast();
		return takeAway;
	}

	// palautetaan pinottujen alkioiden lukumäärä
	public int getSize() {
		return list.size();
	}

	// listataan sisältö
	public void printItems() {
		
		if(list.size() == 0) {
			System.out.println("Pino on tyhjä");
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}

	public String getCurrent(int i) {
		return list.get(i);
	}
}
