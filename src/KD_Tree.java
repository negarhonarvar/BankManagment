import HashMap.HashMap;

public class KD_Tree
{
    static final int k=2;
    public Node Insertion(Node root,Node node,int depth)
    {
        if(root==null)
            return node;//the node itself will be assigned as root
        else
        {
            int a=depth%k;
            if(a==0)
            {
                if(node.x<root.x)
                    root.left=Insertion(root.left,node,depth+1);
                else
                    root.right=Insertion(root.right,node,depth+1);

            }
            else
            {
                if(node.y<root.y)
                    root.left=Insertion(root.left,node,depth+1);
                else
                    root.right=Insertion(root.right,node,depth+1);

            }
        }
        return root;
    }
    public boolean Search(Node root,Node node,int depth)//at the beginning we
            //should start the search with depth 0
    {
        if(root==null)
            return false;
        if(root==node)
            return true;
        int flag=depth%k;
        if(flag%2==0)
        {
            if(root.x<node.x)
                return Search(root.left,node,depth+1);
            else
                return Search(root.right,node,depth+1);
        }
        else
        {
            if(root.y<node.y)
                return Search(root.left,node,depth+1);
            else
                return Search(root.right,node,depth+1);
        }
    }
    public Node MinFinder(Node root,int a,int depth)
    {
       if(root == null)
           return null;
       int flag=depth%k;
       if(flag==a)
       {
           if(root.left==null)
               return root;
           else
               return MinFinder(root.left,a,depth+1);
       }
       return Min(root,MinFinder(root.left,a,depth+1),MinFinder(root.right,a,depth+1),depth);
    }
    public Node Min(Node a, Node b,Node c,int depth)
    {
        Node temp=a;
        if(depth%2==0)
        {
            if(b != null && b.x<temp.x)
                temp=b;
            if(c != null && c.x<temp.x)
                temp=c;
            return temp;
        }
        else
        {
            if(b != null && b.y<temp.y)
                temp=b;
            if(c != null && c.y<temp.y)
                temp=c;
            return temp;
        }
    }
    Node Deletation(Node root,double x, double y,int depth)
    {
        if(root == null)
            return null;
        int flag=depth%k;

        if(root.x==x && root.y==y)
            {
                if(root.right != null)
                {
                    Node min=MinFinder(root.right,flag,0);
                    root.x=min.x;
                    root.y=min.y;
                    if(min.name != null)
                        root.name=min.name;
                    root.right=Deletation(root.right,min.x, min.y,depth+1);
                }
                else if (root.left != null)
                {
                    Node min=MinFinder(root.left,flag,0);
                    root.x=min.x;
                    root.y=min.y;
                    if(min.name != null)
                        root.name=min.name;
                    root.right=Deletation(root.left,min.x, min.y, depth+1);
                }
                else//if the node we need to delete is root itself
                    root=null;
                return root;
            }
        if(flag%2==0)
        {
            if(x<root.x)
                root.left=Deletation(root.left,x,y,depth+1);
            else
                root.right=Deletation(root.right,x,y,depth+1);
        }
        else
        {
            if(y<root.y)
                root.left=Deletation(root.left,x,y,depth+1);
            else
                root.right=Deletation(root.right,x,y,depth+1);
        }
        return root;
    }
}
