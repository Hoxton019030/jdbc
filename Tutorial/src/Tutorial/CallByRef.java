package Tutorial;

class Obj {
	int a;
	int b;

	Obj() {
		a = 10;
		b = 15;
	}
}

public class CallByRef {
	public static void main(String[] args) {
		Obj obj = new Obj();
		System.out.printf("參考呼叫前 \t a = %d\tb= %d",obj.a,obj.b);
		byRef(obj);
		System.out.println();
		System.out.printf("參考呼叫後 \t a = %d\tb= %d",obj.a,obj.b);
		
	}

	static void byRef(Obj p) {
		int t;
		t = p.a;
		p.a = p.b;
		p.b = t;
	}
}
