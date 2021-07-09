/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author romen
 */
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class ElementosPatrimoniales {
    private final String name;
    private final int numberId;
    private final String autor;
    //Me esta dando problemas, y voy corto de tiempo, pero mi intencion era añadirla
    //private final Date fechaCreacion;
    private final String metodo;
    private final String material;
    private final String conservation;
    
    public ElementosPatrimoniales(String name, int numberId, String autor, /*Date fechaCreacion*/ String metodo, String material, String conservation) {
        this.name = name;
        this.numberId = numberId;
        this.autor = autor;
        this.metodo = metodo;
        this.material = material;
        this.conservation = conservation;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return numberId;
    }
    public String getAutor(){
        return autor;
    }
    public String getMetodo(){
        return metodo;
    }
    public String getMaterial(){
        return material;
    }
    public String getConservation(){
        return conservation;
    }
}
