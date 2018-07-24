
public class Triangle {
	private double AB;
	private double BC;
	private double AC;
	
	
	public Triangle(double aB, double bC, double aC) {
		super();
		AB = aB;
		BC = bC;
		AC = aC;
	}
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the aB
	 */
	public double getAB() {
		return AB;
	}
	/**
	 * @param aB the aB to set
	 */
	public void setAB(double aB) {
		AB = aB;
	}
	/**
	 * @return the bC
	 */
	public double getBC() {
		return BC;
	}
	/**
	 * @param bC the bC to set
	 */
	public void setBC(double bC) {
		BC = bC;
	}
	/**
	 * @return the aC
	 */
	public double getAC() {
		return AC;
	}
	/**
	 * @param aC the aC to set
	 */
	public void setAC(double aC) {
		AC = aC;
	}
	public double squareOfTriangle () {
		double HalfPerim = this.perimeterOfTriangle()/2;
		double res = Math.sqrt(HalfPerim*(HalfPerim-this.getAB())*
				(HalfPerim-this.getAC())*(HalfPerim-this.getBC()));
		return res;
	}
	public double perimeterOfTriangle() {
		return (this.getAB()+this.getAC()+this.getBC());
	}
	
}
