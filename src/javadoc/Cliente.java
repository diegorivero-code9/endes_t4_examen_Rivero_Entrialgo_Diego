package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Define el nombre, apellido, id y el listado de cuentas de cada cliente.
 * Esta clase define objetos (cliente) que tienen un nombre, apellido, cuentas e id determinado.
 * @author Diego Rivero Entrialgo
 * @version 1.0, 2024/03/12
 */
public class Cliente {
    /**
     * Se define un String nombre como parámetro privado.
     */
    private String nombre;
    /**
     * Se define un String apellido como parámetro privado.
     */
    private String apellido;
    /**
     * Se define un String id como parámetro privado.
     */
    private String id;
    /**
     * Lista de cuentas de cada cliente.
     * Objeto Arraylist que contendrá objetos(CuentaBancaria) de tipo cuentas.
     */
    private List<CuentaBancaria> cuentas;
    /**
     * Constructor para cliente con 3 parámetros y un listado.
     * Obtiene los atributos nombre, apellido e id y se definen posteriormente.
     * @param nombre El parámetro nombre define el nombre de cada cliente, se pasa como String.
     * @param apellido El parámetro apellido define el apellido de cada cliente, se pasa como String.
     * @param id El parámetro id define el identificador de cada cliente, se pasa como String.
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Método que devuelve un dato String, nombre en este caso.
     * @return devuelve el nombre de cada cliente como un String.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método void que obtiene el atributo nombre y establece el nombre del cliente.
     * @param nombre El parámetro nombre se pasa como String y posteriormente se instancia.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve un dato String, apellido en este caso.
     * @return devuelve el apellido de cada cliente como un String.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método void que obtiene el atributo apellido y establece el apellido del cliente.
     * @param apellido El parámetro apellido se pasa como un String y posteriormente se instancia.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que devuelve un dato String, id en este caso.
     * @return devuelve el id (identificador) de cada cliente como un String.
     */
    public String getId() {
        return id;
    }

    /**
     * Método void que obtiene el atributo id y establece el id del cliente.
     * @param id El parámetro id se pasa como un String y posteriormente se instancia.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Método que obtiene la lista de las cuentas bancarias.
     * @return una nueva lista de las cuentas que existan.
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Método que agrega cuenta a la lista de cuentas.
     * @param cuenta El parámetro cuenta define la cuenta que se va a añadir a la lista de cuentas.
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Método que elimina cuentas/cierra cuentas.
     * @param numeroCuenta El parámetro numeroCuenta define la cuenta que se pasa para comprobar si
     * se cumple la condición.
     * @return El parámetro cuentas, el cual si se cumple la condición se borrara su contenido.
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Método toString que convierte el contenido en una cadena de texto.
     * Devuelve nombre, apellido, id y cuentas respectivamente de cada Cliente.
     * @return La cadena de texto de cada cliente, con su nombre, apellido, id y cuentas.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}

