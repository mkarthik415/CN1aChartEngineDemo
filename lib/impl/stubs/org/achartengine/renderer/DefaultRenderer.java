/**
 * 
 * Provides renderer classes that keep the chart rendering / drawing styles.
 */
package org.achartengine.renderer;


/**
 *  An abstract renderer to be extended by the multiple series classes.
 */
public class DefaultRenderer implements java.io.Serializable {

	/**
	 * A no color constant. 
	 */
	public static final int NO_COLOR = 0;

	/**
	 * The default background color. 
	 */
	public static final int BACKGROUND_COLOR;

	/**
	 * The default color for text. 
	 */
	public static final int TEXT_COLOR;

	public DefaultRenderer() {
	}

	/**
	 *  Returns the chart title.
	 *  
	 *  @return the chart title
	 */
	public String getChartTitle() {
	}

	/**
	 *  Sets the chart title.
	 *  
	 *  @param title the chart title
	 */
	public void setChartTitle(String title) {
	}

	/**
	 *  Returns the chart title text size.
	 *  
	 *  @return the chart title text size
	 */
	public float getChartTitleTextSize() {
	}

	/**
	 *  Sets the chart title text size.
	 *  
	 *  @param textSize the chart title text size
	 */
	public void setChartTitleTextSize(float textSize) {
	}

	/**
	 *  Adds a simple renderer to the multiple renderer.
	 *  
	 *  @param renderer the renderer to be added
	 */
	public void addSeriesRenderer(SimpleSeriesRenderer renderer) {
	}

	/**
	 *  Adds a simple renderer to the multiple renderer.
	 *  
	 *  @param index the index in the renderers list
	 *  @param renderer the renderer to be added
	 */
	public void addSeriesRenderer(int index, SimpleSeriesRenderer renderer) {
	}

	/**
	 *  Removes a simple renderer from the multiple renderer.
	 *  
	 *  @param renderer the renderer to be removed
	 */
	public void removeSeriesRenderer(SimpleSeriesRenderer renderer) {
	}

	/**
	 *  Removes all renderers from the multiple renderer.
	 */
	public void removeAllRenderers() {
	}

	/**
	 *  Returns the simple renderer from the multiple renderer list.
	 *  
	 *  @param index the index in the simple renderers list
	 *  @return the simple renderer at the specified index
	 */
	public SimpleSeriesRenderer getSeriesRendererAt(int index) {
	}

	/**
	 *  Returns the simple renderers count in the multiple renderer list.
	 *  
	 *  @return the simple renderers count
	 */
	public int getSeriesRendererCount() {
	}

	/**
	 *  Returns an array of the simple renderers in the multiple renderer list.
	 *  
	 *  @return the simple renderers array
	 */
	public SimpleSeriesRenderer[] getSeriesRenderers() {
	}

	/**
	 *  Returns the background color.
	 *  
	 *  @return the background color
	 */
	public int getBackgroundColor() {
	}

	/**
	 *  Sets the background color.
	 *  
	 *  @param color the background color
	 */
	public void setBackgroundColor(int color) {
	}

	/**
	 *  Returns if the background color should be applied.
	 *  
	 *  @return the apply flag for the background color.
	 */
	public boolean isApplyBackgroundColor() {
	}

	/**
	 *  Sets if the background color should be applied.
	 *  
	 *  @param apply the apply flag for the background color
	 */
	public void setApplyBackgroundColor(boolean apply) {
	}

	/**
	 *  Returns the axes color.
	 *  
	 *  @return the axes color
	 */
	public int getAxesColor() {
	}

	/**
	 *  Sets the axes color.
	 *  
	 *  @param color the axes color
	 */
	public void setAxesColor(int color) {
	}

	/**
	 *  Returns the color of the Y axis
	 *  
	 *  @return the Y axis color
	 */
	public int getYAxisColor() {
	}

	/**
	 *  Sets the Y axis color.
	 *  
	 *  @param color the Y axis color
	 */
	public void setYAxisColor(int color) {
	}

	/**
	 *  Returns the color of the X axis
	 *  
	 *  @return the X axis color
	 */
	public int getXAxisColor() {
	}

	/**
	 *  Sets the X axis color.
	 *  
	 *  @param color the X axis color
	 */
	public void setXAxisColor(int color) {
	}

	/**
	 *  Returns the labels color.
	 *  
	 *  @return the labels color
	 */
	public int getLabelsColor() {
	}

	/**
	 *  Sets the labels color.
	 *  
	 *  @param color the labels color
	 */
	public void setLabelsColor(int color) {
	}

	/**
	 *  Returns the labels text size.
	 *  
	 *  @return the labels text size
	 */
	public float getLabelsTextSize() {
	}

	/**
	 *  Sets the labels text size.
	 *  
	 *  @param textSize the labels text size
	 */
	public void setLabelsTextSize(float textSize) {
	}

	/**
	 *  Returns if the axes should be visible.
	 *  
	 *  @return the visibility flag for the axes
	 */
	public boolean isShowAxes() {
	}

	/**
	 *  Sets if the axes should be visible.
	 *  
	 *  @param showAxes the visibility flag for the axes
	 */
	public void setShowAxes(boolean showAxes) {
	}

	/**
	 *  Returns if the labels should be visible.
	 *  
	 *  @return the visibility flag for the labels
	 */
	public boolean isShowLabels() {
	}

	/**
	 *  Sets if the labels should be visible.
	 *  
	 *  @param showLabels the visibility flag for the labels
	 */
	public void setShowLabels(boolean showLabels) {
	}

	/**
	 *  Returns if the tick marks should be visible.
	 *  
	 *  @return
	 */
	public boolean isShowTickMarks() {
	}

	/**
	 *  Sets if the tick marks should be visible.
	 *  
	 *  @param showTickMarks the visibility flag for the tick marks
	 */
	public void setShowTickMarks(boolean mShowTickMarks) {
	}

	/**
	 *  Returns if the X axis grid should be visible.
	 *  
	 *  @return the visibility flag for the X axis grid
	 */
	public boolean isShowGridX() {
	}

	/**
	 *  Returns if the Y axis grid should be visible.
	 *  
	 *  @return the visibility flag for the Y axis grid
	 */
	public boolean isShowGridY() {
	}

	/**
	 *  Sets if the X axis grid should be visible.
	 *  
	 *  @param showGrid the visibility flag for the X axis grid
	 */
	public void setShowGridX(boolean showGrid) {
	}

	/**
	 *  Sets if the Y axis grid should be visible.
	 *  
	 *  @param showGrid the visibility flag for the Y axis grid
	 */
	public void setShowGridY(boolean showGrid) {
	}

	/**
	 *  Sets if the grid should be visible.
	 *  
	 *  @param showGrid the visibility flag for the grid
	 */
	public void setShowGrid(boolean showGrid) {
	}

	/**
	 *  Returns if the X axis custom text grid should be visible.
	 *  
	 *  @return the visibility flag for the X axis custom text grid
	 */
	public boolean isShowCustomTextGridX() {
	}

	/**
	 *  Returns if the Y axis custom text grid should be visible.
	 *  
	 *  @return the visibility flag for the custom text Y axis grid
	 */
	public boolean isShowCustomTextGridY() {
	}

	/**
	 *  Sets if the X axis custom text grid should be visible.
	 *  
	 *  @param showGrid the visibility flag for the X axis custom text grid
	 */
	public void setShowCustomTextGridX(boolean showGrid) {
	}

	/**
	 *  Sets if the Y axis custom text grid should be visible.
	 *  
	 *  @param showGrid the visibility flag for the Y axis custom text grid
	 */
	public void setShowCustomTextGridY(boolean showGrid) {
	}

	/**
	 *  Sets if the grid for custom X or Y labels should be visible.
	 *  
	 *  @param showGrid the visibility flag for the custom text grid
	 */
	public void setShowCustomTextGrid(boolean showGrid) {
	}

	/**
	 *  Returns if the legend should be visible.
	 *  
	 *  @return the visibility flag for the legend
	 */
	public boolean isShowLegend() {
	}

	/**
	 *  Sets if the legend should be visible.
	 *  
	 *  @param showLegend the visibility flag for the legend
	 */
	public void setShowLegend(boolean showLegend) {
	}

	/**
	 *  Returns if the legend should size to fit.
	 *  
	 *  @return the fit behavior
	 */
	public boolean isFitLegend() {
	}

	/**
	 *  Sets if the legend should size to fit.
	 *  
	 *  @param fit the fit behavior
	 */
	public void setFitLegend(boolean fit) {
	}

	/**
	 *  Returns the text typeface name.
	 *  
	 *  @return the text typeface name
	 */
	public String getTextTypefaceName() {
	}

	/**
	 *  Returns the text typeface style.
	 *  
	 *  @return the text typeface style
	 */
	public int getTextTypefaceStyle() {
	}

	/**
	 *  Returns the text typeface.
	 *  
	 *  @return the text typeface
	 */
	public org.achartengine.compat.Typeface getTextTypeface() {
	}

	/**
	 *  Returns the legend text size.
	 *  
	 *  @return the legend text size
	 */
	public float getLegendTextSize() {
	}

	/**
	 *  Sets the legend text size.
	 *  
	 *  @param textSize the legend text size
	 */
	public void setLegendTextSize(float textSize) {
	}

	/**
	 *  Sets the text typeface name and style.
	 *  
	 *  @param typefaceName the text typeface name
	 *  @param style the text typeface style
	 */
	public void setTextTypeface(String typefaceName, int style) {
	}

	/**
	 *  Sets the text typeface.
	 *  
	 *  @param typeface the typeface
	 */
	public void setTextTypeface(org.achartengine.compat.Typeface typeface) {
	}

	/**
	 *  Returns the antialiasing flag value.
	 *  
	 *  @return the antialiasing value
	 */
	public boolean isAntialiasing() {
	}

	/**
	 *  Sets the antialiasing value.
	 *  
	 *  @param antialiasing the antialiasing
	 */
	public void setAntialiasing(boolean antialiasing) {
	}

	/**
	 *  Returns the value to be used for scaling the chart.
	 *  
	 *  @return the scale value
	 */
	public float getScale() {
	}

	/**
	 *  Returns the original value to be used for scaling the chart.
	 *  
	 *  @return the original scale value
	 */
	public float getOriginalScale() {
	}

	/**
	 *  Sets the value to be used for scaling the chart. It works on some charts
	 *  like pie, doughnut, dial.
	 *  
	 *  @param scale the scale value
	 */
	public void setScale(float scale) {
	}

	/**
	 *  Returns the enabled state of the zoom.
	 *  
	 *  @return if zoom is enabled
	 */
	public boolean isZoomEnabled() {
	}

	/**
	 *  Sets the enabled state of the zoom.
	 *  
	 *  @param enabled zoom enabled
	 */
	public void setZoomEnabled(boolean enabled) {
	}

	/**
	 *  Returns the visible state of the zoom buttons.
	 *  
	 *  @return if zoom buttons are visible
	 */
	public boolean isZoomButtonsVisible() {
	}

	/**
	 *  Sets the visible state of the zoom buttons.
	 *  
	 *  @param visible if the zoom buttons are visible
	 */
	public void setZoomButtonsVisible(boolean visible) {
	}

	/**
	 *  Returns the enabled state of the external (application implemented) zoom.
	 *  
	 *  @return if external zoom is enabled
	 */
	public boolean isExternalZoomEnabled() {
	}

	/**
	 *  Sets the enabled state of the external (application implemented) zoom.
	 *  
	 *  @param enabled external zoom enabled
	 */
	public void setExternalZoomEnabled(boolean enabled) {
	}

	/**
	 *  Returns the zoom rate.
	 *  
	 *  @return the zoom rate
	 */
	public float getZoomRate() {
	}

	/**
	 *  Returns the enabled state of the pan.
	 *  
	 *  @return if pan is enabled
	 */
	public boolean isPanEnabled() {
	}

	/**
	 *  Sets the enabled state of the pan.
	 *  
	 *  @param enabled pan enabled
	 */
	public void setPanEnabled(boolean enabled) {
	}

	/**
	 *  Sets the zoom rate.
	 *  
	 *  @param rate the zoom rate
	 */
	public void setZoomRate(float rate) {
	}

	/**
	 *  Returns the enabled state of the click.
	 *  
	 *  @return if click is enabled
	 */
	public boolean isClickEnabled() {
	}

	/**
	 *  Sets the enabled state of the click.
	 *  
	 *  @param enabled click enabled
	 */
	public void setClickEnabled(boolean enabled) {
	}

	/**
	 *  Returns the selectable radius value around clickable points.
	 *  
	 *  @return the selectable radius
	 */
	public int getSelectableBuffer() {
	}

	/**
	 *  Sets the selectable radius value around clickable points.
	 *  
	 *  @param buffer the selectable radius
	 */
	public void setSelectableBuffer(int buffer) {
	}

	/**
	 *  Returns the legend height.
	 *  
	 *  @return the legend height
	 */
	public int getLegendHeight() {
	}

	/**
	 *  Sets the legend height, in pixels.
	 *  
	 *  @param height the legend height
	 */
	public void setLegendHeight(int height) {
	}

	/**
	 *  Returns the margin sizes. An array containing the margins in this order:
	 *  top, left, bottom, right
	 *  
	 *  @return the margin sizes
	 */
	public int[] getMargins() {
	}

	/**
	 *  Sets the margins, in pixels.
	 *  
	 *  @param margins an array containing the margin size values, in this order:
	 *           top, left, bottom, right
	 */
	public void setMargins(int[] margins) {
	}

	/**
	 *  Returns if the chart is inside a scroll view and doesn't need to shrink.
	 *  
	 *  @return if it is inside a scroll view
	 */
	public boolean isInScroll() {
	}

	/**
	 *  To be set if the chart is inside a scroll view and doesn't need to shrink
	 *  when not enough space.
	 *  
	 *  @param inScroll if it is inside a scroll view
	 */
	public void setInScroll(boolean inScroll) {
	}

	/**
	 *  Returns the start angle for circular charts such as pie, doughnut. An angle
	 *  of 0 degrees correspond to the geometric angle of 0 degrees (3 o'clock on a
	 *  watch.)
	 *  
	 *  @return the start angle in degrees
	 */
	public float getStartAngle() {
	}

	/**
	 *  Sets the start angle for circular charts such as pie, doughnut, etc. An
	 *  angle of 0 degrees correspond to the geometric angle of 0 degrees (3
	 *  o'clock on a watch.)
	 *  
	 *  @param startAngle the start angle in degrees
	 */
	public void setStartAngle(float startAngle) {
	}

	/**
	 *  Returns if the values should be displayed as text.
	 *  
	 *  @return if the values should be displayed as text
	 */
	public boolean isDisplayValues() {
	}

	/**
	 *  Sets if the values should be displayed as text (supported by pie chart).
	 *  
	 *  @param display if the values should be displayed as text
	 */
	public void setDisplayValues(boolean display) {
	}
}
