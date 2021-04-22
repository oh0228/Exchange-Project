package exchange;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWriteClass() {
		try {
			File file = new File("C:\\Users\\오혜령\\Desktop\\exchange.csv"); // 파일 생성
			if(file.exists() == false) { // 파일이 존재하지 않는다면
				isFileExist = false;
			} else { // 파일이 이미 존재한다면
				isFileExist = true;
			}
			fw = new FileWriter("C:\\Users\\오혜령\\Desktop\\exchange.csv", true); // 파일 이어쓰기				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close(); // fw 닫아주기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void headerWrite() throws IOException {
		if(isFileExist == false) { // 파일이 존재하지 않는다면 (처음에는 헤더가 없으므로)
			String head = "Date," + "Exchange Type," + "Won," + "Exchange Result," + "Change Won" + "\n";
			fw.write(head); // 헤더 write
		}		
	}
	
	public void dataWrite(ExchangeType exType) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String date = sdf.format(c.getTime());
		
		String data = date + "," + exType.exchange_type + "," + exType.won + "," + exType.exchangeResult + "," + exType.returnWon + "\n";
		fw.write(data); // exType 매개변수로 받아서 data 파일에 write
	}	
}

