package com.gl.BinaryPair;

import com.gl.BinaryTreeImpl.BST;

public class BinaryPairTest {

	public static void  main(String [] args)
	{
		Integer list[]= {100,110,90,80,40,60};
		BST tree=binaryTreeGen(list);
		BinaryPairFinder finder = new BinaryPairFinder(tree);
		finder.findPair(10);
	}
	
	public static BST binaryTreeGen(Integer[]list)
	{
		BST tree= new BST();
		for(int i=0;i<list.length;i++)
		{
			tree.put(list[i]);
		}
		return tree;
	}
}
