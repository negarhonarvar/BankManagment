import HashMap.*;
import java.util.Scanner;

public class MainClass
{
    Node root=null;
    int depth=0;
    KD_Tree Branches=new KD_Tree();
    Node b_root=null;
    int b_depth=0;
    KD_Tree Banks=new KD_Tree();
    private static HashMap<String, NeighbourHood> neighbourHoodHashMap = new HashMap<String,NeighbourHood>(); // neighbourhood name -> NeighbourHood
    private static HashMap<String, Branch> ListOfMainBankBranchs = new HashMap<String,Branch>();
    private static HashMap<String,MainBank> ListOfMainBanks= new HashMap<String, MainBank>();

    Scanner in = new Scanner(System.in);
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
        System.out.println("please enter the number of branches you wish to add now:");
        int flag=in.nextInt();
        MainBank b=new MainBank(name,p);
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
            Node node= new Node(x1,y1,branchName);
            Branches.Insertion(root,node,depth);
            root=node;
            depth=depth+1;
            b.Branches.Insertion(b.root,node,b.depth);
            b.depth++;
        }
        b.setBranches(ListOfMainBankBranchs);
        ListOfMainBanks.put(b.getName(),b);
        Node node=new Node(x,y,b.getName());
        Banks.Insertion(b_root,node,b_depth);
        b_root=node;
        b_depth++;
    }
    public void addBr()
    {
        System.out.print("please enter the main bank's name:");
        String mainBankName=in.nextLine();
        System.out.println();
        System.out.print("please enter the branch's name:");
        String branchName=in.nextLine();
        System.out.println();
        System.out.println("please enter the coordinates:");
        System.out.print("x:");
        double x=in.nextDouble();
        System.out.println();
        System.out.print("y:");
        double y=in.nextDouble();
        System.out.println();
        Node node=new Node(x,y,branchName);
        while(Branches.Search(root,node,0))
        {
            System.out.println("a branch with the same coordinates exist,please enter coordinates again");
            System.out.println("re-enter the coordinates:");
            System.out.print("x:");
            x=in.nextDouble();
            System.out.println();
            System.out.print("y:");
            y=in.nextDouble();
            System.out.println();
            node=new Node(x,y,branchName);
        }
        Point p=new Point(x,y);
        Branches.Insertion(root,node,depth);
        ListOfMainBanks.get(mainBankName).Branches.Insertion(ListOfMainBanks.get(mainBankName).root,node,ListOfMainBanks.get(mainBankName).depth);
        ListOfMainBanks.get(mainBankName).root=node;
        ListOfMainBanks.get(mainBankName).depth++;
        depth++;
        root=node;
        Branch branch=new Branch(branchName,mainBankName,p);
        ListOfMainBanks.get(mainBankName).branches.put(branchName,branch);
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

