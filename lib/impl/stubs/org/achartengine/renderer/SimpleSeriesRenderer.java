/**
 * 
 * Provides renderer classes that keep the chart rendering / drawing styles.
 */
package org.achartengine.renderer;


/**
 *  A simple series renderer.
 */
public class SimpleSeriesRenderer implements java.io.Serializable {

	public SimpleSeriesRenderer() {
	}

	/**
	 *  Returns the series color.
	 *  
	 *  @return the series color
	 */
	public int getColor() {
	}

	/**
	 *  Sets the series color.
	 *  
	 *  @param color the series color
	 */
	public void setColor(int color) {
	}

	/**
	 *  Returns the stroke style.
	 *  
	 *  @return the stroke style
	 */
	public BasicStroke getStroke() {
	}

	/**
	 *  Sets the stroke style.
	 *  
	 *  @param stroke the stroke style
	 */
	public void setStroke(BasicStroke stroke) {
	}

	/**
	 *  Returns the gradient is enabled value.
	 *  
	 *  @return the gradient enabled
	 */
	public boolean isGradientEnabled() {
	}

	/**
	 *  Sets the gradient enabled value.
	 *  
	 *  @param enabled the gradient enabled
	 */
	public void setGradientEnabled(boolean enabled) {
	}

	/**
	 *  Returns the gradient start value.
	 *  
	 *  @return the gradient start value
	 */
	public double getGradientStartValue() {
	}

	/**
	 *  Returns the gradient start color.
	 *  
	 *  @return the gradient start color
	 */
	public int getGradientStartColor() {
	}

	/**
	 *  Sets the gradient start value and color.
	 *  
	 *  @param start the gradient start value
	 *  @param color the gradient start color
	 */
	public void setGradientStart(double start, int color) {
	}

	/**
	 *  Returns the gradient stop value.
	 *  
	 *  @return the gradient stop value
	 */
	public double getGradientStopValue() {
	}

	/**
	 *  Returns the gradient stop color.
	 *  
	 *  @return the gradient stop color
	 */
	public int getGradientStopColor() {
	}

	/**
	 *  Sets the gradient stop value and color.
	 *  
	 *  @param start the gradient stop value
	 *  @param color the gradient stop color
	 */
	public void setGradientStop(double start, int color) {
	}

	/**
	 *  Returns if the legend item for this renderer should be visible.
	 *  
	 *  @return the visibility flag for the legend item for this renderer
	 */
	public boolean isShowLegendItem() {
	}

	/**
	 *  Sets if the legend item for this renderer should be visible.
	 *  
	 *  @param showLegend the visibility flag for the legend item for this renderer
	 */
	public void setShowLegendItem(boolean showLegend) {
	}

	/**
	 *  Returns if the item is displayed highlighted.
	 *  
	 *  @return the highlighted flag for the item for this renderer
	 */
	public boolean isHighlighted() {
	}

	/**
	 *  Sets if the item for this renderer should be highlighted. Pie chart is supported for now.
	 *  
	 *  @param highlighted the highlighted flag for the item for this renderer
	 */
	public void setHighlighted(boolean highlighted) {
	}

	/**
	 *  Returns if the bounding points of the first and last visible ones should be displayed.
	 *  
	 *  @return the bounding points display
	 */
	public boolean isDisplayBoundingPoints() {
	}

	/**
	 *  Sets if the bounding points of the first and last visible ones should be displayed.
	 *  
	 *  @param display the bounding points display
	 */
	public void setDisplayBoundingPoints(boolean display) {
	}

	/**
	 *  Returns the number format for displaying chart values.
	 *  
	 *  @return the number format for chart values
	 */
	public org.achartengine.compat.NumberFormat getChartValuesFormat() {
	}

	/**
	 *  Sets the number format for displaying chart values.
	 *  
	 *  @param format the number format for chart values
	 */
	public void setChartValuesFormat(org.achartengine.compat.NumberFormat format) {
	}
}
