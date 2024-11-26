public class ExpeditionMember {
    private String memberName;
    private int memberID;
    private static int memberCount = 0;

    public ExpeditionMember(){
        memberName = "";
        memberID = 0;
        memberCounter();
    }

    public ExpeditionMember(String Name, int ID){
        memberName = Name;
        memberID = ID;
        memberCounter();
    }



    public void setName(String a){
        memberName = a;
    }

    public void setID(int a){
        memberID = a;
    }

    public String getMemberName(){
        return memberName;
    }

    public int getMemberID(){
        return memberID;
    }

    private static void memberCounter(){
        ++memberCount ;
    }

    static int getMemberCount(){
        return memberCount;
    }
}
