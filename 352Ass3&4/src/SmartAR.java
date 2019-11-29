import java.util.*;





public class SmartAR {
	
	int threshold; 
	Sequence mySequ;
	BinaryTree myAVL;
	Sequence allKeys;
	
	void setThreshold(int Threshold) {
		this.threshold = Threshold;
	}
	
	void setKeyLength(int Length) {
		
	}
	
	//https://www.leveluplunch.com/java/exercises/generate-vehicle-plate-numbers/
	
	String generate(int n) {
		//String num;
		StringBuilder num = new StringBuilder();
		int numLetters = (int)((Math.random()*100)%13);
		int numNums = 12 - numLetters;
		
	    for (int i = 0; i < numLetters; i++) {
	        char ch = (char) (Math.random() * 26 + 'A');
	        num.append(ch);
	    }
	    for (int i = 0; i < numNums; i++) {
	        char digit1 = (char) (Math.random() * 10 + '0');
	        num.append(digit1);
	    }
	    String num1 = num.toString();
		return num1;
	}
	
	Sequence allKeys() {
		return this.allKeys;
	}
	
	void add(String key, String value) {
		Node node = new Node(key);
		if(myAVL == null) {
			mySequ.add(node);
		}	
	}
	
	void remove(String key) {
		if(myAVL == null) mySequ.remove(key);
	}
	
	CarInfo getValues(String key) {
		if (myAVL == null) return mySequ.getValues(key);
		return null;
	}
	
	String nextKey(String key) {
		if (myAVL == null) return mySequ.getNext(key);
		return null;
	}
	
	String nextPrev(String key) {
		if (myAVL == null) return mySequ.getNext(key);
		return null;
	}
	
	Sequence previousCars(String key) {
		if (myAVL == null) return mySequ.previousCars(key);
		else return null;
	}
	
}

