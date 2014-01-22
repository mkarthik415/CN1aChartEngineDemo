package pisces.d;


/**
 * 
 *  @author shannah
 */
public interface PathIterator {

	public static final int SEG_CLOSE = 0;

	public static final int SEG_CUBICTO = 1;

	public static final int SEG_LINETO = 2;

	public static final int SEG_MOVETO = 3;

	public static final int SEG_QUADTO = 4;

	public int currentSegment(double[] coords);

	public int currentSegment(float[] coords);

	public int getWindingRule();

	public boolean isDone();

	public void next();
}
