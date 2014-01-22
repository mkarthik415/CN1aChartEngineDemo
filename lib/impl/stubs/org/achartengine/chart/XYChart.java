/**
 * 
 * Provides the classes that handle the actual rendering / drawing of the charts, based on the provided model and renderer.
 */
package org.achartengine.chart;


/**
 *  The XY chart rendering class.
 */
public abstract class XYChart extends AbstractChart {

	/**
	 * The multiple series dataset. 
	 */
	protected org.achartengine.model.XYMultipleSeriesDataset mDataset;

	/**
	 * The multiple series renderer. 
	 */
	protected org.achartengine.renderer.XYMultipleSeriesRenderer mRenderer;

	protected XYChart() {
	}

	/**
	 *  Builds a new XY chart instance.
	 *  
	 *  @param dataset the multiple series dataset
	 *  @param renderer the multiple series renderer
	 */
	public XYChart(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer) {
	}

	protected void setDatasetRenderer(org.achartengine.model.XYMultipleSeriesDataset dataset, org.achartengine.renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  The graphical representation of the XY chart.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param x the top left x value of the view to draw to
	 *  @param y the top left y value of the view to draw to
	 *  @param width the width of the view to draw to
	 *  @param height the height of the view to draw to
	 *  @param paint the paint
	 */
	public void draw(org.achartengine.compat.Canvas canvas, int x, int y, int width, int height, org.achartengine.compat.Paint paint) {
	}

	protected java.util.List getXLabels(double min, double max, int count) {
	}

	protected java.util.Map getYLabels(double[] minY, double[] maxY, int maxScaleNumber) {
	}

	protected org.achartengine.compat.Rect getScreenR() {
	}

	protected void setScreenR(org.achartengine.compat.Rect screenR) {
	}

	/**
	 *  Draws the series.
	 *  
	 *  @param series the series
	 *  @param canvas the canvas
	 *  @param paint the paint object
	 *  @param pointsList the points to be rendered
	 *  @param seriesRenderer the series renderer
	 *  @param yAxisValue the y axis value in pixels
	 *  @param seriesIndex the series index
	 *  @param or the orientation
	 *  @param startIndex the start index of the rendering points
	 */
	protected void drawSeries(org.achartengine.model.XYSeries series, org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, java.util.List pointsList, org.achartengine.renderer.XYSeriesRenderer seriesRenderer, float yAxisValue, int seriesIndex, org.achartengine.renderer.XYMultipleSeriesRenderer.Orientation or, int startIndex) {
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
	 *  The graphical representation of a text, to handle both HORIZONTAL and
	 *  VERTICAL orientations and extra rotation angles.
	 *  
	 *  @param canvas the canvas to paint to
	 *  @param text the text to be rendered
	 *  @param x the X axis location of the text
	 *  @param y the Y axis location of the text
	 *  @param paint the paint to be used for drawing
	 *  @param extraAngle the text angle
	 */
	protected void drawText(org.achartengine.compat.Canvas canvas, String text, float x, float y, org.achartengine.compat.Paint paint, float extraAngle) {
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
	protected void drawXLabels(java.util.List xLabels, Double[] xTextLabelLocations, org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, int left, int top, int bottom, double xPixelsPerUnit, double minX, double maxX) {
	}

	/**
	 *  The graphical representation of the labels on the Y axis.
	 *  
	 *  @param allYLabels the Y labels values
	 *  @param canvas the canvas to paint to
	 *  @param paint the paint to be used for drawing
	 *  @param maxScaleNumber the maximum scale number
	 *  @param left the left value of the labels area
	 *  @param right the right value of the labels area
	 *  @param bottom the bottom value of the labels area
	 *  @param yPixelsPerUnit the amount of pixels per one unit in the chart labels
	 *  @param minY the minimum value on the Y axis in the chart
	 */
	protected void drawYLabels(java.util.Map allYLabels, org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, int maxScaleNumber, int left, int right, int bottom, double[] yPixelsPerUnit, double[] minY) {
	}

	/**
	 *  The graphical representation of the text labels on the X axis.
	 *  
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
	protected void drawXTextLabels(Double[] xTextLabelLocations, org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, boolean showLabels, int left, int top, int bottom, double xPixelsPerUnit, double minX, double maxX) {
	}

	public org.achartengine.renderer.XYMultipleSeriesRenderer getRenderer() {
	}

	public org.achartengine.model.XYMultipleSeriesDataset getDataset() {
	}

	public double[] getCalcRange(int scale) {
	}

	public void setCalcRange(double[] range, int scale) {
	}

	public double[] toRealPoint(float screenX, float screenY) {
	}

	public double[] toScreenPoint(double[] realPoint) {
	}

	/**
	 *  Transforms a screen point to a real coordinates point.
	 *  
	 *  @param screenX the screen x axis value
	 *  @param screenY the screen y axis value
	 *  @return the real coordinates point
	 */
	public double[] toRealPoint(float screenX, float screenY, int scale) {
	}

	public double[] toScreenPoint(double[] realPoint, int scale) {
	}

	public org.achartengine.model.SeriesSelection getSeriesAndPointForScreenCoordinate(org.achartengine.model.Point screenPoint) {
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
	public abstract void drawSeries(org.achartengine.compat.Canvas canvas, org.achartengine.compat.Paint paint, java.util.List points, org.achartengine.renderer.XYSeriesRenderer seriesRenderer, float yAxisValue, int seriesIndex, int startIndex) {
	}

	/**
	 *  Returns the clickable areas for all passed points
	 *  
	 *  @param points the array of points
	 *  @param values the array of values of each point
	 *  @param yAxisValue the minimum value of the y axis
	 *  @param seriesIndex the index of the series to which the points belong
	 *  @return an array of rectangles with the clickable area
	 *  @param startIndex the start index of the rendering points
	 */
	protected abstract ClickableArea[] clickableAreasForPoints(java.util.List points, java.util.List values, float yAxisValue, int seriesIndex, int startIndex) {
	}

	/**
	 *  Returns if the chart should display the null values.
	 *  
	 *  @return if null values should be rendered
	 */
	protected boolean isRenderNullValues() {
	}

	/**
	 *  Returns if the chart should display the points as a certain shape.
	 *  
	 *  @param renderer the series renderer
	 */
	public boolean isRenderPoints(org.achartengine.renderer.SimpleSeriesRenderer renderer) {
	}

	/**
	 *  Returns the default axis minimum.
	 *  
	 *  @return the default axis minimum
	 */
	public double getDefaultMinimum() {
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
	public abstract String getChartType() {
	}
}
