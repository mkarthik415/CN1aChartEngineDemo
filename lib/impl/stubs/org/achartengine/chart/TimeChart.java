/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The time chart rendering class.
 */
public class TimeChart extends LineChart {

	/**
	 * The constant to identify this chart type. 
	 */
	public static final String TYPE = "Time";

	/**
	 * The number of milliseconds in a day. 
	 */
	public static final long DAY = 86400000L;

	/**
	 *  Builds a new time chart instance.
	 *  
	 *  @param dataset the multiple series dataset
	 *  @param renderer the multiple series renderer
	 */
	public TimeChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Returns the date format pattern to be used for formatting the X axis
	 *  labels.
	 *  
	 *  @return the date format pattern for the X axis labels
	 */
	public String getDateFormat() {
	}

	/**
	 *  Sets the date format pattern to be used for formatting the X axis labels.
	 *  
	 *  @param format the date format pattern for the X axis labels. If null, an
	 *           appropriate default format will be used.
	 */
	public void setDateFormat(String format) {
	}

	/**
	 *  The graphical representation of the labels on the X axis.
	 *  
	 *  @param xLabels the X labels values
	 *  @param xTextLabelLocations the X text label locations
	 *  @param canvas the canvas to paint to
	 *  @param paint the paint to be used for drawing
	 *  @param left the left value of the labels area
	 *  @param top the top value of the labels area
	 *  @param bottom the bottom value of the labels area
	 *  @param xPixelsPerUnit the amount of pixels per one unit in the chart labels
	 *  @param minX the minimum value on the X axis in the chart
	 *  @param maxX the maximum value on the X axis in the chart
	 */
	@java.lang.Override
	protected void drawXLabels(java.util.List xLabels, Double[] xTextLabelLocations, org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, int left, int top, int bottom, double xPixelsPerUnit, double minX, double maxX) {
	}

	/**
	 *  Returns the chart type identifier.
	 *  
	 *  @return the chart type
	 */
	public String getChartType() {
	}

	@java.lang.Override
	protected java.util.List getXLabels(double min, double max, int count) {
	}
}
