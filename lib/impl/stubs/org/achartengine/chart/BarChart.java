/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The bar chart rendering class.
 */
public class BarChart extends XYChart {

	/**
	 * The constant to identify this chart type. 
	 */
	public static final String TYPE = "Bar";

	/**
	 * The chart type. 
	 */
	protected BarChart.Type mType;

	/**
	 *  Builds a new bar chart instance.
	 *  
	 *  @param dataset the multiple series dataset
	 *  @param renderer the multiple series renderer
	 *  @param type the bar chart type
	 */
	public BarChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer, BarChart.Type type) {
	}

	@java.lang.Override
	protected ClickableArea[] clickableAreasForPoints(java.util.List points, java.util.List values, float yAxisValue, int seriesIndex, int startIndex) {
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
	public void drawSeries(org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, java.util.List points, org.achartengine.renderer.XYSeriesRenderer seriesRenderer, float yAxisValue, int seriesIndex, int startIndex) {
	}

	/**
	 *  Draws a bar.
	 *  
	 *  @param canvas the canvas
	 *  @param xMin the X axis minimum
	 *  @param yMin the Y axis minimum
	 *  @param xMax the X axis maximum
	 *  @param yMax the Y axis maximum
	 *  @param halfDiffX half the size of a bar
	 *  @param seriesNr the total number of series
	 *  @param seriesIndex the current series index
	 *  @param paint the paint
	 */
	protected void drawBar(org.achartengine.compat.Canvas canvas, float xMin, float yMin, float xMax, float yMax, float halfDiffX, int seriesNr, int seriesIndex, org.achartengine.compat.Paint paint) {
	}

	/**
	 *  Draws a bar.
	 *  
	 *  @param canvas the canvas
	 *  @param xMin the X axis minimum
	 *  @param yMin the Y axis minimum
	 *  @param xMax the X axis maximum
	 *  @param yMax the Y axis maximum
	 *  @param scale the scale index
	 *  @param seriesIndex the current series index
	 *  @param paint the paint
	 */
	protected void drawBar(org.achartengine.compat.Canvas canvas, float xMin, float yMin, float xMax, float yMax, int scale, int seriesIndex, org.achartengine.compat.Paint paint) {
	}

	protected int getGradientPartialColor(int minColor, int maxColor, float fraction) {
	}

	/**
	 *  The graphical representation of the series values as text.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param series the series to be painted
	 *  @param renderer the series renderer
	 *  @param paint the paint to be used for drawing
	 *  @param points the array of points to be used for drawing the series
	 *  @param seriesIndex the index of the series currently being drawn
	 *  @param startIndex the start index of the rendering points
	 */
	protected void drawChartValuesText(org.achartengine.compat.Canvas canvas, org.achartengine.model.XYSeries series, org.achartengine.renderer.XYSeriesRenderer renderer, org.achartengine.compat.Paint paint, java.util.List points, int seriesIndex, int startIndex) {
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
	 *  Calculates and returns the half-distance in the graphical representation of
	 *  2 consecutive points.
	 *  
	 *  @param points the points
	 *  @param length the points length
	 *  @param seriesNr the series number
	 *  @return the calculated half-distance value
	 */
	protected float getHalfDiffX(java.util.List points, int length, int seriesNr) {
	}

	/**
	 *  Returns the value of a constant used to calculate the half-distance.
	 *  
	 *  @return the constant value
	 */
	protected float getCoeficient() {
	}

	/**
	 *  Returns if the chart should display the null values.
	 *  
	 *  @return if null values should be rendered
	 */
	protected boolean isRenderNullValues() {
	}

	/**
	 *  Returns the default axis minimum.
	 *  
	 *  @return the default axis minimum
	 */
	public double getDefaultMinimum() {
	}

	/**
	 *  Returns the chart type identifier.
	 *  
	 *  @return the chart type
	 */
	public String getChartType() {
	}

	/**
	 *  The bar chart type enum.
	 */
	public static final class Type {


		public static final BarChart.Type DEFAULT;

		public static final BarChart.Type STACKED;

		public static final BarChart.Type HEAPED;

		public static BarChart.Type[] values() {
		}

		public static BarChart.Type valueOf(String name) {
		}
	}
}
