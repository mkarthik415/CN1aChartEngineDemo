/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  PieChart Segment Selection Management.
 */
public class PieMapper implements java.io.Serializable {

	public PieMapper() {
	}

	/**
	 *  Set PieChart location on screen.
	 *  
	 *  @param pieRadius
	 *  @param centerX
	 *  @param centerY
	 */
	public void setDimensions(int pieRadius, int centerX, int centerY) {
	}

	/**
	 *  If we have all PieChart Config then there is no point in reloading it
	 *  
	 *  @param datasetSize
	 *  @return true if cfg for each segment is present
	 */
	public boolean areAllSegmentPresent(int datasetSize) {
	}

	/**
	 *  Add configuration for a PieChart Segment
	 *  
	 *  @param dataIndex
	 *  @param value
	 *  @param startAngle
	 *  @param angle
	 */
	public void addPieSegment(int dataIndex, float value, float startAngle, float angle) {
	}

	/**
	 *  Clears the pie segments list.
	 */
	public void clearPieSegments() {
	}

	/**
	 *  Fetches angle relative to pie chart center point where 3 O'Clock is 0 and
	 *  12 O'Clock is 270degrees
	 *  
	 *  @param screenPoint
	 *  @return angle in degress from 0-360.
	 */
	public double getAngle(org.achartengine.model.Point screenPoint) {
	}

	/**
	 *  Checks if Point falls within PieChart
	 *  
	 *  @param screenPoint
	 *  @return true if in PieChart
	 */
	public boolean isOnPieChart(org.achartengine.model.Point screenPoint) {
	}

	/**
	 *  Fetches the SeriesSelection for the PieSegment selected.
	 *  
	 *  @param screenPoint - the user tap location
	 *  @return null if screen point is not in PieChart or its config if it is
	 */
	public org.achartengine.model.SeriesSelection getSeriesAndPointForScreenCoordinate(org.achartengine.model.Point screenPoint) {
	}
}
