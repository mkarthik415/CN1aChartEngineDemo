/**
 * 
 * Provides renderer classes that keep the chart rendering / drawing styles.
 */
package org.achartengine.renderer;


/**
 *  A renderer for the XY type series.
 */
public class XYSeriesRenderer extends SimpleSeriesRenderer {

	public XYSeriesRenderer() {
	}

	/**
	 *  Returns if the chart should be filled below the line.
	 *  
	 *  @return the fill below line status
	 *  
	 *  @deprecated Use {@link #getFillOutsideLine()} instead.
	 */
	@java.lang.Deprecated
	public boolean isFillBelowLine() {
	}

	/**
	 *  Sets if the line chart should be filled below its line. Filling below the
	 *  line transforms a line chart into an area chart.
	 *  
	 *  @param fill the fill below line flag value
	 *  
	 *  @deprecated Use {@link #addFillOutsideLine(FillOutsideLine)} instead.
	 */
	@java.lang.Deprecated
	public void setFillBelowLine(boolean fill) {
	}

	/**
	 *  Returns the type of the outside fill of the line.
	 *  
	 *  @return the type of the outside fill of the line.
	 */
	public XYSeriesRenderer.FillOutsideLine[] getFillOutsideLine() {
	}

	/**
	 *  Sets if the line chart should be filled outside its line. Filling outside
	 *  with FillOutsideLine.INTEGRAL the line transforms a line chart into an area
	 *  chart.
	 *  
	 *  @param fill the type of the filling
	 */
	public void addFillOutsideLine(XYSeriesRenderer.FillOutsideLine fill) {
	}

	/**
	 *  Returns if the chart points should be filled.
	 *  
	 *  @return the points fill status
	 */
	public boolean isFillPoints() {
	}

	/**
	 *  Sets if the chart points should be filled.
	 *  
	 *  @param fill the points fill flag value
	 */
	public void setFillPoints(boolean fill) {
	}

	/**
	 *  Sets the fill below the line color.
	 *  
	 *  @param color the fill below line color
	 *  
	 *  @deprecated Use FillOutsideLine.setColor instead
	 */
	@java.lang.Deprecated
	public void setFillBelowLineColor(int color) {
	}

	/**
	 *  Returns the point style.
	 *  
	 *  @return the point style
	 */
	public org.achartengine.chart.PointStyle getPointStyle() {
	}

	/**
	 *  Sets the point style.
	 *  
	 *  @param style the point style
	 */
	public void setPointStyle(org.achartengine.chart.PointStyle style) {
	}

	/**
	 *  Returns the point stroke width in pixels.
	 *  
	 *  @return the point stroke width in pixels
	 */
	public float getPointStrokeWidth() {
	}

	/**
	 *  Sets the point stroke width in pixels.
	 *  
	 *  @param strokeWidth the point stroke width in pixels
	 */
	public void setPointStrokeWidth(float strokeWidth) {
	}

	/**
	 *  Returns the chart line width.
	 *  
	 *  @return the line width
	 */
	public float getLineWidth() {
	}

	/**
	 *  Sets the chart line width.
	 *  
	 *  @param lineWidth the line width
	 */
	public void setLineWidth(float lineWidth) {
	}

	/**
	 *  Returns if the chart point values should be displayed as text.
	 *  
	 *  @return if the chart point values should be displayed as text
	 */
	public boolean isDisplayChartValues() {
	}

	/**
	 *  Sets if the chart point values should be displayed as text.
	 *  
	 *  @param display if the chart point values should be displayed as text
	 */
	public void setDisplayChartValues(boolean display) {
	}

	/**
	 *  Returns the chart values minimum distance.
	 *  
	 *  @return the chart values minimum distance
	 */
	public int getDisplayChartValuesDistance() {
	}

	/**
	 *  Sets chart values minimum distance.
	 *  
	 *  @param distance the chart values minimum distance
	 */
	public void setDisplayChartValuesDistance(int distance) {
	}

	/**
	 *  Returns the chart values text size.
	 *  
	 *  @return the chart values text size
	 */
	public float getChartValuesTextSize() {
	}

	/**
	 *  Sets the chart values text size.
	 *  
	 *  @param textSize the chart values text size
	 */
	public void setChartValuesTextSize(float textSize) {
	}

	/**
	 *  Returns the chart values text align.
	 *  
	 *  @return the chart values text align
	 */
	public org.achartengine.compat.Paint.Align getChartValuesTextAlign() {
	}

	/**
	 *  Sets the chart values text align.
	 *  
	 *  @param align the chart values text align
	 */
	public void setChartValuesTextAlign(org.achartengine.compat.Paint.Align align) {
	}

	/**
	 *  Returns the chart values spacing from the data point.
	 *  
	 *  @return the chart values spacing
	 */
	public float getChartValuesSpacing() {
	}

	/**
	 *  Sets the chart values spacing from the data point.
	 *  
	 *  @param spacing the chart values spacing (in pixels) from the chart data
	 *           point
	 */
	public void setChartValuesSpacing(float spacing) {
	}

	/**
	 *  Returns the annotations text size.
	 *  
	 *  @return the annotations text size
	 */
	public float getAnnotationsTextSize() {
	}

	/**
	 *  Sets the annotations text size.
	 *  
	 *  @param textSize the annotations text size
	 */
	public void setAnnotationsTextSize(float textSize) {
	}

	/**
	 *  Returns the annotations text align.
	 *  
	 *  @return the annotations text align
	 */
	public org.achartengine.compat.Paint.Align getAnnotationsTextAlign() {
	}

	/**
	 *  Sets the annotations text align.
	 *  
	 *  @param align the chart values text align
	 */
	public void setAnnotationsTextAlign(org.achartengine.compat.Paint.Align align) {
	}

	/**
	 *  Returns the annotations color.
	 *  
	 *  @return the annotations color
	 */
	public int getAnnotationsColor() {
	}

	/**
	 *  Sets the annotations color.
	 *  
	 *  @param color the annotations color
	 */
	public void setAnnotationsColor(int color) {
	}

	/**
	 *  A descriptor for the line fill behavior.
	 */
	public static class FillOutsideLine {


		/**
		 *  The line fill behavior.
		 *  
		 *  @param type the fill type
		 */
		public XYSeriesRenderer.FillOutsideLine(XYSeriesRenderer.FillOutsideLine.Type type) {
		}

		/**
		 *  Returns the fill color.
		 *  
		 *  @return the fill color
		 */
		public int getColor() {
		}

		/**
		 *  Sets the fill color
		 *  
		 *  @param color the fill color
		 */
		public void setColor(int color) {
		}

		/**
		 *  Returns the fill type.
		 *  
		 *  @return the fill type
		 */
		public XYSeriesRenderer.FillOutsideLine.Type getType() {
		}

		/**
		 *  Returns the fill range which is the minimum and maximum data index values
		 *  for the fill.
		 *  
		 *  @return the fill range
		 */
		public int[] getFillRange() {
		}

		/**
		 *  Sets the fill range which is the minimum and maximum data index values
		 *  for the fill.
		 *  
		 *  @param range the fill range
		 */
		public void setFillRange(int[] range) {
		}

		public static final class Type {


			public static final XYSeriesRenderer.FillOutsideLine.Type NONE;

			public static final XYSeriesRenderer.FillOutsideLine.Type BOUNDS_ALL;

			public static final XYSeriesRenderer.FillOutsideLine.Type BOUNDS_BELOW;

			public static final XYSeriesRenderer.FillOutsideLine.Type BOUNDS_ABOVE;

			public static final XYSeriesRenderer.FillOutsideLine.Type BELOW;

			public static final XYSeriesRenderer.FillOutsideLine.Type ABOVE;

			public static XYSeriesRenderer.FillOutsideLine.Type[] values() {
			}

			public static XYSeriesRenderer.FillOutsideLine.Type valueOf(String name) {
			}
		}
	}
}
