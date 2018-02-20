package package1;

public class Test9 {

	public static void main(String[] args) {
		
		double ranNum = Math.random();
		System.out.println(ranNum);
		
		int dice = (int) (ranNum * 10) + 1; // 1から10までの乱数を発生させる
		// サイコロの目を入力
		System.out.println("さいころの目:" + dice);
		// 値が、サイコロの目の範囲内かどうかを調べる
		if (1 <= dice && dice <= 6) {
			// さいころの目が、偶数か、奇数かで、処理を分ける。
			if (dice == 2 || dice == 4 || dice == 6) {
				System.out.println("丁（チョウ）です。"); // 偶数ならば丁（チョウ）
			} else {
				System.out.println("半（ハン）です。"); // 奇数ならば半（ハン）
			}
		} else {
			System.out.println("範囲外の数値です。");
		}

	}

}
