
package acme.entities;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;

public class Notices extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				headerPicture;

	@NotBlank
	private String				title;

	@NotBlank
	private LocalDateTime		creation;

	@NotBlank
	private LocalDateTime		deadline;

	@NotBlank
	private String				body;

	private String				links;

}
