/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The interpolated (cubic) line chart rendering class.
 */
public class CubicLineChart extends LineChart {

	/**
	 * The chart type. 
	 */
	public static final String TYPE = "Cubic";

	public CubicLineChart() {
	}

	/**
	 *  Builds a cubic line chart.
	 *  
	 *  @param dataset the dataset
	 *  @param renderer the renderer
	 *  @param smoothness smoothness determines how smooth the curve should be,
	 *           range [0->0.5] super smooth, 0.5, means that it might not get
	 *           close to control points if you have random data // less smooth,
	 *           (close to 0) means that it will most likely touch all control //
	 *           points
	 */
	public CubicLineChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer, float smoothness) {
	}

	@java.lang.Override
	protected void drawPath(org.achartengine.compat.Canvas canvas, java.util.List points, org.achartengine.compat.Paint paint, boolean circular) {
	}

	/**
	 *  Draws the series points.
	 *  
	 *  @param canvas the canvas
	 *  @param paint the paint object
	 *  @param pointsList the points to be rendered
	 *  @param seriesRenderer the series renderer
	 *  @param yAxisValue the y axis value in pixels
	 *  @param seriesIndex the series index
	 *  @param startIndex the start index of the rendering points
	 */
	protected void drawPoints(org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, java.util.List pointsList, org.achartengine.renderer.XYSeriesRenderer seriesRenderer, float yAxisValue, int seriesIndex, int startIndex) {
	}

	/**
	 *  Returns the chart type identifier.
	 *  
	 *  @return the chart type
	 */
	public String getChartType() {
	}
}
