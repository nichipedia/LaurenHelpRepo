package com.company;
public class tree
{

    public treeNode root;

    public void init()
    {
        root = null;
    }

    public treeNode makeTreeNode(int num) {
        treeNode t;
        t = new treeNode();
        t.data = num;
        t.left = null;
        t.right = null;
        return t;
    }
    public void buildTree(int n, int myList[])
    {
        int j;
        treeNode curr;
        boolean searching;
        init();
        for(j = 0; j < n; j++)
        {
            if(j==0)
            {
                root = makeTreeNode(myList[j]);
            } else
            {
                curr = root;
                searching = true;
                while(searching)
                {
                    if(myList[j]< curr.data)
                    {
                        curr.left = makeTreeNode(myList[j]);
                        searching = false;
                    }
                    else
                        {
                            if (myList[j] > curr.data)
                            {
                                if(curr.right == null)
                                {
                                    curr.right = makeTreeNode(myList[j]);
                                    searching = false;
                                }
                                else
                                    {
                                        curr = curr.right;
                                    }
                            }
                        }
                }
            }

        }
    }

    void inOrderR(treeNode t)
    {
        if(t.left != null){
            inOrderR(t.left);
        }
        System.out.println(t.data);
        if(t.right != null){
            inOrderR(t.right);
        }
    }
}
