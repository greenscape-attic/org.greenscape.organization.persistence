/**
 * 
 */
package org.greenscape.organization.persistence;

import java.util.Collection;

import org.greenscape.organization.OrganizationEntity;

/**
 * @author Sheikh Sajid
 * 
 */
public interface OrganizationPersistence {
	OrganizationEntity findById(Object id);

	OrganizationEntity findByOrganizationId(long orgId);

	Collection<OrganizationEntity> findAll();

	OrganizationEntity save(OrganizationEntity organizationModel);

	void deleteByOrganizationId(long orgId);
}
