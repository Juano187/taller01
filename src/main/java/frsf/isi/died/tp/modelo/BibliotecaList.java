package frsf.isi.died.tp.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.lang.*;

import frsf.isi.died.tp.modelo.productos.*;


public class BibliotecaList implements Biblioteca {

	private ArrayList<MaterialCapacitacion> materiales;
	
	public BibliotecaList() {
	this.materiales = new ArrayList<>();
	}

	@Override
	public void agregar(MaterialCapacitacion material) {
		// TODO Auto-generated method stub
		this.materiales.add(material);
	}

	@Override
	public Integer cantidadMateriales() {
		// TODO Auto-generated method stub
		return this.materiales.size();
	}

	@Override
	public Integer cantidadLibros() {
		// TODO Auto-generated method stub
		int cant=0;
		
		for(MaterialCapacitacion obj : materiales) {
			if(obj instanceof Libro) {
				cant++;
			}
		}
		
		return cant;
	}

	@Override
	public Integer cantidadVideos() {
		// TODO Auto-generated method stub
		int cant=0;
		for(MaterialCapacitacion obj : materiales) {
			if(obj instanceof Video) {
				cant++;
			}
		}
		
		return cant;
	}

	@Override
	public Collection<MaterialCapacitacion> materiales() {
		// TODO Auto-generated method stub
		return this.materiales;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		for(MaterialCapacitacion obj : materiales) {
			if(obj!=null) System.out.println(obj);
		}
	}

	@Override
	public void ordenarPorPrecio(Boolean b) {
		// TODO Auto-generated method stub
		if(b) {
			Collections.sort(materiales, (m1,m2)->m2.precio().compareTo(m1.precio()));
		}
		else {
			Collections.sort(materiales);
		}
	}
	
	
	@Override
	public MaterialCapacitacion buscar(Integer precio) {
		Collections.sort(materiales, (m1, m2) -> m2.getCosto().compareTo(m1.getCosto()));
	return buscadorBinario(0,materiales.size(), precio);
	}
	
	private MaterialCapacitacion buscadorBinario(Integer i,Integer f, Integer c){
			
		   
			try {
				int centro;
		     centro=(f+i)/2;
		     if(materiales.get(centro).getCosto().intValue() == c) return materiales.get(centro);
		     else if(c < materiales.get(centro).getCosto().intValue()){
		        f=centro-1;
		        return buscadorBinario(i,f,c);
		     }
		     else {
		       i=centro+1;
		       return buscadorBinario(i,f,c);
		     }
			}
		   catch(Exception ex) {
			   throw new RuntimeException("Material de precio" + c+ " no encontrado");
		   }
		   
		  
	}
	
	

}
