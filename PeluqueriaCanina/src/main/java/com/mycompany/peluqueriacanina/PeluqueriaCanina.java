package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.Igu.Principal;

/**
 *
 * @author felipeaguilerafuentealba
 */
public class PeluqueriaCanina {

    public static void main(String[] args) {
       //Hacer que la primera pantalla aparezca 
       //Creamos la instancia de la primera pantalla
        Principal principal = new Principal();
        
        //Hacemos la pantalla visible
        principal.setVisible(true);
        
        //Posicionamos la ventana
        principal.setLocationRelativeTo(null);
    }
}
