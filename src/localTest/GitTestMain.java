package localTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GitTestMain {

	public static void main(String[] args) {
		// ** LocalDateTime
		//	=> ��¥�� �ð������� ��� ǥ���ϱ����� Ŭ����
		// 	=> now() : ���� ��¥�� �ð�
		LocalDateTime today = LocalDateTime.now();
		System.out.println("** LocalDateTime today   => " + today);
		// => LocalDateTime Ŭ������ toString() �޼��忡 ����� ����
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
		System.out.println("** LocalDateTime pattern => " + today.format(df));
		System.out.println("** Local Commit Test ... 2021/03/11 ");
		System.out.println("** hotfix branch Commit Test ... ");
	} // main
} // class
