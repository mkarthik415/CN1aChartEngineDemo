/**
 * 
 * The main classes, including the ChartFactory, GraphicalActivity and GraphicalView.
 */
package org.achartengine;


/**
 *  The main handler of the touch events.
 */
public class TouchHandler implements ITouchHandler {

	/**
	 *  Creates a new graphical view.
	 *  
	 *  @param view the graphical view
	 *  @param chart the chart to be drawn
	 */
	public TouchHandler(GraphicalView view, chart.AbstractChart chart) {
	}

	/**
	 *  Handles the touch event.
	 *  
	 *  @param event the touch event
	 */
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
