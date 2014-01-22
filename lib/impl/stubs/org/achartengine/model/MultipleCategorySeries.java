/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  A series for the multiple category charts like the doughnut.
 */
public class MultipleCategorySeries implements java.io.Serializable {

	/**
	 *  Builds a new category series.
	 *  
	 *  @param title the series title
	 */
	public MultipleCategorySeries(String title) {
	}

	/**
	 *  Adds a new value to the series
	 *  
	 *  @param titles the titles to be used as labels
	 *  @param values the new value
	 */
	public void add(String[] titles, double[] values) {
	}

	/**
	 *  Adds a new value to the series.
	 *  
	 *  @param category the category name
	 *  @param titles the titles to be used as labels
	 *  @param values the new value
	 */
	public void add(String category, String[] titles, double[] values) {
	}

	/**
	 *  Removes an existing value from the series.
	 *  
	 *  @param index the index in the series of the value to remove
	 */
	public void remove(int index) {
	}

	/**
	 *  Removes all the existing values from the series.
	 */
	public void clear() {
	}

	/**
	 *  Returns the values at the specified index.
	 *  
	 *  @param index the index
	 *  @return the value at the index
	 */
	public double[] getValues(int index) {
	}

	/**
	 *  Returns the category name at the specified index.
	 *  
	 *  @param index the index
	 *  @return the category name at the index
	 */
	public String getCategory(int index) {
	}

	/**
	 *  Returns the categories count.
	 *  
	 *  @return the categories count
	 */
	public int getCategoriesCount() {
	}

	/**
	 *  Returns the series item count.
	 *  
	 *  @param index the index
	 *  @return the series item count
	 */
	public int getItemCount(int index) {
	}

	/**
	 *  Returns the series titles.
	 *  
	 *  @param index the index
	 *  @return the series titles
	 */
	public String[] getTitles(int index) {
	}

	/**
	 *  Transforms the category series to an XY series.
	 *  
	 *  @return the XY series
	 */
	public XYSeries toXYSeries() {
	}
}
