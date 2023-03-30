package ch.uzh.ifi.hase.soprafs23.questionGenerator.question.DTO;


public class EvolutionDTO {

    String OracleURL;//甲骨文
    String BronzeInscriptionURL; //金文
    String SealScriptURL; //篆书
    String ClerialScriptURL; // 隶书
    String RegularScriptURL; //楷书

    public String getOracleURL() {
        return OracleURL;
    }

    public EvolutionDTO(String oracleURL, String bronzeInscriptionURL, String sealScriptURL, String clerialScriptURL, String regularScriptURL) {
        OracleURL = oracleURL;
        BronzeInscriptionURL = bronzeInscriptionURL;
        SealScriptURL = sealScriptURL;
        ClerialScriptURL = clerialScriptURL;
        RegularScriptURL = regularScriptURL;
    }

    public EvolutionDTO() {
    }

    public void setOracleURL(String oracleURL) {
        OracleURL = oracleURL;
    }

    public String getBronzeInscriptionURL() {
        return BronzeInscriptionURL;
    }

    public void setBronzeInscriptionURL(String bronzeInscriptionURL) {
        BronzeInscriptionURL = bronzeInscriptionURL;
    }

    public String getSealScriptURL() {
        return SealScriptURL;
    }

    public void setSealScriptURL(String sealScriptURL) {
        SealScriptURL = sealScriptURL;
    }

    public String getClerialScriptURL() {
        return ClerialScriptURL;
    }

    public void setClerialScriptURL(String clerialScriptURL) {
        ClerialScriptURL = clerialScriptURL;
    }

    public String getRegularScriptURL() {
        return RegularScriptURL;
    }

    public void setRegularScriptURL(String regularScriptURL) {
        RegularScriptURL = regularScriptURL;
    }


}
