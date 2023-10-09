package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author felipeaguilerafuentealba
 */
public class Controladora {
    ControladoraPersistencia controPersi = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, String nombreDuenio, 
                        String telDuenio, String alergico, String atenEspe) {
        
        //Cramos el dueño y agregamos su informacion
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(telDuenio);
        
        //Creamos la mascota con su informacion
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atenEspe);
        mascota.setUnDuenio(duenio);
        
        controPersi.guardar(duenio,mascota);
    }

    public List<Mascota> traerMascotas() {
        return controPersi.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controPersi.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controPersi.traerMascota(num_cliente);
    }

    public void editarMascota(Mascota mascota, String nombreMascota, String raza, String color, String observaciones, 
                                String alergico, String atenEspe, String nombreDuenio, String telDuenio) {
        
        //Modificar datos mascota
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atenEspe);
        
        //Modifico a la mascota
        controPersi.editarMascota(mascota);
        
        //Creo al dueño
        Duenio dueno = this.buscarDuenio(mascota.getUnDuenio().getIdDuenio());
        //MOdifico el dueño
        dueno.setNombre(nombreDuenio);
        dueno.setCelDuenio(telDuenio);
        
        //llamar al modificar dueño
        this.editarDuenio(dueno);
        
    }

    private Duenio buscarDuenio(int idDuenio) {
        return controPersi.traerduenio(idDuenio);
    }

    private void editarDuenio(Duenio dueno) {
        controPersi.editarDuenio(dueno);
    }

    
}
