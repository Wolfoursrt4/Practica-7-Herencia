package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getColor() {
        return color;
    }
    
    public void sonido(){
        
    }
    
    public void comer(){
        
    }
}
package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class AnimalAcuatico extends Animal {
    private int numeroAletas;

 public AnimalAcuatico(String nombre,String lugarOrigen, String color, int numeroAletas){
    super(nombre,lugarOrigen,color); 
        this.numeroAletas = numeroAletas;
        
}

    public int getNumeroAletas() {
        return numeroAletas;
    }
 
 public void comer(){
     
 }
 public void nadar(){
     
 }
}
package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }
    
    public void colar(){
        
    }
    public void comer(){
        
    }
    
}

package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class AnimalTerrestre extends Animal {
private int numeroPatas;

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }
    
    public void correr(){
        
    }
    public void comer(){
        
    }
}
package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena(int largo, String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }
    public void pelearConPinocho(){
        
    }
}

package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }
    
    public void recolectarRamas(){
        
    }
}
package com.mycompany.actividad7;

/**
 *
 * @author mario
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }
    
    public void hacerTrucos(){
        
    }
}
