package org.achartengine.tools;


/**
 *  Abstract class for being extended by graphical view tools.
 */
public abstract class AbstractTool {

	/**
	 * The chart. 
	 */
	protected org.achartengine.chart.AbstractChart mChart;

	/**
	 * The renderer. 
	 */
	protected org.achartengine.renderer.XYMultipleSeriesRenderer mRenderer;

	/**
	 *  Abstract tool constructor.
	 *  
	 *  @param chart the chart
	 */
	public AbstractTool(org.achartengine.chart.AbstractChart chart) {
	}

	/**
	 *  Returns the current chart range.
	 *  
	 *  @param scale the scale
	 *  @return the chart range
	 */
	public double[] getRange(int scale) {
	}

	/**
	 *  Sets the range to the calculated one, if not already set.
	 *  
	 *  @param range the range
	 *  @param scale the scale
	 */
	public void checkRange(double[] range, int scale) {
	}

	/**
	 *  Sets a new range on the X axis.
	 *  
	 *  @param min the minimum value
	 *  @param max the maximum value
	 *  @param scale the scale
	 */
	protected void setXRange(double min, double max, int scale) {
	}

	/**
	 *  Sets a new range on the Y axis.
	 *  
	 *  @param min the minimum value
	 *  @param max the maximum value
	 *  @param scale the scale
	 */
	protected void setYRange(double min, double max, int scale) {
	}
}
