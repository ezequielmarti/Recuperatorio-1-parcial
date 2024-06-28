public class Sucursal {
    private String ciudad;
    private String direccion;
    private String telefono;

    public Sucursal() {
    }

    public Sucursal(String ciudad, String direccion, String telefono) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //region Getter and Setter
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //endregion
    @Override
    public String toString() {
        return "Sucursal{" +
                "ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

