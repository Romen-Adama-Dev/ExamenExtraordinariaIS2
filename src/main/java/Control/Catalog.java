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

public class Catalog {
    private final String elemName;
    private final int elemId;
    
    public Admin(String elemName, int elemId){
        this.elemName = elemName;
        this.elemId = elemId;
    }
    public void addElem(){
        elemName.add();
    }
    public void removeElem(){
        elemName.remove();
    }
    public String getName(){
        return elemName;
    }
    public int getCatalog(){
        return elemId;
    }
}
