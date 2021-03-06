/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/* Temporary file pending public availability of api jar */
package javax.servlet;

import java.util.EventListener;

public interface ServletRequestAttributeListener extends EventListener {

    default public void attributeAdded(ServletRequestAttributeEvent event) {}

    default public void attributeRemoved(ServletRequestAttributeEvent event) {}

    default public void attributeReplaced(ServletRequestAttributeEvent event) {}

}
