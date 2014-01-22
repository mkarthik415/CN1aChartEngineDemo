/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The range bar chart rendering class.
 */
public class RangeBarChart extends BarChart {

	/**
	 * The chart type. 
	 */
	public static final String TYPE = "RangeBar";

	/**
	 *  Builds a new range bar chart instance.
	 *  
	 *  @param dataset the multiple series dataset
	 *  @param renderer the multiple series renderer
	 *  @param type the range bar chart type
	 */
	public RangeBarChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer, BarChart.Type type) {
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
	 *  Returns the value of a constant used to calculate the half-distance.
	 *  
	 *  @return the constant value
	 */
	protected float getCoeficient() {
	}

	/**
	 *  Returns the chart type identifier.
	 *  
	 *  @return the chart type
	 */
	public String getChartType() {
	}
}
