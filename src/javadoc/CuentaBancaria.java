package javadoc;

import java.util.ArrayList;
/**
 * Define el numeroCuenta, saldo y propietario de cada CuentaBancaria.
 *  Esta clase define objetos (CuentaBancaria) que tienen un numeroCuenta, saldo y propietario determinado.
 *  @author Diego Rivero Entrialgo
 *  @version 1.0, 2024/03/12
 */
public class CuentaBancaria {
    /**
     * Se define un String numeroCuenta como parámetro privado.
     */
    private String numeroCuenta;
    /**
     * Se define un double saldo como parámetro privado.
     */
    private double saldo;
    /**
     * Se define una clase Cliente propietario como parámetro privado.
     */
    private Cliente propietario;

    /**
     * Constructor para CuentaBancaria con 3 parámetros.
     * Obtiene los atributos numeroCuenta, saldo e propietario y se definen posteriormente.
     * @param numeroCuenta El parámetro nombre define el numeroCuenta de cada CuentaBancaria, se pasa como String
     * @param saldo El parámetro saldo define el saldo de cada CuentaBancaria, se pasa como double.
     * @param propietario El parámetro propietario define el cliente que tiene la CuentaBancaria, se pasa como clase Cliente.
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Método que devuelve un dato String, numeroCuenta en este caso.
     * @return devuelve el NumeroCuenta de cada CuentaBancaria como un String.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Método void que obtiene el atributo numeroCuenta y establece el numeroCuenta de cada CuentaBancaria.
     * @param numeroCuenta El parámetro numeroCuenta se pasa como String y posteriormente se instancia.
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Método que devuelve un dato double, saldo en este caso.
     * @return devuelve el saldo de cada CuentaBancaria como un dato double.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método void que obtiene el atributo saldo y establece el nsaldo de cada CuentaBancaria.
     * @param saldo El parámetro saldo se pasa como double y posteriormente se instancia.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método que devuelve un dato de clase Cliente, propietario en este caso.
     * @return devuelve el  propietario de cada CuentaBancaria como clase Cliente.
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Método void que obtiene el atributo propietario y establece el propietario de cada CuentaBancaria.
     * @param propietario El parámetro propietario se pasa como clase Cliente y posteriormente se instancia
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Método que agrega la cantidad de deposito al saldo de la CuentaBancaria.
     * @param cantidad El parámetro cantidad define la cantidad que se va a añadir a el saldo de la CuentaBancaria.
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**

     * Método boolean que permite retirar una cantidad del saldo, solo si el saldo es mayor o igual a la cantidad a retirar.
     * @param cantidad El parámetro cantidad define la cantidad que se va a retirar del saldo disponible.
     * @return Devuelve verdadero si la cantidad es menor o igual al saldo y si no es asi devuelve falso.
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Método toString que convierte el contenido en una cadena de texto.
     * Devuelve la CuentaBancaria,con la información del numeroCuenta, saldo y propietario con el nombre y apellidos de cada cliente.
     * @return  La cadena de texto de cada CuentaBancaria, con su numeroCuenta, saldo y datos del propietario.
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}