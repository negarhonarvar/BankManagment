public class Node
{
    double x;
    double y;
    Node left;
    Node right;
    String name;
      Node(double x, double y,String name)
      {
          this.x=x;
          this.y=y;
          this.left=this.right=null;
          this.name=name;
      }
}
