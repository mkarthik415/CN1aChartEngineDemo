package org.achartengine.tools;


/**
 *  The zoom tool.
 */
public class Zoom extends AbstractTool {

	/**
	 * Zoom on X axis and Y axis 
	 */
	public static final int ZOOM_AXIS_XY = 0;

	/**
	 * Zoom on X axis independently 
	 */
	public static final int ZOOM_AXIS_X = 1;

	/**
	 * Zoom on Y axis independently 
	 */
	public static final int ZOOM_AXIS_Y = 2;

	/**
	 *  Builds the zoom tool.
	 *  
	 *  @param chart the chart
	 *  @param in zoom in or out
	 *  @param rate the zoom rate
	 */
	public Zoom(org.achartengine.chart.AbstractChart chart, boolean in, float rate) {
	}

	/**
	 *  Sets the zoom rate.
	 *  
	 *  @param rate
	 */
	public void setZoomRate(float rate) {
	}

	/**
	 *  Apply the zoom.
	 */
	public void apply(int zoom_axis) {
	}

	/**
	 *  Notify the zoom listeners about a zoom reset.
	 */
	public synchronized void notifyZoomResetListeners() {
	}

	/**
	 *  Adds a new zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public synchronized void addZoomListener(ZoomListener listener) {
	}

	/**
	 *  Removes a zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public synchronized void removeZoomListener(ZoomListener listener) {
	}
}
