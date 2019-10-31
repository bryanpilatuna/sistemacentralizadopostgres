/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.main;
import com.company.session.ProductosJpaController;
import com.mycompany.entidades.Productos;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Aplicaciones D
 */
public class test {
    
     public static void main (String [ ] args) {
      //toma los aprametros establecidos de la cadena de conexion
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("practicabdd");
        
        //la base controlador recibe los parametros de cadena de conexion
        ProductosJpaController pjc = new ProductosJpaController(emf);
        Productos p= new Productos(2);
        p.setNombre("pan");
        Double dl=10.35;
        BigDecimal dbl=BigDecimal.valueOf(dl.doubleValue());
        p.setPrecio(dbl);
        try{
        pjc.create(p);
        }
        catch(Exception ex){
        Logger.getLogger(test.class.getName()).log(Level.ALL.SEVERE,null,ex);
        }
 
        }
    
}
