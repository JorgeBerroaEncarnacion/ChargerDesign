/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("Head")){
         return new HeadFactory();
         
      }else if(choice.equalsIgnoreCase("Cable")){
         return new CableFactory();
      }
      else if (choice.equalsIgnoreCase("Celphone")){
         return new CelFactory();
      }
      return null;
   }
}
