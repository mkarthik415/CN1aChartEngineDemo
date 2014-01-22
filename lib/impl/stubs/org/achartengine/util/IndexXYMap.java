/**
 * 
 * Utility classes that provide helper methods used by most of the other packages.
 */
package org.achartengine.util;


/**
 *  This class requires sorted x values
 */
public class IndexXYMap extends java.util.TreeMap {

	public IndexXYMap() {
	}

	public Object put(Object key, Object value) {
	}

	public Object put(int index, Object key, Object value) {
	}

	public double getMaxXDifference() {
	}

	public void clear() {
	}

	/**
	 *  Returns X-value according to the given index
	 *  
	 *  @param index
	 *  @return the X value
	 */
	public Object getXByIndex(int index) {
	}

	/**
	 *  Returns Y-value according to the given index
	 *  
	 *  @param index
	 *  @return the Y value
	 */
	public Object getYByIndex(int index) {
	}

	/**
	 *  Returns XY-entry according to the given index
	 *  
	 *  @param index
	 *  @return the X and Y values
	 */
	public XYEntry getByIndex(int index) {
	}

	/**
	 *  Removes entry from map by index
	 *  
	 *  @param index
	 */
	public XYEntry removeByIndex(int index) {
	}

	public int getIndexForKey(Object key) {
	}
}
