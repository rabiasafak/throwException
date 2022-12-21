package throwException;

public class student {
	public static student find(String id) throws studentException {
		if (id.equals("1234")){
		
		return new student();
		
	}else {
		throw new studentException("hata");
	}
	}
}
