package 総合課題;

public class 課題に挑戦しよう {
	public static void main(String[] args) {
	    // 変数nameに、好きな名前を代入してください
	    String name = "にんじゃわんこ";

	    // 変数ageに、好きな年齢を代入してください
	    int age = 14;

	    // 変数heightに、好きな身長を代入してください（例: 1.2）
	    double height = 1.2;

	    // 変数weightに、好きな体重を代入してください（例: 20.0）
	    double weight = 20.0;

	    // 変数bmiに、BMIを計算して代入してください
	    double bmi = weight / height / height;

	    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
	    System.out.println("名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");
	    System.out.println("身長は" + height + "mです");
	    System.out.println("体重は" + weight + "kgです");
	    System.out.println("BMIは" + bmi + "です");

	  }
}

//それぞれの値をいれる変数名は、以下のようにしてください（データ型は()部分を参考に）。
//・名前: name（文字列）
//・年齢: age（整数）
//・身長: height（小数） 
//・体重: weight（小数）
//・BMI: bmi（小数）
//※注意点
//・変数に代入する値は自由です。好きな値を代入しましょう。
//・BMIは、「体重 ÷ 身長 ÷ 身長」で算出できます。