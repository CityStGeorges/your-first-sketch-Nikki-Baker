import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String[] allNames = new String[7];
        int[] allStudentIDs = new int[7];

        allNames[0] = "dave";
        allStudentIDs[0] = 2684;

        allNames[1] = "keith";
        allStudentIDs[1] = 5489;

        allNames[2] = "jessica";
        allStudentIDs[2] = 9346;

        allNames[3] = "simone";
        allStudentIDs[3] = 5943;

        allNames[4] = "liz";
        allStudentIDs[4] = 9642;

        allNames[5] = "john";
        allStudentIDs[5] = 2158;

        allNames[6] = "jason";
        allStudentIDs[6] = 1248;

        int noOfMembers =  ThreadLocalRandom.current().nextInt(4, 7);
        ExpeditionMember[] members = new ExpeditionMember[noOfMembers];

        // gets array of random unique indexes with size noOfMembers
        int[] randMembersIndex = new int[noOfMembers];

        for(int i=0; i<noOfMembers; i++){

            boolean success = false;

            while (!success){

                // generate random index
                int randomInt = ThreadLocalRandom.current().nextInt(0,7);
                System.out.println(randomInt);

                // check if unique, if unique success = true (no loop) add value to arr, if not unique, repeat
                if(IntStream.of(randMembersIndex).noneMatch(x -> x == randomInt)){
                    randMembersIndex[i] = randomInt;
                    success = true;
                }

            }
        }
        System.out.println(Arrays.toString(randMembersIndex));

        // instantiate members based on index
        int index;
        for(int i=0; i<noOfMembers; i++){
            index = randMembersIndex[i];
            members[i] = new ExpeditionMember(allNames[index], allStudentIDs[index]);
        }


        // pyramid expedition
        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0],members[1],members[2]);
        System.out.println("pyramid expedition");
        System.out.print("leader: ");
        System.out.println(pyramidExpedition.getExpeditionLeaderName());
        System.out.print("archivist: ");
        System.out.println(pyramidExpedition.getArchivistName());
        System.out.print("researcher: ");
        System.out.println(pyramidExpedition.getFieldResearcherName());
        System.out.println();

        // nile expedition
        ResearchExpedition nileExpedition = new ResearchExpedition(members[noOfMembers-1],members[noOfMembers-2],members[noOfMembers-3]);
        System.out.println("nile expedition");
        System.out.print("leader: ");
        System.out.println(nileExpedition.getExpeditionLeaderName());
        System.out.print("archivist: ");
        System.out.println(nileExpedition.getArchivistName());
        System.out.print("researcher: ");
        System.out.println(nileExpedition.getFieldResearcherName());
        System.out.println();

        // verify member numbers
        int memberCount = ExpeditionMember.getMemberCount();
        System.out.print("member count: ");
        System.out.println(memberCount);
        System.out.print("number of members: ");
        System.out.println(noOfMembers);

        if(memberCount==noOfMembers){
            System.out.println("SUCCESS!");
        }
    }
}