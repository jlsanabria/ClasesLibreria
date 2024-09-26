package enumerator;

public enum Pais {
    ALBANIA("201", "AL"), ALEMANIA("202", "DT"),
    ARGENTINA("54", "AR"), BIELORUSIA("203", "BI"),
    BOLIVIA("591", "BO"), BRASIL("204", "BR"),
    CANADA("205", "CA"), COLOMBIA("206", "CO"),
    ECUADOR("207","EC"), ESTADOS_UNIDOS("208","EU"),
    INGLATERRA("209","EN"), PARAGUAY("210", "PA"),
    PERU("211","PE"), URUGUAY("212", "UR"),
    VENEZUELA("213", "VE");

    private String codigoTelefonoPais;
    private String codigoPais;

    Pais(String codigoTelefonoPais, String codigoPais) {
        this.codigoTelefonoPais = codigoTelefonoPais;
        this.codigoPais = codigoPais;
    }

    public String getCodigoTelefonoPais() {
        return codigoTelefonoPais;
    }

    public String getCodigoPais() {
        return codigoPais;
    }
}
