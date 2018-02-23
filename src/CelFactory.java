/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public class CelFactory extends AbstractFactory {
    @Override
     public Head getHead(String headType){
   
     
         return null;
      }	
     @Override
      public Cable getCable(String cableType){
   
     
         return null;
      }	
    
       @Override
   Celphone getCelphone(String celphone) {
   
      if(celphone == null){
         return null;
      }		
      
      if(celphone.equalsIgnoreCase("Samsung")){
         return new Samsung();
         
      }
      else if(celphone.equalsIgnoreCase("Iphone")){
         return new Iphone();
         
      }
      
      return null;
   }
      
}
