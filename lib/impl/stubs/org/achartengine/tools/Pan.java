package org.achartengine.tools;


/**
 *  The pan tool.
 */
public class Pan extends AbstractTool {

	/**
	 *  Builds and instance of the pan tool.
	 *  
	 *  @param chart the XY chart
	 */
	public Pan(org.achartengine.chart.AbstractChart chart) {
	}

	/**
	 *  Apply the tool.
	 *  
	 *  @param oldX the previous location on X axis
	 *  @param oldY the previous location on Y axis
	 *  @param newX the current location on X axis
	 *  @param newY the current location on the Y axis
	 */
	public void apply(float oldX, float oldY, float newX, float newY) {
	}

	/**
	 *  Adds a new pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public synchronized void addPanListener(PanListener listener) {
	}

	/**
	 *  Removes a pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public synchronized void removePanListener(PanListener listener) {
	}
}
