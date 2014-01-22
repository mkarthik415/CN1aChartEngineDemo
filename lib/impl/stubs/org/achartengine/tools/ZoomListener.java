package org.achartengine.tools;


/**
 *  A zoom listener.
 */
public interface ZoomListener {

	/**
	 *  Called when a zoom change is triggered.
	 *  @param e the zoom event
	 */
	public void zoomApplied(ZoomEvent e);

	/**
	 *  Called when a zoom reset is done.
	 */
	public void zoomReset();
}
