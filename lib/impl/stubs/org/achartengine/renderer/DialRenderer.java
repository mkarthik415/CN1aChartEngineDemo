/**
 * 
 * Provides renderer classes that keep the chart rendering / drawing styles.
 */
package org.achartengine.renderer;


/**
 *  Dial chart renderer.
 */
public class DialRenderer extends DefaultRenderer {

	public DialRenderer() {
	}

	/**
	 *  Returns the start angle value of the dial.
	 *  
	 *  @return the angle start value
	 */
	public double getAngleMin() {
	}

	/**
	 *  Sets the start angle value of the dial.
	 *  
	 *  @param min the dial angle start value
	 */
	public void setAngleMin(double min) {
	}

	/**
	 *  Returns the end angle value of the dial.
	 *  
	 *  @return the angle end value
	 */
	public double getAngleMax() {
	}

	/**
	 *  Sets the end angle value of the dial.
	 *  
	 *  @param max the dial angle end value
	 */
	public void setAngleMax(double max) {
	}

	/**
	 *  Returns the start value to be rendered on the dial.
	 *  
	 *  @return the start value on dial
	 */
	public double getMinValue() {
	}

	/**
	 *  Sets the start value to be rendered on the dial.
	 *  
	 *  @param min the start value on the dial
	 */
	public void setMinValue(double min) {
	}

	/**
	 *  Returns if the minimum dial value was set.
	 *  
	 *  @return the minimum dial value was set or not
	 */
	public boolean isMinValueSet() {
	}

	/**
	 *  Returns the end value to be rendered on the dial.
	 *  
	 *  @return the end value on the dial
	 */
	public double getMaxValue() {
	}

	/**
	 *  Sets the end value to be rendered on the dial.
	 *  
	 *  @param max the end value on the dial
	 */
	public void setMaxValue(double max) {
	}

	/**
	 *  Returns if the maximum dial value was set.
	 *  
	 *  @return the maximum dial was set or not
	 */
	public boolean isMaxValueSet() {
	}

	/**
	 *  Returns the minor ticks spacing.
	 *  
	 *  @return the minor ticks spacing
	 */
	public double getMinorTicksSpacing() {
	}

	/**
	 *  Sets the minor ticks spacing.
	 *  
	 *  @param spacing the minor ticks spacing
	 */
	public void setMinorTicksSpacing(double spacing) {
	}

	/**
	 *  Returns the major ticks spacing.
	 *  
	 *  @return the major ticks spacing
	 */
	public double getMajorTicksSpacing() {
	}

	/**
	 *  Sets the major ticks spacing.
	 *  
	 *  @param spacing the major ticks spacing
	 */
	public void setMajorTicksSpacing(double spacing) {
	}

	/**
	 *  Returns the visual type at the specified index.
	 *  
	 *  @param index the index
	 *  @return the visual type
	 */
	public DialRenderer.Type getVisualTypeForIndex(int index) {
	}

	/**
	 *  Sets the visual types.
	 *  
	 *  @param types the visual types
	 */
	public void setVisualTypes(DialRenderer.Type[] types) {
	}

	public static final class Type {


		public static final DialRenderer.Type NEEDLE;

		public static final DialRenderer.Type ARROW;

		public static DialRenderer.Type[] values() {
		}

		public static DialRenderer.Type valueOf(String name) {
		}
	}
}
