package com.mycompany.test_patterns_observer;

/**
 *
 * @author eddy
 */
public interface Observable {
    void addObserver(Observer o);
    void notifyObservers();
    
}
