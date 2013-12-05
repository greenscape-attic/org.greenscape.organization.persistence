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
	public OrganizationEntity findById(Object id);

	public OrganizationEntity findByOrganizationId(long orgId);

	public Collection<OrganizationEntity> findAll();

	public OrganizationEntity save(OrganizationEntity organizationModel);

	public void deleteByOrganizationId(long orgId);
}
