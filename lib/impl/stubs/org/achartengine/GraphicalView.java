/**
 * 
 * The main classes, including the ChartFactory, GraphicalActivity and GraphicalView.
 */
package org.achartengine;


/**
 *  The view that encapsulates the graphical chart.
 */
public class GraphicalView extends compat.View {

	/**
	 *  Creates a new graphical view.
	 *  
	 *  @param context the context
	 *  @param chart the chart to be drawn
	 */
	public GraphicalView(compat.Context context, chart.AbstractChart chart) {
	}

	/**
	 *  Returns the current series selection object.
	 *  
	 *  @return the series selection
	 */
	public model.SeriesSelection getCurrentSeriesAndPoint() {
	}

	/**
	 *  Returns the drawn state of the chart.
	 *  
	 *  @return the drawn state of the chart
	 */
	public boolean isChartDrawn() {
	}

	/**
	 *  Transforms the currently selected screen point to a real point.
	 *  
	 *  @param scale the scale
	 *  @return the currently selected real point
	 */
	public double[] toRealPoint(int scale) {
	}

	public chart.AbstractChart getChart() {
	}

	@java.lang.Override
	protected void onDraw(compat.Canvas canvas) {
	}

	/**
	 *  Sets the zoom rate.
	 *  
	 *  @param rate the zoom rate
	 */
	public void setZoomRate(float rate) {
	}

	/**
	 *  Do a chart zoom in.
	 */
	public void zoomIn() {
	}

	/**
	 *  Do a chart zoom out.
	 */
	public void zoomOut() {
	}

	/**
	 *  Do a chart zoom reset / fit zoom.
	 */
	public void zoomReset() {
	}

	/**
	 *  Adds a new zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public void addZoomListener(tools.ZoomListener listener, boolean onButtons, boolean onPinch) {
	}

	/**
	 *  Removes a zoom listener.
	 *  
	 *  @param listener zoom listener
	 */
	public synchronized void removeZoomListener(tools.ZoomListener listener) {
	}

	/**
	 *  Adds a new pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public void addPanListener(tools.PanListener listener) {
	}

	/**
	 *  Removes a pan listener.
	 *  
	 *  @param listener pan listener
	 */
	public void removePanListener(tools.PanListener listener) {
	}

	protected compat.RectF getZoomRectangle() {
	}

	@java.lang.Override
	public boolean onTouchEvent(compat.MotionEvent event) {
	}

	/**
	 *  Schedule a view content repaint.
	 */
	public void repaint() {
	}

	/**
	 *  Schedule a view content repaint, in the specified rectangle area.
	 *  
	 *  @param left the left position of the area to be repainted
	 *  @param top the top position of the area to be repainted
	 *  @param right the right position of the area to be repainted
	 *  @param bottom the bottom position of the area to be repainted
	 */
	public void repaint(int left, int top, int right, int bottom) {
	}

	/**
	 *  Saves the content of the graphical view to a bitmap.
	 *  
	 *  @return the bitmap
	 */
	public compat.Bitmap toBitmap() {
	}
}
