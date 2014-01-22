/**
 * 
 * The main classes, including the ChartFactory, GraphicalActivity and GraphicalView.
 */
package org.achartengine;


/**
 *  A handler implementation for touch events for older platforms.
 */
public class TouchHandlerOld implements ITouchHandler {

	/**
	 *  Creates an implementation of the old version of the touch handler.
	 *  
	 *  @param view the graphical view
	 *  @param chart the chart to be drawn
	 */
	public TouchHandlerOld(GraphicalView view, chart.AbstractChart chart) {
	}

	public boolean handleTouch(compat.MotionEvent event) {
	}

	/**
	 *  Adds a new zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public void addZoomListener(tools.ZoomListener listener) {
	}

	/**
	 *  Removes a zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public void removeZoomListener(tools.ZoomListener listener) {
	}

	/**
	 *  Adds a new pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public void addPanListener(tools.PanListener listener) {
	}

	/**
	 *  Removes a pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public void removePanListener(tools.PanListener listener) {
	}
}
