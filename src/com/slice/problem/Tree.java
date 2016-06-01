package com.slice.problem;

public class Tree {

	public Node root;
	public Tree()
	{
		root=null;
	}
	private int[] heapArray;
	private int maxSize;
	public int sum;
	public int count;
	// size of array
	private int currentSize;
	// number of nodes in array
	// -------------------------------------------------------------
	public Tree(int mx)
	// constructor
	{
	maxSize = mx;
	currentSize = 0;
	heapArray = new int[maxSize]; // create array
	System.out.println("Tree1");
	}
	public void check(int numb)
	{ System.out.println("check1");
		insert(numb);
		System.out.println("check2");
	sliceCut(numb);
	System.out.println("check3");
	}
	
	public void sliceCut(int z)
	{
		int x = z/2;
		int y = z - x;
		sum = sum+ (x*y);
		count++;
		System.out.println("xxx "+x +" yy "+ y+ " sum "+sum);
		if(sum <= maxSize )
		{
			System.out.println("InsertYY");
			insert(y);
			System.out.println("InsertXX");
			insert(x);
		}
		else
		{
			System.out.println("Done total no of turns "+count);
			
		}
		
	}
	public void insert(int slice)
	{
		Node newNode = new Node(slice);
		// make new node
		//newNode.iData = slice;
		System.out.println("Insert-node");
		heapArray[currentSize] = slice;
		System.out.println("Insert-node heaparray "+ heapArray[currentSize] );
		//trickleUp(currentSize++);
		currentSize++;
		System.out.println("currentsixee " +currentSize);
		if(currentSize>1)
		{
		int parent = (currentSize-1) / 2;
		System.out.println("parent " +parent);
		//Node bottom = heapArray[currentSize];
		if(currentSize %2!=0)
		{
			System.out.println("AgainCut " +heapArray[parent]);
			sliceCut(heapArray[parent]);
		}
		}
	}
	
	
}
