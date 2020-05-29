package covid_19;

public class DataProcessing {
	
private static final String FILE_PATH="C:/Users/Chamini/eclipse-workspace/Excercise1/src/covid-19-info.json";
	
	
	public static void main(String[] args) {
		DataReading reader = new DataReading();
		reader.readData(FILE_PATH);
	}

}
