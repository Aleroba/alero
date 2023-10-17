/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaPeaje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private String nroCedula;
    private Date fechaNacimiento;
    public List<Vehiculo> vehiculos;

    public Persona(String nombre, String apellido, String nroCedula, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCedula = nroCedula;
        this.fechaNacimiento = fechaNacimiento;
        this.vehiculos = new ArrayList<>();
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    
     public void desasignarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(String nroCedula) {
        this.nroCedula = nroCedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
      public  int calcularTotalPeajes(){
        int totalPeajes =0;
        for (Object vehiculo : vehiculos){
            if (vehiculo instanceof Carro){
              totalPeajes +=Carro.valorPeaje;
            }else{
                if(vehiculo instanceof Moto){
                    totalPeajes +=Moto.valorPeaje;
                }else if(vehiculo instanceof Camion){
                    Camion camion =(Camion) vehiculo;
                   totalPeajes += camion.getNumeroEjes() * camion.getValorPeajeEje();
                }

            }
        }
        return totalPeajes;
    }
    
    @Override
    public String toString() {
        return "Persona: " + nombre + "\nVehiculos: " + vehiculos;
    }
}
