/**
 * 
 * Provides renderer classes that keep the chart rendering / drawing styles.
 */
package org.achartengine.renderer;


/**
 *  A descriptor for the stroke style.
 */
public class BasicStroke implements java.io.Serializable {

	/**
	 * The solid line style. 
	 */
	public static final BasicStroke SOLID;

	/**
	 * The dashed line style. 
	 */
	public static final BasicStroke DASHED;

	/**
	 * The dot line style. 
	 */
	public static final BasicStroke DOTTED;

	/**
	 *  Build a new basic stroke style.
	 *  
	 *  @param cap the stroke cap
	 *  @param join the stroke join
	 *  @param miter the stroke miter
	 *  @param intervals the path effect intervals
	 *  @param phase the path effect phase
	 */
	public BasicStroke(org.achartengine.compat.Paint.Cap cap, org.achartengine.compat.Paint.Join join, float miter, float[] intervals, float phase) {
	}

	/**
	 *  Returns the stroke cap.
	 *  
	 *  @return the stroke cap
	 */
	public org.achartengine.compat.Paint.Cap getCap() {
	}

	/**
	 *  Returns the stroke join.
	 *  
	 *  @return the stroke join
	 */
	public org.achartengine.compat.Paint.Join getJoin() {
	}

	/**
	 *  Returns the stroke miter.
	 *  
	 *  @return the stroke miter
	 */
	public float getMiter() {
	}

	/**
	 *  Returns the path effect intervals.
	 *  
	 *  @return the path effect intervals
	 */
	public float[] getIntervals() {
	}

	/**
	 *  Returns the path effect phase.
	 *  
	 *  @return the path effect phase
	 */
	public float getPhase() {
	}
}
