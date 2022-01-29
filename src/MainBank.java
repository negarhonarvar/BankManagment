import HashMap.HashMap;

public class MainBank {
  private String name;
  private Point coordinate;
  HashMap<String, Branch> branches;
  int depth=0;
  Node root=null;
  KD_Tree Branches = new KD_Tree();

  MainBank(String name, Point point) {
    this.name = name;
    this.coordinate = point;
  }
  public void setBranches(HashMap<String, Branch> branches)
  {
    this.branches=branches;
  }

  public String getName() {
    return name;
  }

  public Point getCoordinate() {
    return coordinate;
  }
}
