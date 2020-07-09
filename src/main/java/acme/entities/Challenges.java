
package acme.entities;

import java.time.LocalDateTime;

import acme.framework.entities.DomainEntity;

public class Challenges extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private String				title;

	private LocalDateTime		deadline;

	private String				description;

}
