/*@author paola*/

package practica3;

public class PrincipalEmpleado 
{
    public static void main(String[] args) 
    {
        Empleado objEmpleado;
        objEmpleado = new Empleado();
        
        objEmpleado.capturar_datos_trabajador();
        //objEmpleado.obtener_salario_mensual();
        objEmpleado.imprimir_datos_trabajador();
    }
    
}

