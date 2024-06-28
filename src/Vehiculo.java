public class Vehiculo {
    private String modelo;
    private int kilometraje;
    private int anio;
    private String codigoInterno;
    private int tarifaDia;
    private TipoVehiculos tipo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, int kilometraje, int anio, String codigoInterno, int tarifaDia, TipoVehiculos tipo) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.codigoInterno = codigoInterno;
        this.tarifaDia = tarifaDia;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public int getTarifaDia() {
        return tarifaDia;
    }

    public void setTarifaDia(int tarifaDia) {
        this.tarifaDia = tarifaDia;
    }

    public TipoVehiculos getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", anio=" + anio +
                ", codigoInterno='" + codigoInterno + '\'' +
                ", tarifaDia=" + tarifaDia +
                ", tipo=" + tipo +
                '}';
    }
}

