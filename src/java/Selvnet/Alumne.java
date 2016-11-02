/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selvnet;

import java.util.ArrayList;

/**
 *
 * @author pauva
 */
public class Alumne {
    String nom;
    int codi;
 String assignatures="", tutories="";
    ArrayList<String> listaAsignaturas; 
    ArrayList<String> listatutorias;

    public String getAssignatures() {
        return assignatures;
    }

    public Alumne() {
    }

    public void setAssignatures(String assignatures) {
        this.assignatures +="  /  "+ assignatures + " / " ;
    }
    
    public String getTutories() {
        return tutories;
    }

    public void setTutories(String tutories) {
        this.tutories +=" / "+  tutories+ " / ";
    }
    public Alumne(String nom, int codi) {
        this.nom = nom;
        this.codi = codi;
        listaAsignaturas=new  ArrayList<String>();
        listatutorias = new ArrayList<String>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    @Override
    public String toString() {
        return  nom ;
    }
    
}
