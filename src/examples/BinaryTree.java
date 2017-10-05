package examples;

public class BinaryTree {
	
	Node root;
	
	public void addNode(int key, String name){
		
		Node newNode = new Node(key, name);
		
		if(root == null){
			root = newNode;
			
		}else{
			Node current = root;
			
			Node parent;
			
			while(true){
				parent = current;
				
				if(key < current.key){
					current = current.leftChild;
					
					if(current == null){
						parent.leftChild = newNode;
						return;
					}
					
				}else{
					current = current.rightChild;
					
					if(current == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node current){
		if(current!=null){
			inOrderTraverseTree(current.leftChild);
			
			System.out.println(current);
			
			inOrderTraverseTree(current.rightChild);
			
		}
	}
	
	public void preorderTraverseTree(Node current){
		if(current != null){
			System.out.println(current);
			
			preorderTraverseTree(current.leftChild);
			
			preorderTraverseTree(current.rightChild);
			
		}
	}
	
	public void pastOrderTraverseTree(Node current){
		if(current != null){
			//pastOrderTraverseTree(current.rightChild);
			
			//System.out.println(current);
			
			pastOrderTraverseTree(current.leftChild);
			pastOrderTraverseTree(current.rightChild);
			
			System.out.println(current);
		}
	}
	
	public Node findNode(int key){
		Node current = root;
		while(current.key != key){
			if(key<current.key){
				current = current.leftChild;
			}else{
				current = current.rightChild;
			}
			
			if(current == null){
				return null;
			}
			
		}
		
		return current;
	}
	
	
	public static void main(String args[]){
		
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice Pres");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales Manager");
		theTree.addNode(85, "Salesman 1");
		
		System.out.println("In order traverse \n");
		theTree.inOrderTraverseTree(theTree.root);
		
		System.out.println("\n Preorder traverse \n");
		theTree.preorderTraverseTree(theTree.root);
		
		System.out.println("\n Past order traverse");
		theTree.pastOrderTraverseTree(theTree.root);
		
		System.out.println("");
		System.out.println(theTree.findNode(15));
	}
	
	

}

class Node{
	int key;
	String name;
	Node leftChild;
	Node rightChild;
	
	public Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString(){
		return name +" has a key "+ key;
	}
}
