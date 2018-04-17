package frsf.isi.died.tp.modelo.productos;

public class Video extends MaterialCapacitacion {

	static final Double costof = 0.15 ;
	Integer duracion; 
	
	public Video() {
		
	}
	
	public Video(Integer id,String titulo) {
		
	}
	
	public Video(Integer id, String titulo, Double costo, Integer duracion) {
		this.duracion = duracion;
		this.id= id;
		this.titulo = titulo;
		this.costo= costo;
		
	}
	
	@Override
	public Boolean esLibro() {
		
		return false;
	}

	@Override
	public Boolean esVideo() {
		
		return true;
	}
	
	@Override
	public Double precio() {
		//TODO 05: implementar metodo abstracto
		Double precio;
		
		precio = (this.costo + (this.duracion * Video.costof)) ;
		
		return precio;
		
	}

	
	
	
	
	
	
	
	
	
	
}
