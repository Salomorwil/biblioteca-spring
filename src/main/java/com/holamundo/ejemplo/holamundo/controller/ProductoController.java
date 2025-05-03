package com.holamundo.ejemplo.holamundo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import com.holamundo.ejemplo.holamundo.modelo.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v2/producto")
public class ProductoController {

        private List<Producto> productos = new ArrayList<>();

        public ProductoController() {
            productos.add(new Producto(1L, "Laptop", 10));
            productos.add(new Producto(2L, "Smartphone", 5));
            productos.add(new Producto(3L, "Teclado", 1));
        }

        @ResponseStatus(value = HttpStatus.NOT_FOUND)
        public class ProductoNoEncontradoException extends RuntimeException {}
        @GetMapping
        public String index(){
            return "bienvenidos al listado de productos";
        }
        @GetMapping("/{idProducto}")
    public Producto buscar(@PathVariable Long idProducto) {
        for (Producto producto : productos) {
            if (producto.getId().equals(idProducto)) {
                return producto;
            }
        }
        throw new ProductoNoEncontradoException();
}
    }