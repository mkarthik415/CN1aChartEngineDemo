/**
 * 
 * Provides the classes that handle the data values (data model) to be used by displaying the charts.
 */
package org.achartengine.model;


/**
 *  An XY series encapsulates values for XY charts like line, time, area,
 *  scatter... charts.
 */
public class XYSeries implements java.io.Serializable {

	/**
	 *  Builds a new XY series.
	 *  
	 *  @param title the series title.
	 */
	public XYSeries(String title) {
	}

	/**
	 *  Builds a new XY series.
	 *  
	 *  @param title the series title.
	 *  @param scaleNumber the series scale number
	 */
	public XYSeries(String title, int scaleNumber) {
	}

	public int getScaleNumber() {
	}

	/**
	 *  Returns the series title.
	 *  
	 *  @return the series title
	 */
	public String getTitle() {
	}

	/**
	 *  Sets the series title.
	 *  
	 *  @param title the series title
	 */
	public void setTitle(String title) {
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
	 *  Adds a new value to the series at the specified index.
	 *  
	 *  @param index the index to be added the data to
	 *  @param x the value for the X axis
	 *  @param y the value for the Y axis
	 */
	public synchronized void add(int index, double x, double y) {
	}

	protected double getPadding(double x) {
	}

	/**
	 *  Removes an existing value from the series.
	 *  
	 *  @param index the index in the series of the value to remove
	 */
	public synchronized void remove(int index) {
	}

	/**
	 *  Removes all the existing values and annotations from the series.
	 */
	public synchronized void clear() {
	}

	/**
	 *  Removes all the existing values from the series but annotations.
	 */
	public synchronized void clearSeriesValues() {
	}

	/**
	 *  Removes all the existing annotations from the series.
	 */
	public synchronized void clearAnnotations() {
	}

	/**
	 *  Returns the current values that are used for drawing the series.
	 *  
	 *  @return the XY map
	 */
	public synchronized org.achartengine.util.IndexXYMap getXYMap() {
	}

	/**
	 *  Returns the X axis value at the specified index.
	 *  
	 *  @param index the index
	 *  @return the X value
	 */
	public synchronized double getX(int index) {
	}

	/**
	 *  Returns the Y axis value at the specified index.
	 *  
	 *  @param index the index
	 *  @return the Y value
	 */
	public synchronized double getY(int index) {
	}

	/**
	 *  Add an String at (x,y) coordinates
	 *  
	 *  @param annotation String text
	 *  @param x
	 *  @param y
	 */
	public void addAnnotation(String annotation, double x, double y) {
	}

	/**
	 *  Remove an String at index
	 *  
	 *  @param index
	 */
	public void removeAnnotation(int index) {
	}

	/**
	 *  Get X coordinate of the annotation at index
	 *  
	 *  @param index the index in the annotations list
	 *  @return the corresponding annotation X value
	 */
	public double getAnnotationX(int index) {
	}

	/**
	 *  Get Y coordinate of the annotation at index
	 *  
	 *  @param index the index in the annotations list
	 *  @return the corresponding annotation Y value
	 */
	public double getAnnotationY(int index) {
	}

	/**
	 *  Get the annotations count
	 *  
	 *  @return the annotations count
	 */
	public int getAnnotationCount() {
	}

	/**
	 *  Get the String at index
	 *  
	 *  @param index
	 *  @return String
	 */
	public String getAnnotationAt(int index) {
	}

	/**
	 *  Returns submap of x and y values according to the given start and end
	 *  
	 *  @param start start x value
	 *  @param stop stop x value
	 *  @param beforeAfterPoints if the points before and after the first and last
	 *           visible ones must be displayed
	 *  @return a submap of x and y values
	 */
	public synchronized java.util.SortedMap getRange(double start, double stop, boolean beforeAfterPoints) {
	}

	public int getIndexForKey(double key) {
	}

	/**
	 *  Returns the series item count.
	 *  
	 *  @return the series item count
	 */
	public synchronized int getItemCount() {
	}

	/**
	 *  Returns the minimum value on the X axis.
	 *  
	 *  @return the X axis minimum value
	 */
	public double getMinX() {
	}

	/**
	 *  Returns the minimum value on the Y axis.
	 *  
	 *  @return the Y axis minimum value
	 */
	public double getMinY() {
	}

	/**
	 *  Returns the maximum value on the X axis.
	 *  
	 *  @return the X axis maximum value
	 */
	public double getMaxX() {
	}

	/**
	 *  Returns the maximum value on the Y axis.
	 *  
	 *  @return the Y axis maximum value
	 */
	public double getMaxY() {
	}
}
