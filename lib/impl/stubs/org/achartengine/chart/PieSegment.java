/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  Holds An PieChart Segment
 */
public class PieSegment implements java.io.Serializable {

	public PieSegment(int dataIndex, float value, float startAngle, float angle) {
	}

	/**
	 *  Checks if angle falls in segment.
	 *  
	 *  @param angle
	 *  @return true if in segment, false otherwise.
	 */
	public boolean isInSegment(double angle) {
	}

	protected float getStartAngle() {
	}

	protected float getEndAngle() {
	}

	protected int getDataIndex() {
	}

	protected float getValue() {
	}

	public String toString() {
	}
}
