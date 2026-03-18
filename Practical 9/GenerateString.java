class GenerateString{
	String U(int _year){
		int year = _year;
		String str = "U";
		for(int i=1; i<=year; i++){
		  str += "_"+i;
		}
		return str;
	}

	public static void main(String[] args){
		GenerateString obj = new GenerateString();
		System.out.print(obj.U(2026));
	}
}
