public class ResearchExpedition {
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

    public ResearchExpedition(ExpeditionMember setLeader, ExpeditionMember setArchivist, ExpeditionMember setResearcher){
        expeditionLeader = setLeader;
        archivist = setArchivist;
        fieldResearcher = setResearcher;

    }

    public String getExpeditionLeaderName(){
        return expeditionLeader.getMemberName();
    }

    public String getArchivistName(){
        return archivist.getMemberName();
    }

    public String getFieldResearcherName(){
        return fieldResearcher.getMemberName();
    }



}
