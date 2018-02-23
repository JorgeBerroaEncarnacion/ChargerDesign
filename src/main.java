/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      AbstractFactory headFactory = FactoryProducer.getFactory("Head");

     
      Head head = headFactory.getHead("USA");

   
      head.typeHead();

      AbstractFactory headFactoryAdapter = FactoryProducer.getFactory("Head");

     
      Head headAdapter = headFactory.getHead("Adapter");

   
      headAdapter.typeHead();

      
      AbstractFactory cableFactory = FactoryProducer.getFactory("Cable");

      
      Cable cable = cableFactory.getCable("Icable");

      
      cable.typeCable();

     AbstractFactory celFactory = FactoryProducer.getFactory("Celphone");
     
     Celphone celphone = celFactory.getCelphone("Samsung");
     
     celphone.typeCel();
     
     
     
   
    }
    
}
