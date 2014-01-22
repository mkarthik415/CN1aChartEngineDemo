/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The chart point style enumerator.
 */
public final class PointStyle extends Enum {

	public static final PointStyle X;

	public static final PointStyle CIRCLE;

	public static final PointStyle TRIANGLE;

	public static final PointStyle SQUARE;

	public static final PointStyle DIAMOND;

	public static final PointStyle POINT;

	public static PointStyle[] values() {
	}

	public static PointStyle valueOf(String name) {
	}

	/**
	 *  Returns the point shape name.
	 *  
	 *  @return the point shape name
	 */
	public String getName() {
	}

	/**
	 *  Returns the point shape name.
	 *  
	 *  @return the point shape name
	 */
	public String toString() {
	}

	/**
	 *  Return the point shape that has the provided symbol.
	 *  
	 *  @param name the point style name
	 *  @return the point shape
	 */
	public static PointStyle getPointStyleForName(String name) {
	}

	/**
	 *  Returns the point shape index based on the given name.
	 *  
	 *  @return the point shape index
	 */
	public static int getIndexForName(String name) {
	}
}
