public class MakeClass{
	String classe[];
	
	MakeClass(){
		this.classe = new String[100];
	}
	
	public void makeClass(String acess, String name, int attrSize, String attrs[]){
		this.classe[0] = acess + " class " + name + "{";
		for(int i = 1; i < attrSize; i++){
			this.classe[i] = "    " + attrs[i - 1] + ";";
		}
		this.classe[attrSize + 2] = "}";
	}
	
	public String toString(){
		String cls = "";
		
		for(int i = 0; i < this.classe.length;){
			if(this.classe[i] != null){
				cls = this.classe[i] + "\n";
				i++;
			}
			else{
				break;
			}
		}
		return cls;
	}
}
