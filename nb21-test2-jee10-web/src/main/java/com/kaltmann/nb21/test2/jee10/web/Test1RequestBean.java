/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.kaltmann.nb21.test2.jee10.web;

import com.kaltmann.nb21.test2.jee10.ejb.Test1Bean;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.logging.Logger;

/**
 *
 * @author xavier
 */
@Named(value = "test1RequestBean")
@RequestScoped
public class Test1RequestBean {

    private static final Logger LOG = Logger.getLogger(Test1RequestBean.class.getName());
    
    /**
     * Creates a new instance of Test1RequestBean
     */
    public Test1RequestBean() {
    }
    
    @EJB
    Test1Bean t1b;
    
    @PostConstruct
    public void init() {
        LOG.info("Construyendo: " + t1b);
    }
    
    public String getTestString() {
        
        LOG.info(t1b.getTest());
        
        return t1b.getTest();
    }
    
}
