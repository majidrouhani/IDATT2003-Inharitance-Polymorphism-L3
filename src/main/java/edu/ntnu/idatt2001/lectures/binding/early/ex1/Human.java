package edu.ntnu.idatt2001.lectures.binding.early.ex1;

import java.util.logging.Logger;

class Human {
	protected Human() {
	}

	public static void walk(Logger log) {
		log.info("Human walks");
	}
}