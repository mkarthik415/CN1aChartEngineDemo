/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  A series for the date / time charts.
 */
public class TimeSeries extends XYSeries {

	/**
	 *  Builds a new date / time series.
	 *  
	 *  @param title the series title
	 */
	public TimeSeries(String title) {
	}

	/**
	 *  Adds a new value to the series.
	 *  
	 *  @param x the date / time value for the X axis
	 *  @param y the value for the Y axis
	 */
	public synchronized void add(java.util.Date x, double y) {
	}

	protected double getPadding(double x) {
	}
}
