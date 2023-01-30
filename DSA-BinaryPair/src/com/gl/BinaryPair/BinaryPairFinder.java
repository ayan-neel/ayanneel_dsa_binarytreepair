package com.gl.BinaryPair;

import java.util.LinkedHashSet;
import java.util.Set;

import com.gl.BinaryTreeImpl.BST;
import com.gl.BinaryTreeImpl.TreeNode;

public class BinaryPairFinder {
	
	BST tree;
	private boolean found =  false;
	BinaryPairFinder(BST tree)
	{
		this.tree=tree;
	}
	public void findPair(int sum) {
		
		Set<Integer> nodes = new LinkedHashSet<Integer>();
		
		findPairInternal( sum, tree.getRoot(), nodes);
	
		if (!found) {
			System.out.println("For the sum [" + sum + "], Matching nodes NOT found");
		}
	}
	private boolean findPairInternal(int sum, TreeNode x,Set<Integer> nodes) {
		
		if (x == null) {
			return false;
		}
		
		found = findPairInternal(
			 sum, x.getLeftNode(), nodes);
		if (found) {
			return true;
		}

		int difference = sum -  x.getData();
		
		if (nodes.contains(difference)) {
			
			found = true;
			System.out.println("For the sum [" + sum + "], Matching nodes -> [" + x.getData() + ", " + difference + "]");
			return found;
		}else {

			nodes.add(x.getData());											
		}		
		
		
		if (!found) {
			return findPairInternal(sum, x.getRightNode(), nodes);
		}else {
			return true;
		}
	}
}
