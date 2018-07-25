
public class Triangle {
	private double ab;
	private double bc;
	private double ac;
	
	
	public Triangle(double aB, double bC, double aC) {
		super();
		ab = aB;
		bc = bC;
		ac = aC;
	}
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the aB
	 */
	public double getAB() {
		return ab;
	}
	/**
	 * @param aB the aB to set
	 */
	public void setAB(double aB) {
		ab = aB;
	}
	/**
	 * @return the bC
	 */
	public double getBC() {
		return bc;
	}
	/**
	 * @param bC the bC to set
	 */
	public void setBC(double bC) {
		bc = bC;
	}
	/**
	 * @return the aC
	 */
	public double getAC() {
		return ac;
	}
	/**
	 * @param aC the aC to set
	 */
	public void setAC(double aC) {
		ac = aC;
	}
	public double squareOfTriangle () {
		double halfPerim = this.perimeterOfTriangle()/2;
		double res = Math.sqrt(halfPerim*(halfPerim-this.getAB())*
				(halfPerim-this.getAC())*(halfPerim-this.getBC()));
		return res;
	}
	public double perimeterOfTriangle() {
		return (this.getAB()+this.getAC()+this.getBC());
	}
	
}
