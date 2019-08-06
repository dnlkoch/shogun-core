/**
 *
 */
package de.terrestris.shoguncore.util.interceptor.impl;

import static org.apache.logging.log4j.LogManager.getLogger;

import org.apache.logging.log4j.Logger;

import de.terrestris.shoguncore.util.interceptor.MutableHttpServletRequest;
import de.terrestris.shoguncore.util.interceptor.WpsRequestInterceptorInterface;

/**
 * Interceptor class for WPS requests. Adds basic auth headers based on the GS
 * properties by default.
 *
 * @author Nils Bühner
 *
 */
public class WpsRequestInterceptor implements WpsRequestInterceptorInterface {

	/**
	 *
	 */
	private static final Logger LOG = getLogger(WpsRequestInterceptor.class);

	/**
	 * @see de.terrestris.shoguncore.util.interceptor.WpsRequestInterceptorInterface#interceptGetCapabilities(de.terrestris.shoguncore.util.interceptor.MutableHttpServletRequest)
	 */
	@Override
	public MutableHttpServletRequest interceptGetCapabilities(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WPS GetCapabilities.");
        return request;
	}

	/**
	 * @see de.terrestris.shoguncore.util.interceptor.WpsRequestInterceptorInterface#interceptDescribeProcess(de.terrestris.shoguncore.util.interceptor.MutableHttpServletRequest)
	 */
	@Override
	public MutableHttpServletRequest interceptDescribeProcess(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WPS DescribeProcess.");
        return request;
	}

	/**
	 * @see de.terrestris.shoguncore.util.interceptor.WpsRequestInterceptorInterface#interceptExecute(de.terrestris.shoguncore.util.interceptor.MutableHttpServletRequest)
	 */
	@Override
	public MutableHttpServletRequest interceptExecute(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WPS Execute.");
        return request;
	}

}
