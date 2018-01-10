/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitsui.fugulin.model;

/**
 *
 * @author mitsui
 */
public class Selectable {
    
    private String text;
    private Integer value;
    
    public Selectable(String text,Integer value){
        this.text = text;
        this.value = value;
    }
    
    public Integer getValue(){
        return this.value;
    }
    
    @Override
    public String toString(){
        return String.format("%d - %s", this.value,this.text);
    }
    
}
