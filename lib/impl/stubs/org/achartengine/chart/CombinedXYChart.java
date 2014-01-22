/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The combined XY chart rendering class.
 */
public class CombinedXYChart extends XYChart {

	/**
	 *  Builds a new combined XY chart instance.
	 *  
	 *  @param dataset the multiple series dataset
	 *  @param renderer the multiple series renderer
	 *  @param chartDefinitions the XY chart definitions
	 */
	public CombinedXYChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer, CombinedXYChart.XYCombinedChartDef[] chartDefinitions) {
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

	@java.lang.Override
	protected ClickableArea[] clickableAreasForPoints(java.util.List points, java.util.List values, float yAxisValue, int seriesIndex, int startIndex) {
	}

	@java.lang.Override
	protected void drawSeries(org.achartengine.model.XYSeries series, org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, java.util.List pointsList, org.achartengine.renderer.XYSeriesRenderer seriesRenderer, float yAxisValue, int seriesIndex, org.achartengine.renderer.XYMultipleSeriesRenderer.Orientation or, int startIndex) {
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
	 *  Returns the chart type identifier.
	 *  
	 *  @return the chart type
	 */
	public String getChartType() {
	}

	/**
	 *  Definition of a chart inside a combined XY chart.
	 */
	public static class XYCombinedChartDef {


		/**
		 *  Constructs a chart definition.
		 *  
		 *  @param type XY chart type
		 *  @param seriesIndex corresponding data series indexes
		 */
		public CombinedXYChart.XYCombinedChartDef(String type, int[] seriesIndex) {
		}

		public boolean containsSeries(int seriesIndex) {
		}

		public int getChartSeriesIndex(int seriesIndex) {
		}

		public String getType() {
		}

		public int[] getSeriesIndex() {
		}
	}
}
