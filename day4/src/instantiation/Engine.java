package instantiation;

public class Engine {
		private int eno;
		private String chasis;
		private String type;
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public String getChasis() {
			return chasis;
		}
		public void setChasis(String chasis) {
			this.chasis = chasis;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		public Engine(int eno, String chasis, String type) {
			super();
			this.eno = eno;
			this.chasis = chasis;
			this.type = type;
		}
		
}
