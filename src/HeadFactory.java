/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public class HeadFactory extends AbstractFactory {
    @Override
    public Head getHead(String headType){
   
      if(headType == null){
         return null;
      }		
      
      if(headType.equalsIgnoreCase("USA")){
         return new USA();
         
      }else if(headType.equalsIgnoreCase("Euro")){
         return new Euro();
        
      }
      
      else if(headType.equalsIgnoreCase("Adapter")){
         return new ChargerAdapter();
      }
      return null;
                 
   }
   
   @Override
   Cable getCable(String cable) {
      return null;
   }
   
   @Override
   Celphone getCelphone(String celphone) {
      return null;
   }
}

