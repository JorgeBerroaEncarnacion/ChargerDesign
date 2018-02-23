/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public class ChargerAdapter implements Head {
    
    Head USA;
     public void setAdapter(Head USA)
     {
         this.USA = USA;
     }
    @Override
    public void typeHead(){
        
        System.out.println( "Adapter");
    }
    
     @Override
    public void Charge(){
    
    USA.Charge();
}
}
