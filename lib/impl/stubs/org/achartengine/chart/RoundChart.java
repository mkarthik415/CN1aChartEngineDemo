/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  An abstract class to be extended by round like chart rendering classes.
 */
public abstract class RoundChart extends AbstractChart {

	/**
	 * The legend shape width. 
	 */
	protected static final int SHAPE_WIDTH = 10;

	/**
	 * The series dataset. 
	 */
	protected org.achartengine.model.CategorySeries mDataset;

	/**
	 * The series renderer. 
	 */
	protected org.achartengine.renderer.DefaultRenderer mRenderer;

	/**
	 * A no value constant. 
	 */
	protected static final int NO_VALUE = 2147483647;

	/**
	 * The chart center X axis. 
	 */
	protected int mCenterX;

	/**
	 * The chart center y axis. 
	 */
	protected int mCenterY;

	/**
	 *  Round chart.
	 *  
	 *  @param dataset the series dataset
	 *  @param renderer the series renderer
	 */
	public RoundChart(org.achartengine.model.CategorySeries dataset, org.achartengine.renderer.DefaultRenderer renderer) {
	}

	/**
	 *  The graphical representation of the round chart title.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param x the top left x value of the view to draw to
	 *  @param y the top left y value of the view to draw to
	 *  @param width the width of the view to draw to
	 *  @param paint the paint
	 */
	public void drawTitle(org.achartengine.compat.Canvas canvas, int x, int y, int width, org.achartengine.compat.Paint paint) {
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
	 *  Returns the renderer.
	 *  
	 *  @return the renderer
	 */
	public org.achartengine.renderer.DefaultRenderer getRenderer() {
	}

	/**
	 *  Returns the center on X axis.
	 *  
	 *  @return the center on X axis
	 */
	public int getCenterX() {
	}

	/**
	 *  Returns the center on Y axis.
	 *  
	 *  @return the center on Y axis
	 */
	public int getCenterY() {
	}

	/**
	 *  Sets a new center on X axis.
	 *  
	 *  @param centerX center on X axis
	 */
	public void setCenterX(int centerX) {
	}

	/**
	 *  Sets a new center on Y axis.
	 *  
	 *  @param centerY center on Y axis
	 */
	public void setCenterY(int centerY) {
	}
}
