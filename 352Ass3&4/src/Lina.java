//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//
//
//// public ArrayList implements List {
//// }
//
//class Sequence<E> {
//	LinkedList<E> seq;
//	
//	public Sequence(int length) {
//		seq = new LinkedList<E>();
//	}
//	
//	public int size() {
//		return seq.size();
//	}
//	
//	public boolean isEmpty() {
//		return seq.isEmpty();
//	}
//	
//	public E atIndex(int index) {
//		return seq.get(index);
//	}
//	
//	public int rankOf(E element) {
//		return seq.indexOf(element);
//	}
//	
//	public E first() {
//		return seq.getFirst();
//	}
//	
//	public E last() {
//		return seq.getLast();
//	}
//	
//	public E prev(int index) {
//		try {
//			return seq.get(index - 1);
//		}
//		catch(Exception e) {
//			throw e;
//		}
//	}
//	
//	public E next(int index) {
//		try {
//			return seq.get(index + 1);
//		}
//		catch(Exception e) {
//			throw e;
//		}
//	}
//	
//	public void set(int index, E value) {
//		seq.set(index, value);
//	}
//	
//	public void addBefore(int index, E value) {
//		seq.add(index - 1, value);
//	}
//	
//	public void addAfter(int index, E value) {
//		seq.add(index + 1, value);
//	}
//	
//	public void addFirst(E value) {
//		seq.addFirst(value);
//	}
//	
//	public void addLast(E value) {
//		seq.addLast(value);
//	}
//	
//	public void remove(int index) {
//		seq.remove(index);
//	}
//}
//
//class Node {
//	String key;
//	CarInfo obj;
//	
//	Node left;
//	Node right;
//	
//	public Node(String key, CarInfo obj) {
//		this.key = key;
//		this.obj = obj;
//		this.left = null;
//		this.right = null;
//	}
//	
//	public void setLeft(Node left) {
//		this.left = left;
//	}
//	
//	public void setRight(Node right) {
//		this.right = right;
//	}
//	
//	public String getKey() {
//		return key;
//	}
//	
//	public CarInfo getValue() {
//		return obj;
//	}
//	
//	public boolean checkKey(String key) {
//		if(this.key.equals(key)) {
//			return true;
//		}
//		return false;
//	}
//	
//	public long getNumericSumOfKey() {
//		long sum = 0;
//		for(int i = 0; i < this.key.length(); i++) {
//			sum += this.key.charAt(i);
//		}
//		return sum;
//	}
//}
//
//class BTree {
//	Node head;
//	
//	public void insert(String key, CarInfo value) {
//		if(head == null) {
//			head = new Node(key, value);
//		}
//		else {
//			Node tmp = new Node(key, value);
//			insertIntoTree(head, tmp);
//		}
//	}
//	
//	private void insertIntoTree(Node head, Node newNode) {
//		if(head.getNumericSumOfKey() < newNode.getNumericSumOfKey()) {
//			if(head.right == null)
//				head.right = newNode;
//			else
//				insertIntoTree(head.right, newNode);
//		}
//		else {
//			if(head.left == null)
//				head.left = newNode;
//			else
//				insertIntoTree(head.left, newNode);
//		}
//	}
//	
//	private Node search(Node root, String key) {
//		if(root == null) {
//			return null;
//		}
//		if(root.checkKey(key) == false) {
//			long sum = 0;
//			for(int i = 0; i < key.length(); i++) {
//				sum += key.charAt(i);
//			}
//			
//			if(root.getNumericSumOfKey() < sum) {
//				search(root.right, key);
//			}
//			else {
//				search(root.left, key);
//			}
//		}
//		return root;
//	}
//	
//	public CarInfo getValue(String key) {
//		Node obj = search(head, key);
//		if(obj != null) {
//			return obj.getValue();
//		}
//		return null;
//	}
//	
//	private long getKeyNumericSum(String key) {
//		long sum = 0;
//		for(int i = 0; i < key.length(); i++) {
//			sum += key.charAt(i);
//		}
//		return sum;
//	}
//	
//	private String minValue(Node root) 
//    { 
//        String minv = root.key; 
//        while (root.left != null) 
//        { 
//            minv = root.left.key;
//            root = root.left; 
//        } 
//        return minv; 
//    }
//	
//	private Node removeFromTree(Node root, String key) {
//		if (root == null)  return root;
//		
//        if (getKeyNumericSum(key) < root.getNumericSumOfKey()) 
//            root.left = removeFromTree(root.left, key); 
//        else if (getKeyNumericSum(key) > root.getNumericSumOfKey()) 
//            root.right = removeFromTree(root.right, key); 
//  
//        else
//        { 
//            if (root.left == null) 
//                return root.right;
//            else if (root.right == null) 
//                return root.left;
//  
//            root.key = minValue(root.right);
//            root.right = removeFromTree(root.right, root.key); 
//        } 
//  
//        return root; 
//	}
//	
//	public void remove(String key) {
//		head = removeFromTree(head, key);
//	}
//}
//
//class CarInfo {
//	String carMake;
//	String carColor;
//	
//	public CarInfo(String carMake, String carColor) {
//		this.carMake = carMake;
//		this.carColor = carColor;
//	}
//}
//
//class SmartAR {
//	
//	Sequence<Node> seqCarRegistrations;
//	BTree treeCarRegistrations;
//	
//	public SmartAR(int length) {
//		if(length < 500000) {
//			
//		}
//	}
//	
//	public void setThreshold() {
//		// 
//	}
//	
//	public void setKeyLength(int length) {
//		if(length >= 6 && length <= 12) {
//			// valid
//		}
//	}
//	
//	public void generate(int n) {
//		// generate n vehicle plates
//	}
//	
//	public Sequence<String> allKeys() {
//		// returns all keys
//		return new Sequence<String>();
//	}
//	
//	public void add(String key, CarInfo carinfo) {
//		
//	}
//	
//	public void remove(String key) {
//		
//	}
//	
//	public Sequence<CarInfo> getValues(String key) {
//		return new Sequence<CarInfo>();
//	}
//	
//	public String nextKey(String key) {
//		return "";
//	}
//	
//	public String prevKey(String key) {
//		return "";
//	}
//	
//	public Sequence<CarInfo> previousCars (String key) {
//		return null;
//	}
//}
//
//public class Lina {
//	List<Integer> abc = new ArrayList<Integer>();
//	
//}
//
