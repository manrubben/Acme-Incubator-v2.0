
package acme.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;

public class TechnologyRecords extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				title;

	@NotBlank
	private String				activitySector;

	@NotBlank
	private String				inventorsName;

	@NotBlank
	private String				description;

	@NotBlank
	private String				website;

	@Email
	private String				email;

	@NotBlank
	private String				indication;

	@Min(value = -5)
	@Max(value = 5)
	private Double				stars;

}
