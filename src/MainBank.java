import HashMap.HashMap;

public class MainBank
{
  private String name;
  private Point coordinate;
  HashMap<String,Branch> branches;
  MainBank(String name,Point point,HashMap<String,Branch> branches)
  {
    this.name=name;
    this.coordinate=point;
    this.branches=branches;
  }
  public String getName()
  {
    return name;
  }

  public Point getCoordinate()
  {
    return coordinate;
  }

  public void setBranches(String name,Branch branch)
  {
    this.branches.put(name,branch);
  }
}
