package days03;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String name, num;
	int kor, eng, mat, total;
	double avg;
	
	System.out.print("��ȣ�� �Է��ϼ���: ");
	num = sc.nextLine();
	
	System.out.print("�̸��� �Է��ϼ���: ");
	name = sc.nextLine();
	
	System.out.print("���� ������ �Է��ϼ���: ");
	kor = sc.nextInt();
	
	System.out.print("���� ������ �Է��ϼ���: ");
	eng = sc.nextInt();
	
	System.out.print("���� ������ �Է��ϼ���: ");
	mat = sc.nextInt();
	
	total = kor + eng + mat;
	avg = total / 3.0;
	System.out.println("\t\t###����ǥ###");
	System.out.println("--------------------------------------------------");
	System.out.printf("%s\t%s\t\t%s\t%s\t%s\t%s\t%s\n", "��ȣ", "�̸�", "����", "����", "����","����","���");
	System.out.println("--------------------------------------------------");
	System.out.printf("%s\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n", num, name, kor, eng, mat, total, avg);
	
	System.out.println();
	System.out.println("��ȣ\t�̸�\t\t����\t����\t����\t����\t���");
	System.out.println("--------------------------------------------------");
	System.out.println(num + "\t" + name + "\t\t" + kor + "\t" + eng + "\t" + mat + "\t" + total + "\t" + (int)(avg*100)/100.0);
	}
}
