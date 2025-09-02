public class _006_StringFormatting{
	public static void main(String[] args) {
		float temp = 31.2f;
		String weather = "맑음";
		System.out.println(String.format("오늘의 온도는 %.1f°C이고, 날씨는 \'%s\'입니다.", temp, weather));
		
		temp = 27.5f;
		weather = "흐림";
		System.out.printf("내일의 온도는 %.1f°C이고, 날씨는 \'%s\'일 것으로 예상됩니다.", temp, weather);
	}
}