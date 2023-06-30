package lt.codeacademy.javau5.wms.enteties;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="prekes")
public class Preke {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="article")
	private String artikelis;
	@Column(name="name")
	private String pavadinimas;
	@Column(name="description")
	private String aprasymas;
	@Column(name="quantity")
	private int kiekis;
	@Column(name="unit")
	private String matVnt;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "book_author",
    	joinColumns = @JoinColumn(name = "book_id"),
    	inverseJoinColumns = @JoinColumn(name = "author_id"))
	@Column(name="location_id")
	private List<Location> location;

	public Preke() {
	}

	public Preke(Long id, String artikelis, String pavadinimas, String aprasymas, int kiekis, String matVnt,
			List<Location> location) {
		this.id = id;
		this.artikelis = artikelis;
		this.pavadinimas = pavadinimas;
		this.aprasymas = aprasymas;
		this.kiekis = kiekis;
		this.matVnt = matVnt;
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArtikelis() {
		return artikelis;
	}

	public void setArtikelis(String artikelis) {
		this.artikelis = artikelis;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getAprasymas() {
		return aprasymas;
	}

	public void setAprasymas(String aprasymas) {
		this.aprasymas = aprasymas;
	}

	public int getKiekis() {
		return kiekis;
	}

	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}

	public String getMatVnt() {
		return matVnt;
	}

	public void setMatVnt(String matVnt) {
		this.matVnt = matVnt;
	}

	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Preke [id=" + id + ", artikelis=" + artikelis + ", pavadinimas=" + pavadinimas + ", aprasymas="
				+ aprasymas + ", kiekis=" + kiekis + ", matVnt=" + matVnt + "]";
	}
	
	
}
