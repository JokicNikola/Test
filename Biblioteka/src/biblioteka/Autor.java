package biblioteka;
/**
 * Predstavlja autora knjige
 * @author Nikola Jokic
 * @version 1.0
 *
 */
public class Autor {
	/**
	 * Ime autora
	 */
	private String ime;
	/**
	 * Prezime autora
	 */
	private String prezime;
	
	public String getIme() {
		return ime;
	}
	
	/**
	 * Postavlja novo ime
	 * @param ime novo ime autora
	 * @throws java.lang.RuntimeException ako je uneto null ili prazan String
	 */
	public void setIme(String ime) {
		if(ime!=null && ime!="")
			this.ime = ime;
		else throw new RuntimeException("Morate uneti ime");
	}
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * Postavlja novo prezime
	 * @param prezime novo prezime autora
	 * @throws java.lang.RuntimeException ako je uneto prezime:
	 * <ul>
	 * 	<li> null</li>
	 *  <li>prazan String</li>
	 *  </ul>
	 */
	public void setPrezime(String prezime) {
		if(prezime!=null && prezime!="")
			this.prezime = prezime;
		else throw new RuntimeException("Morate uneti prezime");
	}
	
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}
	/**
	 * Poredi dva autora
	 * @param obj Drugi autor
	 * @return true ako oba autora imaju isto ime i prezime, inace false
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
	
	

}
