package pisces.d;


/**
 *  Rendering plugin works on fixed point (S15.16) coordinate values.
 *  
 *  @see Renderer
 */
public abstract class Paint extends FXMath {

	protected pisces.m.Matrix transform;

	protected pisces.m.Matrix inverse;

	public Paint(pisces.m.Matrix transform) {
	}

	public void setTransform(pisces.m.Matrix transform) {
	}

	public void setQuality(int quality) {
	}

	/**
	 *  Fixed point S15.16 coordinate values
	 */
	public abstract void paint(int x, int y, int width, int height, int[] minTouched, int[] maxTouched, int[] dst, int dstOffset, int dstScanlineStride) {
	}
}
