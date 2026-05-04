public class Persona {
    private String nombre;
    private int edad;

    public Persona(){
        this.nombre="Sin nombre";
        this.edad=0;
        //System.out.println("Obejeto Persina creado con valores prodefecto");
    }
    //get obtener


    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    //Set Asiganar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
