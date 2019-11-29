import java.util.*;

public class Sequence extends LinkedList<Node>{
	
	
	CarInfo getValues(String key) {
		Node node = getFirst();
		for(int i = 1; i<this.size(); i++) {
			if(node.key == key) {
				return node.values;
			}
			node = this.get(i);
		}
		return null;
	}
	
	String getNext(String key) {
		Node node = getFirst();
		for(int i = 1; i<this.size(); i++) {
			if(node.key == key) {
				return node.next.key;
			}
			node = this.get(i);
		}
		return null;
	}
	
	
	String getPrev(String key) {
		Node node = getFirst();
		for(int i = 1; i<this.size(); i++) {
			if(node.key == key) {
				return node.prev.key;
			}
			node = this.get(i);
		}
		return null;
	}
	
	
	Sequence previousCars(String key) {
		Node node = getFirst();
		for(int i = 1; i<this.size(); i++) {
			if(node.key == key) {
				return node.history;
			}
			node = this.get(i);
		}
		return null;
	}
	
}


