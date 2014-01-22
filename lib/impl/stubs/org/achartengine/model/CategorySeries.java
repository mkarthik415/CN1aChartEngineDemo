/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  A series for the category charts like the pie ones.
 */
public class CategorySeries implements java.io.Serializable {

	/**
	 *  Builds a new category series.
	 *  
	 *  @param title the series title
	 */
	public CategorySeries(String title) {
	}

	/**
	 *  Returns the series title.
	 *  
	 *  @return the series title
	 */
	public String getTitle() {
	}

	/**
	 *  Adds a new value to the series
	 *  
	 *  @param value the new value
	 */
	public synchronized void add(double value) {
	}

	/**
	 *  Adds a new value to the series.
	 *  
	 *  @param category the category
	 *  @param value the new value
	 */
	public synchronized void add(String category, double value) {
	}

	/**
	 *  Replaces the value at the specific index in the series.
	 *  
	 *  @param index the index in the series
	 *  @param category the category
	 *  @param value the new value
	 */
	public synchronized void set(int index, String category, double value) {
	}

	/**
	 *  Removes an existing value from the series.
	 *  
	 *  @param index the index in the series of the value to remove
	 */
	public synchronized void remove(int index) {
	}

	/**
	 *  Removes all the existing values from the series.
	 */
	public synchronized void clear() {
	}

	/**
	 *  Returns the value at the specified index.
	 *  
	 *  @param index the index
	 *  @return the value at the index
	 */
	public synchronized double getValue(int index) {
	}

	/**
	 *  Returns the category name at the specified index.
	 *  
	 *  @param index the index
	 *  @return the category name at the index
	 */
	public synchronized String getCategory(int index) {
	}

	/**
	 *  Returns the series item count.
	 *  
	 *  @return the series item count
	 */
	public synchronized int getItemCount() {
	}

	/**
	 *  Transforms the category series to an XY series.
	 *  
	 *  @return the XY series
	 */
	public XYSeries toXYSeries() {
	}
}
