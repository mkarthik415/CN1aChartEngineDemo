/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  An abstract class to be implemented by the chart rendering classes.
 */
public abstract class AbstractChart implements java.io.Serializable {

	public AbstractChart() {
	}

	/**
	 *  The graphical representation of the chart.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param x the top left x value of the view to draw to
	 *  @param y the top left y value of the view to draw to
	 *  @param width the width of the view to draw to
	 *  @param height the height of the view to draw to
	 *  @param paint the paint
	 */
	public abstract void draw(org.achartengine.compat.Canvas canvas, int x, int y, int width, int height, org.achartengine.compat.Paint paint) {
	}

	/**
	 *  Draws the chart background.
	 *  
	 *  @param renderer the chart renderer
	 *  @param canvas the canvas to paint to
	 *  @param x the top left x value of the view to draw to
	 *  @param y the top left y value of the view to draw to
	 *  @param width the width of the view to draw to
	 *  @param height the height of the view to draw to
	 *  @param paint the paint used for drawing
	 *  @param newColor if a new color is to be used
	 *  @param color the color to be used
	 */
	protected void drawBackground(org.achartengine.renderer.DefaultRenderer renderer, org.achartengine.compat.Canvas canvas, int x, int y, int width, int height, org.achartengine.compat.Paint paint, boolean newColor, int color) {
	}

	/**
	 *  Draws the chart legend.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param renderer the series renderer
	 *  @param titles the titles to go to the legend
	 *  @param left the left X value of the area to draw to
	 *  @param right the right X value of the area to draw to
	 *  @param y the y value of the area to draw to
	 *  @param width the width of the area to draw to
	 *  @param height the height of the area to draw to
	 *  @param legendSize the legend size
	 *  @param paint the paint to be used for drawing
	 *  @param calculate if only calculating the legend size
	 *  
	 *  @return the legend height
	 */
	protected int drawLegend(org.achartengine.compat.Canvas canvas, org.achartengine.renderer.DefaultRenderer renderer, String[] titles, int left, int right, int y, int width, int height, int legendSize, org.achartengine.compat.Paint paint, boolean calculate) {
	}

	/**
	 *  Draw a multiple lines string.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param text the text to be painted
	 *  @param x the x value of the area to draw to
	 *  @param y the y value of the area to draw to
	 *  @param paint the paint to be used for drawing
	 */
	protected void drawString(org.achartengine.compat.Canvas canvas, String text, float x, float y, org.achartengine.compat.Paint paint) {
	}

	/**
	 *  Calculates if the current width exceeds the total width.
	 *  
	 *  @param currentWidth the current width
	 *  @param renderer the renderer
	 *  @param right the right side pixel value
	 *  @param width the total width
	 *  @return if the current width exceeds the total width
	 */
	protected boolean getExceed(float currentWidth, org.achartengine.renderer.DefaultRenderer renderer, int right, int width) {
	}

	/**
	 *  Checks if the current chart is rendered as vertical.
	 *  
	 *  @param renderer the renderer
	 *  @return if the chart is rendered as a vertical one
	 */
	public boolean isVertical(org.achartengine.renderer.DefaultRenderer renderer) {
	}

	/**
	 *  Makes sure the fraction digit is not displayed, if not needed.
	 *  
	 *  
	 *  @param format the number format for the label
	 *  @param label the input label value
	 *  @return the label without the useless fraction digit
	 */
	protected String getLabel(org.achartengine.compat.NumberFormat format, double label) {
	}

	/**
	 *  The graphical representation of a path.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param points the points that are contained in the path to paint
	 *  @param paint the paint to be used for painting
	 *  @param circular if the path ends with the start point
	 */
	protected void drawPath(org.achartengine.compat.Canvas canvas, java.util.List points, org.achartengine.compat.Paint paint, boolean circular) {
	}

	/**
	 *  The graphical representation of a path.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param points the points that are contained in the path to paint
	 *  @param paint the paint to be used for painting
	 *  @param circular if the path ends with the start point
	 */
	protected void drawPath(org.achartengine.compat.Canvas canvas, float[] points, org.achartengine.compat.Paint paint, boolean circular) {
	}

	/**
	 *  Returns the legend shape width.
	 *  
	 *  @param seriesIndex the series index
	 *  @return the legend shape width
	 */
	public abstract int getLegendShapeWidth(int seriesIndex) {
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
	public abstract void drawLegendShape(org.achartengine.compat.Canvas canvas, org.achartengine.renderer.SimpleSeriesRenderer renderer, float x, float y, int seriesIndex, org.achartengine.compat.Paint paint) {
	}

	/**
	 *  Calculates the current legend size.
	 *  
	 *  @param renderer the renderer
	 *  @param defaultHeight the default height
	 *  @param extraHeight the added extra height
	 *  @return the legend size
	 */
	protected int getLegendSize(org.achartengine.renderer.DefaultRenderer renderer, int defaultHeight, float extraHeight) {
	}

	/**
	 *  Draws a text label.
	 *  
	 *  @param canvas the canvas
	 *  @param labelText the label text
	 *  @param renderer the renderer
	 *  @param prevLabelsBounds the previous rendered label bounds
	 *  @param centerX the round chart center on X axis
	 *  @param centerY the round chart center on Y axis
	 *  @param shortRadius the short radius for the round chart
	 *  @param longRadius the long radius for the round chart
	 *  @param currentAngle the current angle
	 *  @param angle the label extra angle
	 *  @param left the left side
	 *  @param right the right side
	 *  @param color the label color
	 *  @param paint the paint
	 *  @param line if a line to the label should be drawn
	 *  @param display display the label anyway
	 */
	protected void drawLabel(org.achartengine.compat.Canvas canvas, String labelText, org.achartengine.renderer.DefaultRenderer renderer, java.util.List prevLabelsBounds, int centerX, int centerY, float shortRadius, float longRadius, float currentAngle, float angle, int left, int right, int color, org.achartengine.compat.Paint paint, boolean line, boolean display) {
	}

	public boolean isNullValue(double value) {
	}

	/**
	 *  Given screen coordinates, returns the series and point indexes of a chart
	 *  element. If there is no chart element (line, point, bar, etc) at those
	 *  coordinates, null is returned.
	 *  
	 *  @param screenPoint
	 *  @return the series and point indexes
	 */
	public org.achartengine.model.SeriesSelection getSeriesAndPointForScreenCoordinate(org.achartengine.model.Point screenPoint) {
	}
}
