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
    private static HashMap<String, NeighbourHood> neighbourHoodHashMap = new HashMap<String,NeighbourHood>(); // neighbourhood name -> NeighbourHood
    private static HashMap<String, Branch> ListOfMainBankBranchs = new HashMap<String,Branch>();
    private static HashMap<String, MainBank> ListOfMainBanks = new HashMap<String,MainBank>(); // branch name -> bank name
    private static HashMap<String, Node> banks = new HashMap<String,Node>(); // name -> Node
    private static HashMap<String, String> types = new HashMap<String,String>(); // coordinate -> type
    private static HashMap<String, Point> List_Of_CentralBanks = new HashMap<String,Point>(); // list of the main banks
    private static HashMap<String, Point> List_Of_Branch = new HashMap<String, Point>(); // list of the branches

    Scanner in = new Scanner(System.in);

    KD_Tree()
    {
        root = null;
    }
    public void KD_TreeInsertion(HashMap<String,Branch> hashMap)
    {
        //Node root=new Node(hashMap.get());
        for (int i = 1; i < hashMap.size(); i++)
        {

        }
    }
    public void MainManu()
    {
        System.out.println("Welcome , please choose your desired service.");
        System.out.println("enter : -addN if you want to add a neighbourhood.");
        System.out.println("enter : -addB if you want to add a main bank.");
        System.out.println("enter : -addBr if you want to add a main bank's branch.");
        System.out.println("enter : -delBr if you want to delete an specific branch.");
        System.out.println("enter : -listB if you want a list of an specific neighbourhood banks list.");
        System.out.println("enter : -listBrs if you want a list of all branches of an specific bank.");
        System.out.println("enter : -nearB if you want to find the closest main bank to you.");
        System.out.println("enter : -nearBr if you want to find the closest branch to you.");
        System.out.println("enter : -availB if you want to find main banks and branches in an specific radius around you.");
        System.out.println("enter any other command to end the program.");
        System.out.print("please enter your choice : ");
        String command=in.nextLine();
        switch (command)
        {
            case("addN"): {
                addN();
                break;
            }
            case("addB"):
            {
                addB();
                break;
            }
            case ("addBr"):
            {
                addBr();
                break;
            }
            case("delBr"):
            {
                delBr();
                break;
            }
            case("listB"):
            {
                listB();
                break;
            }
            case("listBrs"):
            {
                listBrs();
                break;
            }
            case("nearB"):
            {
                nearB();
                break;
            }
            case ("nearBr"):
            {
                nearBr();
                break;
            }
            case("availB"):
            {
                availB();
                break;
            }
            default:return;
        }
        MainManu();
    }
    public void addN()
    {
        System.out.println("Please enter Neighbourhood's name:");
        String name=in.nextLine();
        System.out.println("Now,Please enter the coordinates in this format:");
        System.out.println("1)coordinates of right-up point of neighbourhood border");
        System.out.println("1)coordinates of left-down point of neighbourhood border");
        System.out.print("x:");
        double x1=in.nextDouble();
        System.out.print("y:");
        double y1=in.nextDouble();
        System.out.print("x:");
        double x2=in.nextDouble();
        System.out.print("y:");
        double y2=in.nextDouble();
        NeighbourHood N=new NeighbourHood(name,x1,x2,y1,y2);
        neighbourHoodHashMap.put(N.getName(),N);
    }
    public void addB()
    {
        System.out.println("Please enter Bank's name:");
        String name=in.nextLine();
        System.out.println("Now,Please enter the coordinates :");
        System.out.print("x");
        double x=in.nextDouble();
        System.out.println("y");
        double y=in.nextDouble();
        Point p=new Point(x,y);
        System.out.println("please enter the number of branchs you wish to add now:");
        int flag=in.nextInt();
        for (int i = 0; i < flag ; i++)
        {
            System.out.print("please enter branch's name:");
            String branchName=in.nextLine();
            System.out.println();
            System.out.println("please enter branch's coordinates:");
            System.out.print("x:");
            double x1=in.nextDouble();
            System.out.print("y:");
            double y1=in.nextDouble();
            System.out.println();
            Point p1=new Point(x1,y1);
            Branch branch=new Branch(branchName,name,p1);
            ListOfMainBankBranchs.put(branch.getName(),branch);
        }
        MainBank b=new MainBank(name,p,ListOfMainBankBranchs);
    }
    public void addBr()
    {

    }
    public void delBr()
    {

    }
    public void listB()
    {

    }
    public void listBrs()
    {

    }
    public void nearB()
    {

    }
    public void nearBr()
    {

    }
    public void availB()
    {

    }
}

