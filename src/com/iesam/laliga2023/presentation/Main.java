package src.com.iesam.laliga2023.presentation;

import src.com.iesam.laliga2023.domain.Equipo;

public class Main {
    public static void main (String []args){

        Equipo equipo1 = new Equipo();

        equipo1.setCodEquipo(1);
        equipo1.setDireccion("Madrid");
        equipo1.setNombre("Real Madrid");
        equipo1.setTelefono(123456789);

        System.out.println("El equipo con codigo "+equipo1.getCodEquipo()+ " es de " + equipo1.getDireccion()+
                ", sellama " + equipo1.getNombre()+ " y su telefono es " + equipo1.getTelefono());



    }
}
