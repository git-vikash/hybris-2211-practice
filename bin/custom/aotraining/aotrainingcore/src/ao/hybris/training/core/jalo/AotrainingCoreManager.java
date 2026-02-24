/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package ao.hybris.training.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import ao.hybris.training.core.constants.AotrainingCoreConstants;
import ao.hybris.training.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class AotrainingCoreManager extends GeneratedAotrainingCoreManager
{
	public static final AotrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AotrainingCoreManager) em.getExtension(AotrainingCoreConstants.EXTENSIONNAME);
	}
}
