Main.java:
package com.mycompany.poop7;

/**
 *
 * @author Brandon Hernandez Solis
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(587890);
        ger.setSueldo(25_000);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: "+ger.getNombre());
        
        Gerente ger2 = new Gerente("Karen Avalos",596723,80_000,120_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Samanta Rios",956320,35_000);
        System.out.println(ger3);
        
        System.out.println("######Instancias######");
        
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es una instancia de Gerente");
        }
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es una instancia de Empleado");
        }
        if(ger3 instanceof Object){
            System.out.println("Gerente es una instancia de Object");
        }
    }
}

Empleado.java:
package com.mycompany.poop7;

/**
 *
 * @author Brandon Hernandez Solis
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(587890);
        ger.setSueldo(25_000);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: "+ger.getNombre());
        
        Gerente ger2 = new Gerente("Karen Avalos",596723,80_000,120_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Samanta Rios",956320,35_000);
        System.out.println(ger3);
        
        System.out.println("######Instancias######");
        
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es una instancia de Gerente");
        }
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es una instancia de Empleado");
        }
        if(ger3 instanceof Object){
            System.out.println("Gerente es una instancia de Object");
        }
    }
}

Gerente.java:
/**
 *
 * @author Brandon Hernandez Solis
 */
public class Gerente extends Empleado {
    private int presupuesto;
    private boolean presupuestoAsignado;

    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    public Gerente(String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Gerente{" + "presupuesto=" + presupuesto + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
}
