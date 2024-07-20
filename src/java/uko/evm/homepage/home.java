/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uko.evm.homepage;
    import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author ashhad
 */
   @Named
    @RequestScoped
public class home {

    
            public String getMessage() {
                return "Hello, EVM";
            }
        }


    

