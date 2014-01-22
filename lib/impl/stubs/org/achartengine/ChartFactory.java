/**
 * 
 * The main classes, including the ChartFactory, GraphicalActivity and GraphicalView.
 */
package org.achartengine;


/**
 *  Utility methods for creating chart views or intents.
 */
public class ChartFactory {

	/**
	 * The key for the chart data. 
	 */
	public static final String CHART = "chart";

	/**
	 * The key for the chart graphical activity title. 
	 */
	public static final String TITLE = "title";

	/**
	 *  Creates a line chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a line chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getLineChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Creates a cubic line chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a line chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getCubeLineChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, float smoothness) {
	}

	/**
	 *  Creates a scatter chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a scatter chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getScatterChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Creates a bubble chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a scatter chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getBubbleChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Creates a time chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param format the date format pattern to be used for displaying the X axis
	 *           date labels. If null, a default appropriate format will be used.
	 *  @return a time chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getTimeChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, String format) {
	}

	/**
	 *  Creates a bar chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param type the bar chart type
	 *  @return a bar chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getBarChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.BarChart.Type type) {
	}

	/**
	 *  Creates a range bar chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param type the range bar chart type
	 *  @return a bar chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final GraphicalView getRangeBarChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.BarChart.Type type) {
	}

	/**
	 *  Creates a combined XY chart view.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param types the chart types (cannot be null)
	 *  @return a combined XY chart graphical view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if a dataset number of items is different than the number of
	 *            series renderers or number of chart types
	 */
	public static final GraphicalView getCombinedXYChartView(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.CombinedXYChart.XYCombinedChartDef[] types) {
	}

	/**
	 *  Creates a pie chart view that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the category series dataset (cannot be null)
	 *  @param renderer the series renderer (cannot be null)
	 *  @return a pie chart view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset number of items is different than the number of
	 *            series renderers
	 */
	public static final GraphicalView getPieChartView(compat.Context context, model.CategorySeries dataset, renderer.DefaultRenderer renderer) {
	}

	/**
	 *  Creates a dial chart view that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the category series dataset (cannot be null)
	 *  @param renderer the dial renderer (cannot be null)
	 *  @return a pie chart view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset number of items is different than the number of
	 *            series renderers
	 */
	public static final GraphicalView getDialChartView(compat.Context context, model.CategorySeries dataset, renderer.DialRenderer renderer) {
	}

	/**
	 *  Creates a doughnut chart view that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple category series dataset (cannot be null)
	 *  @param renderer the series renderer (cannot be null)
	 *  @return a pie chart view
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset number of items is different than the number of
	 *            series renderers
	 */
	public static final GraphicalView getDoughnutChartView(compat.Context context, model.MultipleCategorySeries dataset, renderer.DefaultRenderer renderer) {
	}

	/**
	 *  
	 *  Creates a line chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a line chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getLineChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  
	 *  Creates a cubic line chart intent that can be used to start the graphical
	 *  view activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a line chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getCubicLineChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, float smoothness) {
	}

	/**
	 *  Creates a scatter chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a scatter chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getScatterChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Creates a bubble chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @return a scatter chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getBubbleChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer) {
	}

	/**
	 *  Creates a time chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param format the date format pattern to be used for displaying the X axis
	 *           date labels. If null, a default appropriate format will be used.
	 *  @return a time chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getTimeChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, String format) {
	}

	/**
	 *  Creates a bar chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param type the bar chart type
	 *  @return a bar chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getBarChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.BarChart.Type type) {
	}

	/**
	 *  Creates a line chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title. If this is null,
	 *           then the title bar will be hidden. If a blank title is passed in,
	 *           then the title bar will be the default. Pass in any other string
	 *           to set a custom title.
	 *  @return a line chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getLineChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, String activityTitle) {
	}

	/**
	 *  Creates a line chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title. If this is null,
	 *           then the title bar will be hidden. If a blank title is passed in,
	 *           then the title bar will be the default. Pass in any other string
	 *           to set a custom title.
	 *  @return a line chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getCubicLineChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, float smoothness, String activityTitle) {
	}

	/**
	 *  Creates a scatter chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title
	 *  @return a scatter chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getScatterChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, String activityTitle) {
	}

	/**
	 *  Creates a bubble chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title
	 *  @return a scatter chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getBubbleChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, String activityTitle) {
	}

	/**
	 *  Creates a time chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param format the date format pattern to be used for displaying the X axis
	 *           date labels. If null, a default appropriate format will be used
	 *  @param activityTitle the graphical chart activity title
	 *  @return a time chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getTimeChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, String format, String activityTitle) {
	}

	/**
	 *  Creates a bar chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param type the bar chart type
	 *  @param activityTitle the graphical chart activity title
	 *  @return a bar chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getBarChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.BarChart.Type type, String activityTitle) {
	}

	/**
	 *  Creates a range bar chart intent that can be used to start the graphical
	 *  view activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param type the range bar chart type
	 *  @param activityTitle the graphical chart activity title
	 *  @return a range bar chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset and the renderer don't include the same number of
	 *            series
	 */
	public static final compat.Intent getRangeBarChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.BarChart.Type type, String activityTitle) {
	}

	/**
	 *  Creates a combined XY chart intent that can be used to start the graphical
	 *  view activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple series dataset (cannot be null)
	 *  @param renderer the multiple series renderer (cannot be null)
	 *  @param types the chart types (cannot be null)
	 *  @param activityTitle the graphical chart activity title
	 *  @return a combined XY chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if a dataset number of items is different than the number of
	 *            series renderers or number of chart types
	 */
	public static final compat.Intent getCombinedXYChartIntent(compat.Context context, model.XYMultipleSeriesDataset dataset, renderer.XYMultipleSeriesRenderer renderer, chart.CombinedXYChart.XYCombinedChartDef[] types, String activityTitle) {
	}

	/**
	 *  Creates a pie chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the category series dataset (cannot be null)
	 *  @param renderer the series renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title
	 *  @return a pie chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset number of items is different than the number of
	 *            series renderers
	 */
	public static final compat.Intent getPieChartIntent(compat.Context context, model.CategorySeries dataset, renderer.DefaultRenderer renderer, String activityTitle) {
	}

	/**
	 *  Creates a doughnut chart intent that can be used to start the graphical
	 *  view activity.
	 *  
	 *  @param context the context
	 *  @param dataset the multiple category series dataset (cannot be null)
	 *  @param renderer the series renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title
	 *  @return a pie chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset number of items is different than the number of
	 *            series renderers
	 */
	public static final compat.Intent getDoughnutChartIntent(compat.Context context, model.MultipleCategorySeries dataset, renderer.DefaultRenderer renderer, String activityTitle) {
	}

	/**
	 *  Creates a dial chart intent that can be used to start the graphical view
	 *  activity.
	 *  
	 *  @param context the context
	 *  @param dataset the category series dataset (cannot be null)
	 *  @param renderer the dial renderer (cannot be null)
	 *  @param activityTitle the graphical chart activity title
	 *  @return a dial chart intent
	 *  @throws IllegalArgumentException if dataset is null or renderer is null or
	 *            if the dataset number of items is different than the number of
	 *            series renderers
	 */
	public static final compat.Intent getDialChartIntent(compat.Context context, model.CategorySeries dataset, renderer.DialRenderer renderer, String activityTitle) {
	}
}
