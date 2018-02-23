/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public class CableFactory extends AbstractFactory {
    
    @Override
    public Head getHead(String headType){
   
     
         return null;
      }		
    
      
           
     Celphone getcelphone(String celType){
   
     
         return null;
      }	
      @Override
   Cable getCable(String cable) {
   
      if(cable == null){
         return null;
      }		
      
      if(cable.equalsIgnoreCase("Icable")){
         return new Icable();
         
      }
      else if(cable.equalsIgnoreCase("Acable")){
         return new Acable();
         
      }
      
      return null;
   }

    @Override
    Celphone getCelphone(String celphone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
