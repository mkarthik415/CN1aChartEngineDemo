/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  An extension of the XY series which adds a third dimension. It is used for XY
 *  charts like bubble.
 */
public class XYValueSeries extends XYSeries {

	/**
	 *  Builds a new XY value series.
	 *  
	 *  @param title the series title.
	 */
	public XYValueSeries(String title) {
	}

	/**
	 *  Adds a new value to the series.
	 *  
	 *  @param x the value for the X axis
	 *  @param y the value for the Y axis
	 *  @param value the value
	 */
	public synchronized void add(double x, double y, double value) {
	}

	/**
	 *  Adds a new value to the series.
	 *  
	 *  @param x the value for the X axis
	 *  @param y the value for the Y axis
	 */
	public synchronized void add(double x, double y) {
	}

	/**
	 *  Removes an existing value from the series.
	 *  
	 *  @param index the index in the series of the value to remove
	 */
	public synchronized void remove(int index) {
	}

	/**
	 *  Removes all the values from the series.
	 */
	public synchronized void clear() {
	}

	/**
	 *  Returns the value at the specified index.
	 *  
	 *  @param index the index
	 *  @return the value
	 */
	public synchronized double getValue(int index) {
	}

	/**
	 *  Returns the minimum value.
	 *  
	 *  @return the minimum value
	 */
	public double getMinValue() {
	}

	/**
	 *  Returns the maximum value.
	 *  
	 *  @return the maximum value
	 */
	public double getMaxValue() {
	}
}
