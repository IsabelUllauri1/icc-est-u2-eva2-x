package controllers;

import java.util.List;
import java.util.TreeSet;
import java.util.*;
import models.*;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros){
        return new TreeSet<>(libros);
    }
}
