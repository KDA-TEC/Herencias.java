public class Herencias {

    public static void main(String[] args) {

     Cliente cliente = new Cliente();

     cliente.setEdad(20);
     cliente.setNombre("Kevin");
     cliente.setTelefono(929292929);
     cliente.setCredito(5000);

     System.out.println("La edad del cliente es :" + cliente.getEdad());
     System.out.println("El nombre del cliente es :" + cliente.getNombre());
     System.out.println("El telefono del cliente es :" + cliente.getTelefono());
     System.out.println("El credito del cliente es :" + cliente.getCredito());
     System.out.println(" ");

     Trabajador trabajador = new Trabajador();

     trabajador.setEdad(30);
     trabajador.setNombre("Pedro");
     trabajador.setSalario(4500);
     trabajador.setTelefono(989898989);


     System.out.println(" ");
     System.out.println("La edad del trabajador es : " + trabajador.getEdad());
     System.out.println("El nombre del trabajador es : " + trabajador.getNombre());
     System.out.println("El salario del trabajador es : " + trabajador.getSalario());
     System.out.println("El telefono del trabajador es : " + trabajador.getTelefono());



    }
}
class Persona{

    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{

    int credito;

    public String getNombre(){

        return this.nombre;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public int getEdad(){

        return this.edad;
    }

    public void setEdad(int edad){

        this.edad = edad;
    }

    public int getTelefono(){

        return this.telefono;
    }

    public void setTelefono(int telefono){

        this.telefono = telefono;
    }

    public int getCredito(){

        return this.credito;
    }

    public void setCredito(int credito){

        this.credito = credito;
    }

}

class Trabajador extends Persona{

    int salario;

    public String getNombre(){

        return this.nombre;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public int getEdad(){

        return this.edad;
    }

    public void setEdad(int edad){

        this.edad = edad;
    }

    public int getTelefono(){

        return this.telefono;
    }

    public void setTelefono(int telefono){

        this.telefono = telefono;
    }

    public int getSalario(){

        return this.salario;
    }

    public void setSalario(int salario){

        this.salario = salario;
    }
}
