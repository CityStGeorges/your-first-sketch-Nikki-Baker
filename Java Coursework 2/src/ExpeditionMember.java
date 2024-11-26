public class ExpeditionMember {
    private String memberName;
    private int memberID;
    static int memberCount = 0;


    ExpeditionMember(String Name, int ID){
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

    static void memberCounter(){
        ++memberCount ;
    }
}
