/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satellite
 */
public abstract class AbstractFactory {
    
    abstract Head getHead(String head);
    abstract Cable getCable(String cable);
    abstract Celphone getCelphone(String celphone);
    
}
