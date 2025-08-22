import java.util.Objects;

public class User {
	private int cod;

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return cod == other.cod;
	}
	
	
}
