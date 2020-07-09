
package acme.entities;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;

public class Overtures extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				title;

	@NotBlank
	private LocalDateTime		creation;

	@NotBlank
	private LocalDateTime		deadline;

	@NotBlank
	private String				paragraph;

	@Range
	private Money				rangeMoney;

	@Email
	private String				email;

}
