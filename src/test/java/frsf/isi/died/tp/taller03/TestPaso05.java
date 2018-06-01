package frsf.isi.died.tp.taller03;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;
import java.util.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import frsf.isi.died.tp.estructuras.Arbol;
import frsf.isi.died.tp.estructuras.ArbolBinarioBusqueda;
import frsf.isi.died.tp.estructuras.ArbolVacio;
import frsf.isi.died.tp.modelo.Biblioteca;
import frsf.isi.died.tp.modelo.BibliotecaABB;
import frsf.isi.died.tp.modelo.productos.Libro;
import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;
import frsf.isi.died.tp.modelo.productos.Video;


public class TestPaso05 {

	private Biblioteca biblioteca;
	private Libro matA;
	private Libro matB;
	private Libro matC;
	private Libro matD;
	private Libro matE;
	private Libro matF;
	private Libro matG;
	
	@Before
	public void init() {
		matA= new Libro(1, "A", 10.0, 10.0, 10);
		matB= new Libro(2, "B", 20.0, 20.0, 10);
		matC= new Libro(3, "C", 30.0, 30.0, 10);
		matD= new Libro(4, "D", 40.0, 40.0, 10);
		matE= new Libro(5, "E", 50.0, 50.0, 10);
		matF= new Libro(6, "F", 60.0, 60.0, 10);
		matG= new Libro(7, "G", 70.0, 70.0, 10);
		
		biblioteca = new BibliotecaABB();		
	}
	
	@Test
	public void testRango() {
		biblioteca.agregar(matA);
		biblioteca.agregar(matB);
		biblioteca.agregar(matC);
		biblioteca.agregar(matD);
		biblioteca.agregar(matE);
		biblioteca.agregar(matF);
		biblioteca.agregar(matG);
				
		
		List<MaterialCapacitacion> lista = new ArrayList<MaterialCapacitacion>();
		List<MaterialCapacitacion> lista1 = new ArrayList<MaterialCapacitacion>();
		List<MaterialCapacitacion> lista2 = new ArrayList<MaterialCapacitacion>();
		List<MaterialCapacitacion> lista3 = new ArrayList<MaterialCapacitacion>();
		List<MaterialCapacitacion> lista4 = new ArrayList<MaterialCapacitacion>();
		List<MaterialCapacitacion> lista5 = new ArrayList<MaterialCapacitacion>();
		
		
		lista = (List<MaterialCapacitacion>) ((BibliotecaABB)biblioteca).rango(40.04, 80.08);
		lista2.add(matB);
		lista2.add(matC);
		lista2.add(matD);	
		
		
		lista1 = (List<MaterialCapacitacion>) ((BibliotecaABB)biblioteca).rango(40.04, 40.04);
		lista3.add(matB);
		
		
		lista4 = (List<MaterialCapacitacion>) ((BibliotecaABB)biblioteca).rango(00.0, 150.0);
		lista5.add(matA);
		lista5.add(matB);
		lista5.add(matC);
		lista5.add(matD);
		lista5.add(matE);
		lista5.add(matF);
		lista5.add(matG);
		
		
		assertTrue(lista.containsAll(lista2));
		assertTrue(lista1.containsAll(lista3));
		assertTrue(lista4.containsAll(lista5));
	}
}