
class Node 
{ 
    int data; 
    Node left, right; 
  
public Node(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
} 

public class BinarySearchTree 
{ 
	    Node root; 
	  
	    static int findMax(Node node) 
	    { 
	        if (node == null) 
	            return Integer.MIN_VALUE; 
	  
	        int res = node.data; 
	        int lres = findMax(node.left); 
	        int rres = findMax(node.right); 
	  
	        if (lres > res) 
	            res = lres; 
	        if (rres > res) 
	            res = rres; 
	        return res; 
	    } 
	    
	    static int findMin(Node node) 
	    { 
	        if (node == null) 
	            return Integer.MAX_VALUE; 
	      
	        int res = node.data; 
	        int lres = findMin(node.left); 
	        int rres = findMin(node.right); 
	      
	        if (lres < res) 
	            res = lres; 
	        if (rres < res) 
	            res = rres; 
	        return res; 
	    } 
	
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree(); 
        tree.root = new Node(22); 
        tree.root.left = new Node(7); 
        tree.root.right = new Node(3); 
        tree.root.left.right = new Node(6); 
        tree.root.left.right.left = new Node(1); 
        tree.root.left.right.right = new Node(15); 
        tree.root.right.right = new Node(9); 
        tree.root.right.right.left = new Node(8); 
  
        System.out.println("Maximum eleman: "+ tree.findMax(tree.root)); 
		System.out.print("Minimum eleman: "+tree.findMin(tree.root));
	}
}
