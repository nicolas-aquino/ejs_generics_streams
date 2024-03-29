package org.example;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
        private int id;
        List<Vehiculo> vehiculos;

        public Garaje(int id) {
                this.id = id;
                this.vehiculos = new ArrayList<Vehiculo>();
        }

        public Garaje(int id, List<Vehiculo> vehiculos) {
                this.id = id;
                this.vehiculos = vehiculos;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public List<Vehiculo> getVehiculos() {
                return vehiculos;
        }

        public void setVehiculos(List<Vehiculo> vehiculos) {
                this.vehiculos = vehiculos;
        }


}
