package app;

import java.util.Arrays;
import modelo.Compra;
import modelo.Producto;
import modelo.Usuario;

/**
 * Clase principal del proyecto de prueba
 * @date febrero de 2023
 * @author caflorezvi
 * @version 1.0
 */

public class Aplicacion {

    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.setCodigo("123");
        compra.setUsuario( new Usuario("10971112222", "Pepito", "pepe@email.com", 1996) );
        compra.setProductos( 
            Arrays.asList( 
                new Producto[]{ 
                    new Producto("1", "Calculadora CASIO", 2, 56000),
                    new Producto("2", "Tablet Samsung", 1, 1260000) 
                }
            )
        );

        System.out.println(compra);
    }

}
