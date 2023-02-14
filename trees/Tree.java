package trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


class Node{
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data=data;
	}
}

public class Tree {
	
	static Scanner sc=new Scanner(System.in);
	
    static Node CreateTree() {
    	Node root=null;
    	System.out.println("Enter a data: ");
    	int data=sc.nextInt();
    	
    	if(data==-1)return null;
    	
    	root=new Node(data);
    	
    	System.out.println("Enter left for data: "+data);
    	root.left=CreateTree();
    	
    	System.out.println("Enter right for data: "+data);
    	root.right=CreateTree();
    	
    	return root;
    }
    
    static void preOrder(Node node) {
    	if(node==null)return;
    	
    	System.out.println(node.data+" ");
    	preOrder(node.left);
    	inOrder(node.right);
    }
    
    static void inOrder(Node node) {
    	if(node==null)return;
    	
    	inOrder(node.left);
    	System.out.println(node.data+" ");
    	inOrder(node.right);
    }
    
    static void postOrder(Node node) {
    	if(node==null)return;
    	
    	postOrder(node.left);
    	postOrder(node.right);
    	System.out.print(node.data+ " ");
    }
    static void levelOrder(Node node) {
    	Queue <Node> mq= new ArrayDeque<>();
    	mq.add(node);
    	while(mq.size()>0) {
    		int count=mq.size();
    		for(int i=0; i<count;i++) {
    			node=mq.remove();
    			System.out.println(node.data + " ");
    			
    			if(node.left!=null) {mq.add(node.left);}
    			if(node.right!=null) {mq.add(node.right);}
    		}
    		System.out.println();
    	}
    	return;
    }
    static int maxDepth(Node root) {
    	if(root==null) return 0;
    	
    	int ldepth=maxDepth(root.left);
    	int rdepth=maxDepth(root.right);
    	
    	if(ldepth>rdepth) {
    		return ldepth+1;
    	}
    	else return rdepth+1;
    }
   
    /*static int diameter(Node root) {
    	if(root==null)return 0;
    	
    	int lheight=maxDepth(root.left);
    	int rheight=maxDepth(root.right);
    	
    	int currentDia=lheight+rheight+1;
    	
    	int ldia=diameter(root);
    	int rdia=diameter(root);
    	
    	return Math.max(currentDia, Math.max(ldia, rdia));
    }*/
    static void rightView(Node root) {
    	if(root==null)return;
    	
    	Queue<Node> q=new ArrayDeque<>();
    	q.add(root);
    	
    	while(!q.isEmpty()) {
    		int n=q.size();
    		
    		for(int i=0;i<n;i++) {
    			Node curr=q.remove();
    		
    			if(i==n-1) {
    			System.out.println(curr.data+ " ");
    		}
    		
    		if(curr.left!=null) {
    			q.add(curr.left);
    		}
    		if(curr.right!=null) {
    			q.add(curr.right);
    		}
    		}
    	}
    }
    static void leftView(Node root) {
       if(root==null)return;
    	
    	Queue<Node> q=new ArrayDeque<>();
    	q.add(root);
    	
    	while(!q.isEmpty()) {
    		int n=q.size();
    		
    		for(int i=0;i<n;i++) {
    			Node curr=q.remove();
    		
    			if(i==0) {
    			System.out.println(curr.data+ " ");
    		}
    		
    		if(curr.left!=null) {
    			q.add(curr.left);
    		}
    		if(curr.right!=null) {
    			q.add(curr.right);
    		}
    		}
    	}
    }
    static int Count(Node root) {
    	if(root==null)return 0;
    	
    	return(Count(root.left)+Count(root.right)+1);
    }
    static int sum(Node root) {
    	if(root==null) return 0;
    	
    	return(sum(root.left)+sum(root.right)+root.data);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root=CreateTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        
        System.out.println("Right view");
        rightView(root);
        
        System.out.println("Left view");
        leftView(root);
        
        int height=maxDepth(root);
        System.out.println("Height of tree: "+height);
        
        //int diameter=diameter(root);
        //System.out.println(diameter);
        
        int count=Count(root);
        System.out.println("Count "+ count);
        
        int mysum=sum(root);
        System.out.println("Sum "+ mysum);
	}

}
