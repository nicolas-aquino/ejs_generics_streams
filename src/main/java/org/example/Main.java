package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Ej 2
        Haz una clase Main con el método main
        para representar un escenario donde se crea una instancia de la clase garaje
        con una lista de vehículos según la tabla.
        */
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add( new Vehiculo("Ford", "Fiesta", 1000));
        listaVehiculos.add( new Vehiculo("Ford", "Focus", 1200));
        listaVehiculos.add( new Vehiculo("Ford", "Explorer", 2500));
        listaVehiculos.add( new Vehiculo("Fiat", "Uno", 500));
        listaVehiculos.add( new Vehiculo("Fiat", "Cronos", 1000));
        listaVehiculos.add( new Vehiculo("Fiat", "Torino", 1250));
        listaVehiculos.add( new Vehiculo("Chevrolet", "Aveo", 1250));
        listaVehiculos.add( new Vehiculo("Chevrolet", "Spin", 2500));
        listaVehiculos.add( new Vehiculo("Toyota", "Corola", 1200));
        listaVehiculos.add( new Vehiculo("Toyota", "Fortuner", 3000));
        listaVehiculos.add( new Vehiculo("Renault", "Logan", 950));

        Garaje garaje = new Garaje(1, listaVehiculos);

        /*
        Ej 3
        Haciendo uso del método sort en la lista de Vehículos con expresiones lambda,
        obtén una lista de vehículos ordenados por precio de menor a mayor,
        imprime por pantalla el resultado.
         */

       // garaje.getVehiculos().stream().sorted((x,y)-> (x.getCosto() < y.getCosto())).forEach(System.out::println);
        garaje.getVehiculos().stream()
                .sorted((x,y)-> (int) (x.getCosto() - y.getCosto()))
                .forEach(System.out::println);

        /*
        Ej 4
        De la misma forma que el ejercicio anterior,
        imprime una lista ordenada por marca y a su vez por precio.
         */


    }
}