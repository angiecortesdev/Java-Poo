package main.java.com.softlond.project.poo.encapsulamiento;

public class Estudiante extends Persona {
        public static int contadorId = 0;
        protected int id;
        protected String codigo;

        private float promedio;

        public Estudiante(String nombre, String numeroCedula, int edad){
            super(nombre, numeroCedula, edad);
            this.id = contadorId++;
            this.codigo = this.getNombre() + this.id;
            this.promedio = 0;
        }

        public static int getContadorId() {
            return contadorId;
        }

        public static void setContadorId(int contadorId) {
            Estudiante.contadorId = contadorId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public float getPromedio() {
            return promedio;
        }

        public void setPromedio(float promedio) {
            this.promedio = promedio;
        }

        @Override
        public String toString(){
            return "Estudiante{" + 
            "id = " + this.id +
            ", nombre " + this.getNombre() +
            ", número de cédula " + this.getNumeroCedula() +
            ", edad " + this.getEdad() +
            ", promedio " + this.getPromedio() +
            "}";
        }


}
