package ch13.sec02.exam01;

//제네릭 타입
public class Product<K, M> { // 타입 파라미터로 K와 M 정의
	// 필드
	private K kind; // 타입 파라미터를 필드 타입으로 사용
	private M model; // 타입 파라미터를 필드 타입으로 사용

	// 메소드
	public K getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
