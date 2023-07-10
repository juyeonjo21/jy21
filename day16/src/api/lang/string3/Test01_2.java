package api.lang.string3;

public class Test01_2 {
	public static void main(String[] args) {
		//문자열 합성
		// = 원하는 문자열을 만들기 위해 지속적인 연결을 하는 작업
		// = 문자열 덧셈은 성능이 매우 안 좋으며, 이유는 문자열은 '불변'이기 때문.
		// -> (해결책) 덧셈용 도구를 사용하면 된다(StringBuffer / StringBuilder)
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("(");
		buffer.append("신발끈");
		buffer.append("|");
		buffer.append("개나리");
		buffer.append(")");
		String regex = buffer.toString();
		
		String line = "이런 신발끈 개나리 진달래같은!!!";
		//line.replaceAll("(신발끈|개나리)", "***"); // .replaceAll("(식)",("치환값"));
		line = line.replaceAll(regex, "***");
		System.out.println(line);
	}

}
