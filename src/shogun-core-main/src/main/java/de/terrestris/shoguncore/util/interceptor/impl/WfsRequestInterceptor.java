/**
 *
 */
package de.terrestris.shoguncore.util.interceptor.impl;

import static org.apache.logging.log4j.LogManager.getLogger;

import org.apache.logging.log4j.Logger;

import de.terrestris.shoguncore.util.interceptor.MutableHttpServletRequest;
import de.terrestris.shoguncore.util.interceptor.WfsRequestInterceptorInterface;

/**
 * Interceptor class for WFS requests. Adds basic auth headers based on the GS
 * properties by default.
 *
 * @author Nils Bühner
 *
 */
public class WfsRequestInterceptor implements WfsRequestInterceptorInterface {

	/**
	 *
	 */
	private static final Logger LOG = getLogger(WfsRequestInterceptor.class);

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetCapabilities(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WFS GetCapabilities.");
		return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptDescribeFeatureType(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WFS DescribeFeatureType.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetFeature(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WFS GetFeature.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptLockFeature(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WFS LockFeature.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptTransaction(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WFS Transaction.");
        return request;
	}

}
