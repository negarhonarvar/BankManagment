import HashMap.HashMap;

public class MainBank
{
  private String name;
  private Node coordinate;
  HashMap<String,Point> branches=new HashMap<String, Point>();

  public void setName(String name)
  {
    this.name = name;
  }

  public void setCoordinate(Node coordinate)
  {
    this.coordinate = coordinate;
  }

  public String getName()
  {
    return name;
  }

  public Node getCoordinate()
  {
    return coordinate;
  }

  public void setBranches(String name,Point point)
  {
    this.branches.put(name,point);
  }
}
