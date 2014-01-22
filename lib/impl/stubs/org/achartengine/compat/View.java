package org.achartengine.compat;


/**
 * 
 *  @author shannah
 */
public class View {

	public static int DRAWING_CACHE_QUALITY_HIGH;

	public View(Context context) {
	}

	public boolean onTouchEvent(MotionEvent event) {
	}

	public void invalidate(int left, int top, int right, int bottom) {
	}

	public void setDrawingCacheEnabled(boolean b) {
	}

	public boolean isDrawingCacheEnabled() {
	}

	public void setDrawingCacheBackgroundColor(int backgroundColor) {
	}

	public void invalidate() {
	}

	public void setDrawingCacheQuality(int q) {
	}

	public Bitmap getDrawingCache(boolean b) {
	}

	protected void onDraw(Canvas canvas) {
	}

	public int getMeasuredWidth() {
	}

	public int getMeasuredHeight() {
	}

	public class Peer {


		public View.Peer() {
		}

		@java.lang.Override
		public void paint(com.codename1.ui.Graphics g) {
		}

		@java.lang.Override
		public void pointerPressed(int x, int y) {
		}

		@java.lang.Override
		public void pointerReleased(int x, int y) {
		}

		@java.lang.Override
		public void pointerDragged(int x, int y) {
		}

		public void run() {
		}
	}
}
