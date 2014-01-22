package org.achartengine.compat;


/**
 * 
 *  @author shannah
 */
public class GradientDrawable {

	public GradientDrawable(GradientDrawable.Orientation orientation, int[] colors) {
	}

	public void setBounds(int left, int top, int right, int bottom) {
	}

	public void draw(Canvas canvas) {
	}

	public static final class Orientation {


		public static final GradientDrawable.Orientation BL_TR;

		public static final GradientDrawable.Orientation BOTTOM_TOP;

		public static final GradientDrawable.Orientation BR_TL;

		public static final GradientDrawable.Orientation LEFT_RIGHT;

		public static final GradientDrawable.Orientation RIGHT_LEFT;

		public static final GradientDrawable.Orientation TL_BR;

		public static final GradientDrawable.Orientation TOP_BOTTOM;

		public static final GradientDrawable.Orientation TR_BL;

		public static GradientDrawable.Orientation[] values() {
		}

		public static GradientDrawable.Orientation valueOf(String name) {
		}
	}
}
