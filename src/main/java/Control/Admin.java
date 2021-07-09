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

public class Admin {
    private final String catalogName;
    private final int catalogId;
    
    public Admin(String catalogName, int catalogId){
        this.catalogName = catalogName;
        this.catalogId = catalogId;
    }
    public void addCatalog(){
        catalogName.add();
    }
    public void removeCatalog(){
        catalogName.remove();
    }
    public String getName(){
        return catalogName;
    }
    public int getCatalog(){
        return catalogId;
    }
}
