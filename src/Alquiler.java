

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Random;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private static int costoKM = 50 ;
    private int kilometrosRecorridos;
    private int costoTotal;
    private Sucursal retiro;
    private Sucursal entrega;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaFinal, int km,Sucursal retiro, Sucursal entrega) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = LocalDate.now();
        this.fechaFinal = fechaFinal;
        this.kilometrosRecorridos = km;
        this.costoTotal = (km * costoKM) + (vehiculo.getTarifaDia()*((int)ChronoUnit.DAYS.between(fechaInicio,fechaFinal)));
        this.retiro = retiro;
        this.entrega = entrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio() {
        this.fechaInicio = LocalDate.now();
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public static int getCostoKM() {
        return costoKM;
    }

    public static void setCostoKM(int costoKM) {
        Alquiler.costoKM = costoKM;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Sucursal getRetiro() {
        return retiro;
    }

    public void setRetiro(Sucursal retiro) {
        this.retiro = retiro;
    }

    public Sucursal getEntrega() {
        return entrega;
    }

    public void setEntrega(Sucursal entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                ", costoTotal=" + costoTotal +
                ", retiro=" + retiro +
                ", entrega=" + entrega +
                '}';
    }


}

