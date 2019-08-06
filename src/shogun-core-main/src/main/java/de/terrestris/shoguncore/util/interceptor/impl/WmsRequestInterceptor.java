/**
 *
 */
package de.terrestris.shoguncore.util.interceptor.impl;

import static org.apache.logging.log4j.LogManager.getLogger;

import org.apache.logging.log4j.Logger;

import de.terrestris.shoguncore.util.interceptor.MutableHttpServletRequest;
import de.terrestris.shoguncore.util.interceptor.WmsRequestInterceptorInterface;

/**
 * Interceptor class for WMS requests.
 *
 * @author Nils Bühner
 *
 */
public class WmsRequestInterceptor implements WmsRequestInterceptorInterface {

	/**
	 *
	 */
	private static final Logger LOG = getLogger(WmsRequestInterceptor.class);

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetMap(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WMS GetMap.");
		return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetFeatureInfo(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WMS GetFeatureInfo.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptDescribeLayer(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WMS DescribeLayer.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetLegendGraphic(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WMS GetLegendGraphic.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetStyles(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WMS GetStyles.");
        return request;
	}

	/**
	 *
	 */
	@Override
	public MutableHttpServletRequest interceptGetCapabilities(MutableHttpServletRequest request) {
		LOG.debug("Intercepting WMS GetCapabilities.");
        return request;
	}

}
