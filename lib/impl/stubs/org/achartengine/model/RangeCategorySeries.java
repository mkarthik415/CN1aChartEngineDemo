/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  A series for the range category charts like the range bar.
 */
public class RangeCategorySeries extends CategorySeries {

	/**
	 *  Builds a new category series.
	 *  
	 *  @param title the series title
	 */
	public RangeCategorySeries(String title) {
	}

	/**
	 *  Adds new values to the series
	 *  
	 *  @param minValue the new minimum value
	 *  @param maxValue the new maximum value
	 */
	public synchronized void add(double minValue, double maxValue) {
	}

	/**
	 *  Adds new values to the series.
	 *  
	 *  @param category the category
	 *  @param minValue the new minimum value
	 *  @param maxValue the new maximum value
	 */
	public synchronized void add(String category, double minValue, double maxValue) {
	}

	/**
	 *  Removes existing values from the series.
	 *  
	 *  @param index the index in the series of the values to remove
	 */
	public synchronized void remove(int index) {
	}

	/**
	 *  Removes all the existing values from the series.
	 */
	public synchronized void clear() {
	}

	/**
	 *  Returns the minimum value at the specified index.
	 *  
	 *  @param index the index
	 *  @return the minimum value at the index
	 */
	public double getMinimumValue(int index) {
	}

	/**
	 *  Returns the maximum value at the specified index.
	 *  
	 *  @param index the index
	 *  @return the maximum value at the index
	 */
	public double getMaximumValue(int index) {
	}

	/**
	 *  Transforms the range category series to an XY series.
	 *  
	 *  @return the XY series
	 */
	public XYSeries toXYSeries() {
	}
}
