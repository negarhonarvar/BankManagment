public class Branch
{
   private String name;
   private String MainBankName;
   private Point coordinates;
   Branch(String name,String mainBankName,Point coordinates)
   {
       this.name=name;
       this.MainBankName=mainBankName;
       this.coordinates=coordinates;
   }
    public String getName() {
        return name;
    }

    public String getMainBankName() {
        return MainBankName;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
