package enumerator;

public enum EstadoCivil {
    SOLTERO(1, "Soltero(a)"),
    CASADO(2, "Casado(a)"),
    VIUDO(3, "Viudo(a)");

    private int codigoEstadoCivil;
    private String descripcionEstadoCivil;

    EstadoCivil(int codigoEstadoCivil, String descripcionEstadoCivil) {
        this.codigoEstadoCivil = codigoEstadoCivil;
        this.descripcionEstadoCivil = descripcionEstadoCivil;
    }

    public int getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    public String getDescripcionEstadoCivil() {
        return descripcionEstadoCivil;
    }
}
