package co.alpha.common;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseDTO {

	@Id
	@GeneratedValue(generator = "ncsPk") // Use custom generator
	@GenericGenerator(name = "ncsPk", strategy = "native") // Hibernate-specific
	@Column(name = "ID", nullable = false, unique = true)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
