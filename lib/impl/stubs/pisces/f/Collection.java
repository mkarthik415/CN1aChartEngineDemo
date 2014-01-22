package pisces.f;


/**
 *  
 */
public abstract class Collection implements pisces.Font.Glyph.Collection {

	public Collection() {
	}

	public pisces.Font.Glyph getGlyph(char id) {
	}

	public int getMaxWidth() {
	}

	public int getMaxHeight() {
	}

	protected void add(pisces.Font.Glyph glyph) {
	}

	public java.util.Iterator iterator() {
	}

	/**
	 *  Sparse list iterator
	 */
	public static class Iterator {


		public Collection.Iterator(pisces.Font.Glyph[] set) {
		}

		public boolean hasNext() {
		}

		public pisces.Font.Glyph next() {
		}

		public void remove() {
		}
	}
}
