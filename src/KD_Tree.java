import HashMap.*;

import java.util.Scanner;

public class KD_Tree
{
    private static Node root, newNode = null;
    private static Point point;
    private static NeighbourHood neib;
    private static int ctr = 0, order, max;
    private static double x, y, dist;
    private static String districtName, bankName, branchName, str;
    private static HashMap<String, NeighbourHood> district = new HashMap<String,NeighbourHood>(); // district name -> Rect
    private static HashMap<String, String> nameOfTheCoordinate = new HashMap<String,String>(); // coordinate -> name of the bank or branch
    private static HashMap<String, String> bankOfTheBranch = new HashMap<String,String>(); // branch name -> bank name
    private static HashMap<String, Node> banks = new HashMap<String,Node>(); // name -> Node
    private static HashMap<String, String> types = new HashMap<String,String>(); // coordinate -> type
    private static HashMap<String, Point> List_Of_CentralBanks = new HashMap<String,Point>(); // list of the main banks
    private static HashMap<String, Point> List_Of_Branch = new HashMap<String, Point>(); // list of the branches

    private Scanner input = new Scanner(System.in);

    KD_Tree()
    {
        root = null;
    }
}

