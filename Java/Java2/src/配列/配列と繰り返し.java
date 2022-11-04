package 配列;

public class 配列と繰り返し {
	public static void main(String[] args) {
	    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

	    // for文を用いて、「私の名前は◯◯です」と出力してください
	    for(int i=0;names.length > i;i++) {
	      System.out.println("私の名前は"+names[i]+"です");
	    }

	  }
}
