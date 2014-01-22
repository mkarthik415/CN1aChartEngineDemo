/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The doughnut chart rendering class.
 */
public class DoughnutChart extends RoundChart {

	/**
	 *  Builds a new doughnut chart instance.
	 *  
	 *  @param dataset the series dataset
	 *  @param renderer the series renderer
	 */
	public DoughnutChart(org.achartengine.model.MultipleCategorySeries dataset, org.achartengine.renderer.DefaultRenderer renderer) {
	}

	/**
	 *  The graphical representation of the doughnut chart.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param x the top left x value of the view to draw to
	 *  @param y the top left y value of the view to draw to
	 *  @param width the width of the view to draw to
	 *  @param height the height of the view to draw to
	 *  @param paint the paint
	 */
	@java.lang.Override
	public void draw(org.achartengine.compat.Canvas canvas, int x, int y, int width, int height, org.achartengine.compat.Paint paint) {
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
}
