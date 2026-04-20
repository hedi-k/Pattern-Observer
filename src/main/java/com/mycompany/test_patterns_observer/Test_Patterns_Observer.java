package com.mycompany.test_patterns_observer;

/**
 * Exemple d'usage du pattern Observateur / Observé (Observer / Observable en
 * anglais) Un exemple arbitrairement compliqué, un bouton qui modifi un label.
 * En java ce patterne est déja implémenté java.util.Observer mais je fais le
 * choix de l'implémenter manuellement (les interfaces) pour plus de clarté.
 *
 * @author eddy date 19/04/2026
 */
public class Test_Patterns_Observer {

    public static void main(String[] args) {
        //initialisation du modèle.
        Model superModel = new Model();
        //initialusation de la vue.
        Vue superVue = new Vue(superModel);
        //Enregistre l'observateur chez l'observable.
        superModel.addObserver(superVue);
        //Rend la vue visible pour les actions.
        superVue.setVisible(true);
    }
}
