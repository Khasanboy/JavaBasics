package examples;

public class BinaryTreeMine {

	TreeNode root;

	public void addNode(int key, String name) {

		TreeNode newNode = new TreeNode(key, name);
		

		if (root == null) {
			
			root = newNode;
			
		} else {
			
			TreeNode current = root;
			TreeNode parent;
			
			while(true){
			
				parent = current;
				
				if (key < current.key) {
					
					current = current.leftChild;
					
					if(current == null){
						parent.leftChild = newNode;
						return;
					}
				}
				else{
					
					current = current.rightChild;
					
					if(current == null){
						parent.rightChild = newNode;
						return;
					}
				}

			}
			
			
		}
	}
	
	public void inOrderTraverse(TreeNode root2){
		if(root2!= null){
			inOrderTraverse(root2.leftChild);
			System.out.println(root2);
			inOrderTraverse(root2.rightChild);
		}
		
	}
	
	public void preorderTraverse(TreeNode current){
		if(current!= null){
			System.out.println(current);
			preorderTraverse(current.leftChild);
			preorderTraverse(current.rightChild);
		}
	}
	
	public void postOrderTraverse(TreeNode current){
		if(current != null){
			postOrderTraverse(current.leftChild);
			postOrderTraverse(current.rightChild);
			System.out.println(current);
		}
	}
	
	public TreeNode find(int key){
		
		TreeNode current = root;
		
		while(current.key != key){
		if(key<current.key){
			current = current.leftChild;
		}
		else{
			current = current.rightChild;
		}
		
		if(current == null)
			
			return null;
		
		}
		
		return current;
		
	}
	
	public TreeNode findMin(BinaryTreeMine tree){
		TreeNode current = tree.root;
		
		while(current != null){
			if(current.leftChild != null){
				current = current.leftChild;
			}
			else{
				break;
			}
		}
		
		return current;
		
	}
	
	public TreeNode findMax(BinaryTreeMine tree){
		TreeNode current = tree.root;
		
		while(current != null){
			if(current.rightChild != null){
				current = current.rightChild;
			}
			else{
				break;
			}
			
		}
		
		return current;
	}
	
	public static void main(String agrs[]){
		
		BinaryTreeMine tree = new BinaryTreeMine();
		
		tree.addNode(40, "John");
		tree.addNode(12, "Bob");
		tree.addNode(15, "Maarika");
		tree.addNode(19, "Lola");
		tree.addNode(36, "Layli");
		tree.addNode(55, "Malika");
		tree.addNode(71, "Muhammad");
		tree.addNode(68, "Akmal");
		
		tree.inOrderTraverse(tree.root);
		
		System.out.println();
		
		tree.preorderTraverse(tree.root);
		
		System.out.println();
		
		tree.postOrderTraverse(tree.root);
		
		System.out.println();
		
		System.out.println(tree.find(71));
		
		System.out.println(tree.findMin(tree));
		
		System.out.println(tree.findMax(tree));
		
	}

}

class TreeNode {

	int key;
	String name;
	TreeNode leftChild;
	TreeNode rightChild;

	public TreeNode(int key, String name) {
		this.key = key;
		this.name = name;
	}

	public String toString() {
		return name + " has key " + key;
	}
}