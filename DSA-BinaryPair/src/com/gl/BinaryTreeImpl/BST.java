package com.gl.BinaryTreeImpl;

public class BST{
	
	TreeNode root;
	
	public Integer get(Integer key)
	
	{
		return get(root,key);
	}
	public TreeNode getRoot()
	{
		return this.root;
	}
	
	private Integer get(TreeNode x, int key) //recursive search
	
	{
		if(x==null)
			return null;
		if(key<x.getData())
			return get(x.getLeftNode(),key);
		else if(key>x.getData())
			return get(x.getRightNode(),key);
		else
			return x.getData();
	}
	
	public void put(Integer data)
	
	{
		
		root=put(root,data);
		
	}
	
	private TreeNode put(TreeNode x, Integer data)
	
	{
		if(x==null)
			return new TreeNode(data);
		if(data<x.getData())
			x.setLeftNode(put(x.getLeftNode(),data));
		else if(data>x.getData())
			x.setRightNode(put(x.getRightNode(),data));
		else
			x.setData(data);
		return x;
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.put(1);
	}

}
