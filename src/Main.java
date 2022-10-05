public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCredito(100);
        cliente.setEdad(45);
        cliente.setNombre("Eracles");
        cliente.setTelefono(1157389412);

        System.out.println(cliente.getCredito());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}