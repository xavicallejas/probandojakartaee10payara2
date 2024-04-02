/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.kaltmann.nb21.test2.jee10.ejb;

import jakarta.ejb.Stateless;
import java.util.Date;

/**
 *
 * @author xavier
 */
@Stateless
public class Test1Bean {

    public String getTest() {
        return "Esta es una prueba desde el bean" + new Date();
    } 
    
}
