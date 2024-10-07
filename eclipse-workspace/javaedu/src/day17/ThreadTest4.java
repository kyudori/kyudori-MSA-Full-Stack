package day17;

class ThreadTest4 {
	public static void main(String args[]) throws InterruptedException {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 20; i++) {
			System.out.printf("%s", new String("-"));
			Thread.sleep(1000);
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("%s", new String("|")); // pipe
			Thread.sleep(1000);
		}

		System.out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
	}
}
