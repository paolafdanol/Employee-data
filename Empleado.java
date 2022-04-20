/*@author paola*/

package practica3;

import java.util.Scanner;

public class Empleado 
//Atributo
{
    private String nombre;
    private String puesto;
    private double pagoHora;
    private double horasTrabajadasMes;
    private double salarioMensual;

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getPuesto() 
    {
        return puesto;
    }

    public void setPuesto(String puesto) 
    {
        this.puesto = puesto;
    }

    public double getPagoHora() 
    {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) 
    {
        this.pagoHora = pagoHora;
    }

    public double getHorasTrabajadasMes() 
    {
        return horasTrabajadasMes;
    }

    public void setHorasTrabajadasMes(double horasTrabajadasMes) 
    {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }

    public double getSalarioMensual() 
    {
        salarioMensual = (getPagoHora()*getHorasTrabajadasMes());
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) 
    {
        this.salarioMensual = salarioMensual;
    }
    
    void capturar_datos_trabajador()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa dará el salario del empleado");
        System.out.println("Ingrese el nombre del empleado: ");
        setNombre(entrada.nextLine());
        System.out.println("Ingresa el puesto que desempeña: ");
        setPuesto(entrada.nextLine());
        System.out.println("Pago por hora:");
        setPagoHora(entrada.nextInt());
        System.out.println("Horas trabajadas por mes: ");
        setHorasTrabajadasMes(entrada.nextInt());     
    }
    
    public double obtener_salario_mensual()
    {
        System.out.println("$"+getSalarioMensual());
        if(getHorasTrabajadasMes()>=100 && getHorasTrabajadasMes()<=200) 
            System.out.println("Salario + Bono de 10%: $" + (((((getSalarioMensual() * .10)+(getSalarioMensual())))) + "Descontando el IVA(16%): $" +((((((getSalarioMensual() * .10)+(getSalarioMensual())))) - (getSalarioMensual())*.16) )));
        else if(getHorasTrabajadasMes()>=201 && getHorasTrabajadasMes()<=220)
            System.out.println("Salario + Bono de 20%: $" + (((((getSalarioMensual() * .20)+(getSalarioMensual())))) + "Descontando el IVA(16%): $" +((((((getSalarioMensual() * .20)+(getSalarioMensual())))) - (getSalarioMensual())*.16) )));
        else if(getHorasTrabajadasMes()>=221 && getHorasTrabajadasMes()<=230)
            System.out.println("Salario + Bono de 30%: $" + (((((getSalarioMensual() * .30)+(getSalarioMensual())))) + "Descontando el IVA(16%): $" +((((((getSalarioMensual() * .30)+(getSalarioMensual())))) - (getSalarioMensual())*.16) )));
        else
            System.out.println("Su sueldomensual es: " + getSalarioMensual());
        
            
        return getSalarioMensual();
    }
    
    void imprimir_datos_trabajador()
    {
        System.out.println("El empleado tendrá una bonificación en su salario según las horas que haya trabajado al mes");
        System.out.println("Si trabajo entre 100 y 200 horas tendrá un 10% de bonificación");
        System.out.println("Si trabajo entre 201 y 220 horas tendrá un 20% de bonificación");
        System.out.println("Si trabajo entre 221 y 230 horas tendrá un 30% de bonificación");
        System.out.println("           ");
        System.out.println("Datos del Empleado");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Pago por hora : $" + getPagoHora());
        System.out.println("Horas que laboró: " + getHorasTrabajadasMes() + "HRS");
        obtener_salario_mensual();
    }
}