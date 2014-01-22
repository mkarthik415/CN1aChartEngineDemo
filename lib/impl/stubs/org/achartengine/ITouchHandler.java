/**
 * 
 * The main classes, including the ChartFactory, GraphicalActivity and GraphicalView.
 */
package org.achartengine;


/**
 *  The interface to be implemented by the touch handlers.
 */
public interface ITouchHandler {

	/**
	 *  Handles the touch event.
	 *  
	 *  @param event the touch event
	 *  @return true if the event was handled
	 */
	public boolean handleTouch(compat.MotionEvent event);

	/**
	 *  Adds a new zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public void addZoomListener(tools.ZoomListener listener);

	/**
	 *  Removes a zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public void removeZoomListener(tools.ZoomListener listener);

	/**
	 *  Adds a new pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public void addPanListener(tools.PanListener listener);

	/**
	 *  Removes a pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public void removePanListener(tools.PanListener listener);
}
