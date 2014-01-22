package org.achartengine.compat;


/**
 * 
 *  @author shannah
 */
public class Paint {

	public Paint() {
	}

	public void getTextWidths(String text, float[] widths) {
	}

	public int breakText(String text, boolean measureForwards, float maxWidth, float[] measuredWidth) {
	}

	public void getTextBounds(String string, int start, int count, Rect rect) {
	}

	public float measureText(String newText) {
	}

	public float measureText(char[] chars, int start, int count) {
	}

	public void setAntiAlias(boolean antialiasing) {
	}

	public Typeface getTypeface() {
	}

	public void setTypeface(Typeface textTypeface) {
	}

	public Paint.Cap getStrokeCap() {
	}

	public Paint.Join getStrokeJoin() {
	}

	public float getStrokeMiter() {
	}

	public PathEffect getPathEffect() {
	}

	public Paint.Style getStyle() {
	}

	public void setStrokeCap(Paint.Cap cap) {
	}

	public void setStrokeJoin(Paint.Join join) {
	}

	public void setStrokeMiter(float miter) {
	}

	public void setPathEffect(PathEffect pathEffect) {
	}

	public float getStrokeWidth() {
	}

	public void setStrokeWidth(float i) {
	}

	public void setShader(Shader grad) {
	}

	public int getColor() {
	}

	public void setColor(int color) {
	}

	public void setStyle(Paint.Style style) {
	}

	public void setTextAlign(Paint.Align align) {
	}

	public Paint.Align getTextAlign() {
	}

	public void setTextSize(float size) {
	}

	public float getTextSize() {
	}

	public String toString() {
	}

	public static final class Style {


		public static final Paint.Style FILL;

		public static final Paint.Style FILL_AND_STROKE;

		public static final Paint.Style STROKE;

		public static Paint.Style[] values() {
		}

		public static Paint.Style valueOf(String name) {
		}
	}

	public static final class Align {


		public static final Paint.Align CENTER;

		public static final Paint.Align LEFT;

		public static final Paint.Align RIGHT;

		public static Paint.Align[] values() {
		}

		public static Paint.Align valueOf(String name) {
		}
	}

	public static final class Cap {


		public static final Paint.Cap BUTT;

		public static final Paint.Cap ROUND;

		public static final Paint.Cap SQUARE;

		public static Paint.Cap[] values() {
		}

		public static Paint.Cap valueOf(String name) {
		}
	}

	public static final class Join {


		public static final Paint.Join BEVEL;

		public static final Paint.Join MITER;

		public static final Paint.Join ROUND;

		public static Paint.Join[] values() {
		}

		public static Paint.Join valueOf(String name) {
		}
	}
}
