//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionAlquiler gestion = new GestionAlquiler();
        Alquiler alquiler = new Alquiler();

        Cliente a = new Cliente("Juan Perez","12321455",true);
        Cliente b =  new Cliente("Cristian Diaz","34321455",true);
        Cliente c =  new Cliente("Alejandra Alvarez","27321415",false);

        Sucursal suc1 = new Sucursal("Mar del Plata", "Jara 865", "223458458");
        Sucursal suc2 = new Sucursal("Mar de Ajo", "Colon 1565", "226521258");
        Sucursal suc3 = new Sucursal("Miramar", "Calle 8 1233", "222565555");

        Vehiculo v1 = new Vehiculo("Palio",56000,2013,"aaa123",500, TipoVehiculos.CUATROPUERTAS);
        Vehiculo v2 = new Vehiculo("Hilux",103520,2016,"ccc123",1500, TipoVehiculos.CAMIONETA);
        Vehiculo v3 = new Vehiculo("Torino",216000,1984,"sde123",800, TipoVehiculos.DOSPUERTAS);

        gestion.agregarCliente(a);
        gestion.agregarCliente(b);
        gestion.agregarCliente(c);


        gestion.agregarVehiculo(v2);
        gestion.agregarVehiculo(v1);
        gestion.agregarVehiculo(v3);


        gestion.agregarSucursal(suc3);
        gestion.agregarSucursal(suc1);
        gestion.agregarSucursal(suc2);

        alquiler = gestion.nuevo(a,v2,suc1,suc3);
        gestion.agregarAlquiler(alquiler);
        alquiler = gestion.nuevo(b,v2,suc1,suc2);
        gestion.agregarAlquiler(alquiler);
        alquiler = gestion.nuevo(b,v3,suc2,suc1);
        gestion.agregarAlquiler(alquiler);

        gestion.mostrarAlquiler();

        System.out.println("Mayor");
        System.out.println(gestion.mayorMonto());

        gestion.mostrarTotales();



        }
    }
