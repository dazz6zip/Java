package Pack06thread;

// Thread
// 하나의 응용프로그램은 운영체제에 의해 process(작업단위)를 확보하고,
// 응용프로그램의 실행은 thread(실행단위)가 담당
// 기본적으로 main thread 에 의해 응용 프로그램이 실행
// thread 의 갯수 만큼 실행 단위를 늘릴 수 있음
// (multi thread 에 의한 multi tasking 이 가능)
// 주로 네트워크 작업에서 많이 활용

public class Ex37ThreadTest01 extends Thread { // java.lang 은 import 생략 가능

	public Ex37ThreadTest01() {
	}

	public Ex37ThreadTest01(String name) {
		super(name);
	}

	public void run() { // Thread 클래스 안에 (이름이 정해져 있는) 메소드
		for (int i = 1; i <= 50; i++) {
//			System.out.print(i + " ");
			System.out.print(i + ":" + super.getName() + ", ");
		}
	}

	public static void main(String[] args) { 

		try {
			// process 단위의 실행 (잘 사용하지 않음)
//			Process p1 = Runtime.getRuntime().exec("calc.exe");

			// thread 를 사용한 특정 메소드(run) 실행
			// thread 를 사용하지 않은 경우 : 순차적으로 실행
//			Ex37ThreadTest01 th1 = new Ex37ThreadTest01();
//			th1.run();
//			
//			Ex37ThreadTest01 th2 = new Ex37ThreadTest01();
//			th2.run();

			// 사용자 정의 thread 를 사용한 경우 : 랜덤 실행 (동시에 하는 것처럼 보이게 할 수 있음)
//			Ex37ThreadTest01 th1 = new Ex37ThreadTest01();
			Ex37ThreadTest01 th1 = new Ex37ThreadTest01("one");
			th1.start(); // .start() 는 run() 을 실행하는 메소드임
//			Ex37ThreadTest01 th2 = new Ex37ThreadTest01();
			Ex37ThreadTest01 th2 = new Ex37ThreadTest01("two");
			th2.start();

			th2.setPriority(MAX_PRIORITY); // 무조건 반영 x 확률을 높임
			// MAX_PRIORITY = 10 	: 최대 우선순위
			// MIN_PRIORITY = 1 	: 최소 우선순위

			th1.join(); // .join() 은 th1 스레드가 종료될 때까지 main 스레드 종료 대기

			th1.yield(); // 다른 스레드의 수행 요청이 들어오면 현재 스레드의 수행을 일시정지 (양보)
			
			System.out.println();
			System.out.println("프로그램 종료");

		} catch (Exception e) {
			System.out.println("error : " + e);
		}

	}

}
