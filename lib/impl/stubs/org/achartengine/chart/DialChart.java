/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The dial chart rendering class.
 */
public class DialChart extends RoundChart {

	/**
	 *  Builds a new dial chart instance.
	 *  
	 *  @param dataset the series dataset
	 *  @param renderer the dial renderer
	 */
	public DialChart(org.achartengine.model.CategorySeries dataset, org.achartengine.renderer.DialRenderer renderer) {
	}

	/**
	 *  The graphical representation of the dial chart.
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
}
