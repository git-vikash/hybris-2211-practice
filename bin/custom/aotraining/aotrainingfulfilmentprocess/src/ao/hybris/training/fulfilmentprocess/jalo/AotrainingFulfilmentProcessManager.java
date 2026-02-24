/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package ao.hybris.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import ao.hybris.training.fulfilmentprocess.constants.AotrainingFulfilmentProcessConstants;

public class AotrainingFulfilmentProcessManager extends GeneratedAotrainingFulfilmentProcessManager
{
	public static final AotrainingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AotrainingFulfilmentProcessManager) em.getExtension(AotrainingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
