/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  A series that includes 0 to many XYSeries.
 */
public class XYMultipleSeriesDataset implements java.io.Serializable {

	public XYMultipleSeriesDataset() {
	}

	/**
	 *  Adds a new XY series to the list.
	 *  
	 *  @param series the XY series to add
	 */
	public synchronized void addSeries(XYSeries series) {
	}

	/**
	 *  Adds a new XY series to the list.
	 *  
	 *  @param index the index in the series list
	 *  @param series the XY series to add
	 */
	public synchronized void addSeries(int index, XYSeries series) {
	}

	/**
	 *  Adds all the provided XY series to the list.
	 *  
	 *  @param series the XY series to add
	 */
	public synchronized void addAllSeries(java.util.List series) {
	}

	/**
	 *  Removes the XY series from the list.
	 *  
	 *  @param index the index in the series list of the series to remove
	 */
	public synchronized void removeSeries(int index) {
	}

	/**
	 *  Removes the XY series from the list.
	 *  
	 *  @param series the XY series to be removed
	 */
	public synchronized void removeSeries(XYSeries series) {
	}

	/**
	 *  Removes all the XY series from the list.
	 */
	public synchronized void clear() {
	}

	/**
	 *  Returns the XY series at the specified index.
	 *  
	 *  @param index the index
	 *  @return the XY series at the index
	 */
	public synchronized XYSeries getSeriesAt(int index) {
	}

	/**
	 *  Returns the XY series count.
	 *  
	 *  @return the XY series count
	 */
	public synchronized int getSeriesCount() {
	}

	/**
	 *  Returns an array of the XY series.
	 *  
	 *  @return the XY series array
	 */
	public synchronized XYSeries[] getSeries() {
	}
}
