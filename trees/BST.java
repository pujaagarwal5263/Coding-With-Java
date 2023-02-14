package trees;


public class BST {
    static Node insertBST(Node root,int val) {
    	if(root==null) {
    		return new Node(val);
    	}
    	
    	if(val<root.data) {
    		root.left=insertBST(root.left,val);
    	}
    	if(val>root.data) {
    		root.right=insertBST(root.right,val);
    	}
    	return root;
    }
    static void printInorder(Node root) {
    	if(root==null)return;
    	
    	printInorder(root.left);
    	System.out.println(root.data);
    	printInorder(root.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {5,1,3,4,2,7};
        Node root=null;
        root=insertBST(root,5);
        for(int i=1;i<arr.length;i++) {
        	insertBST(root,arr[i]);
        }
        printInorder(root);    
	}

}
