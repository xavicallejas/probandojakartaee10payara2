/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.kaltmann.nb21.test2.jee10.web;

import com.kaltmann.nb21.test2.jee10.ejb.Test1Bean;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import java.io.Serializable;

/**
 *
 * @author xavier
 */
@Named(value = "test2SessionBean")
@SessionScoped
public class Test2SessionBean implements Serializable {

    /**
     * Creates a new instance of Test2SessionBean
     */
    public Test2SessionBean() {
    }
    
    @Inject
    private Test1Bean t1b;
    
    public String getTest2() {
        
        return t1b.getTest();
    }
    
}
