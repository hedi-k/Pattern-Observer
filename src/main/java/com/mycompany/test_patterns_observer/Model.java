package com.mycompany.test_patterns_observer;

import java.util.LinkedList;
/**
 * Le model, crée un entier permet de le retourner et de le modifier via setters et getters.
 * @author eddy
 */
public class Model implements Observable {

    //Liste d'observateurs.
    private LinkedList<Observer> observers = new LinkedList<>();
    private int nombre;

    public Model() {
        nombre = 0;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre +1;
        this.notifyObservers();
    }

    //Ajoute les observateurs dans une liste pour les "enregistrer"
    @Override
    public void addObserver(Observer o) {
       this.observers.add(o);
    }

    //Informe les observateurs que le modèle a changer.
    @Override
    public void notifyObservers() {
        for (Observer o : this.observers){
        o.updateObserver();
        }
    }
}
