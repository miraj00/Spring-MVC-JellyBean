package co.grandcircus.assessment6b.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jellybean")
public class Jellybean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String style;
	private Integer rating;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	public Jellybean() {
		super();	
	}
	
	public Jellybean(Long id, String style, Integer rating) {
		super();
		this.id = id;
		this.style = style;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Jellybean [id=" + id + ", style=" + style + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
	
	
	
}
