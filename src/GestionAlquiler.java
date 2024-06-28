
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GestionAlquiler {
    public GestionAlquiler() {
    }

    List<Alquiler> listaAlquiler = new ArrayList<>();
    List<Sucursal> listaSucursal = new ArrayList<>();
    List<Vehiculo> listaVehiculos = new ArrayList<>();
    List<Cliente> listaClientes = new ArrayList<>();

    public void agregarCliente(Cliente cliente){
        if(!this.listaClientes.contains(cliente)){
            this.listaClientes.add(cliente);
        }
    }

    public void mostrarCliente(){
        for (Cliente cliente: this.listaClientes) {
            System.out.println(cliente);
        }
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        if(!this.listaVehiculos.contains(vehiculo)){
            this.listaVehiculos.add(vehiculo);
        }
    }

    public void mostrarVehiculo(){
        for (Vehiculo vehiculo: this.listaVehiculos) {
            System.out.println(vehiculo);
        }
    }

    public void agregarSucursal(Sucursal sucursal){
        if(!this.listaSucursal.contains(sucursal)){
            this.listaSucursal.add(sucursal);
        }
    }

    public void mostrarSucursal(){
        for (Sucursal sucursal: this.listaSucursal) {
            System.out.println(sucursal);
        }
    }

    public Alquiler nuevo(Cliente c, Vehiculo v, Sucursal retiro, Sucursal entrega){

        Scanner scanner = new Scanner(System.in);
        Alquiler alquiler = null;
        if(!c.isTieneRegistro()){
            System.out.println("El cliente no tiene registro");
        }else{
            System.out.println("Por cuantos dias lo va a alquilar?  ");
            int fechaRetorno = scanner.nextInt();
            Random r = new Random();
            int km = r.nextInt(500);

            alquiler = new Alquiler(c,v, LocalDate.now().plusDays(fechaRetorno),km,retiro,entrega);
            v.setKilometraje(v.getKilometraje()+km);
        }
        return alquiler;

    }

    public void agregarAlquiler(Alquiler alquiler){
        if(!this.listaAlquiler.contains(alquiler)){
            this.listaAlquiler.add(alquiler);
        }
    }

    public void mostrarAlquiler(){
        for (Alquiler alquiler: this.listaAlquiler) {
            System.out.println(alquiler);
        }
    }

    public Alquiler mayorMonto(){
        Alquiler aux = new Alquiler();
        int mayor=0;
        for (Alquiler alquiler: this.listaAlquiler) {
            if (alquiler.getCostoTotal()>mayor){
                aux = alquiler;
            }
        }
        return aux;
    }

    public void mostrarTotales(){
        int cont2=0;
        int cont4=0;
        int contCamioneta=0;

        for (Alquiler alquiler: this.listaAlquiler){
            if(alquiler.getVehiculo().getTipo().equals(TipoVehiculos.DOSPUERTAS)){
                cont2++;
            }else if(alquiler.getVehiculo().getTipo().equals(TipoVehiculos.CUATROPUERTAS)){
                cont4++;
            }else{
                contCamioneta++;
            }
        }
        System.out.println("Cantidad 2 puertas " + cont2);
        System.out.println("Cantidad 4 puertas " + cont4);
        System.out.println("Cantidad camioneta " + contCamioneta);
    }
}

