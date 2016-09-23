/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class UnitTest {
     @Test
    public void  UtilTest() {
  
 
      
EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        
}
}
