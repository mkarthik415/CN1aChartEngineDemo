/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The line chart rendering class.
 */
public class LineChart extends XYChart {

	/**
	 * The constant to identify this chart type. 
	 */
	public static final String TYPE = "Line";

	/**
	 *  Builds a new line chart instance.
	 *  
	 *  @param dataset the multiple series dataset
	 *  @param renderer the multiple series renderer
	 */
	public LineChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Sets the series and the renderer.
	 *  
	 *  @param dataset the series dataset
	 *  @param renderer the series renderer
	 */
	protected void setDatasetRenderer(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  The graphical representation of a series.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param paint the paint to be used for drawing
	 *  @param points the array of points to be used for drawing the series
	 *  @param seriesRenderer the series renderer
	 *  @param yAxisValue the minimum value of the y axis
	 *  @param seriesIndex the index of the series currently being drawn
	 *  @param startIndex the start index of the rendering points
	 */
	@java.lang.Override
	public void drawSeries(org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, java.util.List points, org.achartengine.renderer.XYSeriesRenderer renderer, float yAxisValue, int seriesIndex, int startIndex) {
	}

	@java.lang.Override
	protected ClickableArea[] clickableAreasForPoints(java.util.List points, java.util.List values, float yAxisValue, int seriesIndex, int startIndex) {
	}

	/**
	 *  Returns the legend shape width.
	 *  
	 *  @param seriesIndex the series index
	 *  @return the legend shape width
	 */
	public int getLegendShapeWidth(int seriesIndex) {
	}

	/**
	 *  The graphical representation of the legend shape.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param renderer the series renderer
	 *  @param x the x value of the point the shape should be drawn at
	 *  @param y the y value of the point the shape should be drawn at
	 *  @param seriesIndex the series index
	 *  @param paint the paint to be used for drawing
	 */
	public void drawLegendShape(org.achartengine.compat.Canvas canvas, org.achartengine.renderer.SimpleSeriesRenderer renderer, float x, float y, int seriesIndex, org.achartengine.compat.Paint paint) {
	}

	/**
	 *  Returns if the chart should display the points as a certain shape.
	 *  
	 *  @param renderer the series renderer
	 */
	public boolean isRenderPoints(org.achartengine.renderer.SimpleSeriesRenderer renderer) {
	}

	/**
	 *  Returns the scatter chart to be used for drawing the data points.
	 *  
	 *  @return the data points scatter chart
	 */
	public ScatterChart getPointsChart() {
	}

	/**
	 *  Returns the chart type identifier.
	 *  
	 *  @return the chart type
	 */
	public String getChartType() {
	}
}
